fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    var (n,m) = readLine().split(" ").map { it.toInt() }
    var ba = MutableList(n) { 0 }
    for (i in 1..m) {
        var (a,b,c) = readLine().split(" ").map { it.toInt() }
        for (j in a..b) {
            ba[j-1] = c
        }
    }
    repeat(n) {
        print("${ba[it]} ")
    }
}