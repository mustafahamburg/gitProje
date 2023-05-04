package Java.Day_53_Interface;

import java.util.ArrayList;
import java.util.List;

public class Cat implements Animal{ // implement keyword ile interface class ,
                                    // normal class tarafindan inherit edildi
                                    // interface class i , normal CAT class i tarafindan uygulandi
                                    // interface kurallar cercevesini ifade eder
                                    // implement eden class bu kurallari uygular
    @Override
    public String food() {
        return "sut icer";
    }

    public static void main(String[] args) {
        List<String>stringList=new ArrayList<>();
    }
}
