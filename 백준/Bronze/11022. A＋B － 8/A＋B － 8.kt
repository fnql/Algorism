import java.lang.StringBuilder
import java.util.*

fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        sb.appendLine("Case #${it+1}: $a + $b = ${a+b}")
    }
    println(sb)
}