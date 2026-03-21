
abstract class LibraryItem {
    private String itemId;
    private String title;
    protected boolean isReserved=false;
    public LibraryItem(String itemId, String title){
        this.itemId=itemId;
        this.title=title;
    }
    public String getTitle() {
        return title;
    }
    public void showDetails() {
        System.out.println("Item ID: " +itemId);
        System.out.println("Title: " +title);
    }
    abstract void processLoan();
}
class TextBook extends LibraryItem{
    public TextBook(String itemId, String title){
        super(itemId, title);
    }
    @Override
    void processLoan() {
        if (!isReserved) {
            isReserved=true;
            System.out.println("Textbook " +getTitle()+ " issued for 14 days.");
        } else {
            System.out.println("Error: " + getTitle() + " is already on loan.");
        } 
    }
}
class ResearchPaper extends LibraryItem {
    public ResearchPaper(String itemId, String title) {
        super(itemId,title);
    }
    @Override
    void processLoan() {
        System.out.println("Generating secure PDF download link");
    }
}
public class case4 {
    public static void main(String[] args) {
        LibraryItem book=new TextBook("B101", "Java Core");
        book.processLoan();  
        book.processLoan();  
        LibraryItem paper=new ResearchPaper("R99", "AI Ethics");
        paper.processLoan();
    }
}