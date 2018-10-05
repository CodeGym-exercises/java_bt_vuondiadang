public class Apple {
    private int weight;

    public Apple() {
        this.weight = 10;
    }
    public Apple(int weight) {
        this.weight = weight;
    }
    public boolean isEmpty(){
        if(this.weight==0){
            return true;
        }
        return false;
    }
    public void isEaten(){
        this.weight-=1;
    }
}
