package lesson2;

public class Controller {

    //@Autowired
    //SolutionUtil solutionUtil;

    //Request
    public void processSolution1001() {
        //logic
        int testCounts = 10;
        int testSuccessful  = 7;

        //
        //
        SolutionUtil solutionUtil = new SolutionUtil();
        solutionUtil.solutionLogic(testCounts, testSuccessful);
        //logic
    }

    //Request
    public void processSolution1002() {
        //logic
        int testCounts = 20;
        int testSuccessful = 20;

        SolutionUtil solutionUtil = new SolutionUtil();
        solutionUtil.solutionLogic(testCounts, testSuccessful);
        //logic
    }

    //Request
    public void processSolution1003() {
        //logic
        int testCounts = 25;
        int testSuccessful = 25;

        SolutionUtil solutionUtil = new SolutionUtil();
        solutionUtil.solutionLogic(testCounts, testSuccessful);
        //logic
    }


    public static void main(String[] args) {


    }
}
