package Summer_Assignment_2401920100030.Week_1.OOPS;

interface LibraryUser
{
    public void registerAccount();
    public void requestBook();
}

class KidUser implements LibraryUser
{
    int age;
    String bookType;

    public KidUser(int age , String bookType) {
        this.age = age;
        this.bookType = bookType;
    }
    
    @Override
    public void registerAccount(){
        if(age < 12){
            System.out.println("You have successfully registered under a Kids Account");
        }
        else{
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook(){
        if("Kids".equals(bookType)){
            System.out.println("Book Issued successfully, please return the book within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

class AdultUser implements LibraryUser
{
    int age;
    String bookType;

    public AdultUser(int age , String bookType) {
        this.age = age;
        this.bookType = bookType;
    }
    
    @Override
    public void registerAccount(){
        if(age > 12){
            System.out.println("You have successfully registered under an Adult Account");
        }
        else{
            System.out.println("Sorry, Age must be greater than 12 to register as an Adult");
        }
    }

    @Override
    public void requestBook(){
        if("Fiction".equals(bookType)){
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}




public class LibraryInterfaceDemo {
    public static void main(String[] args){
        System.out.println();

        LibraryUser k1 = new KidUser(10, "Kids");
        k1.registerAccount();
        k1.requestBook();

        System.out.println();

        LibraryUser k2 = new KidUser(18, "Fiction");
        k2.registerAccount();
        k2.requestBook();

        System.out.println();

        LibraryUser a1 = new AdultUser(5, "Kids");
        a1.registerAccount();
        a1.requestBook();

        System.out.println();

        LibraryUser a2 = new AdultUser(23, "Fiction");
        a2.registerAccount();
        a2.requestBook();
        
        System.out.println();

    }
}
