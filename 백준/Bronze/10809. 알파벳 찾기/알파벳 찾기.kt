fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    var a = (97..122).toList()
    var s = readLine()
    for (i in a) {
        print("${s.indexOf(i.toChar())} ")
    }
}