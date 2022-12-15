package day18arraylistspassbyvalue;

public class MethodOverloading01 {
    public static void main(String[] args) {
        /*
        Method overloading nasilyapilir...
        1-Methodisimleri ayn olmalidir..
        2-Method parametreleri farkli olmalidir.
            a-Parametre sayilari degistirilebilir.  int int   === int int int
            b-Parametrelerin data tiplerini degistirebilirsiniz..  int    double
            c-data tiplerinin yerlerini degistirebiliriz          double   int
                ancak data tipleri farkli ise..
        3-Method ismi + Parametreler ==> Method Signature (imzasidir)
        4- Method Signature disinda ne degistiriseniz degistirin Java o methodlari farkli kabul etmez.
         */
        add(3,5);  // 1.method kullanir data tipleri uydugu icin
        add(3,5.0); //3.method kullanir  data tipleri uydugu icin
        // add(3.0, 5.0);  // uygun method olmadigi icin hata verir...
    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
    }
}
