package excersises2

class BankAccount(var _balance: Int = 0){

    def balance = _balance

    def payInMoney(money: Int): Unit = {
        _balance += money
    }

    def payOutMoney(money: Int): Unit = {
        if(_balance > money) {
            _balance -= money
        }
    }
}

