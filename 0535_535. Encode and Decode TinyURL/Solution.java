import java.util.HashMap;

/*
 * @lc app=leetcode id=535 lang=java
 *
 * [535] Encode and Decode TinyURL
 */
public class Codec {

    private HashMap<String, String> codeMap = new HashMap<>();
    private HashMap<String, String> urlMap = new HashMap<>();

    public static final int CODE_LENGTH = 6;

    static String HOST_BASE = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String charSet = buildCharSet();
        String shortUrl = "";
        while(urlMap.containsKey(longUrl) == false){
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < Codec.CODE_LENGTH; i++) {
                int r = (int)(Math.random() * charSet.length());
                sb.append(charSet.charAt(r));
            }
            String code = sb.toString();
            if(codeMap.containsKey(code) == false) {
                codeMap.put(code, longUrl);
                urlMap.put(longUrl, code);
                shortUrl = code;
            }
        }
        return HOST_BASE + shortUrl;
    }

    private String buildCharSet(){
        StringBuffer charSetBuffer = new StringBuffer();
        for(char c = 'a'; c <= 'z'; c++){
            charSetBuffer.append(c);
        }
        for(char c = 'A'; c <= 'Z'; c++){
            charSetBuffer.append(c);
        }
        for(char c = '0'; c <= '9'; c++) {
           charSetBuffer.append(c);
        }
        return charSetBuffer.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return codeMap.getOrDefault(shortUrl.replace(HOST_BASE, ""), "");
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));


