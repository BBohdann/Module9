package httpmanager;

import java.io.FileNotFoundException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpStatusChecker {
    public String getStatusImage(int code){
        try {
            String url = "https://http.cat/" + code + ".jpg";
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            int responce = connection.getResponseCode();
            if(responce == 404){
                throw new FileNotFoundException("File not found error");
            }else {
                return url;
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
