public class SueciaMain {
    public static void main(String[] args) {
        System.out.println ("################################Suécia###########################################");
        Suecia stats = new Suecia();
        String myName3 = stats.getName3();
        System.out.println("Name: " + myName3);

        int myAge3 = stats.getAge3();
        System.out.println("Age: " + myAge3);

        double myHeight3 = stats.getHeight3();
        System.out.println("Height: " + myHeight3 + " m");

        stats.saySomething3(myName3);

        System.out.println ("-");

        String myName4 = stats.getName4();
        System.out.println("Name: " + myName4);

        int myAge4 = stats.getAge4();
        System.out.println("Age: " + myAge4);

        boolean myBool = stats.bool();
        System.out.println("Have a cat? : " + myBool);

        double myHeight4 = stats.getHeight4();
        System.out.println("Height: " + myHeight4 + " m");

        stats.saySomething4(myName4);
        System.out.println ("##################################################################################");
    }
}
