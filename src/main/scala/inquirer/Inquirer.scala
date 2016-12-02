package inquirer

import inquirer.input.Input
import inquirer.questions.Question
import screen.Output

import scala.collection.mutable

class Inquirer(input: Input, output: Output) {


  def prompt(questions: Question*): Seq[Answer] = {

    val answers = mutable.ArrayBuffer[Answer]()

    for(q <- questions) {

      var answer: Answer = null

      do {
        output.render(q.text)

        answer = Answer(input.readString())
      } while(! q.validate(answer))

      answers.append(answer)
    }

    answers.toSeq
  }

}
