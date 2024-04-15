public class Pants implements Washable{
    String material;
    int cleanliness;
    boolean ripped;

    @Override
    public void onWash() {
        if (Math.random() >0.5){
            ripped = true;
        }
        cleanliness += 20;
    }

    @Override
    public boolean shouldBeWashed(){
        return cleanliness < 90 && !ripped;
    }

    public Pants(String material, int cleanliness, boolean ripped) {
        this.material = material;
        this.cleanliness = cleanliness;
        this.ripped = ripped;
    }
}
