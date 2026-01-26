package Previous_M1;
import java.util.*;

public class EntryUtility_Exceptions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of entries");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter the entry " + i + " details");
            String entry = sc.nextLine();

            try {
                String[] parts = entry.split(":");

                String employeeId = parts[0];
                int duration = Integer.parseInt(parts[2]);

                EntryUtility.validateEmployeeId(employeeId);
                EntryUtility.validateDuration(duration);

                System.out.println("Valid entry details");

            } catch (Exception e) {
                System.out.println("Invalid entry details");
            }
        }
        sc.close();
    }
}
class EntryUtility {

    static boolean validateEmployeeId(String employeeId)
            throws InvalidEntryException {

        if (!employeeId.matches("GOAIR/\\d{4}")) {
            throw new InvalidEntryException("Invalid entry details");
        }
        return true;
    }

    static boolean validateDuration(int duration)
            throws InvalidEntryException {

        if (duration < 1 || duration > 5) {
            throw new InvalidEntryException("Invalid entry details");
        }
        return true;
    }
}
class InvalidEntryException extends Exception {

    public InvalidEntryException(String message) {
        super(message);
    }
}
