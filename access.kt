//アクセス修飾子

//public　どこからでも
//protected　そのクラス＋サブクラス
//private　そのクラス内でのみ使えるプロパティ

class AdminUser2(name: String):User4(name) {
        fun hello() {
          println("hello $name")
        }
        
        override fun hi() {
          println("[admin] hi $name")
        }
}

class User4(protected var name: String){
    open fun hi() {
        println("hi $name")
    }
}

fun main(args: Array<String>) {
    val bob = AdminUser2("bob")
}
