package com.ygaller

data class QuestionAndAnswer(val questions: Questions, val answer: String) {
  companion object {
    fun fromQuestionIdAndAnswer(questionId: String, answer: String) =
        QuestionAndAnswer(Questions.fromId(questionId), answer)
  }
}
