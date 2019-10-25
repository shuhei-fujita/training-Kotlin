//関数を作る試み

//関数を定義してみる
fun hello(name: String = "noneData", age: Int = 0):Unit {   //引数に初期値を与える
    println("hello $name $age")
}

//関数の返り値を使ってみる
//関数を渡すのではなく，値のみを渡すイメージ
fun hi(): String {
    return "hi!"
}

fun main(args: Array<String>) {
    // hello()    //関数を呼び出す
    hello("tom", 23)  //引数を渡してみる
    hello() //引数を与えなければ，初期値が表示される
    hello(age = 23, name = "Bob")   //こう書けば，引数を与える順番は選べる
    
    //関数の返り値を使ってみる
    val msg = hi()
    println(msg)
    println(hi())
}
