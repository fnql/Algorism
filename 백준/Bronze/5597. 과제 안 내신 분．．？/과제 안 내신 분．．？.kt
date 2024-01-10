
fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {

    var stu = (1..30).toMutableList()
    repeat(28) {
        stu.remove(readLine().toInt())
    }
    println(stu.minOrNull())
    print(stu.maxOrNull())
}