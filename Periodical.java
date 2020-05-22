public class Periodical extends LibraryItems implements IsReservable {
    private PublishingCompany publisher;
    private String category;
    private int pubDate;
    private boolean epub;

    public Periodical (String title, boolean isAvailable, boolean isReservable, boolean isLate, String category, int pubDate, boolean epub, PublishingCompany publisher) {
        super(title, isAvailable, isReservable);
        this.publisher = publisher;
        this.category = category;
        this.pubDate = pubDate;
        this.epub = epub;

        if(this.title != null){
            this.company = new PublishingCompany();
        }
    }
    //getters
    
    public PublishingCompany getPublisher(){
        return publisher;
    }

    public void setPublisher(PublishingCompany publisher){
        this.publisher = publisher;
    }

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

    @Override
    public boolean canReserve(){
        return true;
    }

    public class PublishingCompany {
        private String company;
    
        public String getPublishingCompany(){
            return company;
        }
    
        public void setPublishingCompany(String company){
            this.company = company;
        }
    }
    public PublishingCompany company;
}