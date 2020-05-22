public class Book extends LibraryItems implements IsLoanable, IsReservable {
    // private String author;
    public Author authorName;
    private boolean isAvailable;
    private boolean isLate;
    

    public Book (String title, boolean isAvailable, boolean isReservable, String author, boolean isLate) {
        super(title, isAvailable, isReservable);
        // this.author = author;
        this.isLate = isLate;

        if(this.title != null){
            this.authorName = new Author();
        }
        
    }
    //getters
    
    public Author getAuthor(){
        return authorName;
    }

    public void setAuthor(Author authorName){
        this.authorName = authorName;
    }
    public boolean getIsLate(){
        return this.isLate;
    }

    //Setters
    
    public void setIsLate(boolean isLate){
        this.isLate = isLate;
    }
    

    @Override
    public boolean canReserve(){
        return true;
    }

    @Override
    public boolean isLoanable(boolean isLoanable){
        if(this.isAvailable){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void fines(int daysLate){
        double charge = .10;
        double lateFine = charge * daysLate;
        System.out.println("Fines for late charge" + lateFine);

    }
    

}


