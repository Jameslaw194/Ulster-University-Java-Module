public class HelloWorld {

    public static void main(String[] args) {
/*
        for (int i = 0; i < 4; i+=1){
            System.out.println("Java Programming is fun");
        }
        */
/*
        for (int i = 0; i < 3; i+=1){
            System.out.println("*       *");
        }
        System.out.println(" *     *");
        System.out.println("  *****");
        */
/*
        String [] name = {"Joel", "William", "Mary Sue", "Sarah", "Hank"};
        String [] lab = {"43", "50", "39", "46", "35"};
        String [] bonus = {"7", "8", "10", "9", "6"};

        System.out.println("////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==          Student Points            ==");
        System.out.println("////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");

        System.out.printf("%-10s %-5s %-5s %-5s\n", "Name", "Lab", "Bonus", "Total");
        System.out.println(new String(new char[40]).replace('\0', '_'));

        // Calculate total points and print each student's information
        for (int i = 0; i < name.length; i++) {
            int totalPoints = Integer.parseInt(lab[i]) + Integer.parseInt(bonus[i]);
            System.out.printf("%-10s %-5s %-5s %-5d\n",
                    name[i], lab[i], bonus[i], totalPoints);
        }
*/
/*
        int height = 2;
        int width = 3;
        int depth = 4;

        System.out.println("The box is "+height+"cm high, "+width+"cm wide and "+depth+"cm depth");
        System.out.println("The volume of the box is "+height*width*depth+"cms cubed");
        System.out.println("The perimeter of the box is "+(height*4+width*4+depth*4)+"cms");
*/


        double celsiusTemperature = 100.0;
        double fahrenheitTemperature;

        fahrenheitTemperature = (celsiusTemperature * 9.0 / 5.0) + 32.0;

        System.out.printf("%.2f°C is equal to %.2f°F%n", celsiusTemperature, fahrenheitTemperature);

    }
}
