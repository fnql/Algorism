import java.lang.StringBuilder
import java.util.*

fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    var s : String?
    while (readLine().also { s = it } != null) {
        val token = StringTokenizer(s)
        sb.appendLine(token.nextToken().toInt() + token.nextToken().toInt())
//        var (a,b) = (readLine() ?: break).split(" ").map { it.toInt() }
//            sb.appendLine(a+b)
    }
    println(sb)
}