package tutorial_08

object Q3 {
  val toUpper: String => String = (str: String) => str.toUpperCase()
  val toLower: String => String = (str: String) => str.toLowerCase()
  val charterToUpper: (String, Int) => String = (str: String, index: Int) =>
    str.updated(index, str.charAt(index).toUpper)

  val formatNames: (String, String => String) => String = (name, func) => func(name)
  val formatCharacterName: (String, Int, (String, Int) => String) => String = (name, index, func) => func(name, index)



  def main(args: Array[String]): Unit = {
    println(formatNames("Benny",toUpper))
    println(formatCharacterName("Niroshan", 1, charterToUpper))
    println(formatNames("Saman",toLower))
    println(formatCharacterName("Kumara", 5, charterToUpper))
  }
}
