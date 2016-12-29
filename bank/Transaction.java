public class Transaction {
    public void transaction(int i, customer a, customer b){
        a.setMoney(a.getMoney() - i);
        b.setMoney(b.getMoney() + i);
    }
}

