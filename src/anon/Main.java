package anon;

public class Main {
    /*
      Когда используем анонимные классы:
      1. Когда нужен только один экземпляр класса
      2. Когда класс имеет очень короткое тело
      3. Класс используется сразу же, как только определен
     */
    public static void main(String[] args) {
        /*
        new SuperClassOrInterfaceName() {
            // fields
            // overridden methods
        };
        */

        //System.out.println(new java.util.Scanner(System.in).nextInt());

        //int n = (new java.util.Scanner(System.in).nextInt());

        //System.out.println(n);

        SpeakingEntity person = new SpeakingEntity() {
            @Override
            public void sayHello() {
                System.out.println("Hello!");
            }

            @Override
            public void sayBye() {
                System.out.println("Bye!");
            }
        };
        SpeakingEntity newPerson = new SpeakingEntity() {
            @Override
            public void sayHello() {
                System.out.println("Fight!!");
            }

            @Override
            public void sayBye() {
                System.out.println("You loose!");
            }
        };
        person.sayHello();
        person.sayBye();
        newPerson.sayHello();
        newPerson.sayBye();
    }
}