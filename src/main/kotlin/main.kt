fun main() {
    println("Bem vindo ao curso Gigabyte")

    val curso: Course

    try {
        curso = Course(
            name = "Introdução ao Kotlin - básico",
            code = "abc-def",
            hours = 10,
            isPrivate = false,
            instructorName = "Micael Pimentel"
        )
        println(curso.toString())
    } catch (e: Exception) {
        println(e)
    }

    val atividade1 = AssigmentExplanation("Descriçao da atividade 1")
    val atividade2 = AssigmentVideo("youtube.com", 12,"Transcrição do video")
    val atividade3 = AssigmentQuestion("Descrição da atividade 3", 3)

    val atividade = Assigment("Atividade", "asd-fgf",1,false, atividade1)
}