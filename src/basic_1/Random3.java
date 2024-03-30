package basic_1;

public class Random3 {

    public static void main(String[] args) {


        Random3 special = new Random3();
        Boolean isS = special.isSpecial("ab1221ba");
        System.out.println(isS);

    }
    public boolean isSpecial(String text) {
        String tempText = alterText(text);
        return text.equals(tempText);
    }
    public String alterText(String inputText) {
        if(inputText == null || inputText.isEmpty()) {
            return inputText;
        }
        return inputText.charAt(inputText.length() - 1) + alterText(inputText.substring(0, inputText.length() - 1)); }
}
