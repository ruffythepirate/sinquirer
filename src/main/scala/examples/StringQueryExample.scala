package examples

import inquirer.{Inquirer, StringQuestion}
import inquirer.input.Input
import inquirer.screen.Output

object StringQueryExample {

  def run(input: Input, output: Output): Unit = {

    val inq = new Inquirer(input, output)

    val answer = inq.prompt(
      StringQuestion("Why not?")
    )
  }
}
