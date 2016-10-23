package lesson2;

import lesson2.interfaceexample.ServiceDB;
import lesson2.interfaceexample.SolutionDAO;

import java.util.Date;

public class SolutionUtil {
    private Task taskLogic(int testSuccessful, int testCounts) {
        Task task = new Task();
        task.setTotalSolutions();
        if(testSuccessful == testCounts) task.setSuccessfultSolutions();
        task.setLastSubmit(new Date());
        return task;
    }

    public void solutionLogic(int testSuccessful, int testCounts) {
        Solution solution = new Solution();
        solution.setName("Jack");
        solution.setDate(new Date());
        solution.setTask(taskLogic(testSuccessful, testCounts));


        ServiceDB<Solution> serviceDB = new SolutionDAO<Solution>();
        serviceDB.save(solution);

    }




}
