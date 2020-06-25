/*
 Diseñe, modele mediante el diagrama UML e implemente una clase Libro_Fisica
que contenga los siguientes atributos: código de tipo entero, titulo de tipo String,
autor de tipo String, anio_edicion de tipo entero.
Diseñe e implemente un único constructor que permita gestionar los datos de la clase,
además, implemente sus respectivos métodos get() y set() correspondientes para cada
atributo; además, implemente el método toString() para mostrar la información relativa
a la clase Libro_Fisica.
En la clase principal main(), diseñe e implemente 3 objetos que lleven el nombre de la
clase Libro_Fisica, con valores considerados para la presente aplicación y muestre por
pantalla. Finalmente, implemente la versión de prueba en Git Hub-Atom.
.
 */
package libro_fisicaapp;

/**
 *
 * @author Lenin Paul
 */
class Libro_Fisica{
 /*Atributos*/
private int codigo;
private String titulo;
private String autor;
private int anio_edicion;

    /*Constructor*/

public Libro_Fisica(int pCodigo, String pTitulo ,String pAutor ,int pAnio_edicion) {
    codigo=pCodigo;
    titulo=pTitulo;
    autor=pAutor;
   anio_edicion=pAnio_edicion;
}
/*Metodos*/

public int getCodigo (){
    return codigo;
}
public void setCodigo(int codigo){
    this.codigo= codigo ;/*this,puntero que invocaa al atrivuto private codigo*/
}
public String getTitulo(){
    return titulo;
}
public void setTitulo(String titulo){
    this.titulo= titulo ;
}
public String getAutor(){
    return autor;
}
public void setAutor(String autor){
    this.autor= autor ;
}
public int getAnio_edicion(){
    return anio_edicion;
}
public void setAnio_edicion(int anio_edicion){
    this.anio_edicion= anio_edicion ;
}
@Override
public String  toString(){
    return "El Libro de Fisica con codigo "+codigo+" de cuarto nivel con titulo : "+titulo+" y"
           + " con el autor "+autor
           + " y con anio de edicion : "+anio_edicion+" se encuentra en el repositoio de la ESPE";
}
}




public class Libro_FisicaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro_Fisica libro1=new Libro_Fisica(111,  "FUNDAMENTOS DE FISICA", "J.D Beer",  2018);
        Libro_Fisica libro2=new Libro_Fisica(112,  "FUNDAMENTOS DE FISICA", "A.Manrique",  2019);
        Libro_Fisica libro3=new Libro_Fisica(113,  "FUNDAMENTOS DE FISICA", "D.Zill", 2020);


        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());



    }

}
