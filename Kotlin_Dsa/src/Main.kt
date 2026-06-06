
fun main() {

    val a = arrayOf(
        intArrayOf(5, 7, 8),
        intArrayOf(6, 5, 8,6,5),
        intArrayOf(1, 6, 8),
        intArrayOf(1, 7, 9),
    )

    for (row in a){
        val n = row.size

        for ( i in 0 until n-1){
            for ( j in 0 until n-1-i){
                if (row[j] > row[j+1]){
                    val temp = row[j];
                    row[j] = row[j+1]
                    row[j+1]= temp
                }
            }
        }
    }

    for ( row in a){
        println(row.joinToString(" "))
    }

}