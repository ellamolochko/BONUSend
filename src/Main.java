public class Main {
    public static void main(String[] args) {
        int balance = 322;
        System.out.println("Ваш текуший баланс:" + balance);
        int amount = 2473;
        System.out.println("Сумма пополнения:" + amount);
        if (amount > 1000) {
            int t = (int) (balance + amount + amount / 100);
            System.out.println("Вы пополнили счет на " + amount + " рублей - бонус равен " + amount / 100 + " рубля/ей, итоговая сумма на балансе " + t + " рубля/ей");
        }
        if (amount <= 1000) {
            int t2 = (int) (balance + amount);
            System.out.println("Вы пополнили счет на " + balance + " рублей - бонусы не начислены, итоговая сумма на балансе " + t2 + " рубля/ей");
        }
    }
}