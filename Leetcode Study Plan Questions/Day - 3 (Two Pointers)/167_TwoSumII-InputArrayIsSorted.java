class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int[] arr = new int[2];
        for (int i=0; i<numbers.length; i++){
            int diff = target - numbers[i];
            if (hashmap.containsKey(diff)){
                int res = hashmap.get(diff); 
                arr[0] = res+1;
                arr[1] = i+1;
                return arr;
            }
            else {
                hashmap.put(numbers[i], i);
            }
        }
        return arr;
    }
}