fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    var t = readLine().toInt()
    repeat(t) {
        var (a,b) = readLine().split(" ")
        var sb = StringBuilder()
        for (i in b) {
            repeat(a.toInt()) {
                sb.append(i)
            }
        }
        println(sb)
    }
}