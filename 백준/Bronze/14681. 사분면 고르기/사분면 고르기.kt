fun main(args: Array<String>) {
   var x = readLine()!!.toInt()
   var y = readLine()!!.toInt()
    if (x > 0) {
        if (y > 0) {
            print(1)
        } else {
            print(4)
        }
    } else {
        if (y > 0) {
            print(2)
        } else {
            print(3)
        }
    }
}