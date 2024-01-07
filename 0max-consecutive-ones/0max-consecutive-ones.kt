class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var result = IntArray(nums.size) { 0 }
    if (nums[0] == 1)  result[0] = 1
    for (i in 1 until nums.size) {
        if (nums[i] == 1) {result[i] += 1}
        if (nums[i-1] == nums[i]) {
            result[i] += result[i-1]
        }
    }
    return result.maxOrNull()!!
    }
}