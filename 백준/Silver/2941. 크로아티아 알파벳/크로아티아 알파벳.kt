fun main(args:Array<String>) = with(System.`in`.bufferedReader()) {
    var result = 0
    var word = readLine().toString()
    var index = 0
    while (index < word.length-1) {
        var al = word[index].toString() + word[index+1].toString()
        if ( al == "c="||
            al == "c-"||

            al  == "d-"||
            al  == "lj"||
            al  == "nj"||
            al  == "s="||
            al  == "z=") {

                index += 1

        } else  if(al == "dz" && index + 2 < word.length && word[index+2].toString() == "=") {
            index += 2
        }
    result +=1
        index += 1
    }
    if (index == word.length-1) {
        result +=1
    }

    print(result)
}