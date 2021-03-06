package com.alternate.apachekafkasample;

import com.alternate.apachekafkasample.services.Consumer;
import com.alternate.apachekafkasample.services.Producer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter bootstrap string: ");
        String bootstrapString = scanner.nextLine();

        System.out.println("Select mode (1 - Producer 2 - Consumer)");
        System.out.print("Enter selection (1/2): ");

        String mode = scanner.nextLine();

        if ("1".equals(mode)) {
            Producer producer = new Producer(bootstrapString);
            producer.start();
        } else if ("2".equals(mode)) {
            Consumer consumer = new Consumer(bootstrapString);
            consumer.start();
        } else {
            throw new UnsupportedOperationException("invalid choice");
        }
    }
}
