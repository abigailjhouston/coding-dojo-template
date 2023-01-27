import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class CalculatorTest extends AnyFunSpec
{
  val calculator = new Calculator()
   it("one plus one returns two") {

   calculator.sum(1,1) shouldBe 2

  }
  it("one times one returns one") (pending)
}
