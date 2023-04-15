package Java.Day_39_ConstructorAndOOPintro.Constructor;

public class Okul {
    public static void main(String[] args) {
    // Yontem 1)  Direkt constractor parametreli tanimlanarak obje create ettik

        Student ogr=new Student(124563,"Ali","Gel",4);
        System.out.println(ogr);     // direkt yazilamiyor , bir method a ihtiyac var

    // Yontem 2)  En klasik obje olusturma tarzi

        Student st=new Student();
        st.name="Veli";st.surName="Git";
        st.id=25457;
        st.classRoom=2;
    }
    // Yontem 3)  Method yardimi ile veriable tanimladik:
    public static Student creatStudent(int id,String name,String  surName,int classRoom){
        Student student=new Student();
        student.classRoom=classRoom;
        student.name=name;
        student.surName=surName;

        return student;
    }
}
          /* Constructor ile Method un farki nedir?
             1-Constructor in adi Class in adi ile ayni olmak zorunda,method da ise degil
             2-Constructor in return type i yoktur, metrhod un var
           */