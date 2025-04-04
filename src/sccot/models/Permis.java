package sccot.models;
import java.io.*;
import java.util.*;

import sccot.utils.DataBaseManager;

/**
 * 
 */
public class Permis {

    /**
     * Default constructor
     */
    public Permis(String id, Date dateDel, Date dateExp) {
    this.id = id;
    this.dateDel = dateDel;
    this.dateExp = dateExp;
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
   private Date dateDel;

    /**
     * 
     */
    private Date dateExp;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDateDel() {
		return dateDel;
	}

	public void setDateDebut(Date dateDel) {
		this.dateDel = dateDel;
	}

	public Date getDateExp() {
		return dateExp;
	}

	public void setDateExperation(Date dateExp) {
		this.dateExp= dateExp;
	}
	
	public void addPermis(Permis p) {
		DataBaseManager.addPermis(p);
	}

}