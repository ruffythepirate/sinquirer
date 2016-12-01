package inquirer

import inquirer.input.Input
import screen.Output

import scala.collection.mutable

class Inquirer(input: Input, output: Output) {


  def prompt(questions: Question*): Seq[Answer] = {

    val answers = mutable.ArrayBuffer[Answer]()

    for(q <- questions) {
      output.render(q.text)

      val answer = input.readString()
      answers.append(Answer(answer))
    }

    answers.toSeq
  }

}
