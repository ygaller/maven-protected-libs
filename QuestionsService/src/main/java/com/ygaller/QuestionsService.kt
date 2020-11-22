package com.ygaller

class QuestionsService {

  fun doSomething() {
    println("We have access to the constant: $REVENUE")

    val answers = listOf(QuestionAndAnswer(Questions.Revenue, "100"))
    println("Generating an answers object: $answers")
  }
}

fun main() {
  QuestionsService().doSomething()
}
