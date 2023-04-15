package Java.Day_39_ConstructorAndOOPintro;

public class TlhBank1 {
    public static void main(String[] args) {

        TlhBank1 tninBankaHesabi=new TlhBank1(); // Bu bir Constuctor dir

    }
    public TlhBank1(){  // Burada bir parametresiz constructor create ettik(ayni zamanda default bir constuctor dir)
                        // Class ismi ile ayni olmak zorundadir
                        // Retur Type si (int,String,void...) yoktur
                        // Constructor lar hem parametreli hem de parametresiz olabilirler,
                        // parametreli olusturursak parametresiz obje create edemeyiz
                        // yazilmadiginda gizli olarak calisir.
                        // Class icerisinde bir kez olusturulur.Tum objeler ayni constructor u kullanabilir
    }
    public void TlhBank1(){   // Bu bir constructor degildir,Method tur

    }

}
