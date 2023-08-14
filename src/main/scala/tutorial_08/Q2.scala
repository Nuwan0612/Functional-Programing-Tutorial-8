package tutorial_08

object Q2 {
  val checkNumber: Int => String = (number: Int) =>
    if(number < 0) "Negative"
    else if(number == 0) "Zero"
    else if(number % 2 == 0) "Even"
    else "Odd"

  def main(args: Array[String]): Unit = {
    print("Enter the integer number: ")
    val num = scala.io.StdIn.readInt()
    println("Number Type: " + checkNumber(num))
  }
}
