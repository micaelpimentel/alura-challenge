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

    val atividade = Assigment("Atividade", "asd-fgf",1,false, atividade3)

    val alternativa1 = Alternative(
        explanation = "Texto da explicação 1",
        ordinal = 1,
        isCorrectAnswer = false,
        justification = "Tá errado, mano",
        question = atividade3
    ).toString().also(::println)
    val alternativa2 = Alternative(
        explanation = "Texto da explicação 2",
        ordinal = 2,
        isCorrectAnswer = true,
        justification = "Tá certo!",
        question = atividade3
    ).toString().also(::println)
    val alternativa3 = Alternative(
        explanation = "Texto da explicação 3",
        ordinal = 3,
        isCorrectAnswer = false,
        justification = "Errroouuu!!",
        question = atividade3
    ).toString().also(::println)

    val category = Category(
        name = "Nome da Categoria",
        code = "s-ab",
        description = "Descrição sucinta da categoria",
        studyGuideText = "Guia de estudos",
        isActive = true,
        ordinal = 1,
        iconPath = "caminho/do/arquivo.png",
        colorCode = "#0A81EF"
    ).also(::println)
}