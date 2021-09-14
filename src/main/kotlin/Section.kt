class Section(
    val name: String,
    val code: String,
    val ordinal: Int,
    val isActive: Boolean = false,
    val isTestExam: Boolean = false,
    val course: Course
) {
    init {
        if (name.isBlank())
            throw IllegalArgumentException("Nome do curso não pode ser vazio")
        if (code.isBlank())
            throw IllegalArgumentException("Código não pode ser vazio")
        if (!code.all { it.isLowerCase() && it.isLetter() || it == '-' })
            throw IllegalArgumentException("Código deve ser composto somente por letras minusculas e -")
    }
}