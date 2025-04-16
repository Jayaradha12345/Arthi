public class loop{
    public static void main(String arg[]){
        int[] num = {3,2,4,5};
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]>max)
             max = num[i];
             
            
        }
        System.out.println("maxnumberis" +max);

    }
}