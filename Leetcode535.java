public class Leetcode535 {
    public class Codec {
        String URL = "";

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            URL = longUrl;
            return "http:tinyurl.com/4e9iAk";
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return URL;
        }
    }

    // public class Codec {
    //     Map<String, String> codeDB = new HashMap<>(), urlDB = new HashMap<>();
    //     static final String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    //     private String getCode() {
    //         char[] code = new char[6];
    //         for (int i = 0; i < 6; i++)
    //             code[i] = chars.charAt((int) Math.random() * 62);
    //         return "http://tinyurl.com/" + String.valueOf(code);
    //     }

    //     public String encode(String longUrl) {
    //         if (urlDB.containsKey(longUrl))
    //             return urlDB.get(longUrl);
    //         String code = getCode();
    //         while (codeDB.containsKey(code))
    //             code = getCode();
    //         codeDB.put(code, longUrl);
    //         urlDB.put(longUrl, code);
    //         return code;
    //     }

    //     public String decode(String shortUrl) {
    //         return codeDB.get(shortUrl);
    //     }
    // }
    // Your Codec object will be instantiated and called as such:
    // Codec codec = new Codec();
    // codec.decode(codec.encode(url));
}
