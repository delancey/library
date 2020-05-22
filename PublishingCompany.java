public class PublishingCompany {
    String company;
    
    public PublishingCompany(){
        this.company = "Publishing Company";
    }

    public PublishingCompany(String company){
        this.company = company;
    }

    public String getPublishingCompany(){
        return company;
    }

    public void setPublishingCompany(String company){
        this.company = company;
    }
}