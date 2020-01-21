package it.salvatore.database;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "card")
    public class Card{

        @DatabaseField(id = true)
        private int id;
        @DatabaseField
        private String cardno;
        @DatabaseField
        private int cliente_id;
        @DatabaseField
        private Date data_scadenza;


        public Card() {
            // ORMLite needs a no-arg constructor
        }
        public Card(int id, String cardno) {
            this.id = id;
            this.cardno = cardno;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getCardno() {
            return cardno;
        }
        public void setCardno(String cardno) {
        this.cardno = cardno;
    }

        public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }
        public int getCliente_id() {
        return cliente_id;
    }

        public void setData_scadenza(Date data_scadenza) {
        this.data_scadenza = data_scadenza;
    }

        public Date getData_scadenza() {
        return data_scadenza;
    }
}


