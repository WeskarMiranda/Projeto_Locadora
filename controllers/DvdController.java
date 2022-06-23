package controllers;

import java.util.ArrayList;

import controllers.interfaces.IDvdController;
import models.Dvd;

public class DvdController implements IDvdController {
    
    private static ArrayList<Dvd> dvds = new ArrayList<Dvd>();
	
	@Override
	public ArrayList<Dvd> Listar(){
		return dvds;
	}
	
	@Override
	public boolean cadastrarDvd(Dvd dvd){
		if( buscarId(dvd.getIdDvd()) == null )  {
			dvds.add(dvd);
			return true;
		}
		return false;
	}
	
	@Override
    public Dvd buscarId(String idDvd) {
		for(Dvd dvdCad : dvds) {
			if(dvdCad.getIdDvd().equals(idDvd)) {
				return dvdCad;
			}
		}
		return null;
	}
	
}
