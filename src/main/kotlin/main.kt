fun main() {
    println("Bem vindo ao curso Gigabyte")

    val curso: Curso

    try {
        curso = Curso(
            name = "Introdução ao Kotlin",
            code = "abcdef",
            hours = 10,
            isPrivate = false,
            instructorName = "Micael Pimentel"
        )
        println(curso.toString())
    } catch (e: Exception) {
        println(e)
    }

}