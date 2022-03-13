package pl.kamilbak.employes;

public class Driver extends AbstractEmployee {

    private boolean isDrivingLicenseActive;

    public Driver(String firstName, String lastName, int salary, boolean isDrivingLicenseActive) {
        super(firstName,lastName,salary);
        this.isDrivingLicenseActive = isDrivingLicenseActive;
    }

    public boolean isDrivingLicenseActive() {
        return isDrivingLicenseActive;
    }

    public void setDrivingLicenseStatus (boolean drivingLicenseStatus) {
        isDrivingLicenseActive = drivingLicenseStatus;
    }

    public void displayEmployeeInfo()
    {

        System.out.println("Imie: " + firstName);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Pensja: " + salary);
        System.out.println("Praca wykonywana: kierowca");
        if (isDrivingLicenseActive)
        {
            System.out.println("Status prawa jazdy: aktywne");
        }
        else
        {
            System.out.println("Status prawa jazdy: nieaktywne");

        }
    }

}
