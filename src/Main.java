import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        String elementTree;
        MyTreeSet myTreeSet = new MyTreeSet();
        OtherMethods otherMethods = new OtherMethods();
        Scanner scanner = new Scanner(System.in);

        do {
            elementTree = scanner.nextLine();
            if (otherMethods.exitProgramm(elementTree)) { // Exit
                scanner.close();
                break;
            }
            if (otherMethods.exitProgramm(elementTree)) { // Stop
                ++counter;
                System.out.println(counter);
            }
            myTreeSet.add(Integer.valueOf(elementTree));
        }
        while (counter == 0);
        System.out.println(myTreeSet);
        scanner.close();
    }
}