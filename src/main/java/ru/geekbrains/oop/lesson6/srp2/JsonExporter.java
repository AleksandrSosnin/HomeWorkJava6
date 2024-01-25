package ru.geekbrains.oop.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class JsonExporter {
    public static void saveToJson(OrderData order) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + order.getClientName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
            writer.write("\"qnt\":" + order.getQnt() + ",\n");
            writer.write("\"price\":" + order.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
            System.out.println("Order saved to " + fileName);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
