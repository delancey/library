public class PeriodicalMagazine extends Periodical{

    public PeriodicalMagazine(String title, boolean isAvailable, boolean isReservable, boolean isLate,  PublishingCompany publisher, String category,
            int pubDate, boolean epub) {
        super(title, isAvailable, isReservable, isLate, category, pubDate, epub, publisher);       
    }
   
    @Override
    public boolean canReserve(){
        return true;
    }    
}