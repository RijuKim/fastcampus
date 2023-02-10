package fastcampus.part0.lecture_kotlin.chapter2

// Scope function 범위 지정함수
/*
    - 코틀린 표준 라이브러리에서 제공하는 확장함수
    - 목적: 간결성, 명료성, 유지보수 용이성
    - 정의: 객체의 context 내에서, 실행 가능한 코드 블럭을 만드는 함수.
           호출 시 임시 범위가 생성되며, 이 범위 안에서는 이름 없이 객체에 접근 가능
    - 수신 객체(receiver) : 확장 함수가 호출되는 대상이 되는 값(객체)
    - 수신 객체 지정 람다: 수신 객체를 명시하지 않고, 람다의 본문 안에서 해당 객체의 매서드를 호출할 수 있게 하는 것
    - 차이점
        수신 객체 접근 방법: this, it
        return 값: 수신객체, 마지막 행 (lambda result)
    - let: null 체크를 해야할 때, 지역 변수를 명시적으로 표현해야할 때
    - run: 객체를 초기화하고 리턴 값이 있을 때
    - apply: 객체 초기화
    - also: 수신객체를 명시적으로 사용하고 싶을 때, 로그를 남길 때
    - with: 객체 초기화, 람다 리턴 값이 필요 없을 때
 */

fun main() {
    // let, run, apply, also
    // 1. let
    // 수신객체.let { user ->
    //
    // 마지막 줄 //return
    // }
    // null safe에 많이 사용, 수신객체를 it으로 받고 명시적으로 변수 선언 가능
    val a = 3
    a.let { }
    val user: User? = User("김리주", 24, true)
    val age = user?.let {
        it.age
    }

//    val age = user.let {
//        user.age
//    }
    println(age)

    // 2. run
    // 수신객체.run { this ->
    //
    // 마지막 줄
    // }
    // 람다 리턴값 수신객체를 this로 받고 생략가능
    val kid = User("아이", 4, false)
    val kidAge = kid.run {
        this.age
    }
    println(kidAge)

    // 3. apply
    // 수신객체.apply {
    //  어떤값
    // }
    // return 값이 수식객체 자기자신
    val female = User("슬기", 20, true, true)
    val femaleValue = female.apply {
        hasGlasses = false
    }
    println(femaleValue.hasGlasses)

    val kidName = kid.apply {
        name
    }
    println(kidName)

    // 4. also
    // 수신객체.also { it -> //local variable
    //
    //
    // } //return 수신객체 (자기자신)
    // apply처럼 초기화 가능
    val male = User("민수", 17, false, true)
    val maleValue = male.also {
        println(it.name)
    }

    // 5. with
    // with(수신객체) {
    // ---
    // 마지막줄
    // }
    val result = with(male) {
        hasGlasses = false
        true
    }
}

class User(
    val name: String,
    val age: Int,
    val gender: Boolean,
    var hasGlasses: Boolean = true,
)
