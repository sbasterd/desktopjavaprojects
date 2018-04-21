public class PigLatin {
    public static void main(String[] args) {
        String string="saeed is a very hard boy";
        String[] tokens=string.split(" ");
        String[] newString=convert(tokens);
        for (String str :
                newString) {
            System.out.println(str);
        }
    }
    public static String[] convert(String[] token){
        String[] changed=new String[token.length];
        for(int count=0;count<token.length;++count){
            String sub=token[count].substring(1);
            sub+=token[count].charAt(0)+"ay";
            changed[count]=sub;
        }
        return changed;
    }
}
