public class StringPortions {
    public static void main(String[] args) {
        String string1 = "abcdefghijklmn";
        String string2 = "Efghijklavabc";
        if(string1.regionMatches(true,4,string2,0,3)){
            System.out.println("these portions are equal");
        }
        else System.out.println("not equal");
    }
}
