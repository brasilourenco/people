public class RMMain {
    public static void main(String[] args) {
        System.out.println ("################################Lajes###########################################");
        RM stats = new RM();
        String myName6 = stats.getName6();
        System.out.println("Name: " + myName6);

        int myAge6 = stats.getAge6();
        System.out.println("Age: " + myAge6);

        double myHeight6 = stats.getHeight6();
        System.out.println("Height: " + myHeight6 + " m");

        stats.saySomething6(myName6);

        System.out.println ("-");

        String myName7 = stats.getName7();
        System.out.println("Name: " + myName7);

        int myAge7 = stats.getAge7();
        System.out.println("Age: " + myAge7);

        boolean myBool2 = stats.bool2();
        System.out.println("Have a dog? : " + myBool2);

        double myHeight7 = stats.getHeight7();
        System.out.println("Height: " + myHeight7 + " m");

        stats.saySomething7(myName7);
        System.out.println ("##################################################################################");
    }
}
