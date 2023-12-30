fun main(args: Array<String>) {
    var t = readLine()!!.toInt()
    var result = mutableListOf<Int>()
    for (i in 1..t) {
        var (a,b) = readLine()!!.split(" ").map { it.toInt() }
        result.add(a+b)
    }
    result.map { println(it) }
}