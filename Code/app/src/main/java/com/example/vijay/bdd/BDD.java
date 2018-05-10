package com.example.vijay.bdd;

/**
 * Created by vijay on 06-04-2017.
 */

public class BDD {
    String artistname;
    String artistblood;
    String artistage;
    String artistaddress;
    String artistphone;
    String artistid;
    String artistuser;
    String artistpass;

    public BDD(){

    }

    public BDD(String artistid, String artistname,String artistblood, String artistage, String artistaddress, String artistphone,String artistuser,String artistpass){
        this.artistblood=artistblood;
        this.artistage=artistage;
        this.artistaddress=artistaddress;
        this.artistphone=artistphone;
        this.artistname=artistname;
        this.artistid=artistid;
        this.artistuser=artistid;
        this.artistpass=artistid;
    }

    public String getArtistname() {
        return artistname;
    }

    public String getArtistblood() {
        return artistblood;
    }
    public String getArtistage() {
        return artistage;
    }
    public String getArtistaddress() {return artistaddress;}
    public String getArtistphone() {return artistphone;}

    public String getArtistid() {
        return artistid;
    }
    public String getArtistuser() {
        return artistuser;
    }

    public String getArtistpass() {
        return artistpass;
    }

}
