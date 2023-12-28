fun main(args: Array<String>) {
   var a = readLine()!!.toInt()
   if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
       print(1)
   } else {
       print(0)
   }
}