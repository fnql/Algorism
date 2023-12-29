fun main(args: Array<String>) {
    var (a,b) = readLine()!!.split(" ").map { it.toInt() }
    var c = readLine()!!.toInt()
    var m = b + c
    a += m/60
    b = m % 60
    if (a > 23) {
        a -= 24
    }
    print("$a $b")
}