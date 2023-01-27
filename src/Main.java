import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Условие
        //Авиаперевозчики предлагают различные бонусные программы, начисляющие бесплатные мили за перелёты.
        // Формула расчёта следующая: за каждые 20 рублей, потраченные на билет, начисляется 1 миля.
        // Дробные мили не начисляются.
        //
        //Ваша задача
        //Создать приложение, рассчитывающее количество начисленных миль за купленный билет.
        // Стоимость билета вы выбираете сами — сами заполняете переменную, в которой она будет храниться.
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму покупки:");
        int ticketPrice = scan.nextInt();
        System.out.println("Сумма покупки составляет:" + ticketPrice);

        int milePrice = 20;

        int sumOfMiles = ticketPrice / milePrice;
        System.out.println("Количество бонусных миль за покупку:" + sumOfMiles);


    }
}