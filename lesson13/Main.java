package lesson13;

public class Main {
    public static void main(String[] args) {
        CaramelCandies caramelCandies = new CaramelCandies("Барбарис", 374, 100);
        GingerSnap gingerSnap = new GingerSnap("Имбирное \"Lambertz\"", 408, 500);
        OatmealCookies oatmealCookies = new OatmealCookies("Овсяное \"Полет\"", 433, 500);
        Toffee toffee = new Toffee("Кис-Кис", 430, 500);
        СhocolateСandies chocolateCandies = new СhocolateСandies("Трюфель", 510, 1000);
        GlazedMarshmallow glazedMarshmallow = new GlazedMarshmallow("Обожайка", 410, 1000);
        UnglazedMarshmallow unglazedMarshmallow = new UnglazedMarshmallow("Жако", 320, 500);

        Sweets[] arr = {caramelCandies, gingerSnap, oatmealCookies, toffee, chocolateCandies,
                glazedMarshmallow, unglazedMarshmallow};

        System.out.println("Масса новогоднего подарка " + Sweets.calcWeight(arr) + " грамм.");
    }
}
