import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("A new approach to solving problems");
        task1();
    }
    private static void task1() {
        System.out.println("Условные операторы.Задание 7. Повышенная сложность.");

        Scanner one = new Scanner(System.in );
        System.out.print("Возраст клиента: "); // задаем суммы через консоль.
        int age = one.nextInt();

        Scanner two = new Scanner(System.in );
        System.out.print("Доход клиента: "); // задаем суммы через консоль.
        int salary = two.nextInt();

        Scanner three = new Scanner(System.in );
        System.out.print("Укажите желаемой сумму кредита : "); // задаем суммы через консоль.
        int wantedSum = three.nextInt();

        double percent = 1.1; // процентная ставка - ПС
        double paymentMAX = salary/2; // максимальный платеж - МП

        if (salary >= 80_000) {
            percent -= 0.007;
        } else if (age < 23) {
            percent += 0.01;
        } else if (age < 30) {
            percent += 0.005;
        }
        double credit = wantedSum * percent; // кредит - КР
        double paymentCredit = credit/12; // ежемесячный платеж по кредиту

        if (paymentMAX > paymentCredit) {
            System.out.printf("«Максимальный платеж при ЗП %d равен %.2f рублей. Платеж по кредиту %.2f рублей. Одобрено»\n", salary, paymentMAX, paymentCredit);
        } else {
            System.out.printf("«Максимальный платеж при ЗП %d равен %.2f рублей. Платеж по кредиту %.2f рублей. Отказано»\n", salary,paymentMAX, paymentCredit);
        }
        one.close();
        two.close();
        three.close();
    }
}