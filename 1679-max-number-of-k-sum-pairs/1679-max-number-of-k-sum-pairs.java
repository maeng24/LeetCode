class Solution {
    public int maxOperations(int[] nums, int k) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : nums){
            int removeNum = k-num;
            if(map.containsKey(removeNum) && map.get(removeNum)>0) {
                map.put(removeNum, map.get(removeNum)-1);
                answer++;                      
            } else map.put(num, map.getOrDefault(num, 0)+1);
        }
        
//         for(int num : nums){
//             if(num<k) countArr[num]++;
//         }
        
//         if(k%2==0){
//             for(long i=1; i<k/2; i++) {
//                 answer+=Math.min(countArr[i], countArr[k-i]);
//             }
        
//             answer+=countArr[k/2]/2;
//         }else{
//             for(long i=1; i<=k/2; i++) {
//                 answer+=Math.min(countArr[i], countArr[k-i]);
//             }
//         }
        
        return answer;
    }
}