public class Shirt implements Washable{
    String color;
    int cleanliness;

    @Override
    public void onWash() {
        cleanliness += 20;
    }

    @Override
    public boolean shouldBeWashed(){
        return cleanliness < 90;
   }

    public Shirt(String color, int cleanliness) {
        this.color = color;
        this.cleanliness = cleanliness;
    }
}
