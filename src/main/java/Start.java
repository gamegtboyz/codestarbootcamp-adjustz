import java.io.InputStream;
import java.net.URL;
import jakarta.json.Json;
import jakarta.json.JsonReader;
import jakarta.json.JsonObject;

class Start {
    public static void main(String[] data) {
        String base = "https://api.coinbase.com";
        //String base = "https://185.173.192.48";
        String path = "v2/prices/BTC-USD/spot";
        try {
            URL url = new URL (base + path);
            InputStream input = url.openStream();
            JsonReader reader = Json.createReader(input);
            JsonObject object = reader.readObject()
                                        .getJsonObject("data");
            String number = obhect.getString("amount");
            double value = Double.parseDouble(number);
            System.out.println(value);

        } catch (Exception e) {
            System.err.println("Unable to connect");
        }
        
    }
}
//JSON object {"name" : "David", "number" : 7 }
//JSON array [ ]
