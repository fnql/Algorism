fun main() = with(System.`in`.bufferedReader()){
   var n = readLine()!!.toInt()
    var nList = readLine()!!.split(" ").map { it.toInt() }.sorted().toIntArray()
    var m = readLine()!!.toInt()
    var mList = readLine()!!.split(" ").map { it.toInt() }
    var sb =  StringBuilder()
    for (i in mList) {
        if (binarySearch(nList, i)) {
            sb.appendLine(1)
        } else {
            sb.appendLine(0)
        }
    }
//    mergeSort(mList.toIntArray(), 0, m-1);
    println(sb)
}

fun binarySearch(arr:IntArray, target:Int) : Boolean {
    var left = 0
    var right = arr.size -1
    while (left <= right) {
        val mid = (left + right) /2
        if(arr[mid]==target) return true
        else if (arr[mid] > target) right = mid - 1
        else left = mid +1
    }
    return false
}