package me.nibo.corejava.v1ch04.employeetest;

/**
 * EmployeeTest
 * @author NiBo
 */
@SuppressWarnings({ "PMD.UseUtilityClass" })
public class EmployeeTest {

    @SuppressWarnings({ "PMD.SystemPrintln", "PMD.UnusedFormalParameter" })
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.printf("name=%s, salary=%.2f, hireDay=%s\n",
                    e.getName(), e.getSalary(), e.getHireDay());
        }
    }

}
