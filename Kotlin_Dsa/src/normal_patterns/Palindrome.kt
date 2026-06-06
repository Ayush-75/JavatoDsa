package normal_patterns

// To check weather number is palindrome or not

fun main(args: Array<String>) {

//    val word = readln()
//    println(isPalindrome1(word))

//    println(reverseString1("Ayush"))

    val s = "aa"
    println(isPalindromeR(s, 0, s.length - 1))

    println(isPalindromeFor("abca"))

}

// normal way
fun isPalindrome(str: String): Boolean {
    return str == str.reversed()
}

fun isPalindrome1(str: String): Boolean {
// noon
    var left = 0
    var right = str.length - 1

    while (left < right) {
        if (str[left] != str[right]) {
            return false
        }
        left++
        right--
    }
    return true
}

// is palindrome with for loop

fun isPalindromeFor(str: String): Boolean {
    val n = str.length
    for (i in 0 until n / 2) {
        if (str[i] != str[n - i - 1]) {
            return false
        }
    }
    return true
}


// reverse a string

fun reverseString(str: String): String {
    var result = ""

    for (i in str.length - 1 downTo 0) {
        result += str[i]
    }
    return result
}

fun reverseString1(str: String): String {
    val chars = str.toCharArray()

    var left = 0
    var right = str.length - 1

    while (left < right) {
        val temp = chars[left]
        chars[left] = chars[right]
        chars[right] = temp

        left++
        right--
    }
    return String(chars)
}

fun CharSequence.reversed(): String {
    val result = StringBuilder(length)

    for (i in length - 1 downTo 0) {
        result.append(this[i])
    }

    return result.toString()
}

// palindrome with recursion

fun isPalindromeR(s: String, l: Int, r: Int): Boolean {
    if (l >= r) return true
    return if (s[l] == s[r]) {
        isPalindromeR(s, l + 1, r - 1)
    } else {
        false
    }
}