package Collections.Entreprise;

public class EmployeAbsentException extends Throwable {
    public EmployeAbsentException() {
        super("L'employé n'est pas présent dans l'entreprise.");
    }
}
