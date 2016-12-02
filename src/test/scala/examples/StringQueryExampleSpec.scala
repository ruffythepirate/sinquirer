package examples

import inquirer.input.Input
import inquirer.screen.Output
import org.scalatest.mock.MockitoSugar
import org.scalatest.{BeforeAndAfter, Matchers, WordSpec}
import org.mockito.Mockito._
import org.mockito.ArgumentMatchers.any

class StringQueryExampleSpec extends WordSpec with Matchers with BeforeAndAfter with MockitoSugar  {

  var input: Input = _
  var output: Output = _

  before{
    input = mock[Input]
    output = mock[Output]
  }

  "StringQueryExample" should {
    "ask for input" in {
      StringQueryExample.run(input, output)

      verify(input).readString
    }

    "print a respons" in {
      when(input.readString).thenReturn("Why not?")
      StringQueryExample.run(input, output)

      verify(output).render(any())
    }
  }


}
