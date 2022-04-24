public class Main {
    public static void main(String[]args) {
        int balance = 500;
        int rep = 2000;
        int bonus;
        if (rep >= 1000) {
            bonus = rep / 100;
            System.out.println ("Бонус " + bonus);
            System.out.println ("Итого " + (balance + rep + bonus));
        } else {
            System.out.println ("Бонус = 0 ");
            System.out.println ("Итого " + (balance + rep));
        }
    }
}
