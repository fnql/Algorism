import java.lang.StringBuilder
import java.util.*

fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    repeat(readLine().toInt()) {
        val token = StringTokenizer(readLine())
        val sum = (token.nextToken().toInt() + token.nextToken().toInt()).toString()
        sb.appendLine("Case #${it+1}: $sum")
    }
    println(sb)
}