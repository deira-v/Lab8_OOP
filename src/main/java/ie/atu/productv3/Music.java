package ie.atu.productv3;

public class Music extends Product {

    private String artist;
    private String label;

    //Constructor
    public Music() {
        super();
        artist = "";
        label = "";
        count++;
    }

    //Setters and Getters
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public String getArtist() {
        return artist;
    }
    public String getLabel() {
        return label;
    }

    //toString Calling super
    @Override
    public String toString() {
        return super.toString() + " by " + artist +
                " '" + label + "'";
    }
}
