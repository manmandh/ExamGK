import java.util.Scanner;

public class Main {
    public static void displayMenu(){
        System.out.println("---Please choose function---");
        System.out.println("1. Add Order ");
        System.out.println("2. Price food ");
        System.out.println("3. The same type of food ");
        System.out.println("4. Food has time <15 minutes ");
        System.out.println("5. Total price Order ");
    }

    public static void main(String[] args) {
        Handle handle = new Handle();
        Scanner scanner = new Scanner(System.in);
        boolean programme = true;
        while (programme){
            try{
                Main.displayMenu();
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        handle.addOrder();
                        break;
                    case 2:
                        handle.priceFood();
                        break;
                    case 3:
                        System.out.println("Enter the food");
                        String sameFood = scanner.nextLine();
                        handle.printType(sameFood);
                        break;
                    case 4:
                        handle.timeFood();
                        break;
                    case 5:
                        handle.printOrderHasTotal();
                        break;
                    default:
                        System.err.println("Wrong");
                }

            }
            catch (Exception e){
                System.out.println("Error!!! Restart Menu");
            }
        }
    }
}