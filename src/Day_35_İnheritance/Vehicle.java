package Day_35_─░nheritance;

public class Vehicle {

    String type;
    double price;
    String color;

    public void sellPriceWithTax(double price){
        price+=price*0.10;
        System.out.println(price);
    }

}
