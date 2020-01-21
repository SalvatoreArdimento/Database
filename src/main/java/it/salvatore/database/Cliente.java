package it.salvatore.database;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "cliente")
public class Cliente{

    @DatabaseField(id = true)
    private int id;
    @DatabaseField
    private String nome;
    @DatabaseField
    private String cognome;
    @DatabaseField
    private int codice_cliente;


    public Cliente() {
        // ORMLite needs a no-arg constructor
    }
    public Cliente(int codice_cliente, String nome, String cognome) {
        this.codice_cliente = codice_cliente;
        this.nome = nome;
        this.cognome = cognome;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodice_cliente(int codice_cliente) {
        this.codice_cliente = codice_cliente;
    }
    public int getCodice_cliente() {
        return codice_cliente;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }
}


