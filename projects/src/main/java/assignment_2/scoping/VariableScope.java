package assignment_2.scoping;

public class VariableScope {
    public static void main (String args[]) {
        example_1();

        // Question 1, does i exist at this point?
        //Answer: No, i does not exist at this point as it has local method scope.

        // If so can you uncomment this and the code will compile?
        //Answer : If you uncomment following code, it will NOT compile as i is not available at this point.
        // System.out.println(i);

        if(true) {
            int i = 0;
        }
        // Question 2, does i exist at this point?
        //Answer : No, i does not exist at this point.

        // If so can you uncomment this and the code will compile?
        //Answer : Again i will not be available here and so code will NOT compile, it will produce error.

        // System.out.println(i);
    }

    public static void example_1(){
        int i = 0;
        System.out.println(i);
    }
}
