package dao;

public class DaoImpl implements IDao{


    @Override
    public double getData() {
        System.out.println("De la base de données");
        double t = 21;
        return t;
    }
}
