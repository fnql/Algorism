import java.lang.StringBuilder
import java.util.*

fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val star = "*"
    repeat(readLine().toInt()) {
        sb.append(star)
        repeat(it) {
            sb.append(star)
        }
        sb.appendLine()
    }
    println(sb)
}