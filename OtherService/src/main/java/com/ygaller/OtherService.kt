package com.ygaller

class OtherService {
  fun doSomething() {
    // Uncommenting this won't compile
//    println("Printing the constant $REVENUE")

    val answers = mapOf(
        "revenue" to "100.0"
    )

    println("""
      The question 'revenue' maps to ${Questions.fromId("revenue")} 
      and we can access the Questions enum: ${Questions.Revenue})
      but we can't access the constant REVENUE, even though Questions uses it
      mapped answers are ${
      answers.map {
        QuestionAndAnswer.fromQuestionIdAndAnswer(it.key, it.value)
      }
    }""".trimIndent())

  }
}

fun main() {
  OtherService().doSomething()
}
