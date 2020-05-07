package app;

public class Main {
    public static void main(final String[] args) throws Exception {
        var vowelList = new ExtractVowel("Mohamed Lamine KabA");
        System.out.println(vowelList.getVowel());
        vowelList.newtext("Youssouf");
        System.out.println(vowelList.getVowel());
    }
}