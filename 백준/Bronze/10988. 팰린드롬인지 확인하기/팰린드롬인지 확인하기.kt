fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    var word = readLine()
    var l = word.length-1
    var result = 1
    for (i in 0 .. (l)/2) {
        if (word[i] != word[l-i]) {
            result = 0
            break;
        }
    }
    print(result)
}