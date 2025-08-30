public class Employee extends Worker{

    private long employeeId;
    private String hireDate;

    public Employee(String name,String birthDate,String contractEndDate,long employeeId,String hireDate){
        super(name,birthDate,contractEndDate);
        this.employeeId=employeeId;
        this.hireDate=hireDate;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }
}
