package normal_patterns

fun main(args: Array<String>) {

    val word = "Hello world Android"

    println(word.trim().split("\\s+".toRegex()).reversed().joinToString(" "))
    println(reverseWord(word))
    println(word.reversed())

}

fun reverseWord(s: String): String{
    val result = StringBuilder()
    var i = s.length - 1

    while (i>=0){
        while (i>=0 && s[i] == ' ') i--

        val wordEnd= i
        while (i>=0 && s[i] != ' ') i--

        if (wordEnd >=0){
            if (result.isNotEmpty()) result.append(' ')

            for (j in i+1 .. wordEnd){
                result.append(s[j])
            }
        }
    }
    return result.toString()
}