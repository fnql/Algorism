import java.lang.StringBuilder
import java.util.*

fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    while (true) {
        var (a,b) = readLine().split(" ").map { it.toInt() }
        if (a==0) {
            break
        } else {
            sb.appendLine(a+b)
        }
    }
    println(sb)
}