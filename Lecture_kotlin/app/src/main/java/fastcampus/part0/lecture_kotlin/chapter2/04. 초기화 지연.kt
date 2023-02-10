package fastcampus.part0.lecture_kotlin.chapter2

// 초기화 지연
/*
    -정의: 변수를 선언할 때 값을 지정하지 않고, 나중에 지정할 수 있는 방법
    - 목적: 효율적 메모리 사용, null safe한 value 사용
    lateinit, var
        - 변수타입 지정해줘야함
        - primitive 타입 사용 불가
        - 선언 후 나중에 초기화 가능
    lazy, val
        - 선언과 동시에 초기화해야함
        - 호출시점에 초기화
 */

lateinit var text: String
lateinit var age: Integer
val test: Int by lazy {
    println("초기화 중")
    100
}

fun main() {
    text = "name"
    println(text)
    println("메인 함수 실행")
    println("초기화한 값 $test")
    println("두번째 호출 $test")
}
