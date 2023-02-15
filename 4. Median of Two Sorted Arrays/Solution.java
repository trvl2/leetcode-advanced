/*
 *      4. Median of Two Sorted Arrays
 *      https://leetcode.com/problems/median-of-two-sorted-arrays/
 *
 *      Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 *      The overall run time complexity should be O(log (m+n)).
 *
 * */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, answer, 0, nums1.length);
        System.arraycopy(nums2, 0, answer, nums1.length, nums2.length);

        Arrays.sort(answer);

        if (answer.length % 2 == 0) {
            return (double)(answer[answer.length / 2] + answer[answer.length / 2 - 1]) / 2;
        } else {
            return (double)answer[answer.length / 2];
        }
    }
}