package Java.Day_57_Error_Exception_01;

public class _06_TryChatchFinally {
    public static void main(String[] args) {
        String str="ABC";
        try {
            System.out.println("Try block ici");
            System.out.println(str.substring(5));
        }catch (NullPointerException ex){
            System.out.println("Null Point Exception hatasi var,This block statement");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Test basarisiz oldu.Test Fail");
        }catch (Exception ex){
            System.out.println("Genel hatalar");
        }finally {
            System.out.println("Finally block");
        }
    }
}
