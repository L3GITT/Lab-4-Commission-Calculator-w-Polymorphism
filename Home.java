public class Home extends Policy {
    private int squareFootage;
    private double dwelling;
    private double contents;
    private double liability;
  
    public Home() {
        super();
        this.squareFootage = 0;
        this.dwelling = 0.0;
        this.contents = 0.0;
        this.liability = 0.0;
    }
    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }
    public void setDwelling(double dwelling) {
        this.dwelling = dwelling;
    }
    public void setContents(double contents) {
        this.contents = contents;
    }
    public void setLiability(double liability) {
        this.liability = liability;
    }
  
    public int getSquareFootage() {
        return squareFootage;
    }
    
    public double getDwelling() {
        return dwelling;
    }
    
    public double getContents() {
        return contents;
    }
    
    public double getLiability() {
        return liability;
    }
  
    @Override
    public double computeCommission() {
        return (dwelling + contents + liability) * (17.0 / 75.0);
    }

    @Override
    public String toString() {
        return String.format("Home Policy%n------------%nName: %s %s%nFootage: %d%n" +
                           "Dwelling: $%,.2f%nContents: $%,.2f%nLiability: $%,.2f%nCommission: $%,.2f%n",
                           getFirstName(), getLastName(), squareFootage, dwelling, contents, liability, computeCommission());
    }
    public void printPolicy() {
        System.out.println("Home Policy");
        System.out.println("-----------");
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Footage: " + squareFootage);
        System.out.printf("Dwelling: $%,.2f%n", dwelling);
        System.out.printf("Contents: $%,.2f%n", contents);
        System.out.printf("Liability: $%,.2f%n", liability);
        System.out.printf("Commission: $%,.2f%n", computeCommission());
    }
}
