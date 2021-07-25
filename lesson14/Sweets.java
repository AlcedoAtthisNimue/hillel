package lesson14;

public abstract class Sweets {

    private String name;
    private int calories;
    private int weight;
    static int counter;

    public int getWeight() {
        return weight;
    }
    public String getName() { return name; }

    public Sweets(String name, int calories, int weight) {
        this.name = name;
        this.calories = calories;
        this.weight = weight;
        counter++;
    }
    public int calcWeight(Sweets[] arr){
        int result=0;
        for (Sweets item : arr){
            result += item.getWeight();
        }
        return result;
    }

    @Override
    public String toString() {
        return '{' + "name='" + name + '\'' +
                '}';
    }
}
