fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    var sb = StringBuilder();
    var t = readLine().toInt()
    repeat(t) {
        var s = readLine()
        sb.appendLine("${s.first()}${s.last()}")
    }
    println(sb)
}