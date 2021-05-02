import scala.annotation.tailrec

object Task3 {

  val daysOfWeek = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def calculate(): Unit = {
    println("Zad 3")
    println("Tail recursion")
    var result = task3TailRecursive("", daysOfWeek)
    println(result)
    println("------------------------------------------------------------------------------------------")
  }

  @tailrec
  def task3TailRecursive(currentResult: String, days: List[String]): String = {
    if (days.isEmpty) {
      return currentResult
    }
    if (currentResult.isBlank) {
      return task3TailRecursive(currentResult + days(0), days.slice(1, days.length))
    }
    else {
      return task3TailRecursive(currentResult + ", " + days(0), days.slice(1, days.length))
    }
  }
}