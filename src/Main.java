

public class Main {
    public static void main(String[] args) {

        int ticketPrice = 1253;
        System.out.println("Вы получаете 1 бонусную милю за каждые 20 рублей Вашей покупки.");
        System.out.println("Сумма покупки составляет:" + ticketPrice);

        int milePrice = 20;

        int sumOfMiles = ticketPrice / milePrice;

        System.out.println("Количество бонусных миль за покупку:" + sumOfMiles);

    }
}