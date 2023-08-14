package tutorial_08

object Q1 {
  val interest: Double => Double = (deposite: Double) =>
    if (deposite <= 20000) 0.02 * deposite
    else if (deposite <= 200000) 0.04 * deposite
    else if (deposite <= 2000000) 0.035 * deposite
    else 0.065 * deposite

  def main(args: Array[String]): Unit = {
    print("Enter the amount: ")
    val amount = scala.io.StdIn.readDouble()
    println("Interest: " + interest(amount))
  }
}
