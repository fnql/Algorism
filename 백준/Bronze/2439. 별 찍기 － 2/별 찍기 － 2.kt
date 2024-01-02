import java.lang.StringBuilder
import java.util.*

fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val n = readLine().toInt()
    repeat(n) {
        repeat(n-it-1) {
            sb.append(" ")
        }
        repeat(it + 1) {
            sb.append("*")
        }


        sb.appendLine()
    }
    println(sb)
}