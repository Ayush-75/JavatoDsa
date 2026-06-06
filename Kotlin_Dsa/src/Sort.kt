fun main(args: Array<String>) {

    val i = intArrayOf(10,20,30,40)

    val n = i.size
    val sum = n * (i.first() + i.last())/2
    val sum2 = 10 * ( n *  (n +1)/2)
    val sum3 = n * (n + 1) / 2
    println(sum2)

    val check = checkNumberIsPresent(i,30)
    println(check)

    pairMaker(i)
}

fun checkNumberIsPresent(a: IntArray,key:Int): Boolean {
    for (e in a) {
        if (e == key) {
            println(a.indexOf(key))
            return true
        }
    }
    return false
}

fun pairMaker(a: IntArray){
    val n = a.size
    for (i in 0 until n){
        for (j in i+1 until n){
            println(" ${a[i]}  ${a[j]} ")
        }
    }
}

