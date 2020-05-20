public class PeriodicalNewspaper  extends Periodical{
    private String location;
    private String datePublished;
    
    public PeriodicalNewspaper(String title, boolean isAvailable, boolean isReservable, boolean isLate, String category, int pubDate, boolean epub, String location, String datePublished ) {
        super(title, isAvailable, isReservable, isLate, category, pubDate, epub);

        this.location = location;
        this.datePublished = datePublished;
    }

        public String getLocation(){
            return this.location;
        }
        public String getDatePublished(){
            return this.datePublished;
        }
    
        //Setters
        public void setLocation(String location){
            this.location = location;
        }
        public void setDatePublished(String datePublished ){
            this.datePublished = datePublished;
        }
}
