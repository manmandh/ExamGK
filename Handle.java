import java.util.ArrayList;

public class Handle {
    private ArrayList<Order> list;

    public Handle(){
        list = new ArrayList<Order>();
    }

    public void add(Order order){
        this.list.add(order);
    }

    public void addOrder(){
        for(int i =0; i<3; i++){
            System.out.println(String.format("Enter information(%d/%d)", i+1,3));
            Order order = new Order();
            order.inputInformation();
            this.add(order);
        }
    }

    public void priceFood(){
        System.out.println("Print food <200, >200 Free");
        for(Order order : list){
            if(order.getDiscount()<200){
                 order.displayInformation();
                System.out.println("___");
            }
            else
                System.out.println("The ship is Free");
                order.displayInformation();
        }
    }
    public void timeFood(){
        System.out.println("Time food < 15 minutes");
        for(Order order : list){
            if(order.getTime() <15)
                order.displayInformation();
            System.out.println("___");
        }
    }

    public void printType(String sameFood){
        for(Order order : list){
            String fullOrder = order.getType();
            String str[] = fullOrder.split(" ");
            if(str[str.length -1].equals(sameFood))
                order.displayInformation();
        }
    }

    public void printOrderHasTotal(){
        System.out.println("Display has total Discount");
        for (Order order: list){
            order.displayInformation();
            order.getDiscount();
        }
    }



}
