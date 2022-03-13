package pl.kamilbak;

import pl.kamilbak.shops.movingshop.CarMovingShop;
import pl.kamilbak.shops.staticshop.MarketShop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean shouldCcontinue = true;

        ChainOfStores chainOfStores = new ChainOfStores();

        while (shouldCcontinue) {
            System.out.println("-------------------------------------------------------");
            System.out.println("            Sieć Sklepów - MENU");
            System.out.println("");
            System.out.println("Wybierz z Opcji:");
            System.out.println("1. Dodaj nowy sklep");
            System.out.println("2. Wyświetl wszystkie sklepy");
            System.out.println("3. Dodaj pracownika");
            System.out.println("4. Wyświetl wszystkich pracowników");
            System.out.println("5. Wyświetl informacje o pracowniku");
            System.out.println("6. Przypisz pracownika do sklepu ");
            System.out.println("7. Wyjdź z aplikacji");
            System.out.println("-------------------------------------------------------");

            int userChoice = scanner.nextInt();
            switch (userChoice){
                case 1 -> chainOfStores.addShop();
                case 2 -> chainOfStores.displayShopList();
                case 3 -> chainOfStores.addEmployee();
                case 4 -> chainOfStores.displayEmployesList();
                case 5 -> chainOfStores.displayInfoAboutFoundEmployee();
                case 6 -> chainOfStores.assignEmployeeToStore();
                case 7 -> shouldCcontinue = false;
            }
        }
    }
}
