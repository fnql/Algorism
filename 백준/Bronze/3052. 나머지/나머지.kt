fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    var ten = mutableListOf<Int>()
    repeat(10) {
        var i = readLine().toInt()
        if (!ten.contains(i%42)) {
            ten.add(i%42)
        }
    }
    print(ten.size)
}