public abstract class Stall {

    private String name;
    private String owner;
    private int parkingSpot;

    public Stall(String name, String owner, int parkingSpot){
        this.name = name;
        this.owner = owner;
        this.parkingSpot = parkingSpot;
    }

    public String getName(){
        return this.name;
    }

    public String getOwner(){
        return this.owner;
    }

    public int getParkingSpot(){
        return this.parkingSpot;
    }
}
