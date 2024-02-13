public class Policy {
    
    private String policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String smokingStatus;
    private double heightInInches;
    private double weightInPounds;

    
    public Policy() {
        this.policyNumber = "";
        this.providerName = "";
        this.policyholderFirstName = "";
        this.policyholderLastName = "";
        this.policyholderAge = 0;
        this.smokingStatus = "";
        this.heightInInches = 0.0;
        this.weightInPounds = 0.0;
    }

    
    public Policy(String policyNumber, String providerName, String policyholderFirstName,
                  String policyholderLastName, int policyholderAge, String smokingStatus,
                  double heightInInches, double weightInPounds) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyholderFirstName = policyholderFirstName;
        this.policyholderLastName = policyholderLastName;
        this.policyholderAge = policyholderAge;
        this.smokingStatus = smokingStatus;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }

    public void setPolicyholderFirstName(String policyholderFirstName) {
        this.policyholderFirstName = policyholderFirstName;
    }

    public String getPolicyholderLastName() {
        return policyholderLastName;
    }

    public void setPolicyholderLastName(String policyholderLastName) {
        this.policyholderLastName = policyholderLastName;
    }

    public int getPolicyholderAge() {
        return policyholderAge;
    }

    public void setPolicyholderAge(int policyholderAge) {
        this.policyholderAge = policyholderAge;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    
    public double calculateBMI() {
        return (weightInPounds * 703) / (heightInInches * heightInInches);
    }

    
    public double calculatePolicyPrice() {
        double policyPrice = 600.0; // Base fee

        if (policyholderAge > 50) {
            policyPrice += 75.0;
        }

        if (smokingStatus.equalsIgnoreCase("smoker")) {
            policyPrice += 100.0;
        }

        double bmi = calculateBMI();

        if (bmi > 35) {
            policyPrice += (bmi - 35) * 20;
        }

        return policyPrice;
    }

    
    public void printPolicyDetails() {
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Provider Name: " + providerName);
        System.out.println("Policyholder’s First Name: " + policyholderFirstName);
        System.out.println("Policyholder’s Last Name: " + policyholderLastName);
        System.out.println("Policyholder’s Age: " + policyholderAge);
        System.out.println("Policyholder’s Smoking Status: " + smokingStatus);
        System.out.println("Policyholder’s Height: " + heightInInches + " inches");
        System.out.println("Policyholder’s Weight: " + weightInPounds + " pounds");
        System.out.println("Policyholder’s BMI: " + calculateBMI());
        System.out.println("Policy Price: $" + calculatePolicyPrice());
    }
}
