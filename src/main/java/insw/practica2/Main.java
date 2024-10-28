package insw.practica2;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // LISTA DE COSAS PARA EL CLIENTE VIP
        List<String> itemsVIP = new ArrayList<>();
        itemsVIP.add("Item1");
        itemsVIP.add("Item2");

        // ORDEN DEL CLIENTE VIP
        Order vipOrder = new Order("Ana", CustomerType.VIP, itemsVIP, 1200);
        vipOrder.applyDiscount();
        vipOrder.calculateTax();
        vipOrder.printOrderDetails();

        // LISTA DE COSAS PARA UN CLIENTE REGULAR
        List<String> itemsRegular = new ArrayList<>();
        itemsRegular.add("Item3");
        itemsRegular.add("Item4");

        // ORDEN DEL CLIENTE REGULAR 
        Order regularOrder = new Order("Bob", CustomerType.REGULAR, itemsRegular, 600);
        regularOrder.applyDiscount();
        regularOrder.calculateTax();
        regularOrder.printOrderDetails();
    }
}