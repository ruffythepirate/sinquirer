package inquirer.questions

import inquirer.Answer

abstract class Question() {

  val text: String

  def validate(answer: Answer): Boolean = {
    true
  }
}

case class StringQuestion(val text: String) extends Question()


