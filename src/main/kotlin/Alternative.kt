class Alternative(
    val explanation: String,
    val ordinal: Int,
    val isCorrectAnswer: Boolean,
    val justification: String,
    val question: AssigmentQuestion
) {
    init {
        if (explanation.isBlank())
            throw IllegalArgumentException("Explicação não pode ser vazio")
    }

    override fun toString(): String {
        return "Alternative(explanation='$explanation', ordinal=$ordinal, isCorrectAnswer=$isCorrectAnswer, justification='$justification', question=${question.description})"
    }
}