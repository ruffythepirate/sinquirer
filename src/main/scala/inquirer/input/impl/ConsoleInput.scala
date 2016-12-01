package inquirer.input.impl

import inquirer.input.Input

class ConsoleInput  extends Input {

  val sc = new java.util.Scanner(System.in)

  override def readString(): String = {
    sc.next()
  }

  override def readInt(): Int = {
    sc.nextInt()
  }
}
