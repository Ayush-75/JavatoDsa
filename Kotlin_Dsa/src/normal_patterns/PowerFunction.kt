package normal_patterns

import kotlin.math.abs
import kotlin.math.pow

fun main(args: Array<String>) {

    val a = -5
    val b = 3
    println(power(5,3))
    println(powerLoop(5,3))
    var res = powerLoop(abs(a),b)
    if (a<0) res = -res
    println(res)

    val mat = 5.0.pow(3).toInt()
    println(mat)

    println(fastPower(5,3))

}

fun power(a: Int,b: Int): Int{
    if (b == 0) return 1;
    return power(a,b-1)*a
}

fun powerLoop(a: Int,b: Int): Int{
    var result = 1
    for (i in 1..b){
        result *= a
    }
    return result
}

fun fastPower(a: Int,b: Int): Int{
    if (b == 0) return 1;
    if (a%2==0) return fastPower((a*a),b/2)
    return a * fastPower(a,b-1)
}

// what if the power number is negative