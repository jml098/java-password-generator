package org.lessons.java.security;


import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName;
        String lastName;
        String favoriteColor;
        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;

        System.out.println("********************************");

        System.out.print("Inserisci il tuo nome: ");
        firstName = scanner.nextLine();

        System.out.print("Inserisci il tuo cognome: ");
        lastName = scanner.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        favoriteColor = scanner.nextLine();

        System.out.print("Inserisci il tuo giorno di nascita: ");
        dayOfBirth = scanner.nextInt();

        System.out.print("Inserisci il tuo mese di nascita: ");
        monthOfBirth = scanner.nextInt();

        System.out.print("Inserisci il tuo anno di nascita: ");
        yearOfBirth = scanner.nextInt();

        scanner.close();

        System.out.println("********************************");

        String password = firstName + "-" + lastName + "-" + favoriteColor + "-" + (dayOfBirth + monthOfBirth + yearOfBirth);
        System.out.println("La tua password generata è: " + password);
    }
}
