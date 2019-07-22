package controlflowswitch;

public class ControlFlowSwitch {

    public static void main(String[] args) {

        /*
        String day = "Friday";
        if (day == "Monday") {
            System.out.println("1");
        } else if (day == "Tuesday") {
            System.out.println("2");
        } else if (day == "Wednesday") {
            System.out.println("3");
        } else if (day == "Thursday") {
            System.out.println("4");
        } else if (day == "Friday") {
            System.out.println("5");
        } else if (day == "Saturday") {
            System.out.println("6");
        } else if (day == "Sunday") {
            System.out.println("7");
        }
         */
        String day = "Saturday";
        switch (day) {
            case "Monday":
                System.out.println("1");
                break;
            case "Tuesday":
                System.out.println("2");
                break;
            case "Wednesday":
                System.out.println("3");
                break;
            case "Thursday":
                System.out.println("4");
                break;
            case "Friday":
                System.out.println("5");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Not valid day");
                break;

        }
    }
}
