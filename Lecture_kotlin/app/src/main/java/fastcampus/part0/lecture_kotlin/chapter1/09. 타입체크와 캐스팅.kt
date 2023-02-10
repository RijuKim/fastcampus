package fastcampus.part0.lecture_kotlin

fun main() {
    cast(10)
}

fun cast(a: Any) {
    val result = (a as? String) ?: "실패"
    println(result)
}

// 스마트캐스팅 다시 듣기
