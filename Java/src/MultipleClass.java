public class MultipleClass {

    public void display() {
        System.out.println("Class One");
    }

    public static void main(String args[]) {

        MultipleClass m = new MultipleClass();
        Secoundclass s = new Secoundclass();

        m.display();
        s.display();
    }
}

    class Secoundclass{
        public void display(){
            System.out.println("Class Two");

        }
    }

