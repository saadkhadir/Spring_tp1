package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    @Autowired
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

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }
}
