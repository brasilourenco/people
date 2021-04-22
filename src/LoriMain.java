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
        System.out.println ("##################################################################################");
    }
}
