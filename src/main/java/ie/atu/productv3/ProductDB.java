package ie.atu.productv3;

//import ie.atu.productv2.Book;

public class ProductDB {
    public static Product getProduct(String productCode) {

        Book myBook = null;
        Software mySoftware = null;
        Music myMusic = null;
        Product myProduct = null;
        TV myTV = null;

        //Book products by code
        if (productCode.equalsIgnoreCase("java")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct = myBook;
        }

        //Software products by code
        if (productCode.equalsIgnoreCase("studios")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        }
        else if (productCode.equalsIgnoreCase("eclipse")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        }
        else if (productCode.equalsIgnoreCase("oracle")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }

        //Music products by code
        if (productCode.equalsIgnoreCase("spotify")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("The album");
            myMusic.setPrice(7.50);
            myMusic.setArtist("Abba");
            myMusic.setLabel("Thank you for the music");
            myProduct = myMusic;
        }
        else if (productCode.equalsIgnoreCase("youtube")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Nimrod");
            myMusic.setPrice(8.50);
            myMusic.setArtist("Green Day");
            myMusic.setLabel("Good riddance");
            myProduct = myMusic;
        }
        else if(productCode.equalsIgnoreCase("tidal")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Kepler");
            myMusic.setPrice(6.50);
            myMusic.setArtist("Gemitaiz");
            myMusic.setLabel("Blue sky");
            myProduct = myMusic;
        }

        //TV products by code
        if(productCode.equalsIgnoreCase("Samsung")){
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Tv");
            myTV.setPrice(400);
            myTV.setScreenSize(23);
            myTV.setManufacture("Samsung");
            myProduct = myTV;
        }
        else if(productCode.equalsIgnoreCase("LG")){
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Television");
            myTV.setPrice(350);
            myTV.setScreenSize(20);
            myTV.setManufacture("LG");
            myProduct = myTV;
        }
        else if(productCode.equalsIgnoreCase("Sony")){
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Tv");
            myTV.setPrice(300);
            myTV.setScreenSize(25);
            myTV.setManufacture("Sony");
            myProduct = myTV;
        }

        return myProduct;

    }
}

