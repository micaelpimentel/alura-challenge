fun main() {
    println("Bem vindo ao curso Gigabyte")

    try {
        Course(
            name = "Introdução ao Kotlin - básico",
            code = "abc-def",
            hours = 10,
            isPrivate = false,
            instructorName = "Micael Pimentel"
        ).toString().also(::println)

        Course(
            name = "Polimorfismo e Heranças em Kotlin",
            code = "efd-qpweop",
            hours = 8,
            isPrivate = false,
            instructorName = "Micael Pimentel"
        ).toString().also(::println)

    } catch (e: Exception) {
        println(e)
    }

    val atividade1 = AssigmentExplanation("Descriçao da atividade 1")
    val atividade2 = AssigmentVideo("youtube.com", 12,"Transcrição do video")
    val atividade3 = AssigmentQuestion("Descrição da atividade 3", 3)

    val atividade = Assigment("Atividade", "asd-fgf",1,false, atividade1)
}