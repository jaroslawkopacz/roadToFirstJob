package stringClass;

public class Main {
    public static void main(String[] args) {
        trimExample();
    }

    public static void stringPoolExample(){
        String name = "Maciej";
        String name2 = new String("Maciej");

        System.out.println(name == name2);
    }

    public static void compareToExample(){
        System.out.println("a".compareTo("b"));
        System.out.println("c".compareTo("b"));
        System.out.println("c".compareTo("c"));
    }

    public static void concatExample(){
        String s = "Ti";
        String animal = s.concat("ger");
        System.out.println(animal);
    }

    public static void containsExample(){
        String s = "bdhjqwbjhk";
        System.out.println(s.contains("qwb"));
        System.out.println(s.contains("bdg"));
    }

    public static void endsWithExample(){
        String s = "bdhjqwbjhk";
        System.out.println(s.endsWith("jhk"));
        System.out.println(s.endsWith("jhh"));
    }

    public static void blankEmptyExample(){
        String s = "";
        String s2 = "    ";
        String s3 = "XD";

        System.out.println(s3.isEmpty());
        System.out.println(s3.isBlank());
    }

    public static void repeatExample(){
        System.out.println("X".repeat(5));
    }

    public static void replaceExample(){
        System.out.println("Boom".replace('o', 'u'));
        System.out.println("Boom".replace("Boom", "bu"));
    }

    public static void substringExample(){
        String s = "0123456789";
        System.out.println(s.substring(4,8));
    }

    public static void trimExample() {
        System.out.println("'"+"      XD   ".trim() + "'");
    }

}
