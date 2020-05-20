public class LibraryItems {
    private String title;
    private boolean isAvailable;
    private boolean isReservable;
    // private boolean isLate;
    
   
    


    public LibraryItems (String title, boolean isAvailable, boolean isReservable, boolean isLate){
        this.title = title;
        this.isAvailable = isAvailable;
        this.isReservable = isReservable;
        // this.isLate = isLate;
        
        
    }


    //getters

    public String title(){
        return title;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public boolean isReservable(){
        return isReservable;
    }

    // public boolean isLate(){
    //     return isLate;
    // }
    

    

    //setters

    public void setTitle(String title){
        this.title = title;
    }

    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public void isReservable(boolean isReservable){
        this.isReservable = isReservable;
    }

    // public void isLate(boolean isLate){
    //     this.isLate = isLate;
    // }


}