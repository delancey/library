public class CardHolder {
    private String firstName;
    private String lastName;
    private int age;
    private int yearJoined;
    private int cardNumber;
    private boolean hasFines;
    private boolean canCheckout;
    private boolean canReserve;

    public CardHolder(String firstName, String lastName, int age, int yearJoined, int cardNumber, boolean hasFines, boolean canCheckout, boolean canReserve){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearJoined = yearJoined;
        this.cardNumber = cardNumber;
        this.hasFines = hasFines;
        this.canCheckout = canCheckout;
        this.canReserve = canReserve;
    }


    //getters
    public String firstName(){
        return firstName;
     }

     public String lastName(){
        return lastName;
     }

     public int age(){
        return age;
     }

     public int yearJoined(){
        return yearJoined;
     }

     public int cardNumber(){
         return cardNumber;
     }

      public boolean hasFines(){
        return hasFines;
     }

     public boolean canCheckout(){
        return canCheckout;
     }

     public boolean canReserve(){
        return canReserve;
     }
    
    //setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public void setYearJoined(int yearJoined){
        this.yearJoined = yearJoined;
    }

    public void setCardNumber(int cardNumber){
        this.cardNumber = cardNumber;
    }

    public void setHasFines(boolean hasFines ){
        this.hasFines = hasFines;
    }

    public void setCanCheckout(boolean canCheckout){
        this.canCheckout = canCheckout;
        
    }

    public void setCanReserve(boolean canReserve){
        this.canReserve = canReserve;
    }
        
}