package ru.geekbrains.oop.lesson6.srp2;

public class Order {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        OrderData orderData = OrderData.inputFromConsole();
        JsonExporter.saveToJson(orderData);
    }
}
