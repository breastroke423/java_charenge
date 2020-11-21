public class FizzBuzz {
    public static void main(String[] args) {
        int i = 0;
        int loopCount = 100;
        int numFiz = 3;
        int numBuzz = 5;
        String strFiz = "Fiz";
        String strBuzz = "Buzz";
        for (i = 1; i <= loopCount; i++) {
            if(i % (numFiz * numBuzz) == 0){
                System.out.println(strFiz + strBuzz);
            } else if (i % numFiz == 0){
                System.out.println(strFiz);
            } else if (i % numBuzz == 0){
                System.out.println(strBuzz);
            } else {
                System.out.println(i);
            }
        }
    }
}
