package excersises2

class BankAccount(_balance: Int = 0){

    private var balance = _balance

    def getBalance = _balance


    def payInMoney(money: Int): Unit = {
        balance += money
    }

    def payOutMoney(money: Int): Unit = {
        if(balance > money) {
            balance -= money
        }
    }
}


/*
- to jest gotowe
* */