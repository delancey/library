public class Book extends LibraryItems {
    private boolean isLate;

    public Book (String title, boolean isAvailable, boolean isReservable, boolean isLate) {
        super(title, isAvailable, isReservable, isLate);
        this.isLate = isLate;
        
    }
	//getters
    public boolean getIsLate(){
        return this.isLate;
    }

    //Setters
    public void setIsLate(boolean isLate){
        this.isLate = isLate;
    }

}
