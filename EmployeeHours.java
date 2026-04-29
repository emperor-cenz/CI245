package homeworks;

import java.util.Scanner;

public class EmployeeHours {

    public static void main(String[] args) {

        String[] NAMES = {"Tom", "Jane", "Mark"};
        String[] DAYS = {"MON", "TUE", "WED", "THU", "FRI"};

        // Create a double type 2D array
        double[][] hours = new double[NAMES.length][DAYS.length];

        // Invoke methods
        input_hours(hours, NAMES, DAYS);

        display_hours(hours, NAMES, DAYS);

        System.out.println("----------------------------");

        System.out.println("Total hours : "
                + totalHours(hours, NAMES, DAYS));

        totalHoursByEmployee(hours, NAMES, DAYS);

    } // end main


    // 1) Method to enter work hours
    public static void input_hours(double[][] hours,
                                   String[] NAMES,
                                   String[] DAYS) {

        Scanner input = new Scanner(System.in);

        for (int employee = 0; employee < NAMES.length; employee++) {

            System.out.println("Enter hours for " + NAMES[employee]);

            for (int day = 0; day < DAYS.length; day++) {

                System.out.print(DAYS[day] + ": ");

                hours[employee][day] = input.nextDouble();
            }
        }
    }


    // 2) Method to display all work hours
    public static void display_hours(double[][] hours,
                                     String[] NAMES,
                                     String[] DAYS) {

        System.out.println("\nWork Hours Table");

        for (int employee = 0; employee < NAMES.length; employee++) {

            System.out.print(NAMES[employee] + ": ");

            for (int day = 0; day < DAYS.length; day++) {

                System.out.print(hours[employee][day] + " ");
            }

            System.out.println();
        }
    }


    // 3) Method to compute total hours
    public static double totalHours(double[][] hours,
                                    String[] NAMES,
                                    String[] DAYS) {

        double total = 0;

        for (int employee = 0; employee < NAMES.length; employee++) {

            for (int day = 0; day < DAYS.length; day++) {

                total += hours[employee][day];
            }
        }

        return total;
    }


    // 4) Show total hours by each employee
    public static void totalHoursByEmployee(double[][] hours,
                                            String[] NAMES,
                                            String[] DAYS) {

        System.out.println("\nTotal Hours By Employee");

        for (int employee = 0; employee < NAMES.length; employee++) {

            double total = 0;

            for (int day = 0; day < DAYS.length; day++) {

                total += hours[employee][day];
            }

            System.out.println(NAMES[employee]
                    + " worked "
                    + total
                    + " hours");
        }
    }

}


