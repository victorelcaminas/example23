import java.util.Scanner;

public class Example23 {
    public static void main(String[] args){
        float grade = 0, sum = 0;
        boolean wasTen = false;
        int i = 0;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        while ( grade != -1) {
            grade = inputValue.nextFloat();
            if (grade != -1) {
                sum = sum + grade;
                    i = i + 1;
                    if (grade == 10){
                        wasTen = true;
                }
            }
        }
        System.out.println("Average: " + sum / i);
        if (wasTen) {
            System.out.println("There was a 10");
        } else {
            System.out.println("There was not a 10");
        }
    }
}
