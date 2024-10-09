package practica2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import insw.practica2.CustomerType;
import insw.practica2.DiscountCalculator;

public class DiscountTestCase {

    @Test
    public void testRegularCustomerDiscountAbove100() {
        double totalAmount = 150;
        double discount = DiscountCalculator.calculateDiscount(CustomerType.REGULAR, totalAmount);
        assertEquals(7.5, discount, 0.01);  // 
    }

    @Test
    public void testRegularCustomerDiscountAbove500() {
        double totalAmount = 600;
        double discount = DiscountCalculator.calculateDiscount(CustomerType.REGULAR, totalAmount);
        assertEquals(60, discount, 0.01);  
    }

    @Test
    public void testVIPCustomerDiscountAbove1000() {
        double totalAmount = 1200;
        double discount = DiscountCalculator.calculateDiscount(CustomerType.VIP, totalAmount);
        assertEquals(240, discount, 0.01);  
    }
}

    
