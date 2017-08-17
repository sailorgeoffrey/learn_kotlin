package i_introduction._3_Default_Arguments

fun foo(name: String, toUpperCase: Boolean = false, number: Int = 42): String {
    return if (toUpperCase) {
        name.toUpperCase()
    } else {
        name
    } + number
}

fun task3(): String {
    return (foo("a") +
            foo("b", number = 1) +
            foo("c", toUpperCase = true) +
            foo(name = "d", number = 2, toUpperCase = true))
}