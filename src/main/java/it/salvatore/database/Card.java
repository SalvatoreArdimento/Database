package it.salvatore.database;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "cards")
    public class Card{

        @DatabaseField(id = true)
        private int id;
        @DatabaseField
        private String cardno;

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
    }


