package inquirer.input

trait Input {

  def readString(): String

  def readInt(): Int
}
