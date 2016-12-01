package inquirer

abstract class Question(val text: String)

case class StringQuestion(override val text: String) extends Question(text)


