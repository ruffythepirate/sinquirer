package inquirer.screen.impl

import inquirer.screen.Output

class ConsoleOutput extends Output {

  def render(text: String) = {
    println(text)
  }

}
