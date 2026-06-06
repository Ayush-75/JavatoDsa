package backtracking

fun main(args: Array<String>) {

    val mat = arrayOf(
        intArrayOf(1, 1, 1, 0),
        intArrayOf(1, 0, 0, 1),
        intArrayOf(1, 1, 0, 0),
        intArrayOf(1, 1, 1, 1)
    )

    val n = mat.size
    val m = mat[0].size

    val vis = Array(n) { BooleanArray(m) }
    vis[0][0] = true

    ratInMaze(mat,vis,0,0,"",n,m)
}

fun isValid(i: Int, j: Int, mat: Array<IntArray>, vis: Array<BooleanArray>, n: Int, m: Int): Boolean {
    return i < n && i >= 0 && j < m && j >= 0 && mat[i][j] == 1 && !vis[i][j]
}

fun ratInMaze(mat: Array<IntArray>, vis: Array<BooleanArray>, i: Int, j: Int, path: String, n: Int, m: Int) {
    if (i == n - 1 && j == m - 1) {
        println(path)
        return
    }

    // move down
    if (isValid(i + 1, j, mat, vis, n, m)) {
        vis[i + 1][j] = true
        ratInMaze(mat, vis, i + 1, j, path + 'D', n, m)
        vis[i + 1][j] = false
    }

    // moves left
    if (isValid(i, j - 1, mat, vis, n, m)) {
        vis[i][j - 1] = true
        ratInMaze(mat, vis, i, j - 1, path + 'L', n, m)
        vis[i][j - 1] = false
    }

    // moves right
    if (isValid(i, j + 1, mat, vis, n, m)) {
        vis[i][j + 1] = true
        ratInMaze(mat, vis, i, j + 1, path + 'R', n, m)
        vis[i][j + 1] = false
    }
    if (isValid(i - 1, j, mat, vis, n, m)) {
        vis[i - 1][j] = true
        ratInMaze(mat, vis, i - 1, j, path + 'U', n, m)
        vis[i - 1][j] = false
    }
}

