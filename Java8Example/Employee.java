
/**
 * Employee
 */
public class Employee {

    private int empid;
    private String empname;
    private int empsalary;
    private int empage;

    Employee(int empid, String empname, int empsalary, int empage){
        this.empid = empid;
        this.empname = empname;
        this.empsalary = empsalary;
        this.empage = empage;
    }

    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getEmpname() {
        return empname;
    }
    public void setEmpname(String empname) {
        this.empname = empname;
    }
    public int getEmpsalary() {
        return empsalary;
    }
    public void setEmpsalary(int empsalary) {
        this.empsalary = empsalary;
    }
    public int getEmpage() {
        return empage;
    }
    public void setEmpage(int empage) {
        this.empage = empage;
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empage=" + empage
                + "]";
    }

    
}