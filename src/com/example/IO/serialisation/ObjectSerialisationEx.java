package com.example.IO.serialisation;

import java.io.*;

public class ObjectSerialisationEx {

    public static void main(String[] args) {

        String fileName = "product.txt";


        try (ObjectOutputStream oos =
                     new ObjectOutputStream(
                             new FileOutputStream(fileName))) {

            Product p1 = new Product("TV", 20000, 101);

            oos.writeObject(p1);

            System.out.println(" Object Serialized Successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }



        try (ObjectInputStream ois =
                     new ObjectInputStream(
                             new FileInputStream(fileName))) {

            Product p = (Product) ois.readObject();

            System.out.println(" Object Deserialized Successfully");
            System.out.println(p);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
