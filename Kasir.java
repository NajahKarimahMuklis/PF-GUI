import static java.lang.System.out;
import java.util.Scanner;

public class Kasir {
    private String item;
    private int price;
    private int qty;
    private double total;
    private double cash;
    private double change;

    public void setItem(String i) {
        item = i;
    }

    public String getItem() {
        return item;
    }

    public void setPrice(int p) {
        price = p;
    }

    public int getPrice() {
        return price;
    }

    public void setQuantity(int q) {
        qty = q;
    }

    public int getQuantity() {
        return qty;
    }

    public void setTotalPrice(double t) {
        total = t;
    }

    public double getTotalPrice() {
        return total;
    }

    public void setCash(double c) {
        cash = c;
    }

    public double getCash() {
        return cash;
    }

    public void setChange(double ch) {
        change = ch;
    }

    public double setChange() {
        return change;
    }

}
