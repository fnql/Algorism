fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    val n = readLine()
    val l = readLine().split(" ").map { it.toInt() }.toIntArray()
    val v = readLine().toInt()
    print(l.count { it == v })
}