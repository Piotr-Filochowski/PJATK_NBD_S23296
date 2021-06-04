
object Task2 {
  val daysOfWeek = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def calculate(): Unit = {
    println("Zad 2")
    println("a. recursive")
    println(task2RecurentFunction("", daysOfWeek))
    println("b. recursive reverse")
    println(task2RecurentReverse("", daysOfWeek))
    println("------------------------------------------------------------------------------------------")
  }

  def task2RecurentFunction(concat: String, days: List[String]): String = {
    if (days.isEmpty) {
      return concat
    } else return task2RecurentFunction(concat + days.head + " ", days.tail)
  }

  def task2RecurentReverse(concat: String, days: List[String]): String = {
    if (days.isEmpty) {
      return concat
    } else return task2RecurentReverse(concat + daysOfWeek.last + " ", daysOfWeek.init)
  }
}


/*
- zamiast index wziac head i tail przy przetwarzaniu listy

+ znowu czysta funkcja

+ przeniesc days of the week jako parametr, nie jako zmienna globalna



DONE

* */