package controlflow;

public class ControlFlowIf {

    public static void main(String[] args) {

        //age
        int age = 60;
        if (age > 20) {
            if (age < 60) {
                System.out.println("Hello sir!");
            } else if (age > 60) {
                System.out.println("Hello grandpa");
            } else {
                System.out.println("Hello grandpa");
            }

            System.out.println("Graduated");
        } else {
            System.out.println("Not Graduated");
        }
        String newr = (age < 60) ? "Hello sir!" : "Hello grandpa";
        String result = (age > 20) ? "Gratuaded" : "Not Gratuaded";

        //String result = (age > 20) ? ((age<60) ? ("Hello sir!" : "Hello grandpa")) : ("Not graduated");
        System.out.println("result is " + result);
    }

}
