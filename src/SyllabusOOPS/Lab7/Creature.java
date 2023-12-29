package SyllabusOOPS.Lab7;

abstract public class Creature {
    Boolean canfly;
    Boolean hasTail;
    public abstract  void noOfLegs();
    public abstract void printInfo();
}
class human extends Creature{
    Boolean canfly = false;
    Boolean hasTail = false;

    @Override
    public void noOfLegs() {
        int legs = 2;
        System.out.println("Human has ="+legs+" legs");
    }

    @Override
    public void printInfo() {
        System.out.println("Human");
        System.out.println("Can Fly="+canfly);
        System.out.println("Has Tail="+hasTail);
        noOfLegs();
    }
}
class Dog extends Creature{
    Boolean canfly = false;
    Boolean hasTail = true;

    @Override
    public void noOfLegs() {
        int legs = 4;
        System.out.println("Dog has ="+legs+" legs");
    }
    @Override
    public void printInfo() {
        System.out.println("Dog");
        System.out.println("Can Fly="+canfly);
        System.out.println("Has Tail="+hasTail);
        noOfLegs();
    }
}
class Pigeon extends Creature{
    Boolean canfly = true;
    Boolean hasTail = false;

    @Override
    public void noOfLegs() {
        int legs = 2;
        System.out.println("Pigeon has ="+legs+" legs");
    }
    @Override
    public void printInfo() {
        System.out.println("Pigeon");
        System.out.println("Can Fly="+canfly);
        System.out.println("Has Tail="+hasTail);
        noOfLegs();
    }
}

class use{
    public static void main(String[] args) {
        Pigeon p = new Pigeon();
        p.printInfo();
        human h = new human();
        h.printInfo();
        Dog d = new Dog();
        d.printInfo();
    }
}
