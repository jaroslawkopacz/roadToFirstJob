package stringClass;

public class exercises {
    public static void main(String[] args) {
        String s = repeatEnd("Hello", 3);
        System.out.println(s);
    }

//    Zadanie 13 - Powtarzany koniec
//
//    Mając ciąg “str” i int n, zwróć ciąg złożony z n powtórzeń ostatnich n znaków ciągu.
//
//    Na przykład:
//    repeatEnd("Hello", 3) → "llollollo"
//    repeatEnd("Hello", 2) → "lolo"
//    repeatEnd("Hello", 1) → "o"

    public static String repeatEnd(String str, int n) {
        return str.substring(str.length() - n).repeat(n);
    }






}
