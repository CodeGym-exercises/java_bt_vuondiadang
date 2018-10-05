public class Human {
    private String name;
    private boolean gender;
    private int age;

    public Human(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }
    public void say(String word){
        System.out.println(word);
    }
    public void eat(Apple food){
        System.out.printf("%s: can 1 mieng\n", this.name);
        food.isEaten();
    }
    public void sleep(){
        System.out.printf("%s is Slept!! \n", this.name);
    }
}
