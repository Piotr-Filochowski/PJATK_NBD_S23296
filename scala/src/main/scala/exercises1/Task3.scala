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
  def task3TailRecursive(concat: String, days: List[String]): String = {
    if (days.isEmpty) {
      return concat
    }
    if (concat.isBlank) {
      return task3TailRecursive(concat + days.head, days.tail)
    }
    else {
      return task3TailRecursive(concat + ", " + days.head, days.tail)
    }
  }
}


/*
- days.tail zamiast days.slice

done
* */