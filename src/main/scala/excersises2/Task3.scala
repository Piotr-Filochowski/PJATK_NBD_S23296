package excersises2

object Task3 {

  val people = List(
    new Person2("Piotr", "A"),
    new Person2("Adam", "B"),
    new Person2("Ola", "C"),
    new Person2("Wojtek", "D"))

  def calculate(): Unit = {
   println("Zad 3")
    people.foreach(person => println(sayHello(person)))
    println("------------------------------------------------------------------------------------------")
  }

  def sayHello(person: Person2): String = {
    person.name match {
      case "Piotr" => "Hello Piotr!"
      case "Adam" => "Hi Adam!"
      case "Ola" => "Hi Ola!"
      case _ => "Hello stranger"
    }
  }

}
