public class LoriMain {
    public static void main(String[] args) {
        System.out.println ("################################Juncal###########################################");
        Lori stats = new Lori();
        String myName = stats.getName();
        System.out.println("Name: " + myName);

        int myAge = stats.getAge();
        System.out.println("Age: " + myAge);

        double myHeight = stats.getHeight();
        System.out.println("Height: " + myHeight + " m");

        stats.saySomething(myName);

        System.out.println ("-");

        String myName2 = stats.getName2();
        System.out.println("Name: " + myName2);

        int myAge2 = stats.getAge2();
        System.out.println("Age: " + myAge2);

        int myLargura = stats.getLargura();
        System.out.println("Largura: " + myLargura + " m");

        double myHeight2 = stats.getHeight2();
        System.out.println("Height: " + myHeight2 + " m");

        stats.saySomething(myName2);
        System.out.println ("##################################################################################");
    }
}
