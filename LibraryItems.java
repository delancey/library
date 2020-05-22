public class LibraryItems {
    protected String title;    
    protected boolean isReservable;
    // private boolean isLate;
    
    public LibraryItems (String title, boolean isAvailable, boolean isReservable){
        this.title = title;
        this.isReservable = isReservable;
    }

    //getters
    public String getTitle(){
        return title;
    }

    public boolean isReservable(){
        return isReservable;
    }

    //setters
    public void setTitle(String title){
        this.title = title;
    }
    
    public void isReservable(boolean isReservable){
        this.isReservable = isReservable;
    }

    @Override
    public String toString(){
        return this.getTitle();
    }
}