package fastcampus.part0.lecture_kotlin

fun main() {
    print(1..10 == IntRange(1, 10))

    for (i in 1..10) {
        print(i)
        print(".")
    }

    println()
    for (i in 1 until 10) {
        print(i)
        print(".")
    }

    for (i in 1..10 step(2)) {
        print(i)
        print(".")
    }

    println()

    for (i in 10 downTo 1) {
        print(i)
        print(".")
    }

    // while 자바랑 똑같이
}
