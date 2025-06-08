class Solution {
    String tictactoe(char[][] box) {
        for(int j =0;j<3;j++){
            int countA =0;
            int countB = 0;
            for(int i = 0;i<3;i++){
               if(box[i][j]=='X')countA++;
               else if(box[i][j] =='O')countB++;
            }
                if(countA == 3)return "A";
                if(countB == 3)return "B";
        }
            for(int j =0;j<3;j++){
            int countA =0;
            int countB = 0;
            for(int i = 0;i<3;i++){
               if(box[j][i]=='X')countA++;
               else if(box[j][i] =='O')countB++;
            }
    
        if(countA == 3)return "A";
        if(countB == 3)return "B";
            }
            if(box[0][0] == 'X' && box[1][1] == 'X' && box[2][2] == 'X')return "A";
             if(box[0][0] == 'O' && box[1][1] == 'O' && box[2][2] == 'O')return "B";

             if(box[2][0] == 'X' && box[1][1] == 'X' && box[0][2] == 'X')return "A";
             if(box[2][0] == 'O' && box[1][1] == 'O' && box[0][2] == 'O')return "B";

             int c = 0;
             for(int i=0;i<3;i++){
                for(int j=0;j<3;j++)
                if(box[i][j]=='X' || box[i][j]=='O')
                    c++;
                }
                if(c != 9) return "Pending";
                return "Draw";
             }
        
        public String tictactoe(int[][] moves) {
        int n = moves.length;
        char[][]box = new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                box[i][j]='.';
            }
        }
            for(int i=0;i<n;i++){
                if(i%2 ==0){
                    box[moves[i][0]][moves[i][1]] = 'X';
                }
                else{
                    box[moves[i][0]][moves[i][1]] = 'O';
                }
            }
        
            return tictactoe(box);
        }
           
        
    
}