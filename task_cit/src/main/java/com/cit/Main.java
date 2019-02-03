package com.cit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Directory dir = new Directory();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите абонента в формате Фамилия И.О. : ");

        String inputName = scanner.nextLine();
        System.out.println(dir.inReturn(inputName));
    }
}
