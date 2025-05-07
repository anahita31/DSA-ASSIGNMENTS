package HOMEASSIGNMENT1;
import java.util.ArrayList;
import java.util.Scanner;
public class Q2 {
	public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> lines = new ArrayList<>();
    
    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        if (line.isEmpty()) break; // Optional: stop on empty line
        lines.add(line);
    }
    for (int i = lines.size() - 1; i >= 0; i--) {
        System.out.println(lines.get(i));
    }

    scanner.close();
}
}

