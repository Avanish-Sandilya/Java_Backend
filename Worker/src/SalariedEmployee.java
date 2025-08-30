public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String contractEndDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, contractEndDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public boolean retire(){
        int yearOfBirth = Integer.parseInt(getBirthDate().substring(5));
        return 2025-yearOfBirth>=60;
    }
}
