package Java.Day_39_ConstructorAndOOPintro.constructor2;

public class Kitap {
    String author;
    int publishYear;
    String name;

    Kitap(){

    }

    public Kitap(String author,int publishYear,String name){
     this.author=author;
     this.name=name;
     this.publishYear=publishYear;
    }
    public String toString(){    // bir constructor ile olusan objenin yazdirilmasi boyle
        return name+" "+publishYear+" "+author;
    }
}
