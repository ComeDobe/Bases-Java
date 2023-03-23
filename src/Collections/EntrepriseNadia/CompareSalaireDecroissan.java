package Collections.EntrepriseNadia;

import Collections.EntrepriseNadia.EmployeNadia;

import java.util.Comparator;

public class CompareSalaireDecroissan  implements Comparator<EmployeNadia> {
    @Override
    public int compare(EmployeNadia o1, EmployeNadia o2) {
        return -Double.compare(o1.getSalaire(), o2.getSalaire());
    }
}
