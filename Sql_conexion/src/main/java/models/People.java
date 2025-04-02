
package models;

public class People {
    //atributos
   private  int id;
   private int dni;
   private  String nombres;
   private  String apellidos ; 
   public   int getDni (){
     return dni;
   }
   //metodos personalizados
    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    //metodos
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    //metod getter in setter
    public String walk() {
        return "estoy caminando";
    }
   public  String speak (){
    return "hola chamo";
}
}
