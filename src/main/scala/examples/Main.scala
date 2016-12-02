package examples

import inquirer.input.Input
import inquirer.input.impl.ConsoleInput
import inquirer.screen.Output
import inquirer.screen.impl.ConsoleOutput
import inquirer.{Inquirer, StringQuestion}

object Main extends App {

  StringQueryExample.run(new ConsoleInput, new ConsoleOutput() )
}




