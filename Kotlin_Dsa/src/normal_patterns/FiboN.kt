package normal_patterns


fun main(args: Array<String>) {

    fiboN(8)
    println()
    println(fiboR(7))
}

fun fiboN(n: Int){

    var t1 = 0
    var t2 = 1
    print("Fibonacci series up to $n terms: ")

    for (i in 1..n){
        val sum = t1+t2
        t1 = t2
        t2 = sum
        print("$t1 ")
    }

}

fun fiboR(n: Int): Int{
    if (n<= 1) return n
    return fiboR(n-1) + fiboR(n-2)
}