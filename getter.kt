class User2(var name: String) {
    var team = "red"
    //getter
    get () {
        return field.toUpperCase()  //touppercase 大文字に変換,ここで設定する値は特殊な変数fieldで表される
    }
    
    //setter
    set(value) {    //設定される値が()内に入ってくるされる
        //空文字だった時無視するの処理
        if (value != "") {
            field = value
        }
    }

    fun hi(){
        println("hi $name")
    }

}

fun main(args: Array<String>) {
    val tom = User2("tom")
    println(tom.team)
}
