package Java.Day_40_Constructor_2.Example_1;

public class Student {
    int ogrNumber;
    String ogrName;
    String ogrSurName;
    int ogrLevel;
    boolean aktifMi;

    public Student() {
        System.out.println("Nesne olusturuldu");
    }

    public Student(int ogrNumber, String ogrName, String ogrSurName, int ogrLevel, boolean aktifMi) {
        System.out.println("Parametreli bir obje olusturuldu");
        // this.ogrNumber instince veriable,yani class tan gelendegisken
        // ogrNumber->this.ogrNumber esitlenen ise ,parametreden gelen degisken
        // isim benzerligi nedeniyle karismasin diye this kull.
        // Generate den otomatik yazmak icin ,bir de genellemede kullanacagimiz icin
        this.ogrName = ogrName;
        this.ogrSurName = ogrSurName;
        this.aktifMi = aktifMi;
        this.ogrLevel = ogrLevel;
        this.ogrNumber = ogrNumber;
    }

    public Student(int ogrNumber,String ogrName, String ogrSurName, int ogrLevel) {

        this(ogrNumber,ogrName,ogrSurName,ogrLevel,false);

    }



    public Student(int ogrNumber, String ogrName, String ogrSurName) {
       /*
        this.ogrName = ogrName;
        this.ogrSurName = ogrSurName;
        this.aktifMi = false;          // default degerini atadik
        this.ogrLevel = 0;
        this.ogrNumber = ogrNumber;
       */
        // yukaridaki gibi uzun yapmaktansa boyle de yapabiliriz
        // this()-> bu syntex ile constructor methodu cagirabiliyoruz
        // bu sekilde  kullanim tekrarlari ortadan kaldirir
        // tek bir this() ile parantez icinde tum parametreleri girerek ve
        // olmayan parametrelerin default degerlerini atiyoruz

        this(ogrNumber,ogrName,ogrSurName,0,false);
        // bu kullanim "clean cod" ahlakina uygun olanidir,muadili "super" dir
    }

    public Student(int ogrNumber) {

        this.ogrName = "";
        this.ogrSurName = "";
        this.aktifMi = false;          // default degerini atadik
        this.ogrLevel = 0;
        this.ogrNumber = ogrNumber;

    }
        public static Student createStudent () {  // 1) ögrenci ozellikleriyle creat etme
            Student ogr1 = new Student();
            ogr1.aktifMi = true;
            ogr1.ogrLevel = 3;
            ogr1.ogrName = "Ahmet";
            ogr1.ogrSurName = "Bayrak";
            ogr1.ogrNumber = 100342;
            return ogr1;
        }

}