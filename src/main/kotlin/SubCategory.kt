class SubCategory(
    val name: String,
    val code: String,
    val description: String,
    val studyGuideText: String,
    val isActive: Boolean = false,
    val ordinal: Int,
    val category: Category
) {
    init {
        if (name.isBlank())
            throw IllegalArgumentException("Nome não pode ser vazio")
        if (code.isBlank())
            throw IllegalArgumentException("Código não pode ser vazio")
        if (!code.matches("^(?:[a-z]-?)+[^-]\$".toRegex()))
            throw IllegalArgumentException("Código deve ser composto por letras minusculas separadas por -")
    }
}