package normal_patterns

fun main() {
    foo(4)
}

fun foo(n:Int){

    var fact = 1
    for(i in 1..n){
        fact*=i
    }

    println("Factorial of $n is $fact ")

}