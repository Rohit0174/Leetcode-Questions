class Solution {
    public int[] twoSum(int[] arr, int target) {
     int ans[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){
            int x=target-arr[i];
            if(map.containsKey(x) && map.get(x)!=i){
                ans[0]=map.get(x);
                ans[1]=i;
                break;
            }
            
        }
        return ans;
            
    }
}