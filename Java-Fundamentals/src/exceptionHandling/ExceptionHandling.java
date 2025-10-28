/*
Why exception handling is needed?
-> To handle unexpected exception/errors
-> To promote smooth execution of program
 */

package exceptionHandling;

public class ExceptionHandling {
    private final int[] nums = {1, 2, 3};

    public int getNum(int idx) {
        try {
            return this.nums[idx];
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return -1;
    }

    public static void main(String[] args) {
        ExceptionHandling e = new ExceptionHandling();
        System.out.println(e.getNum(8));
    }
}
