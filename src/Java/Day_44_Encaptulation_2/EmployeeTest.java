package Java.Day_44_Encaptulation_2;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {


        // Employee calisan=new Employee("Gulden");
        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Ramazan");

        ArrayList<Integer>sayilar=new ArrayList<>();
        sayilar.add(5);

        ArrayList<Employee> calisanlar = new ArrayList<>();
        Employee calisan = new Employee("Gulden");
        calisanlar.add(calisan);
        calisanlar.add(new Employee("Bilal"));
        calisanlar.add(new Employee("Ayse",12345));
        calisanlar.add(new Employee("Symbat",125,"IT"));
        calisanlar.add(new Employee("Selim",15236,"QA","Senior"));
        System.out.println("calisanlar = " + calisanlar);
    }
}
