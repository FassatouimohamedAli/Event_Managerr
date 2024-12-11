package com.example;

import java.util.Date;

public class Event {
private int id ;
private String libelle ;
private Date DateDebut ;
private Date DateFin ;
private Date CoutTotal ;
private String  lieu ;

private String type ;

private String supervisor ;

    public Event(int id, String libelle, Date dateDebut, Date dateFin, Date coutTotal, String lieu, String type, String supervisor) {
        this.id = id;
        this.libelle = libelle;
        DateDebut = dateDebut;
        DateFin = dateFin;
        CoutTotal = coutTotal;
        this.lieu = lieu;
        this.type = type;
        this.supervisor = supervisor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    public Date getDateDebut() {
        return DateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        DateDebut = dateDebut;
    }

    public Date getDateFin() {
        return DateFin;
    }

    public void setDateFin(Date dateFin) {
        DateFin = dateFin;
    }

    public Date getCoutTotal() {
        return CoutTotal;
    }

    public void setCoutTotal(Date coutTotal) {
        CoutTotal = coutTotal;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
}
