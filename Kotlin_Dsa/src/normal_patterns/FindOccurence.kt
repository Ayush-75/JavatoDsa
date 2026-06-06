package normal_patterns

fun main(args: Array<String>) {

    val str = "abcabaabc"
    val target = "abc"

    val result = countOccurrences(str, target)
    val result1 = countWithRecursion(target, str, 0)
    println(result1)
}

fun findOccurrence(mainString: String, target: String): Int {
    var count = 0
    val m = mainString.length
    val n = target.length

    for (i in 0..m - n) {
        if (mainString.substring(i, i + n) == target) {
            count++
        }
    }
    return count
}

fun countOccurrences(mainString: String, target: String): Int {
    var count = 0

    for (i in 0..mainString.length - target.length) {
        var match = true

        for (j in target.indices) {
            if (mainString[i + j] != target[j]) {
                match = false
                break
            }
        }

        if (match) count++
    }

    return count
}

fun countWithRecursion(t: String, s: String, i: Int): Int {
    if (i > s.length - t.length) {
        return 0
    }
    var subProblem: Int = countWithRecursion(t, s, i + 1)
    var doStartingCharMatch: Boolean = s.substring(i, i + t.length) == t
    return if (doStartingCharMatch) subProblem + 1
    else subProblem
}