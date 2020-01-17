package it.salvatore.database;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.query.In;
import com.j256.ormlite.support.ConnectionSource;
import it.salvatore.database.Card;

import java.util.List;


public class CardApp {

    public static void main(String[] args) throws Exception {

        // this uses h2 by default but change to match your database
        String databaseUrl = "jdbc:postgresql://localhost:5432/checkcard";
        // create a connection source to our database
        ConnectionSource connectionSource =
                new JdbcConnectionSource(databaseUrl, "postgres","developer2");

        // instantiate the dao
        Dao<Card, Integer> cardDao =
                DaoManager.createDao(connectionSource, Card.class);



        Card card = new Card();



         //QUERY FOR ALL
          /*  List<Card> list = cardDao.queryForAll();
        for (int i = 0; i < list.size(); i++) {
            card = list.get(i);
            System.out.println("Id " + card.getId());
            System.out.println("CardNo " + card.getCardno());
        }*/

         //QUERY FOR EQ


        List<Card> list = cardDao.queryForEq("cardno","673728319312");


        card = list.get(0);
        System.out.println("id "+card.getId());
        System.out.println("cardno "+card.getCardno());




        // close the connection source
        connectionSource.close();
    }
}


