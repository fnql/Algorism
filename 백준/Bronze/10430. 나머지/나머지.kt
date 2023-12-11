fun main(args: Array<String>) {
   var (a,b,c) = readLine()!!.split(" ").map { it.toInt() }
    println((a+b)%c)
    println(((a%c)+(b%c))%c)
    println((a*b)%c)
    println(((a%c)*(b%c))%c)
}