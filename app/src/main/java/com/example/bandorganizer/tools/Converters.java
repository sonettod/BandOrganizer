package com.example.bandorganizer.tools;


import androidx.room.TypeConverter;

import com.example.bandorganizer.models.Band;
import com.example.bandorganizer.models.Record;
import com.example.bandorganizer.models.UserTyp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Converters {
    @TypeConverter
    public static Date toDate(String stringdate){
        return stringdate == null ? null : new Date(stringdate);
    }

    @TypeConverter
    public static String toTimestamp(Date date){
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("dd/MM/yy");
        return dateTimeFormat.format(date);
    }

    @TypeConverter
    public static byte[] usertyptobyte(UserTyp usertyp){
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(usertyp);
            byte[] usertypAsBytes = baos.toByteArray();
            ByteArrayInputStream bais = new ByteArrayInputStream(usertypAsBytes);
            return usertypAsBytes;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @TypeConverter
    public static UserTyp readbytetousertyp(byte[] usertypAsBytes){
        try{
            ByteArrayInputStream baip = new ByteArrayInputStream(usertypAsBytes);
            ObjectInputStream ois = new ObjectInputStream(baip);
            UserTyp usertyp = (UserTyp) ois.readObject();
            return usertyp;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @TypeConverter
    public static byte[] bandlisttobyte(List<Band> bandList){
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(bandList);
            byte[] bandListAsBytes = baos.toByteArray();
            ByteArrayInputStream bais = new ByteArrayInputStream(bandListAsBytes);
            return bandListAsBytes;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @TypeConverter
    public static List<Band> readbytetobandlist(byte[] bandlistAsBytes){
        try{
            ByteArrayInputStream baip = new ByteArrayInputStream(bandlistAsBytes);
            ObjectInputStream ois = new ObjectInputStream(baip);
            return (List<Band>) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    @TypeConverter
    public static byte[] songrectobyte(Record songrec){
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(songrec);
            byte[] songRecAsBytes = baos.toByteArray();
            ByteArrayInputStream bais = new ByteArrayInputStream(songRecAsBytes);
            return songRecAsBytes;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @TypeConverter
    public static Record readbytetosongrec(byte[] songRecAsBytes){
        try{
            ByteArrayInputStream baip = new ByteArrayInputStream(songRecAsBytes);
            ObjectInputStream ois = new ObjectInputStream(baip);
            Record songrec = (Record) ois.readObject();
            return (Record) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
