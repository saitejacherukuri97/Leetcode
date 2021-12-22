class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Merging each array by one ele at a time
        // The trick is to solve from last
        // Taking 3 pointers -> i,j,k
        int i = m-1, j = n-1, k = m+n-1;
        // System.out.println(j);
        while(i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]){
                nums1[k] = nums1[i]; i--; k--;
            }
            else {
                nums1[k] = nums2[j]; j--; k--;
            }
        }
        while (j >= 0){
            nums1[k] = nums2[j]; j--; k--;
        }
    }
}