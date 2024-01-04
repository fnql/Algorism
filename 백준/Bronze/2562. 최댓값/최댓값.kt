import java.util.*

fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    var a = mutableListOf<Int>()
    for (i in 0..8) {
        val token = StringTokenizer(readLine())
        a.add(token.nextToken().toInt())
    }
    println(a.maxOrNull())
    print(a.indexOf(a.maxOrNull())+1)
}