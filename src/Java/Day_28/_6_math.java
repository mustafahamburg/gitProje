package Java.Day_28;

import java.util.Random;

public class _6_math {
    public static void main(String[] args) {
        // Math class icerisinde bir cok static method yer alir.
        // cok kullanisli
        System.out.println(Math.max(7,5));  // 7
        System.out.println(Math.min(3,5));  // 3

        System.out.println(Math.PI);  // 3.141592653589793

        System.out.println(Math.E);  // 2.718281828459045
      // double degerlerin min max ini cagirdik
        System.out.println(Math.min(2.7,81231)); // 2.7
        System.out.println(Math.max(4.6,8.1231)); // 8.1231

        System.out.println(Math.pow(2,5)); //2 ussu 5 oluyor yani 32.0
        System.out.println(Math.floor(-2.3)); // expected result -3  , floor--> zemin veya taban  demek,
                                              // ondalik sayinin bir alta yuvarlar
        System.out.println(Math.ceil(3.1)); // expected result 4  , ceil-->tavan veya ust demek,
                                            // ondalik sayiyi bir uste yuvarlar

        Math.random(); // bu math class icinde bir random
        Random r=new Random();  // bu random class i
        // Random icin ikisini de kullanabiliriz

        // TODO: regex kutuphanesinde tanimli,arastirrrr!!!!

    }
}
