package it.salvatore.database;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.QueryBuilder;

import java.util.List;

public class CheckQueryBuilder {
    public static void main(String[] args) throws Exception {               // viene utilizzato " codice_cliente " per la ricerca
        int id = 2;
        CardDao getCardDao = new CardDao();
        ClienteDao getClienteDao = new ClienteDao();
        Dao<Card, Integer> cardDao = getCardDao.getCardDao();
        Dao<Cliente, Integer> clienteDao = getClienteDao.getClienteDao();
        QueryBuilder<Card, Integer> cardQb = cardDao.queryBuilder();
        QueryBuilder<Cliente, Integer> clienteQb = clienteDao.queryBuilder();
        cardQb.where().eq("cliente_id",id);
        List<Card> listCard = cardQb.join("cliente_id", "codice_cliente", clienteQb).query();

        for (Card c : listCard) {
            System.out.println("Id " + c.getId());
            System.out.println("CardNo " + c.getCardno());


        }


    }
}
