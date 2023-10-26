public class Main {
    public static void main(String[] args) {
        int x = 322;
        System.out.println("Ваш текуший баланс:" + x);
        int y = 2473;
        System.out.println("Сумма пополнения:" + y);
        if (y > 1000) {
            int t = (int) (x + y + y / 100);
            System.out.println("Вы пополнили счет на " + y + " рублей - бонус равен " + y / 100 + " рубля/ей, итоговая сумма на балансе " + t + " рубля/ей");
        }
        if (y <= 1000) {
            int t2 = (int) (x + y);
            System.out.println("Вы пополнили счет на " + x + " рублей - бонусы не начислены, итоговая сумма на балансе " + t2 + " рубля/ей");
        }
    }
}