package lesson15.moving;

public class Main implements CanFly{
    @Override
    public Double speed(CanFly canFly) {
        return 9.9;
    }

    @Override
    public Double speed() {
        return 7.7;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.speed(main));
        System.out.println(main.speed());
    }
}
