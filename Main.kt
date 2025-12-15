        fun main() {
    val userName: String = "walid"
    val password: String = "2010"

    println("welcome to login-page ")
    println("enter your usenname:")
    val inputUserName = readLine()
    println("enter your password ${inputUserName}")
    val inputPassword = readLine()

    if (inputUserName == userName && inputPassword == password) {
        println("login successful")
    } else {
        println("failed to login")
    }
    var attempts = 3
    while (attempts > 0) {
        println("please try again")
        println("enter your usenname:")
        val inputUserName = readLine()
        println("enter your password ${inputUserName}")
        val inputPassword = readLine()

        if (inputUserName == userName && inputPassword == password) { break 
            println("login successful")
        } else {
            println("failed to login")
        }


    }
}