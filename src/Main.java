public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Adam duoc sinh ra
        Human adam = new Human("Adam",true);
        //Eva duoc sinh ra
        Human eva = new Human("Eva",false);

        God.say("Khong duoc an tao, an vao se chet :v ");
        Snake.say("An tao di, khong chet duoc dau ma lo :| ");

        Apple apple = new Apple();

        //Adam, Eva: ke chu! an thoi!!
        while(!apple.isEmpty()){
            adam.eat(apple);
            eva.eat(apple);
            if(apple.isEmpty()){
                System.out.println("Da het tao! ");
            }
        }

        adam.sleep();
        eva.sleep();

        God.say("Eva! ba se phai vang loi chong va dau don khi sinh con\n " +
                "Adam, nguoi se phai quoc dat ma an!! ");

    }
}
