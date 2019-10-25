/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
    println("Hello, world!")
    
    //定数の宣言,valは定数の宣言に使う
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

    //nullを代入できない型と，できる型
    //null非許容型，null許容型
    //定数，変数宣言時に型が指定されたらnullを，通常では代入することはできない
    //?をつけると許容型になる
    var text: String? = null

    //valは再代入できない
    val msg: String = "Hello World"
    println(msg)

    //データ型の基礎
    val c: Char = 'a'

    val i: Int = 100
    val l:Long = 555555555555L
    val d: Double = 5555.5555
    val f: Float = 555.555F

    val flag: Boolean = true

    println(flag)

    //データ演算　+-*%
    val x:Int = 10
    println(x / 3)
    println(x / 3.0)
    println(x % 3)

    //++ --
    var y = 5
    y++
    println(y)

    y--
    println(y)

    var z = 4
    z += 12  //z = z + 12

    val flag2:Boolean = true
    println(!flag2)

    //文字列を扱う
    println("hello" + "world")
    val name: String = "taguchi"
    println("my name is $name")

    println("my score is ${12 + 32}")

    // \nで改行
    // \でタブ
    println("hello\nhello\tworld")

    //比較演算子
    //ifで条件分岐
    // > >= < <= == !=
    val score: Int = 86
    // if (score > 80) {
    //     println("great")
    // } else if (score > 60) {
    //     println("good")
    // } else {
    //     println("so so...")
    // }

    //ifは式なので，「値を返すことができる」
    val result = if (score > 80) "Great" else "so so..."
    println(result)

    //whenによる条件分岐
    //他の言語でいう，swich
    val num2: Int = 3

    // when (num2) {
    //     0 -> println("Zero")
    //     1 -> println("One")
    //     2, 3 -> println("Two or Three")

    //     //範囲を示す演算子
    //     in 4..10 -> println("Many")
        
    //     else -> println("Other")
    // }

    //whenは式なので，「値を返すことができる」
    val num3: Int = 5
    val result3 = when (num3) {
        0 -> "Zero"
        1 -> "One"
        2, 3 -> "Two or Three"

        //範囲を示す演算子
        in 4..10 -> "Many"
        
        else -> "Other"
    }
    println(result3)

    //ループ処理
    //whileを使う
    var i2: Int = 0

    //()内の条件が満たされている間，繰り返す
    while (i2 < 10) {
        println("loop: $i2")
        i2++
    }
    
    var i3: Int = 100
    do {
        println("loop2: $i3")
        i3++
    } while (i3 < 10)
}