package Collections.EntrepriseNadia;

public class EmployeNadiaException extends Throwable {


    private EmployeNadia Emp;
    private String message="";
    public EmployeNadiaException(String s, EmployeNadia empl, EmployeNadia emp) {
        super(emp.getNom()+" ");
    }
}
