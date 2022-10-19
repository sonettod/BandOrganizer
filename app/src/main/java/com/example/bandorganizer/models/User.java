package com.example.bandorganizer.models;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;
import java.util.List;

@Entity(tableName = "tblUser")
public class User {
    //DB Primary key
    @PrimaryKey(autoGenerate = true)
    private int id;
    //User Attribute

    public String username;
    public String vorname;
    public String nachname;
    public Date geburtsdatum;
    public String email;
    public String telnummer;
    public String prefmusic;
    public UserTyp usertyp;
    public List<Band> bandlist;

    //Konstruktor
    public User(String username, String vorname, String nachname, Date geburtsdatum, String email, String telnummer, String prefmusic, List<Band> bandlist){

    }


    //Getter Methoden für User-Attribute
    public int getId(){return id;}
    public String getUsername() {return username;}
    public String getVorname() {return vorname;}
    public String getNachname() {return nachname;}
    public Date getGeburtsdatum() {return geburtsdatum;}
    public String getEmail() {return email;}
    public String getTelnummer() {return telnummer;}
    public String getPrefmusic() {return prefmusic;}
    public UserTyp getUserTyp() {return usertyp;}
    public List<Band> getBandList(){return bandlist;}

    //Setter Methoden für user-Attribute
    public void setId(int id){this.id = id;}
    public void setUsername(String username) {this.username = username;}
    public void setVorname(String vorname) {this.username = vorname;}
    public void setNachname(String nachname){this.nachname = nachname;}
    public void setGeburtsdatum(Date geburtsdatum){this.geburtsdatum = geburtsdatum;}
    public void setEmail(String email){this.email = email;}
    public void setTelnummer(String telnummer){this.telnummer = telnummer;}
    public void setPrefmusic(String prefmusic){this.prefmusic = prefmusic;}
    public void setUserTyp(UserTyp usertyp){this.usertyp = usertyp;}
    public void setBandList(List<Band> bandList){this.bandlist = bandList;}



}
