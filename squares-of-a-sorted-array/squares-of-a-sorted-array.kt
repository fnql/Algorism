class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        val numList = ArrayList<Int>(nums.size)
        repeat(nums.size) {
            numList.add(nums[it] * nums[it])
        }
        val sortNum = numList.sorted().toIntArray()
        return sortNum
    }
}