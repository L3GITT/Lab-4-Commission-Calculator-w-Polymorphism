public class Life extends Policy {
    private int age;
    private double term;

    public Life() {
        super();
        this.age = 0;
        this.term = 0.0;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setTerm(double term) {
        this.term = term;
    }
    public int getAge() {
        return age;
    }
    
    public double getTerm() {
        return term;
    }

    @Override
    public double computeCommission() {
        return term * 0.20;
    }

    @Override
    public String toString() {
        return String.format("Life Policy%n------------%nName: %s %s%nAge: %d%n" +
                           "Term: $%,.2f%nCommission: $%,.2f%n",
                           getFirstName(), getLastName(), age, term, computeCommission());
    }
    public void printPolicy() {
        System.out.println("Life Policy");
        System.out.println("-----------");
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Age: " + age);
        System.out.printf("Term: $%,.2f%n", term);
        System.out.printf("Commission: $%,.2f%n", computeCommission());
    }
}
