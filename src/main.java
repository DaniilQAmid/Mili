public class main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 7649;
        int miles = service.calculate(price);
        System.out.println("Стоимость билета составляет: " + price + " рублей");
        System.out.println("Бонусных миль будет начислено: " + miles);
    }
}
