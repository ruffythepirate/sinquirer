import inquirer.{Inquirer, StringQuestion}
import inquirer.input.Input
import inquirer.input.impl.ConsoleInput
import inquirer.screen.Output
import inquirer.screen.impl.ConsoleOutput

object Main extends App {

  Example.run(new ConsoleInput, new ConsoleOutput() )
}

object Example {

  def run(input: Input, output: Output): Unit = {

    val inq = new Inquirer(input, output)

    val answer = inq.prompt(
      StringQuestion("Why not?")
    )
  }

}


