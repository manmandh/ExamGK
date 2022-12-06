import java.util.Scanner;

public class Order extends Food{
    public Order() {
    }
    private double price;
    private double amount;
    private double ship;

    public Order(String nameOfFood, int time, String type, double price, double amount, double ship) {
        super(nameOfFood, time, type);
        this.price = price;
        this.amount = amount;
        this.ship = ship;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getShip() {
        return ship;
    }
    public void setShip(double ship) {
        this.ship = ship;
    }

    @Override
    public String toString() {
        return "Order{" +
                "nameOfFood='" + super.getNameOfFood()+ '\'' +
                ", time=" + super.getTime() +
                ", type='" + super.getType() + '\'' +
                "price=" + price +
                ", amount=" + amount +
                ", ship=" + ship +
                '}';
    }

    public  void displayInformation(){
        System.out.println("Order{" +
                "nameOfFood='" + super.getNameOfFood()+ '\'' +
                ", time=" + super.getTime() +
                ", type='" + super.getType() + '\'' +
                "price=" + price +
                ", amount=" + amount +
                ", ship=" + ship +
                '}');
    }

    public void inputInformation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Enter Order---");
        super.inputInformation();
        scanner.nextLine();
        System.out.println("Input price: ");
        this.price = scanner.nextDouble();
        System.out.println("Input amount: ");
        this.amount = scanner.nextDouble();
        System.out.println("Input ship: ");
        this.ship = scanner.nextDouble();
    }

    public double getDiscount(){
        return price*amount+ship;
    }
}
