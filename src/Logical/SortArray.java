package Logical;
 
import java.util.Arrays;
import java.util.Comparator;

public class SortArray {
    public static void main(String[] args) {

        // sort Array of employee objects using Comparator interface

        Employee[] employees = {
            new Employee(10, "Ramesh", 50000),
            new Employee(20, "John", 30000),
            new Employee(30, "tom", 40000),
            new Employee(40, "Tony", 60000)
        };

        System.out.println(" Before sorting => " + Arrays.toString(employees));
        Arrays.sort(employees, new SortEmployeeBySalary());
        System.out.println(" After sorting Employee by salary => " + Arrays.toString(employees));

        Arrays.sort(employees, new SortEmployeeByName());
        System.out.println(" After sorting Employee by name=> " + Arrays.toString(employees));

    }
}

class SortEmployeeBySalary implements Comparator < Employee > {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() - o2.getSalary();
    }
}


class SortEmployeeByName implements Comparator < Employee > {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}