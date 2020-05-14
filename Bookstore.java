import java.io.IOException;
import java.util.ArrayList;

public class Bookstore {
    // public String bookname;
    // public String author;
    // public String category;
    
    private final String address;
    private final String hours;
    private final String storeSize;
    private final String bookCondition;

    private ArrayList<String> titles;

    public Bookstore() {
        address = "123 Read Lane";
        hours = "M-F 9am-6pm, Saturday 10am-3pm, Sunday 1pm-4pm";
        storeSize = "We have the largest selection, over 100,000 BOOKS!";
        bookCondition = "We have both NEW and OLD books";

        titles = new ArrayList<String>();
        loadTitles();
    }

    public Bookstore(String address, String hours, String storeSize, String bookCondition) {
        this.address = address;
        this.hours = hours;
        this.storeSize = storeSize;
        this.bookCondition = bookCondition;

        titles = new ArrayList<String>();
        loadTitles();
    }

    // public String getBookName(){
    //     return bookname +" by "+ author;
    // }

    public String getAddress(){
        return address;
    }

    public String getHours(){
        return hours;
    }
    public String getStoreSize(){
        return storeSize;
    }
    public String getBookCondition(){
        return bookCondition;
    }

    private void loadTitles(){
        try{
            Utils.loadStringsToArray(this.titles);
        } catch (IOException e){
            System.out.println("Could not initilize the title");
            this.titles = new ArrayList<>();
        }
    }

    public void printBookTitles(){
        for(int i = 0; i < titles.size(); i++ ){
            System.out.println(titles.get(i));
        }
    }
    
    public void searchTitles(String word){
        for(int i = 0; i < titles.size(); i++){
            if (titles.get(i).toLowerCase().contains(word.toLowerCase())){
                System.out.println(titles.get(i));
            }
        }
    }
}