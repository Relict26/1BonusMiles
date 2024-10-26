public class Main {
    public static void main(String[] args) {
        int ticketPrice = 15500; // стоимость билета
        int rublesPerMile = 20; // количество рублей для одной бонусной мили

        // Рассчитываем количество бонусных миль
        int bonusMiles = ticketPrice / rublesPerMile;

        // Результат
        System.out.println("Начисленные бонусные мили: " + bonusMiles);
    }
}
