import java.util.Scanner;

public class Food {
    private String nameOfFood;
    private int time;
    private String type;

    public Food(){

    }

    public Food(String nameOfFood, int time, String type) {
        this.nameOfFood = nameOfFood;
        this.time = time;
        this.type = type;
    }

    public String getNameOfFood() {
        return nameOfFood;
    }
    public void setNameOfFood(String nameOfFood) {
        this.nameOfFood = nameOfFood;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Order{" +
                "nameOfFood='" + nameOfFood + '\'' +
                ", time=" + time +
                ", type='" + type + '\'' +
                '}';
    }

    public void inputInformation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Enter food---");
        System.out.println("Input name of Food: ");
        this.nameOfFood = scanner.nextLine();
        System.out.println("Input  time: ");
        this.time = scanner.nextInt();
        System.out.println("Input type: ");
        this.type = scanner.nextLine();

    }

    public void displayInformation(){
        System.out.println("Food{" +
                "nameOfFood='" + nameOfFood + '\'' +
                ", time=" + time +
                ", type='" + type + '\'' +
                '}');
    }
}
