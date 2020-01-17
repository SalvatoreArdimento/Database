package it.salvatore.database;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.util.List;

public class CardCreateUpdateDelete {
    public static void main(String[] args) throws Exception {

        String databaseUrl = "jdbc:postgresql://localhost:5432/checkcard";
        // create a connection source to our database
        ConnectionSource connectionSource =
                new JdbcConnectionSource(databaseUrl, "postgres", "developer2");

        // instantiate the dao
        Dao<Card, Integer> cardDao =
                DaoManager.createDao(connectionSource, Card.class);

        //CREATE
        Card createdCard = new Card(5,"77759928329");
       // cardDao.create(createdCard);



        //UPDATE
        createdCard.setCardno("77759928329");
        cardDao.update(createdCard);

        //DELETE
        //cardDao.delete(createdCard);

        List<Card> listCard = cardDao.queryForAll();
        for (Card c : listCard) {
            System.out.println("Id " + c.getId());
            System.out.println("CardNo " + c.getCardno());

        }



    }
}
