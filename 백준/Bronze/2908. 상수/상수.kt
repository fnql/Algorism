fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    var (a,b) = readLine().split(" ")
    a = a.reversed()
    b = b.reversed()
    if (a>b) {
        print(a)
    } else {
        print(b)
    }
}