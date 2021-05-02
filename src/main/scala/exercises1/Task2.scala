
object Task2 {
  val daysOfWeek = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def calculate(): Unit = {
    println("Zad 2")
    println("a. recursive")
    println(task2RecurentFunction("", 0))
    println("b. recursive reverse")
    println(task2RecurentReverse("", daysOfWeek.length - 1))
    println("------------------------------------------------------------------------------------------")
  }

  def task2RecurentFunction(concat: String, currentIndex: Int): String = {
    if (currentIndex == daysOfWeek.length) {
      return concat
    } else return task2RecurentFunction(concat + daysOfWeek(currentIndex) + " ", currentIndex + 1)
  }

  def task2RecurentReverse(concat: String, currentIndex: Int): String = {
    if (currentIndex == -1) {
      return concat
    } else return task2RecurentReverse(concat + daysOfWeek(currentIndex) + " ", currentIndex - 1)
  }
}