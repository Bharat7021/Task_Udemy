public class Leetcode171 {
    public static String colberToTitle(int col) {
        StringBuilder result = new StringBuilder();
        while(col>0){
            result.insert(0,(char)((col-1)%26+'A'));
            col = (col-1)/26;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int x = 12850896;//ABCDEF
        System.out.println((char)(1285089%26+64));
        System.out.println(colberToTitle(x));
    }
}
