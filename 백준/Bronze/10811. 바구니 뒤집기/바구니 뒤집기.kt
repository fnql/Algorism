fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    var (n,m) = readLine().split(" ").map { it.toInt() }
    var bas = (1..n).toMutableList()
    repeat(m) {
        var (a,b) = readLine().split(" ").map { it.toInt() -1 }
        var v = b
        var swaV = bas[v]
        var count = if ((b-a) %2 ==0) {
            (b-a)/2
        } else {
            (b-a)/2+1
        }
        for (i in 0 until count)  {
            bas[v] = bas[a+i]
            bas[a+i] = swaV
            v = b-i-1
            swaV = bas[v]
        }
    }
    print(bas.joinToString(" "))
}