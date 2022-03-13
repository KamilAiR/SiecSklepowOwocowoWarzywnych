package pl.kamilbak;

import pl.kamilbak.employes.Driver;
import pl.kamilbak.employes.Employee;
import pl.kamilbak.employes.Seller;
import pl.kamilbak.shops.Shop;
import pl.kamilbak.shops.movingshop.CarMovingShop;
import pl.kamilbak.shops.staticshop.BuildingShop;
import pl.kamilbak.shops.staticshop.MarketShop;

import javax.lang.model.type.NullType;
import java.util.*;

public class ChainOfStores {

    private Set<Shop> shopList = new HashSet<>();
    private Set<Employee> employesList = new HashSet<>();
    private Map<String, Employee> lastNameToEmployee = new HashMap<>();
    private Map<String, Shop> nameToShop = new HashMap<>();
    private Map<Employee, Shop> employeeToShop = new HashMap<>();


    Scanner scanner = new Scanner(System.in);

    public void addShop() {
        System.out.println("Jakiego rodzaju sklep chcesz dodać?");
        System.out.println("1. Sklep samochodowy");
        System.out.println("2. Sklep w budynku");
        System.out.println("3. Stoisko na ryneczku");
        System.out.println("-------------------------------------------------------");

        int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                Scanner scanner = new Scanner(System.in);

                System.out.println(" Podaje nazwę sklepu");
                String shopName = scanner.nextLine();
                System.out.println(" Podaj numer rejestracyjny samochodu ");
                String plate = scanner.nextLine();

                CarMovingShop carMovingShop = new CarMovingShop(shopName, plate);
                shopList.add(carMovingShop);
                nameToShop.put(shopName,carMovingShop);

            } else if (userChoice == 2) {
                Scanner scanner = new Scanner(System.in);

                System.out.println(" Podaje nazwę sklepu");
                String shopName = scanner.nextLine();
                System.out.println(" Podaj adres sklepu ");
                String adress = scanner.nextLine();

                BuildingShop buildingShop = new BuildingShop(shopName, adress);
                shopList.add(buildingShop);
                nameToShop.put(shopName,buildingShop);
            } else if (userChoice == 3) {
                Scanner scanner = new Scanner(System.in);

                System.out.println(" Podaje nazwę sklepu");
                String shopName = scanner.nextLine();
                System.out.println(" Podaj adres sklepu ");
                String adress = scanner.nextLine();
                System.out.println(" Podaje liczbe stoisk");
                int numberOfStands = scanner.nextInt();

                MarketShop marketShop = new MarketShop(shopName, adress, numberOfStands);
                shopList.add(marketShop);
                nameToShop.put(shopName,marketShop);
            } else {
                System.out.println("Nie ma takiej opcji.");
            }
        }

    public void displayShopList(){
            for (Shop shop: shopList ) {
                if (shop instanceof MarketShop)
                    System.out.println("Sklep na ryneczku: " + shop.getName());
                if (shop instanceof BuildingShop)
                    System.out.println("Sklep w budynku: " + shop.getName());
                if (shop instanceof CarMovingShop)
                    System.out.println("Sklep samochodoy: " + shop.getName());
                System.out.println("");
            }
    }


    public void addEmployee()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jakiego pracownika chcesz dodać?");
        System.out.println("1. Kierowca");
        System.out.println("2. Sprzedawca");

        int userChoice = scanner.nextInt();

            if (userChoice == 1)
            {
                Scanner scanner1 = new Scanner(System.in);
                Scanner scanner11 = new Scanner(System.in);

                System.out.println("Podaj imie pracownika");
                String firstName= scanner1.nextLine();
                System.out.println("Podaj nazwisko pracownika");
                String lastName= scanner1.nextLine();
                System.out.println("Ustal pensje pracownika");
                int salary = scanner1.nextInt();
                System.out.println("Czy pracownik posiada ważne prawo jazdy? T/N");
                String userAnswer= scanner11.nextLine();

                boolean isDrivingLicenseActive = true;

                if (userAnswer.equals("T"))
                {
                    isDrivingLicenseActive = true;
                }
                else if (userAnswer.equals("N"))
                {
                    isDrivingLicenseActive = false;
                }

                Driver driver = new Driver(firstName,lastName,salary,isDrivingLicenseActive);
                employesList.add(driver);
                lastNameToEmployee.put(lastName, driver);
            }

            else if (userChoice ==2)
            {
                Scanner scanner2 = new Scanner(System.in);
                Scanner scanner22 = new Scanner(System.in);
                System.out.println("Podaj imie pracownika");
                String firstName= scanner2.nextLine();
                System.out.println("Podaj nazwisko pracownika");
                String lastName= scanner2.nextLine();
                System.out.println("Ustal pensje pracownika");
                int salary = scanner2.nextInt();
                System.out.println("Czy pracownik posiada ważną książeczkę sanepidu? T/N");
                String userAnswer= scanner22.nextLine();

                boolean isSanepidCertificateactive = true;

                if (userAnswer.equals("T"))
                {
                    isSanepidCertificateactive = true;
                }
                else if (userAnswer.equals("N"))
                {
                    isSanepidCertificateactive = false;
                }

                Seller seller = new Seller(firstName, lastName,  salary,  isSanepidCertificateactive);
                employesList.add(seller);
                lastNameToEmployee.put(lastName, seller);
            }
            else
            {
                System.out.println(" Nie ma takiej opcji");
            }


    }

    public void displayEmployesList(){
        for (Employee employee: employesList ) {
            if (employee instanceof Driver)
                System.out.println("Kierowca: " + employee.getFullName());
            if (employee instanceof Seller) {
                System.out.println("Sprzedawca: " + employee.getFullName());
            }

            if ( employeeToShop.containsKey(employee))
            {
                System.out.println("Sklep, w którym pracuje: " + (employeeToShop.get(employee)).getName());
            }
            else
            {
                System.out.println("Pracownik nie prztpisany do sklepu");
            }

            System.out.println("");
        }
    }


    public Employee findEmployeeByName()
    {

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Podaj nazwisko pracownika");
        String lastName = scanner3.nextLine();

        if (lastNameToEmployee.containsKey(lastName))
        {
            Employee emp = lastNameToEmployee.get(lastName);
            return  emp;
        }
        else
        {
            System.out.println("Nie ma takiego pracownika");
            return null;
        }

    }

    public Shop findShopByName()
    {
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Podaj nazwę sklepu");
        String shopName = scanner4.nextLine();

        if (nameToShop.containsKey(shopName)) {
            Shop shop = nameToShop.get(shopName);
            return shop;
        }
        else
        {
            System.out.println("Nie ma takiego sklepu");
            return null;
        }

    }

    public void  displayInfoAboutFoundEmployee()
    {
        Employee emp= findEmployeeByName();
        emp.displayEmployeeInfo();
    }

    public void assignEmployeeToStore()
    {

        Employee emp = findEmployeeByName();
        Shop shop = findShopByName();
        employeeToShop.put(emp,shop);
        System.out.println("Przypisano pracownika do sklepu.");
    }
}





