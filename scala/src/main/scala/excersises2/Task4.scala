package excersises2

object Task4 {

  def duplicate(input: Int): Int = {
    input + input
  }

  def calculate(): Unit = {
    println("Zad 4")
    println(myAwesomeFunction(2, duplicate))
    println("------------------------------------------------------------------------------------------")
  }

  def myAwesomeFunction(myInt: Int, worker: Int => Int): Int = {
    worker(worker(worker(myInt)))
  }
}
