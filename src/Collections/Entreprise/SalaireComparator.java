package Collections.Entreprise;

import java.util.Comparator;

class SalaireComparator implements Comparator<Employe> {

    @Override
    public int compare(Employe emp1, Employe emp2) {
        double diff = emp2.getSalaire() - emp1.getSalaire();
        if (diff == 0) {
            return emp1.getNom().compareTo(emp2.getNom());
        } else {
            return Double.compare(diff, 0);
        }
    }
}