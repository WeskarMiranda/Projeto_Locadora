package controllers.interfaces;

import java.util.ArrayList;

import models.Dvd;

public interface IDvdController {

    ArrayList<Dvd> Listar();

    boolean cadastrarDvd(Dvd dvd);
    
    Dvd buscarId(String idDvd);
}
