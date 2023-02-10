package fastcampus.part0.lecture_kotlin

// 컬렉션(list, map, set)
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.add(6)
    list.addAll(listOf(7, 8, 9))

    val list1 = listOf(1, 2, 3, 4)

    println(list.joinToString { "," })

    mapOf((1 to "안녕"), (2 to "hello"))
}
