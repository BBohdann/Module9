package httpmanager;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HttpImageStatusCli {
    public void askStatus(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write an code status");
        String code;
        while (true) {
            code = scanner.nextLine();
            if (Pattern.matches("\\d+", code)) {
                break;
            } else {
                System.out.println("Please enter a valid number\n");
            }
        }
        HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
        downloader.downloadStatusImage(Integer.parseInt(code));
    }
}
