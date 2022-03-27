/**
 * author: seungw0n
 * question: Median of Two Sorted Arrays
 * details:
 *  Runtime: 3 ms, faster than 86.09% of Java online submissions for Median of Two Sorted Arrays.
 *  Memory Usage: 50.4 MB, less than 17.72% of Java online submissions for Median of Two Sorted Arrays.
 * comment:
 *  Need to change the filename (Solution.java)
 *  Try to solve it without using an array
*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        
        int[] arr = new int[totalLength];
        m = 0;
        n = 0;
        for (int i = 0; i < totalLength/2 + 1; i++) {
            if (m >= nums1.length) {
                arr[i] = nums2[n];
                n++;
            } else if (n >= nums2.length) {
                arr[i] = nums1[m];
                m++;
            } else if (nums1[m] <= nums2[n]) {
                arr[i] = nums1[m];
                m++;
            }  else {
                arr[i] = nums2[n];
                n++;
            }
            
        }
        
        if (totalLength % 2 == 0)
            return ( ((double)arr[totalLength/2] + (double)arr[totalLength/2 - 1]) / 2.0 );
        else
            return ( (double)arr[totalLength/2] );
        
    }
}
