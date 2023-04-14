/*
This program was created by Kimg@techtrepacademy.com to teach troubleshooting
Modified by Alenna for the CTE course "Software & Programming Development 2" instructed by Mr. Gross
Email - alenna.castaneda@oneidaihla.org
*/
public class error {
    public static void main(String[] args) {
        System.out.println("hello everybody");
        System.out.println("am I doing this correctly");
        //looping 10 times
        for (int i=0;i<10;i++){
            System.out.println("the number i is "+i);
        }

        //looping 10 times
        for (int i=0;i>10;i++){
            System.out.println("the new number i is "+i);
            //if i is 0
            if (i==0){
                System.out.print("i is equal to zero");
            //i is not 0
            }else {
                System.out.print("i is not equal to zero");
            }
        }
    }
    //what other errors can I put into a source code file?
}
