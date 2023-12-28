fun main(args: Array<String>) {
   var (a,b) = readLine()!!.split(" ").map { it.toInt() }
    if (a>b) {
        print(">")
    } else if (a<b){
        print("<")
    } else {
        print("==")
    }
}