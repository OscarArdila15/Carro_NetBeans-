/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazcarro;

/**
 *
 * @author Oscar Ardila
 */
public class Bt {
   private String id;
   private String nombreBT;
   // getter y setter
    public Bt ()
    {
     id="";
     nombreBT="";
    }
    public String toString() {
      return nombreBT;
   }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreBT() {
        return nombreBT;
    }

    public void setNombreBT(String nombreBT) {
        this.nombreBT = nombreBT;
    }
   

}
