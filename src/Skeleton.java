public class Skeleton extends Boss{
    int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    public String printInfo(){
        return super.printInfo() + " Number of arrows: " + this.numberOfArrows;
    }
}
