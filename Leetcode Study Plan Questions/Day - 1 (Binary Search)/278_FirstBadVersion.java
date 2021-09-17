/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //Bruteforce approach (timelimit exceed)=> TC - O(n), SC - O(1)
        // for (int i=1; i<=n; i++){
        //     if (isBadVersion(i)) return i;
        // }
        // return 0;
        
        //binary search => TC - O(log n), SC - O(1)
        int lo=1, hi=n, pos=0;
        while(lo<=hi){
            int mid = (int)((lo+(hi-lo)/2));
            if (isBadVersion(mid) == true) {
                pos = mid;
                hi = mid-1;
            }
            else {
                lo = mid+1;
            }
        } 
        return pos;
    } 
}