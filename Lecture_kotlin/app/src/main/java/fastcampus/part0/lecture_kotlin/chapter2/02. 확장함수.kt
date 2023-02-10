package fastcampus.part0.lecture_kotlin.chapter2

fun main() {
    // 확장함수 Extension function
    // 기존에 정의되어 있는 클래스에 함수를 추가하는 기능
    val test = Test()
    Test().hello()
    test.hi()
}

// 커스텀을 위해 새로운 함수를 쓰지 않아도 됨
fun Test.hi() = print("하이")

class Test() {
    fun hello() = println("안녕")
    fun bye() = println("잘가")
}
