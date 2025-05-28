class Solution {
public:
    vector<int> maxTargetNodes(vector<vector<int>>& edges1, vector<vector<int>>& edges2, int k) {
        
        int n=0,m=0;
        for(auto ele:edges1)
        {
            n=max({n,ele[0],ele[1]});
        }
        n++;
        for(auto ele:edges2)
        {
            m=max({m,ele[0],ele[1]});
        }
        m++;
       
        //Create the adjacency list for both 
        unordered_map<int,vector<int>>adj1;
        for(auto pair:edges1)
        {
            int u=pair[0];
            int v=pair[1];
            adj1[u].push_back(v);
            adj1[v].push_back(u);
        }
        unordered_map<int,vector<int>>adj2;
        for(auto pair:edges2)
        {
            int u=pair[0];
            int v=pair[1];
            adj2[u].push_back(v);
            adj2[v].push_back(u);
        }
        
        //lets check the maximum number of nodes reachable from every node at a dis k-1 in edge 2
        vector<int>vecm(m);
        for(int i=0;i<m;i++)
        {
            queue<pair<int,int>>q;
            q.push({i,0});
            vector<bool>vis(m,false);
            vis[i]=true;
            int k2=k;
            int c=1;
            while(!q.empty())
            {
                auto ele=q.front();
                q.pop();
                int u=ele.first;
                int dis=ele.second;
                if(dis>=k2-1) continue;

                for(auto v:adj2[u])
                {
                     if(!vis[v]) 
                    {
                        q.push({v,dis+1});
                        c++;
                        vis[v]=true;
                    }
                }
            }
            vecm[i]=c;
        }
        //lets check the maximum number of nodes reachable from every node at a dis k in edge 1
        vector<int>vecn(n);
        for(int i=0;i<n;i++)
        {
            queue<pair<int,int>>q;
            q.push({i,0});
            vector<bool>vis(n,false);
            vis[i]=true;
            int k1=k;
            int c=1;
            while(!q.empty())
            {
                auto ele=q.front();
                q.pop();
                int u=ele.first;
                int dis=ele.second;
                if(dis>=k1) continue;

                for(auto v:adj1[u])
                {
                    if(!vis[v]) 
                    {
                        q.push({v,dis+1});
                        c++;
                        vis[v]=true;
                    }
                    
                }
            }
            vecn[i]=c;
        }

    //vecn=> 5 3 5 4 4 vecm=> 3 2 2 1 3 1 1 1 
    sort(vecm.begin(),vecm.end(),greater<int>());
    int maxi = (k > 0) ? vecm[0] : 0; //Handle the edge case

    cout<<maxi;
    vector<int>answer(n);
    for(int i=0;i<n;i++)
    {
        answer[i]=vecn[i]+maxi;
    }
    return answer;


        

    }
};