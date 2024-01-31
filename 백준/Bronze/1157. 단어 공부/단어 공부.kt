fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    var word = readLine().toUpperCase().map { it.toString() }.toList()
    var wordSet = word.toSet()
    var maxCount = 0
    var result = "?"
    for (i in wordSet) {
        var c = word.count { it == i }
        if (maxCount < c) {
            maxCount = c
            result = i
        } else if (maxCount == c) {
            result = "?"
        }
    }
    print(result)
}