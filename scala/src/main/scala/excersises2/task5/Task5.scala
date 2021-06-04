package excersises2.task5

object Task5 {

  def calculate(): Unit = {
    var person1 = new Person("Adam", "Abacki", 111.1);
    var person2 = new Person("Bartek", "Babacki", 222.2) with Employee {
      override var salary: Double = 1000
    }
    var person3 = new Person("Czarek", "Cabacki", 333.3) with Student{
      override var salary: Double = 1000
    }
    var person4 = new Person("Dawid", "Dabacki", 444.4) with Teacher{
      override var salary: Double = 1000
    }

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