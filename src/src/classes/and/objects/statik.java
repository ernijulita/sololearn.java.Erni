package classes.and.objects;

public class statik {
    class person{
    public static int pCount;
    public static void main(String[ ] args) {
        Person.pCount = 1;
        Person.pCount++;
        System.out.println(Person.pCount);
    }
    }

}

