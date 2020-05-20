public class BookReference extends Book {
    private int pubYear;

    public BookReference (String title, boolean isAvailable, boolean isReservable, boolean isLate, int pubYear) {
        super(title, isAvailable, isReservable, isLate);
    }
	//getters
    public int getPubYear(){
        return this.pubYear;
    }

    //Setters
    public void setPubYear(int pubYear){
        this.pubYear = pubYear;
    }
}