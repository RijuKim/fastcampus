package fastcampus.part0.lecture_kotlin.chapter2

/*
    1. object: 클래스를 정의함과 동시에 객체 생성
        - 싱글톤을 쉽게 만들 수 있는 키워드
        - 생성자 사용 불가
        - 프로퍼티, 메서드, 초기화 블록 사용 가능
        - 다른 클래스나 인터페이스 상속 가능

    2. Companion object
        - Java의 static과 동일한 역할
        - 클래스 내에 하나만 생성 가능

 */

fun main() {
    Counter
    println(Counter.count)
    Counter.countUp()
    Counter.countUp()
    println(Counter.count)

    Book.NAME
}

object Counter {
    init {
        println("카운터 초기화")
    }

    var count = 0
    fun countUp() {
        count++
    }
}

class Hello() {
    fun hello() = println("Hello")
}

class Book {
    // static과 같은 역할
    companion object {
        const val NAME = "hello"
    }
}
