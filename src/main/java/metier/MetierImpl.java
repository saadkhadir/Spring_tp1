package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;
    @Override
    public double calcul() {
        double t=dao.getData();
        double res=t*25;
        return res;
    }
}
