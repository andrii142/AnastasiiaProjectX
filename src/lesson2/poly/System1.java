package lesson2.poly;

import lesson2.interfaceexample.ServiceDB;
import lesson2.interfaceexample.UserDAO;

import java.util.ArrayList;
import java.util.List;

public class System1 {

    static void paySalaryForAll(List<Employee> employeeList) {
        for(Employee employee : employeeList) {
            employee.paySalary();
        }
    }

    public static void main(String[] args) {
        Employee dev = new Developer();
        Employee man = new Manager();

        List<Employee> list = new ArrayList<Employee>();
        list.add(dev);
        list.add(man);

        paySalaryForAll(list);



        ServiceDB<Employee> serviceDB = new UserDAO<Employee>();




    }
}
