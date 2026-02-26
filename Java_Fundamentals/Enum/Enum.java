package Enum;

// enum Laptop {
//     Macbook(2000), Aspire(500), Thinkpad(700), XPS;

//     private int price;

//     private Laptop() {
//         this.price = 600;
//     }

//     public int getPrice() {
//         return price;
//     }

//     public void setPrice(int price) {
//         this.price = price;
//     }

//     private Laptop(int price) {
//         this.price = price;
//     }
// }

class Computer {
    String Model;
    int price;
    private Computer cp;

    private Computer() {
        this.Model = "Lenovo Legion";
        this.price = 1000;
        this.cp = null;
    }

    public Computer(String Model, int price) {
        this.Model = Model;
        this.price = price;
        this.cp = new Computer();
    }

    public Computer getCp() {
        return cp;
    }

    public void setCp(Computer cp) {
        this.cp = cp;
    }

}

public class Enum {
    public static void main(String[] args) {
        Computer cp = new Computer("Sexaphone", 1000);
        Computer ex = cp.getCp();
        System.out.println("Laptop Model " + ex.Model);
        System.out.println("Laptop Price " + ex.price);
        // for (Laptop lap : Laptop.values()) {
        // System.out.println(lap + " : " + lap.getPrice());
        // }
    }
}
