package fastcampus.part0.lecture_kotlin.chapter2

fun main() {
    // 1. 익명 함수
    // 2. 변수처럼 사용돼서, 함수의 argument, return 가능
    // 3. 한 번 사용되고, 재사용 되지 않는 함수
    val a = fun() { println("Hello") }
    val b: (Int) -> Int = { it * 10 } // input, output
    val d = { i: Int, j: Int -> i * j }
    val f: (Int, String, Boolean) -> String = { _, b, _ -> b }

    println(b(10))
    hello(10, b)
}

// 위의 코드 조각이 함수의 argument 처럼 사용될 수 있음
fun hello(a: Int, b: (Int) -> Int): (Int) -> Int {
    println(a)
    println(b(20))
    return b
}
