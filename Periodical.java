public class Periodical extends LibraryItems {
    private String category;
    private int pubDate;
    private boolean epub;

    public Periodical (String title, boolean isAvailable, boolean isReservable, boolean isLate, String category, int pubDate, boolean epub) {
        super(title, isAvailable, isReservable, isLate);
        this.category = category;
        this.pubDate = pubDate;
        this.epub = epub;
    }
    //getters
    
    public String category(){
        return this.category;
    }

    public int pubDate(){
        return this.pubDate;
    }
    public boolean getEpub(){
        return this.epub;
    }

    //Setters

    public void setCategory(String category){
        this.category = category;
    }

    public void setPubDate(int pubDate){
        this.pubDate = pubDate;
    }
    
    public void setEPub(boolean epub){
        this.epub = epub;
    }
}