package Java50;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Hello I am Java";
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        String revStr = "";
        String[] words = str.split(" ");
        for(int i=0;i<words.length;i++){
            if(i == words.length - 1){
                revStr = words[i] + revStr;
            }
            else {
                revStr = " " + words[i] + revStr;
            }
        }
        return revStr;
    }
}
