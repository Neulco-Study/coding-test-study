package Week01.이분탐색_LTC;

/* The isBadVersion API is defined in the parent class VersionControl.
   boolean isBadVersion(int version); */

public class LTC_FirstBadVersion_송시연_0919 extends VersionControl {
    public int firstBadVersion(int n) {
        int lo = 1;
        int hi = n;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (isBadVersion(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }
}
