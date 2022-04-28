package controllers;

import java.util.ArrayList;

import models.Dvd;

public class DvdController {
    
    private static ArrayList<Dvd> dvds = new ArrayList<Dvd>();
	
	
	public static ArrayList<Dvd> Listar(){
		return dvds;
	}
	
	public static boolean cadastrarDvd(Dvd dvd){
		if( buscarId(dvd.getIdDvd()) == null )  {
			dvds.add(dvd);
			return true;
		}
		return false;
	}
	


    public static Dvd buscarId(String idDvd) {
		for(Dvd dvdCad : dvds) {
			if(dvdCad.getIdDvd().equals(idDvd)) {
				return dvdCad;
			}
		}
		return null;
	}
	
	
}
