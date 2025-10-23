public abstract class Policy {
    private String firstName;
    private String lastName;

    public Policy() {
        this.firstName = "";
        this.lastName = "";
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    public abstract double computeCommission();
    
    public abstract String toString();
}
