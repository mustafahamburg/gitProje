package Java.Day_51_FinalKeyword;

public class FinalKeywordConstructor {

    // Final keyword deger atamadan constructoer araciligi ile deger atamasi yaptik
    public final int number;

    public FinalKeywordConstructor(int a,int b){
        //number=1123;  parametre olmadan atanan deger
        number=a+b; // int parametre yani obje create ederken verilen degeri final olan
                  // bir variable degeri olarak belirledik
    }
    //public void test1(){
    //    number=123; // burada methoddan final ile tanimlanmis instance variable deger atanamaz
    //}



}
