package com.example.bandorganizer.models;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "tblSong")
public class Song {
    //DB Primary Key
    @PrimaryKey(autoGenerate = true)
    public int id;
    //Song Attributes
    public String titel;
    public String singer;
    public TonTyp tontyp;
    public String songtext; //To be changed to binary file in a second step (PDF)
    public String songurl;
    public Record songrec;

    //Konstruktor
    public Song(String titel, String singer, TonTyp tontyp, String songtext, String songurl, Record songrec){

    }

    //Generated Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public TonTyp getTontyp() {
        return tontyp;
    }

    public void setTontyp(TonTyp tontyp) {
        this.tontyp = tontyp;
    }

    public String getSongtext() {
        return songtext;
    }

    public void setSongtext(String songtext) {
        this.songtext = songtext;
    }

    public String getSongurl() {
        return songurl;
    }

    public void setSongurl(String songurl) {
        this.songurl = songurl;
    }

    public Record getSongrec() {
        return songrec;
    }

    public void setSongrec(Record songrec) {
        this.songrec = songrec;
    }


}
