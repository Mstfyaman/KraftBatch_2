package Day_35_─░nheritance;

public class Truck extends Vehicle{
// Truck is a Vehicle
    int carryingCapasity;

    public void carrying(){
        System.out.println(color + " " + type + " " + carryingCapasity + " yuk tasir");
    }


    public String toString() {
        return "Truck{" +
                "carryingCapasity=" + carryingCapasity +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
