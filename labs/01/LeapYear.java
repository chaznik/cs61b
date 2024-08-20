public class LeapYear {
    public static void main(String[] args) {

        System.out.println(args.length);

        if (args.length != 1) {
            System.out.println("Please enter input in the following format: java filename year - eg. java LeapYear 2000 ");
        }

        printLeapYear(args[0]);
    }

    public static void printLeapYear(String year) {
        int convertedYear = Integer.parseInt(year);
        String result = isLeapYear(convertedYear) ? year + " is a leap year." : year + " is not a leap year.";
        System.out.println(result);
    }

    //Leap year is divisible by 400 or divisible by 4 and not 100
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}