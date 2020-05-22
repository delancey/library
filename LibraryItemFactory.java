public class LibraryItemFactory {
    public static LibraryItems CreateLibraryItem(LibraryItemType type){
        LibraryItems d = null;
        Author newAuthor = new Author("K.F. Breene");
        PublishingCompany newPublisher = new PublishingCompany ("Harper Books");

        // if(type == null){
        //     return null;
        // } 

        switch (type) {
            case BOOKGENERAL:
                d = new BookGeneral(title, true, true, false, "fantasy", 05152020, 06022020, 346, 14, true, true);
                break;
            case BOOKREFERENCE:
                d = new BookReference("CSS Secrets", true, true, false, 2018);
                break;
            case PERIODICALNEWSPAPER:
                d = new PeriodicalNewspaper(title, true, false, false, "Gannet", "news", 05212020, false, "Charlotte", 05212020);
                break;
                case PERIODICALMAGAZINE:
                d = new PeriodicalMagazine(title, false, false, false, "Time Inc", "news", 05142020, true);
                break;
            default:
        }

        return d;
    }


    }
