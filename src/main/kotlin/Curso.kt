class Curso(
    var name: String,
    val code: String,
    val hours: Int,
    val isPrivate: Boolean = true,
    val targetAudienceText: String = "",
    val instructorName: String,
    val syllabusText: String = "",
    val skills: String = ""
) {
    init {
        if (name.isBlank())
            throw IllegalArgumentException("Nome do curso não pode ser vazio")
        if (code.isBlank())
            throw IllegalArgumentException("Código não pode ser vazio")
        if (hours !in 1..20)
            throw IllegalArgumentException("Horas deve ser entre 1 e 20")
        if (instructorName.isBlank())
            throw IllegalArgumentException("Nome do instrutor não pode ser vazio")
    }

    override fun toString(): String {
        return "name: $name, code: $code, hours: $hours, isPrivate: $isPrivate, " +
                "targetAudience: $targetAudienceText, instructorName: $instructorName, " +
                "syllabusText: $syllabusText, skills: $skills"
    }
}