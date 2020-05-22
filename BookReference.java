public class BookReference extends Book {
    private int pubYear;

    public BookReference (String title, boolean isAvailable, boolean isReservable, boolean isLate, int pubYear) {
        super(title, isAvailable, isReservable, title, isLate);

        if(this.title != null){
            this.author = new Author();
        }
    }
	//getters
    public int getPubYear(){
        return this.pubYear;
    }

    //Setters
    public void setPubYear(int pubYear){
        this.pubYear = pubYear;
    }
    @Override
    public boolean canReserve(){
        return true;
    }

    public class Author {
        private String authorName;
    
            public Author(){
                
            }
    
            public Author (String authorName){
                this.authorName = authorName;
            }
    
            public String getAuthorName(){
                return this.authorName;
            }        
        }
        public Author author;


}