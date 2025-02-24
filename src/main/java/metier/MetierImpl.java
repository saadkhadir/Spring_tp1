package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;
    @Override
    public double calculKelvin() {
        double t=dao.getData();
        double res=t+273.15;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
