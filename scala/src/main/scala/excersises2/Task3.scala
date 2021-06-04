package excersises2

object Task3 {

  val people = List(
    Person2("Piotr", "A"),
    Person2("Adam", "B"),
    Person2("Ola", "C"),
    Person2("Wojtek", "D"))

  def calculate(): Unit = {
    println("Zad 3")
    people.foreach(person => println(sayHello(person)))
    println("------------------------------------------------------------------------------------------")
  }

  def sayHello(person: Person2): String = {
    person match {
      case Person2("Piotr", surname) => "Witaj Piotrze " + surname
      case Person2("Adam", surname) => "Witaj Adamie " + surname
      case Person2("Ola", surname) => "Witaj Olu " + surname
      case _ => "Hello stranger"
    }
  }
}
