package Exception;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileHandler fileHandler = new FileHandler();

        System.out.println("============= Writer Program ===============");
        System.out.print("Do you want to write a file? (Y/N or y/n): ");
        String writeResponse = scanner.nextLine();

        if (writeResponse.equalsIgnoreCase("Y")) {
            System.out.print("Please input path file: ");
            String path = scanner.nextLine();

            System.out.println("Please input content file:");
            String content = scanner.nextLine();

            if (fileHandler.writeFile(path, content)) {
                System.out.println("Save file with content <save> or <SAVE>");
            }
        }

        System.out.print("Do you want to read the file? (Y/N or y/n): ");
        String readResponse = scanner.nextLine();

        if (readResponse.equalsIgnoreCase("Y")) {
            System.out.print("Please input path file: ");
            String path = scanner.nextLine();

            String fileContent = fileHandler.readFile(path);
            System.out.println("Content in file:\n" + fileContent);
            System.out.println("Read file is successed");
        }

        scanner.close();
    }
}
