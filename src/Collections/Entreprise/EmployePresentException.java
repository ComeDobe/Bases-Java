package Collections.Entreprise;

public class EmployePresentException extends Throwable {

    public EmployePresentException() {
        super("L'employé est déjà présent dans l'entreprise.");

}
}
