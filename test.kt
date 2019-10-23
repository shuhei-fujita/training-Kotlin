/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
    println("Hello, world!")
    
    //定数の宣言
    val a: Int = 1
    
    println(a)
    
    //定数の宣言だけ，代入
    val b: Double
    b = 1.1
    
    println(b)
    
    //型の変換
	val str: String = "64"
    val intVal: Int = str.toInt()
    println(intVal)
    
    val num: Int = 64
    val stringVal: String = str.toString()
    println(stringVal)
    
}