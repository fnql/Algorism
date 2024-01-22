fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    var t = readLine().trim()
        .split(" ")
    if (t.first() == ""){
        print(0)
    } else {
        print(t.size)
    }

}