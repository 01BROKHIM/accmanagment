public class Main {
    public static void main(String[] args) {
        PersonalAccount adik = new PersonalAccount(220104121, "ibrohim");
        PersonalAccount azar = new PersonalAccount(220104101, "turat");
        adik.deposit(222400);
        adik.withdraw(-20033);
        adik.printTransactionHistory();
    }
}