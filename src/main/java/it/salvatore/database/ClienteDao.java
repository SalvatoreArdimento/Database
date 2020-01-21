package it.salvatore.database;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

public class ClienteDao {
    private String databaseUrl = "jdbc:postgresql://localhost:5432/checkcard";
    // create a connection source to our database
    private ConnectionSource connectionSource;
    private Dao<Cliente, Integer> ClienteDao;

    public ClienteDao() throws SQLException {
        connectionSource =   new JdbcConnectionSource(databaseUrl, "postgres","developer2");


    }

    public Dao<Cliente, Integer> getClienteDao() throws Exception{
        Dao<Cliente, Integer> ClienteDao =
                DaoManager.createDao(connectionSource, Cliente.class);
        return ClienteDao;
    }
}
