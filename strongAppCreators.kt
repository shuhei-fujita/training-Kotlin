
fun main(args: Array<String>) {
    //0から１００まで繰り返す処理
    var x = 0
    while (x <= 100) {
        val count = if (x % 3 == 0) {
            print("strong-app-creators\n")
        } else {
            print(x)
            print("\n")
        }
        x++
    }

}