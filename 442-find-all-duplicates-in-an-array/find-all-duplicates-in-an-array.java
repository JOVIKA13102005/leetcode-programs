class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      HashMap<Integer,Integer> map = new HashMap<>();
      List<Integer> list=new ArrayList<>();
      for(int num:nums){
        if(map.containsKey(num)){
            map.put(num,map.get(num)+1);
            if(map.get(num)==2)
                list.add(num);
            }
        
        else
        map.put(num,1);
      }
      return list;
    }
}