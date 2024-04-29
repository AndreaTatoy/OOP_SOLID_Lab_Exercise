public class Customer implements DiscountApplicator{
    private String name;
    private String type;

    public Customer(String name, String type){
        this.name = name;
        this.type = type; 
    }

    public double discountForSeniorCitizen(){
        if (type.equalsIgnoreCase("Senior Citizen")){
            return amount * 0.10;
        }
    }
  
    public double discountForStudent(){
        if (type.equalsIgnoreCase("Student")){
            return amount * 0.05;
        }
    }
  
    public double noDiscount(){
        if (type.equalsIgnoreCase("Regular" || NULL)){
          return 0.0;
        }
    }

    public double applyDiscount(){
        if (type.equalsIgnoreCase("Senior Citizen")){
            return amount - discountForSeniorCitizen();
        }
  
        if (type.equalsIgnoreCase("Student")){
            return amount - discountForStudent();
        }
  
        if (type.equalsIgnoreCase("Regular" || NULL)){
            return amount;
        }
    }
}