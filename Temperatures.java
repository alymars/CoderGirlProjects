public class Temperatures {
    public static void main(String[] args) {
        System.out.println("Temperature Calculator");
        System.out.println();
        System.out.println("The data provided are:");

        int[][] temps = new int[4][7];

        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        //avg temp 71.14

        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        //avg temp 82.43

        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        //avg temp 75.14


        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;
        //avg temp 68.86

        String[] time = {"7AM: ", "3PM: ", "7PM: ", "3AM: "};
        String[] day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int rows = 4;
        int columns = 7;
        int a, b;


        for (a = 0; a < rows; a++) {
            System.out.print(time[a]);
            for (b = 0; b < columns; b++) {
                System.out.print(temps[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Based on that data, the following are the average temperatures for the week.");
        System.out.println();

        for (b = 0; b < columns; b++) {
            int daysum = 0;
            System.out.print(day[b] + ": ");
            for (a = 0; a < rows; a++) {
                daysum += temps[a][b];
            }
            System.out.println(daysum / rows);
        }

        System.out.println();

        for (a = 0; a < temps.length; a++) {
            int sum = 0;
            System.out.print(time[a]);

            for (b = 0; b < temps.length; b++) {
                sum += temps[a][b];
                System.out.print("");
            }
            System.out.println(sum / temps.length);
        }

        System.out.println();
        System.out.println("The final overall average temperature for the week was:");
        //average overall temp 73.71
        System.out.println();

        int avg = 0;
        for(a = 0; a < 4; a++) {
            for(b = 0; b < 7; b++) {
                avg += temps[a][b];

            }
        }
        System.out.println("Overall temperature is " + avg/28);
    }
}

