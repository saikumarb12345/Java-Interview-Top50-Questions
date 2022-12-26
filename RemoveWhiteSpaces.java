package Java50;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String input = "Hi   Welcome to the      Code  PressS  community    ";
        // input.replace(" ","");
        System.out.println(removeWhiteSpaces(input));
        // input = input.replaceAll("\\s", ""); --> Use this Also
    }
    // How to remove Whitespaces from String ?
    public static String removeWhiteSpaces(String input){
        StringBuilder str = new StringBuilder();

        char[] ch = input.toCharArray();
        for(char c : ch){
            // IF CHARACTER IS NOT WHITE SPACE, THEN ONLY APPEND(ADD) IT.
            if(!Character.isWhitespace(c)){
                str.append(c);
            }
        }
        return str.toString();
    }
}
