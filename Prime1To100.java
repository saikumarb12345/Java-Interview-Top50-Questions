package Java50;

public class Prime1To100 {
    public static void main(String[] args) {
        int num=50;

        for(int i=2;i<=num;i++){
            int temp = 0;
            for(int j=2;j<i/2;j++){
                if(i % j == 0){
                    temp++;
                    break;
                }
            }
            if( temp == 0){
                System.out.print(i+" ");
            }
        }
    }
    public static void prime(int num){

    }
}
