package it.salvatore.database;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.query.In;
import com.j256.ormlite.support.ConnectionSource;
import it.salvatore.database.Card;

import java.util.List;


public class CardApp2 {

    public static void main(String[] args) throws Exception {

        CardDao dao = new CardDao();
        Dao<Card, Integer>cardDao = dao.getCardDao();



        Card card = new Card();

        //QUERY FOR ALL
        List<Card> listCard = cardDao.queryForAll();
        for (Card c : listCard) {
            System.out.println("Id " + c.getId());
            System.out.println("CardNo " + c.getCardno());

        }

        //QUERY FOR EQ
        listCard = cardDao.queryForEq("cardno","673728319312");
        for (Card c : listCard) {
            System.out.println("Id " + c.getId());
            System.out.println("CardNo " + c.getCardno());
        }


    }
}


