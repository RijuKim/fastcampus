package fastcampus.part0.lecture_kotlin

fun main() {
    val user = User("김리주")
    println(user.age)
    val kid = Kid("아이", 3, "male")
}

// 상속
open class User(open val name: String, open var age: Int = 100)

// 생성시 constructor와 property 역할을 한번에 가능, 디폴트값 넣기 가능, init -> 부생성자 호출
class Kid(override val name: String, override var age: Int) : User(name, age) {
    var gender: String = "female"

    init {
        println("초기화 중 입니다.")
    }

    // 프레그먼트 초기화 시 사용 가
    constructor(name: String, age: Int, gender: String) : this(name, age) {
        this.gender = gender
        println("부생성자 호출")
    }
}
