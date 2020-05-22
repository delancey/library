public class OverdueList<E extends Book> {
    
    private E overdueItem;

    public OverdueList(E overdueItem){
        this.overdueItem = overdueItem;
    }

    //getter
    public E getOverdueItems(){
        return this.overdueItem;
    }
}