
fun main() {

    // A 2D array where each row is sorted independently using bubble sort.
    // Note: Kotlin allows rows to have different sizes.
    val a = arrayOf(
        intArrayOf(5, 7, 8),
        intArrayOf(6, 5, 8,6,5),
        intArrayOf(1, 6, 8),
        intArrayOf(1, 7, 9),
    )

    // Loop through every row in the 2D array.
    for (row in a){
        // Number of elements in the current row.
        val n = row.size

        // Bubble sort for the current row.
        // Outer loop controls how many passes we make.
        for ( i in 0 until n-1){
            // Inner loop compares adjacent elements and swaps them if needed.
            for ( j in 0 until n-1-i){
                if (row[j] > row[j+1]){
                    // Swap the two values.
                    val temp = row[j]
                    row[j] = row[j+1]
                    row[j+1]= temp
                }
            }
        }
    }

    // Print the sorted rows one by one.
    for ( row in a){
        println(row.joinToString(" "))
    }

}