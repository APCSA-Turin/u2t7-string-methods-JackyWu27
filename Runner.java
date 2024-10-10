public class Runner {
    public static void main(String[] args) {
    CustomStringMethods methods = new CustomStringMethods();
    boolean bool1 = methods.longerThan("Food", 2);
    System.out.println(bool1);
    String str2 = methods.funnyString("Banan", 1);
    System.out.println(str2);
    String str3 = methods.halvesReversed("Tacocat");
    System.out.println(str3);
    String str4 = methods.pigLatin("Hey");
    System.out.println(str4);
    String str5 = methods.removeCharacter("Help", 99);
    System.out.println(str5);
    String str6 = methods.insertAt("hello", "hi", "z");
    System.out.println(str6);
    String str7 = methods.endUp("qwerty", 99);
    System.out.println(str7);
    
    String str8 = methods.yellOrWhisper("Abfghbdf");
    System.out.println(str8);

    }
}
