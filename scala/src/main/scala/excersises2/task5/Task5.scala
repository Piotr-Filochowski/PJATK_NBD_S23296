package excersises2.task5

object Task5 {


  def calculate(): Unit = {
    println("Zad 5")
    val people = List(
//      new Person("person", "Abacki", 0.5),
      new Person("employee", "Babacki", 222.2) with Employee,
      new Person("student", "Cabacki", 333.3) with Student,
      new Person("teacher", "Dabacki", 444.4) with Teacher,
      new Person("student-employee", "Cabacki", 333.3) with Student with Employee,
      new Person("employee-Student", "Cabacki", 333.3) with Employee with Student
    )
    for(person <- people) {
      println(person.toString())
      println("My net income is: " + person.calculateSalaryNet())
      println("My gross income is:  " + person.calculateSalaryGross())
      println("------")
    }
  }
}


/*

all good
*/