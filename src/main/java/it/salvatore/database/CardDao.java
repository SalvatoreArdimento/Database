package it.salvatore.database;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

public class CardDao {
    private String databaseUrl = "jdbc:postgresql://localhost:5432/checkcard";
    // create a connection source to our database
    private ConnectionSource connectionSource;
    private Dao<Card, Integer> cardDao;

    public CardDao() throws SQLException {
    connectionSource =   new JdbcConnectionSource(databaseUrl, "postgres","developer2");


}

    public Dao<Card, Integer> getCardDao() throws Exception{
        Dao<Card, Integer> cardDao =
                DaoManager.createDao(connectionSource, Card.class);
        return cardDao;
    }
}
