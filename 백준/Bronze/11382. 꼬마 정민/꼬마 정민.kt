fun main(args: Array<String>) {
    var a = readLine()!!.split(" ").map { it.toLong() }.toLongArray()
    print(a.sum())
}