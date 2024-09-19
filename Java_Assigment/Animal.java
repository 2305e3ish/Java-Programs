public class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
    public void sound() {
        System.out.println("Animal is making a sound");
    }

    class lion extends Animal {
        public void eat() {
            System.out.println("Lion is eating");
        }
        public void sound() {
            System.out.println("Lion is roaring");
        }
    }

    class tiger extends Animal {
        public void eat() {
            System.out.println("Tiger is eating");
        }
        public void sound() {
            System.out.println("Tiger is roaring");
        }
    }

    class panther extends Animal {
        public void eat() {
            System.out.println("Panther is eating");
        }
        public void sound() {
            System.out.println("Panther is roaring");
        }
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myLion = myAnimal.new lion();
        Animal myTiger = myAnimal.new tiger();
        Animal myPanther = myAnimal.new panther();

        myAnimal.eat();
        myAnimal.sound();

        myLion.eat();
        myLion.sound();

        myTiger.eat();
        myTiger.sound();

        myPanther.eat();
        myPanther.sound();
    } 
    
}
