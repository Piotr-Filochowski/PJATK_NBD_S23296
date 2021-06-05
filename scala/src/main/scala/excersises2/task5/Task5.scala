package excersises2.task5

object Task5 {


  def calculate(): Unit = {
    println("Zad 5")
    var person1 = new Person("person", "Abacki", 0.5)
    var employee = new Person("employee", "Babacki", 222.2) with Employee
    var student = new Person("student", "Cabacki", 333.3) with Student
    var teacher = new Person("teacher", "Dabacki", 444.4) with Teacher
    println("Im " + person1.name + " my tax is " + person1.tax)
    println("Im " + employee.name + " my tax is " + employee.tax)
    println("Im " + student.name + " my tax is " + student.tax)
    println("Im " + teacher.name + " my tax is " + teacher.tax)


    var studentEmployee = new Person("student employee", "Cabacki", 333.3) with Student with Employee
    var employeeStudent = new Person("employee Student", "Cabacki", 333.3) with Employee with Student
    println("Im " + studentEmployee.name + " my tax is " + studentEmployee.tax)
    println("Im " + employeeStudent.name + " my tax is " + employeeStudent.tax)

  }
}


/*

Zdefiniuj klasę Osoba i trzy traity: Student, Nauczyciel, Pracownik.

Osoba powinna mieć własności read only: imie, nazwisko, podatek.

Pracownik powinien mieć własność pensja (z getterem i seterem).

Student i Pracownik powinni przesłaniać własność podatek – dla Studenta zwracamy 0, dla Pracownika 20% pensji.

Nauczyciel powinien dziedziczyć z Pracownika, dla niego podatek zwraca 10% pensji.


Stwórz obiekty z każdym z traitów, pokaż jak podatek działa dla każdego z nich.
Stwórz obiekty z traitami Student i Pracownik,
pokaż jak podatek zadziała w zależności od kolejności w jakiej te traity zostały dodane przy tworzeniu obiektu.
*/