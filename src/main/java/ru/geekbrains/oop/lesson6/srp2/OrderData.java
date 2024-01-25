package ru.geekbrains.oop.lesson6.srp2;

import java.util.Scanner;

public class OrderData {
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public OrderData(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public static OrderData inputFromConsole() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Client name: ");
            String clientName = scanner.nextLine();
            System.out.print("Product: ");
            String product = scanner.nextLine();
            System.out.print("Quantity: ");
            int qnt = Integer.parseInt(scanner.nextLine());
            System.out.print("Price: ");
            int price = Integer.parseInt(scanner.nextLine());
            return new OrderData(clientName, product, qnt, price);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input format. Please enter a valid number.");
            return null;
        }
    }
}
