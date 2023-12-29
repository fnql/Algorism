fun main(args: Array<String>) {
    var (a,b,c) = readLine()!!.split(" ").map { it.toInt() }
    var result = 0
    if (a == b) {
        if (b == c) {
            result = 10000 + a * 1000
        } else {
            result = 1000 + a * 100
        }
    } else {
        if (b == c) {
            result = 1000 + b * 100
        } else {
            if (a == c) {
                result = 1000 + a * 100
            } else {
                result = maxOf(a,b,c) * 100
            }
        }
    }
    print(result)
}