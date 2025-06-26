import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println
                ("Введите первое число:");
        int enterTheNumberFirst = scanner.nextInt();
        System.out.println
                ("Введите второе число:");
        int enterTheNumberSecond = scanner.nextInt();

        System.out.println
                ("Сумма чисел: " + (enterTheNumberFirst + enterTheNumberSecond));
        System.out.println
                ("Разность чисел: " + (enterTheNumberFirst - enterTheNumberSecond));
        System.out.println
                ("Произведение чисел: " + (enterTheNumberFirst * enterTheNumberSecond));
        System.out.println
                ("Частное: " + ((double)enterTheNumberFirst / enterTheNumberSecond));
    }
}
