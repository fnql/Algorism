import kotlin.math.*
fun main(args: Array<String>) {
    fun prime_number(N : Int) : MutableList<Int> {
        val isPrime = BooleanArray(N +1) {true}

        isPrime[0] = false
        isPrime[1] = false

        for (i in 2..sqrt(N.toDouble()).toInt()) {
            if (!isPrime[i]){
                continue
            }

            for (j in i * i..N step i) {
                isPrime[j] = false
            }
        }
        var result = mutableListOf<Int>()
        for (i in 0..N) {
            if (isPrime[i]) {
                result.add(i)
            }

        }
        return result
    }
    var (a,b) = readLine()!!.split(" ").map { it.toInt()}
    var primeList = prime_number(b)
    for (i in primeList) {
        if (i >= a) {
            println(i)
        }
    }
}