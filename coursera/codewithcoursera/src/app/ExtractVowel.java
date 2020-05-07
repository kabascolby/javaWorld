package app;

public class ExtractVowel {
    String text;
    String vowel = "aeuio";
    StringBuilder result;

    public ExtractVowel(String text) {
        this.text = setText(text);
    }
    
    private String setText(String text) {
        if(text == null)
            throw new IllegalArgumentException("Invalid input");
        return text;
    }
    
    public void newtext(String text){
        this.text = setText(text);
    }

    public String getVowel(){
            
        result = new StringBuilder();

        for(char c : text.toCharArray())
            if(vowel.contains(String.valueOf(c).toLowerCase()))
                result.append(c);
        return result.toString();
    }
    
}