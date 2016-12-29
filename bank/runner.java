public class runner {
    public static void main(String[] args) {
        employee emp1 = new employee();
        employee emp2 = new employee();
        employee emp3 = new employee();
        customer cus1 = new customer();
        customer cus2 = new customer();
        customer cus3 = new customer();
        cus1.setMoney(1700);
        cus2.setMoney(2000);
        cus3.setMoney(20000);
        cus3.CusTransaction(2000, cus3, cus2);
        System.out.println(cus2.getMoney());
        System.out.println(cus3.getMoney());
    }
}
