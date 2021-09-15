class Assigment(
    val name: String,
    val code: String,
    val ordinal: Int,
    val isActive: Boolean = false,
    val type: AssigmentType,
    val section: Section? = null
) {
    init {
        if (name.isBlank())
            throw IllegalArgumentException("Nome do curso não pode ser vazio")
        if (code.isBlank())
            throw IllegalArgumentException("Código não pode ser vazio")
        if (!code.matches("^(?:[a-z]-?)+[^-]\$".toRegex()))
            throw IllegalArgumentException("Código deve ser composto por letras minusculas separadas por -")
    }
}