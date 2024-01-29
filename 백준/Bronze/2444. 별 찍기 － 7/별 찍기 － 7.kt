fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    var n = readLine().toInt()
    for (i in 0 until n) {
        repeat((((n-1)*2+1) - (i*2+1))/2) {
            print(" ")
        }
        repeat(i*2+1) {
            print("*")
        }
        println()
    }

    for (i in n-2 downTo 0) {
        repeat((((n-1)*2+1) - (i*2+1))/2) {
            print(" ")
        }
        repeat(i*2+1) {
            print("*")
        }
        println()
    }

}