package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if(lastInRow<0){
            System.out.println("last number in row is negative");
        }
        int sum = 0;
        if(numberToSkip>lastInRow){
            System.out.println("number to skip is bugger then the last");
        }
        for(int i=0;i<=lastInRow;i++){
            sum = sum+i;
        }
        int fin = sum-numberToSkip;
        System.out.println("counted sum is "+fin);
      //  System.out.println("skipped sum is "+ skipped);

    }
}
