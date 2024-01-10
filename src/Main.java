//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int startingScore = 100; // начальный счет
        int replenishment = 2050; // сумма пополнения

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100; // начисление бонусов
        } else {
            bonus = 0; //бонус не начисляется
        }
        int Score = startingScore + bonus + replenishment; //сумма с учетом пополнения

        System.out.println((bonus) + " начислено бонусов"); // вывод бонусов на экран
        System.out.println((Score) + " доступный баланс"); // вывод баланса на экран

    }
}