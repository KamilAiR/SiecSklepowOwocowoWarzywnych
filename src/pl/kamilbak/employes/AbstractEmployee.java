package pl.kamilbak.employes;

public abstract class AbstractEmployee implements Employee {

    protected final String firstName;
    protected final String lastName;
    protected int salary;

    public AbstractEmployee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public void payTheEmployee() {
        System.out.println("Pracownikowi wypłacono pensję w wysokości: " + salary + " zł");
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
        System.out.println("zmieniono pensję pracownika na: "+ salary + " zł");
    }


}
