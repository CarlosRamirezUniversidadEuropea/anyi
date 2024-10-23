package test2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import insw.practica2.TaxCalculator;

public class TaxTestCase {

    @Test
    public void testTaxCalculation() {
        double totalAmount = 100;
        double tax = TaxCalculator.calculateTax(totalAmount);
        assertEquals(15, tax, 0.01);  
    }

    @Test
    public void testTaxCalculationForLargerAmount() {
        double totalAmount = 1000;
        double tax = TaxCalculator.calculateTax(totalAmount);
        assertEquals(150, tax, 0.01);  
    }

    
}
