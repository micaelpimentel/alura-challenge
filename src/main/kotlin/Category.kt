class Category(
    val name: String,
    val code: String,
    val description: String,
    val studyGuideText: String,
    var isActive: Boolean = false,
    val ordinal: Int,
    val iconPath: String,
    val colorCode: String,
) {
    init {
        if (name.isBlank())
            throw IllegalArgumentException("Nome não pode ser vazio")
        if (code.isBlank())
            throw IllegalArgumentException("Código não pode ser vazio")
        if (!code.matches("^(?:[a-z]-?)+[^-]\$".toRegex()))
            throw IllegalArgumentException("Código deve ser composto por letras minusculas separadas por -")
        if (!colorCode.matches("[a-fA-F0-9]{6}".toRegex()))
            throw IllegalArgumentException("Cor deve ser um hexadecimal com seis dígitos")
    }

    override fun toString(): String {
        return "Category(name='$name', code='$code', description='$description', studyGuideText='$studyGuideText', isActive=$isActive, ordinal=$ordinal, iconPath='$iconPath', colorCode='$colorCode')"
    }
}