class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Traverse thru both arrays and find intersection
        // TC - O(n) 
        // use hashmaps
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : nums1){  // O(n)
            if (map.containsKey(i)) map.put(i, map.get(i)+1);
            else map.put(i,1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for (int j : nums2){  // O(n)
            if (map.containsKey(j) && map.get(j) > 0){
                list.add(j);
                map.put(j, map.get(j)-1);
            } 
        }
        
        int[] res = new int[list.size()];
        int l = 0;
        for (int k : list){  // O(n)
            res[l++] = k;
        }
        
        return res;
    }
}