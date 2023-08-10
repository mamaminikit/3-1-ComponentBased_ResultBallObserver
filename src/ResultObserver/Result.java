/* Kitthanya Teachanontkullawat (Mine) 64050027
    Observer Pattern */
package ResultObserver;
import java.util.Scanner;

/**
 * @author mmmaimankarae
 */

// main method (Client)
public class Result {
    public static void main(String[] args) {
        final String red = "\u001B[31m";
        String input = "Start";
        Scanner scan = new Scanner(System.in);
        Viewer1 one = new Viewer1();
        Viewer2 two = new Viewer2();
        RecordSource record = new RecordSource();
        
        record.register(one);
        record.register(two);
        
        while (input != "") {
            System.out.print("Enter score: ");
            input = scan.nextLine();
            if (input != "") {
                record.setNewMatch(input);
            } else {
                System.out.println(red + "\'New match was updated already\'");
            }
        }
    }
}
