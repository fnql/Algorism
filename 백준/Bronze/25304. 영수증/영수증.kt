fun main(args: Array<String>) {
    var x = readLine()!!.toLong()
    var n = readLine()!!.toInt()
    var total : Long = 0
    for (i in 1..n) {
        var (a,b) = readLine()!!.split(" ").map { it.toInt() }
        total += a*b
    }
    if (total == x) {
        print("Yes")
    } else {
        print("No")
    }
}