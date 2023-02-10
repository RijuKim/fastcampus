package fastcampus.part0.lecture_kotlin

fun main() {
    println("Hello world!!")
    println(test(1, 2))
}

// 2. 함수
fun test(a: Int, b: Int = 3): Int {
    println(a + b)
    return a + b
}

/*
    1. 함수는 fun+이름
    2. 모든 함수에는 리턴값이 존재해야 하며, 리턴값이 없을 시 void와 같은 unit을 사용한다.(생략 가능)
    3. 오버로딩을 따로 만들지 않아도 됨
    4. 트레이닝 컴마가 들어가도 컴파일 에러 발생 x
 */
