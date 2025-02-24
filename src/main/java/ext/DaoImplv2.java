package ext;

import dao.IDao;

public class DaoImplv2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Depuis Web service en Celcuis");
        double t=26;
        return t;
    }
}
