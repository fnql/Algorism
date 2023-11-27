fun main(args: Array<String>) {
    var n = readLine()!!
    var score = readLine()!!.split(" ").map {it.toInt()}
    var newScore = mutableListOf<Double>()
    var m = score.maxOrNull()
    for (i in score) {
        newScore.add((i.toDouble())/(m!!.toDouble())*100)
    }
    print(newScore.average())
}