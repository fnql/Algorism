fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    var (n,x) = readLine().split(" ").map { it.toInt() }
    val a = readLine().split(" ").map { if (it.toInt() < x) {
        print("$it ")
    }
    }
}