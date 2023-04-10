package Java.Day_36_WrapperClasses;

public class _4_exampleWrapper {
    public static void main(String[] args) {
        String str="((W&e**_lco73me %t%o co!$,r,e< J>>>&@av'''~a777.||}{";
        // yukaridaki stringdeki Alphabetic degerleri yeni bir stringe atayip yazdieriniz,method ile..

        System.out.println("newLetter(str) = " + newLetter(str));// Welcome to core Java
    }
    private static String newLetter(String s){
        String newStr="";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isAlphabetic(s.charAt(i)) || s.charAt(i)== ' '){
                newStr+=s.charAt(i);
            }
        }
        return newStr;
    }

}
