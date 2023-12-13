fun main(args: Array<String>) {

    var (n,m) = readLine()!!.split(" ").map() {it.toInt()}
    var numbers = (readLine()!!.split(" ").map() {it.toInt()}).toList()
    var arrayList = mutableListOf<List<Int>>()
     var range =Array<List<Int>>(m) {(readLine()!!.split(" ").map() {it.toInt()}).toList()}
    for (i in 0..m-1) {
       
        arrayList.add(range[i])
    }
    
    var sum = 0
    var prefix_sum = mutableListOf<Int>(0)
    for (i in numbers) {
        sum += i
        prefix_sum.add(sum)
    }
    
    for (i in arrayList) {
        println(prefix_sum[i[1]] - prefix_sum[i[0]-1])
    }

}