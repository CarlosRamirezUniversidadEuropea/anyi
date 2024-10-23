package insw.practica2;
import java.util.List;

public class Order {
	public String customerName;
    public CustomerType customerType;
    public List<String> items;
    public double totalAmount;
    public double discount;
    public double tax;


    public Order(String nombre,
            CustomerType customerType,
            List<String> items,
            double totalAmount) {
   customerName = nombre;
   this.customerType = customerType;
   this.items = items;
   this.totalAmount = totalAmount;
   this.discount = 0;
   this.tax = 0;
}

    public void applyDiscount() {
        if (this.customerType.equals(CustomerType.REGULAR)) {
            if (this.totalAmount > 100) {
                this.discount = this.totalAmount * 0.05;
            }
            if (this.totalAmount > 500) {
                this.discount = this.totalAmount * 0.1;
            }
        } else if (this.customerType.equals(CustomerType.VIP)) {
            if (this.totalAmount > 100) {
                this.discount = this.totalAmount * 0.1;
            }
            if (this.totalAmount > 500) {
                this.discount = this.totalAmount * 0.15;
            }
        }
  
        if (this.totalAmount > 1000) {
            this.discount = this.totalAmount * 0.2;
        }
    }

    public void calculateTax() {
        this.tax = this.totalAmount * 0.15;
    }

    public String returnOrderDetails() {
        double finalAmount = totalAmount - this.discount + this.tax;
        return "Customer: " + this.customerName +
                " Customer Type: " + this.customerType +
                " Items: " + String.join(", ", this.items) +
                " Total Amount: " + this.totalAmount +
                " Discount: " + this.discount +
                " Tax: " + this.tax +
                " Final Amount: " + finalAmount;
    }
}
