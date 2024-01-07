class Solution {
    fun findNumbers(nums: IntArray): Int {
        var result = 0
        repeat(nums.size) {
            if (nums[it].toString().length % 2 == 0) {
                result += 1
            }
        }
        return result
    }
}