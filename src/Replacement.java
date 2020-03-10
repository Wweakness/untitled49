import java.util.*;

public class Replacement {
    public static String replaceSpace(String iniString, int length) {
        StringBuilder str=new StringBuilder();
        char[] a=iniString.toCharArray();
        for(int i=0;i<length;i++){
            if(Character.isLetter(a[i])){
                str.append(a[i]);
            }else {
                str.append("%20");
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String a="mysf  MDSF";
        int b=10;
        System.out.println(replaceSpace(a,b));
    }
}