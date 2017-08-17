package i_introduction._4_Lambdas

fun example() {

    val sum = { x: Int, y: Int -> x + y }
    val square: (Int) -> Int = { x -> x * x }

    sum(1, square(2)) == 5
}

fun task4(collection: Collection<Int>): Boolean {
    return collection.stream().anyMatch { element -> element % 42 == 0 }
}
