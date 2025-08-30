public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String contractEndDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, contractEndDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public boolean isEligibleForRetirement() {
        int yearOfBirth = Integer.parseInt(getBirthDate().substring(6));
        int currentYear = java.time.LocalDate.now().getYear();
        return currentYear - yearOfBirth >= 60;
    }

    public void retire() {
        if (isEligibleForRetirement()) {
            this.isRetired = true;
        }
    }

}
