import java.util.Comparator;
import java.util.List;

public class Metody {
   public static void sortWiek(List<Employee> employeeList){
       employeeList.sort(Comparator.comparing(Employee::getAge).reversed());
       System.out.println("\n Sortowanie po wieku \n");
       for (Employee employee: employeeList
       ) {
           System.out.println(employee.getName()+ " jego wiek to :  " + employee.getAge());

       }
   }
    public static List<Employee> sortKasa(List<Employee> employeeList){
        System.out.println("\n Sortowanie po Kasie");
        employeeList.sort(Comparator.comparing(Employee::getSalary));
        return employeeList;
    }

}
