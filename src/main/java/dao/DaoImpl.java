package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao{


    @Override
    public double getData() {
        System.out.println("De la base de données en Celsuis");
        double t = 21;
        return t;
    }
}
