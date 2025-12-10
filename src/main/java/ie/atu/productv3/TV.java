package ie.atu.productv3;

public class TV extends Product{

    private double ScreenSize;
    private String Manufacture;

    //Defaullt Constructor
    public TV() {
        super();
        ScreenSize = 0;
        Manufacture = "";
        count++;
    }

    //Setters and Getters
    public double getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(double screenSize) {
        this.ScreenSize = screenSize;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public void setManufacture(String manufacture) {
        this.Manufacture = manufacture;
    }

    // toSting with super
    @Override
    public String toString() {
        return super.toString() + " " +
                ScreenSize + " Inches' " +
                Manufacture;
    }
}
