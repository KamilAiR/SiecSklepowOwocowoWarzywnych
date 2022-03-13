package pl.kamilbak.employes;

public class Seller extends AbstractEmployee {

    private boolean isSanepidCertificateActive;

    private int sellingExperience;
    public Seller(String firstName, String lastName, int salary, boolean isSanepidCertificateactive) {
        super(firstName,lastName,salary);
        this.isSanepidCertificateActive = isSanepidCertificateactive;
    }

    public boolean isSanepidCertificateactive() {
        return isSanepidCertificateActive;
    }

    public void setSanepidCertificateActive(boolean sanepidCertificateActive) {
        isSanepidCertificateActive = sanepidCertificateActive;
    }

    public void displayEmployeeInfo()
    {
        System.out.println("Imie: " + firstName);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Pensja: " + salary);
        System.out.println("Praca wykonywana: sprzedawca");
        if(isSanepidCertificateActive)
        {
            System.out.println("Status książeczki sanepidowskiej: aktywna");
        }
        else
        {
            System.out.println("Status książeczki sanepidowskiej: nieaktywna");
        }
    }

}
