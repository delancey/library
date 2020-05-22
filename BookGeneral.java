public class BookGeneral extends Book {
    private String genre, checkoutDate, returnDate, pg;
    private int daysLoaned;
    private boolean ebook, audiobook;
    
    public BookGeneral(String title, boolean isAvailable, boolean isReservable, boolean isLate, String genre, String checkoutDate, String returnDate, String pg, int daysLoaned, boolean ebook, boolean audiobook) {
        super(title, isAvailable, isReservable, pg, audiobook);

        this.genre = genre;
        this.checkoutDate = checkoutDate;
        this.returnDate = returnDate;
        this.daysLoaned = daysLoaned;
        this.ebook = ebook;
        this.audiobook = audiobook;
        this.pg = pg;
    }
    
     //getters
     public String getGenre(){
        return this.genre;
    }
    public String getCheckoutDate(){
        return this.checkoutDate;
    }
    public String getReturnDate(){
        return this.returnDate;
    }
    public int getDaysLoaned(){
        return this.daysLoaned;
    }
    public boolean getEbook(){
        return this.ebook;
    }
    public boolean getAudiobook(){
        return this.audiobook;
    }
    public String getPg(){
        return this.pg;
    }

    //Setters
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setCheckoutDate(String checkoutDate ){
        this.checkoutDate = checkoutDate;
    }
    public void setReturnDate(String returnDate ){
        this.returnDate = returnDate;
    }
    public void setCheckoutLength(int daysLoaned){
        this.daysLoaned = daysLoaned;
    }
    public void setEbook(boolean ebook){
        this.ebook = ebook;
    }
    public void setAudiobook( boolean audiobook){
        this.audiobook = audiobook;
    }
    public void setPg(String pg ){
        this.pg = pg;
    }




}