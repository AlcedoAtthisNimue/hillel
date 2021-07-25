package lesson14;

public class Main {
    public static void main(String[] args) {
        CaramelCandies caramelCandies = new CaramelCandies("Барбарис", 374, 100);
        GingerSnap gingerSnap = new GingerSnap("Имбирное \"Lambertz\"", 408, 500);
        OatmealCookies oatmealCookies = new OatmealCookies("Овсяное \"Полет\"", 433, 500);
        Toffee toffee = new Toffee("Кис-Кис", 430, 500);
        СhocolateСandies chocolateCandies = new СhocolateСandies("Трюфель", 510, 1000);
        GlazedMarshmallow glazedMarshmallow = new GlazedMarshmallow("Обожайка", 410, 1000);
        UnglazedMarshmallow unglazedMarshmallow = new UnglazedMarshmallow("Жако", 320, 500);
        
        Sweets[] arr = new Sweets[Sweets.counter];
        arr[0] = caramelCandies;
        arr[1] = gingerSnap;
        arr[2] = oatmealCookies;
        arr[3] = toffee;
        arr[4] = chocolateCandies;
        arr[5] = glazedMarshmallow;
        arr[6] = unglazedMarshmallow;

        System.out.print("Что в новогоднем подарке? \n");
        for (Sweets item : arr){
            System.out.println(item.toString());
        }
        System.out.println("Масса новогоднего подарка " + toffee.calcWeight(arr) + " грамм.");
    }
}
