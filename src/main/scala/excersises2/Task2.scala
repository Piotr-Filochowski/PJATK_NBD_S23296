package excersises2

object Task2 {

  def calculate(): Unit = {
    println("Zad2")
    println("Using no args constructor")
    val bankAccount = new BankAccount()
    println("Init balance " + bankAccount.balance)
    println("Using constructor with param")
    val bankAccount2 = new BankAccount(6)
    println("Current balance " + bankAccount2.balance)
    println("Adding 5$")
    bankAccount2.payInMoney(5)
    println("Current balance " + bankAccount2.balance)
    println("Paying out 3$")
    bankAccount2.payOutMoney(3)
    println("Current balance " + bankAccount2.balance)
    println("Trying to pay out  10$")
    bankAccount2.payOutMoney(10)
    println("Current balance " + bankAccount2.balance)
    println("------------------------------------------------------------------------------------------")
  }

}
