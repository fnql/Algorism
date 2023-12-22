fun main(args: Array<String>) {
   var a = readLine()!!.toInt()
   var b = readLine()!!
    var bList = b.map { it.toString().toInt() }.toIntArray().reversed()
    for (i in bList) {
        println(a * i)
    }
    print(a*b.toInt())
}