package fastcampus.part0.lecture_kotlin

fun main() {
    var name: String = "리주"

    var nickname: String? = null

/*    val result: if(nickname==null){
        "값이 없음"
    } else{
        nickname
    }
*/
    val result = nickname ?: "값이 없음"
    println(result)
}
