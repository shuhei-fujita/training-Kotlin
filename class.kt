//クラスを作ってみる
//データ　＝　プロパティ
//関数　＝　メソッド

class User(var name: String) {  //コンストラクタ引数
    // val name = "me"

    fun hi() {
        println("hi $name")
    }

}

fun main(args: Array<String>) {
    // val user = User()   //このuserをクラスのインスタンスと呼ぶ

    // println(user.name)
    // user.hi()

    //コンストラクタ
    //インスタンスの生成の時に，プロパティーの値を設定したい時
    val tom = User("tom")   //インスタンス生成時の引数を，クラスに渡す

    println(tom.name)
    tom.hi()

    val bob = User("bob")   //インスタンス

    println(bob.name)
    bob.hi()
}
