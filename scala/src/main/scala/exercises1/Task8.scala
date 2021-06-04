import scala.annotation.tailrec

object Task8 {

  val listOfInts = List(
    1,
    2,
    3,
    0,
    4,
    0,
    123,
    12335234,
    0)

  def calculate(): Unit = {
    println("Zad 8")
    println(filterOutZerosFromList(listOfInts, 0))
    println("------------------------------------------------------------------------------------------")
  }

  @tailrec
  def filterOutZerosFromList(list: List[Int], index: Int): List[Int] = {
    if (index > list.length) {
      return list
    }
    if (list(index) == 0) {
      val trunced = list.take(index) ++ list.drop(index + 1)
      return filterOutZerosFromList(trunced, index + 1)
    } else {
      return filterOutZerosFromList(list, index + 1)
    }
  }
}


/*
- to jest gotowe
* */


