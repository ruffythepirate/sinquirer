package examples

import inquirer.Inquirer
import inquirer.input.Input
import inquirer.questions.StringQuestion
import inquirer.screen.Output

object StringQueryExample {

  def run(input: Input, output: Output): Unit = {

    val inq = new Inquirer(input, output)

    val answer = inq.prompt(
      StringQuestion("Why not?")
    )
  }
}
