package fastcampus.part0.lecture_kotlin

fun main() {
    max(10, 3)
    max2(10, 3)
    isHoliday("금")
}

fun max(a: Int, b: Int) {
    val result = if (a > b) {
        println(a)
    } else {
        println(b)
    }
    println(result)
} // unit 출력

fun max2(a: Int, b: Int) {
    val result = if (a > b) {
        a
    } else {
        b
    }
    println(result)
} // 10 출력

// switch 대신 when 사용
// 월 화 수 목 금 토 일
fun isHoliday(dayOfWeek: String) {
    val result = when (dayOfWeek) {
        "토",
        "일",
        -> true
        else -> false
    }

    println(result)
}
