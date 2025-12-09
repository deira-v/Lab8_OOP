package ie.atu.productv3;

public class TV extends Product{

    private double ScreenSize;
    private String Manufacture;

    public TV() {
        super();
        ScreenSize = 0;
        Manufacture = "";
    }

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

    @Override
    public String toString() {
        return super.toString() +
                "ScreenSize='" + ScreenSize + "inches'" +
                ", Manufacture='" + Manufacture + "'";
    }
}
