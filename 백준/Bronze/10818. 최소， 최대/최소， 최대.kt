fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    val n = readLine()
    val a = readLine().split(" ").map { it.toInt()
    }
    print("${a.minOrNull()} ${a.maxOrNull()}")
}