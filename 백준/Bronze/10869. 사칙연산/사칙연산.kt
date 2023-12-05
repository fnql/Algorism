fun main(args: Array<String>) {
    var (a,b) = readLine()!!.split(" ").map {it.toInt()}
    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(a%b)
}