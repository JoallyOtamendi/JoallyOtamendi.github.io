/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacurso.pojos;

/**
 *
 * @author ferys
 */
public class CategoriaProd {
   private int idCategoria;
   private String nomCategoria;
   private String descCategoria;

    public CategoriaProd(int idCategoria, String nomCategoria, String descCategoria) {
        this.idCategoria = idCategoria;
        this.nomCategoria = nomCategoria;
        this.descCategoria = descCategoria;
    }

    public String getDescCategoria() {
        return descCategoria;
    }

    public void setDescCategoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }
      
    @Override
    public String toString (){
        return this.nomCategoria;
    }
}
