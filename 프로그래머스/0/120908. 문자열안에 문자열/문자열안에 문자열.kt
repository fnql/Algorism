class Solution {
    fun solution(str1: String, str2: String): Int {
        var answer: Int = 0
        if (str1.indexOf(str2) == -1) {
            answer = 2
        } else {
            answer = 1
        }
        return answer
    }
}