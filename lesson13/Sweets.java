package lesson13;

public class Sweets {
    private String name;
    private int calories;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public Sweets(String name, int calories, int weight) {
        this.name = name;
        this.calories = calories;
        this.weight = weight;
    }
    public static int calcWeight(Sweets[] arr){
        int result=0;
        for (Sweets item : arr){
            result += item.getWeight();
        }
        return result;
    }
}
