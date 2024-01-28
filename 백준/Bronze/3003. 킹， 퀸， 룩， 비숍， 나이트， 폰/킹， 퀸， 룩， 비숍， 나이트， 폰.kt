fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    var ori = listOf(1, 1, 2, 2, 2, 8 )
    var pice = readLine().split(" ").map { it.toInt() }
    var sb = mutableListOf<Int>()
    for (i in ori.indices) {
        sb.add(ori[i] - pice[i])
    }
    print(sb.joinToString(" "))
}