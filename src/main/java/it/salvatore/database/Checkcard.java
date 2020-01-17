package it.salvatore.database;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.util.List;

public class Checkcard {
    public static void main(String [] args) throws Exception{
        // this uses h2 by default but change to match your database
        String databaseUrl = "jdbc:postgresql://localhost:5432/checkcard";
        // create a connection source to our database
        ConnectionSource connectionSource =
                new JdbcConnectionSource(databaseUrl, "postgres","developer2");

        // instantiate the dao
        Dao<Card, Integer> cardDao =
                DaoManager.createDao(connectionSource, Card.class);


        CardNumber checkcard = new CardNumber("");
        List<Card> listCard = cardDao.queryForAll();
        for (Card c : listCard) {
            checkcard.setCardNo(c.getCardno());
            if(checkcard.isCorrect()&&checkcard.getCardNo().length()==13){
               System.out.println("Id "+c.getId());
               System.out.println("CardNo "+c.getCardno());
         }else
             System.out.println("La carta con id "+c.getId()+" ha il checkdigit errato");


        }




    }
}
