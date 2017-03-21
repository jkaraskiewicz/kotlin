// !LANGUAGE: +ArrayLiteralsInAnnotations

annotation class Anno(val a: Array<String> = [""], val b: IntArray = [])

@Anno([], [])
fun test() {}

fun arrayOf(): Array<Int> = TODO()
fun intArrayOf(): Array<Int> = TODO()