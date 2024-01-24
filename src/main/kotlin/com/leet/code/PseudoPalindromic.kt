package com.leet.code

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}


class PseudoPalindromic {
    fun pseudoPalindromicPaths(root: TreeNode?): Int {
        dfs(root, 0)
        return result
    }

    private var result = 0

    private fun dfs(root: TreeNode?, path: Int) {
        var path = path
        if (root == null) return
        if (root.left == null && root.right == null) {
            path = path xor (1 shl root.`val`)
            if ((path and (path - 1)) == 0) ++result
            return
        }

        dfs(root.left, path xor (1 shl root.`val`))
        dfs(root.right, path xor (1 shl root.`val`))
    }
}

fun main (){
    println(PseudoPalindromic().pseudoPalindromicPaths(TreeNode(1)))
}