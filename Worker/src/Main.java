public class Main {
    public static void main(String[] args) {
        SalariedEmployee emp = new SalariedEmployee("James Henry Runner","11/09/1960","30/05/2025",12346678,"05/11/2001",7400000,false);
        // Access fields using getters
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Is retired? " + emp.isRetired());

        // Check retirement eligibility
        System.out.println("Eligible for retirement? " + emp.isEligibleForRetirement());

        // Retire if eligible
        emp.retire();
        System.out.println("After retire: " + emp.isRetired());
    }
}
