package fastcampus.part0.lecture_kotlin.chapter2

/*Data class: 데이터를 담기 위한 클래스
    - toString(), hashCode(), equals(), copy() 매서드를 자동으로 생성
        override하면 직접 구현한 코드를 사용
    - 1개 이상의 property가 있어야 함
    - 데이터클래스는 abstract, open, sealed, inner를 붙일 수 없음
    - 상속이 불가능

  Sealed class: 추상 클래스로, 상속 받은 자식 클래스의 종류를 제한
    - 컴파일러가 sealed 클래스의 자식 클래스가 어떤 것인지 앎
    - when과 함께 쓰일 떄 장점 있음
 */

fun main() {
    val person = Person("리주", 24)
    val dog = Dog("구름", 11)

    println(person.toString())
    println(dog.toString())
    println(dog.copy(age = 3).toString())

    val cat: Cat = BlueCat()
    val result = when (cat) {
        is BlueCat -> "blue"
        is RedCat -> "red"
        is GreenCat -> "green"
        // else -> "none"
    }

    println(result)
}

class Person(
    val name: String,
    val age: Int,
)

class Rabbit()

data class Dog(
    val name: String,
    val age: Int,
) {
    override fun toString(): String {
        return "직접 구현: $name"
    }
}

// Sealed class
sealed class Cat
class BlueCat : Cat()
class RedCat : Cat()
class GreenCat : Cat()
