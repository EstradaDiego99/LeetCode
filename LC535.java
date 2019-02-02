// Diego Estrada Talamantes
// devdiegoest@gmail.com

import java.util.HashMap;
public class LC535{

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        // Aquí escribimos el método respuesta
        System.out.println();
        long endTime   = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000000;
        System.out.println("Tiempo: "+totalTime+" ms");
    }
}

class Codec {

    HashMap<String,String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String shortUrl = "";
        for(int i=0; i<10; i++){
            shortUrl = shortUrl + (char)((Math.random()*100)%43+48);
        }
        map.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}