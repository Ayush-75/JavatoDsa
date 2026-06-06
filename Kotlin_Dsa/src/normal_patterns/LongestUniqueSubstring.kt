package normal_patterns

fun main(args: Array<String>) {

    val s = "abbabca"
    println(longestUniqueSubstring(s))
}

fun longestUniqueSubstring(s: String): String{
    val set = HashSet<Char>()

    var left = 0
    var maxLength = 0
    var startIndex = 0

    for (right in s.indices){

        while (s[right] in set){
            set.remove(s[left])
            left++
        }

        set.add(s[right])

        if (right - left + 1 > maxLength){
            maxLength = right - left + 1
            startIndex = left
        }
    }

    return s.substring(startIndex,startIndex+maxLength)
}