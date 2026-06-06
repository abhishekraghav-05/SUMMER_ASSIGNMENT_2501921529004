interface LibraryUser {
    void registerAccount(int age);
    void requestBook(String bookType);
}

// KidsUsers class for kids section
class KidUsers implements LibraryUser {
    int age;
    String bookType;

    @Override
    public void registerAccount(int age) {
        if(age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        }else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook(String bookType) {
        if(bookType == "Kids") {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        }else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

// AdultUsers class for adult section
class AdultUser implements LibraryUser {
    int age;
    String bookType;

    @Override
    public void registerAccount(int age) {
        if(age > 12) {
            System.out.println("You have successfully registered under a Adult Account");
        }else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook(String bookType) {
        if(bookType == "Fiction") {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}

class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUsers kid = new KidUsers();

        kid.registerAccount(10);
        kid.registerAccount(18);

        kid.requestBook("Kids");
        kid.requestBook("Fiction");
    }
}