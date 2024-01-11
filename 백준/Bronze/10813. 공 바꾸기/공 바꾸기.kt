fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {

    var (n,m) = readLine().split(" ").map { it.toInt() }
    var bas = (1..n).toMutableList()
    repeat(m) {
        var (i,j) = readLine().split(" ").map { it.toInt() }
        var swap = bas[i-1]
        bas[i-1] = bas[j-1]
        bas[j-1] = swap
    }
    for (i in bas) {
        print("$i ")
    }
}