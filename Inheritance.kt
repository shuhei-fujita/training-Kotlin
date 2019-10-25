//継承
//User -> AdminUser

class AdminUser(name: String): User3 (name) {
    fun hello() {
        println("hello $name")
    }

    override fun hi() {
        println("[admin] hi $name")
    }
}

open class User3 (var name: String) {   //継承してもいいと明示するために，親クラスにopenをかく
    open fun hi() {
        println("hi $name")
    }
}

fun main(args: Array<String>) {
    val bob = AdminUser("bob")
    println(bob.name)
    bob.hello()
    bob.hi()
}