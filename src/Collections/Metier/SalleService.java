package Collections.Metier;

import java.util.ArrayList;
import java.util.List;

class SalleService implements IDao<Salle> {
    private List<Salle> salles;

    public SalleService() {
        salles = new ArrayList<Salle>();
    }

    public boolean create(Salle s) {

        s.setId(salles.size() + 1); // Id auto-incrément
        return salles.add(s);
    }

    public boolean delete(Salle s) {
        return salles.remove(s);
    }

    public boolean update(Salle s) {
        for (Salle salle : salles) {
            if (salle.getId() == s.getId()) {
                salle.setCode(s.getCode());
                salle.setLibelle(s.getLibelle());
                return true;
            }
        }
        return false;
    }

    public Salle findById(int id) {
        for (Salle salle : salles) {
            if (salle.getId() == id) {
                return salle;
            }
        }
        return null;
    }

    public List<Salle> findAll() {
        return new ArrayList<Salle>(salles);
    }
}