package inquirer

import inquirer.input.Input
import inquirer.questions.{Question, StringQuestion}
import inquirer.screen.Output
import org.scalatest.mock.MockitoSugar
import org.scalatest.{BeforeAndAfter, Matchers, WordSpec}
import org.mockito.Mockito._
import org.mockito.ArgumentMatchers.any


class InquirerSpec extends WordSpec with Matchers with BeforeAndAfter with MockitoSugar {

  var input: Input = _
  var output: Output = _

  var cut: Inquirer = _

  var stringQuestion = StringQuestion("What can you say?")

  before {
    input = mock[Input]
    output = mock[Output]

    cut = new Inquirer(input, output)
  }


  "Inquirer.prompt" should {

    "render a question" in {
      cut.prompt(stringQuestion)

      verify(output).render(any())
    }

    "ask user for input" in {
      cut.prompt(stringQuestion)

      verify(input).readString
    }

    "return an answer" in {
      when(input.readString).thenReturn("string")

      val answer = cut.prompt(stringQuestion)

      assert(answer.size === 1)
    }

    "ask again" when {
      "validation fails" in {
        when(input.readString).thenReturn("string")

        val question = mock[StringQuestion]
        when(question.validate(any())).thenReturn(false).thenReturn(true)


        val answer = cut.prompt(question)
        verify(input, times(2)).readString

      }
    }
  }

}
