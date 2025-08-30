public class Worker {
    private String name;
    private String birthDate;
    private String contractEndDate;

    public Worker(String name, String birthDate, String contractEndDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.contractEndDate = contractEndDate;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }
}
