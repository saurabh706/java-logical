
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaEx {
    
    public static List<Employee> addEmployees(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(12, "Saurabh", 1200000, 31));
        list.add(new Employee(14, "Raj", 100000, 21));
        list.add(new Employee(2, "Sameer", 900000, 41));
        list.add(new Employee(21, "Ramesh", 300000, 22));
        list.add(new Employee(10, "Sam", 1100000, 20));
        list.add(new Employee(3, "Tom", 1200000, 33));
        return list;
    }

    public static void main(String[] args) {
        List<Employee> list = addEmployees();
        Stream<Employee> str = list.stream().sorted((Employee e1, Employee e2)-> e1.getEmpname().compareTo(e2.getEmpname()));
        str.forEach(System.out::println);
    }
}
