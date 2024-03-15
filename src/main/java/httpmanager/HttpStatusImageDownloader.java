package httpmanager;


import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HttpStatusImageDownloader {
    public void downloadStatusImage(int code)  {
        try {
            String url = new HttpStatusChecker().getStatusImage(code);
            try(InputStream in = new URL(url).openStream()) {
                String path = "cats/" + code + ".jpg";
                if (!new File(path).exists()) {
                    Files.copy(in, Paths.get(path));
                } else {
                    System.out.println("There is not image for HTTP status" + code);
                }
            }
        }catch (Exception e){
            System.out.println("Sth went wong: " + e.getMessage());
        }
    }
}
