import java.util.Scanner;

public class Index{
    public static void main(String[] args) { //method
        Scanner input = new Scanner(System.in);


        Bookstore store = new Bookstore();
        Bookstore store2 = new Bookstore("999 Brown Rd", "8-5", "small", "new");
        // store.bookname = "Sweetest Goodbye"; // setting property
        // store.author = "Jane Doe";
        // System.out.println(store.getBookName());

    System.out.printf(" Would you like our FAQ?");
        String answer = input.next();
        

        if ( answer.equalsIgnoreCase("no")){
            System.out.println("What would you ask?");
        } else if (answer.equalsIgnoreCase("yes")){
            System.out.println(" 1.What is our location address?\n 2.What is the store operating hours?\n 3.How big is the store?\n 4.Does the store have new or used books?\n 5. See our book list?\n 6.Search by Word" );
            System.out.println("What number would you like to look at?");
            Integer answer1 = input.nextInt();
            if(answer1 == 1){
                System.out.println(store2.getAddress());
            } else if (answer1 == 2){
                System.out.println(store2.getHours());
            } else if (answer1 == 3){
                System.out.println(store2.getStoreSize());
            } else if (answer1 == 4){
                System.out.println(store2.getBookCondition());
            }else if (answer1 == 5) {
                store2.printBookTitles();
            } else if (answer1 == 6){
                System.out.println("Enter a word:");
                String word = input.next();
                store2.searchTitles(word);
            } else {
            System.out.println("Please choose 1-6");
            }


        } else{
            System.out.println("Please type Yes or No");
        }



        input.close();
    }
}