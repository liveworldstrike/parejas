import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Parejas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parejas
{
    // instance variables - replace the example below with your own
    private ArrayList<String> alumnos;

    /**
     * Constructor for objects of class Parejas
     */
    public Parejas()
    {
        // initialise instance variables
        alumnos = new ArrayList<String>();

        alumnos.add("Adeva Tranche, Adrián");
        alumnos.add("Aller González, Francisco Javier");
        alumnos.add("Álvarez Prieto, Noelia");
        alumnos.add("Barrionuevo Pérez, Manuel");
        alumnos.add("Bóveda del Río, José Antonio");
        alumnos.add("de la Viuda Crespo, Ignacio");
        alumnos.add("Encina Maestro, David");
        alumnos.add("Felix Nañez, Kevin");
        alumnos.add("Fernández Diez, Daniel");
        alumnos.add("Fernández González, Javier");
        alumnos.add("Fernández Rincón, Jesús");
        alumnos.add("Fuentes Álvarez, Francisco José");
        alumnos.add("García Juárez, David");
        alumnos.add("García Serrano, Rubén");
        alumnos.add("González Álvarez, David");
        alumnos.add("López Beltrán, Víctor");
        alumnos.add("Lora García, Sandra");
        alumnos.add("Melcón Diez, Víctor");
        alumnos.add("Menéndez Pouso, Francisco José");
        alumnos.add("Pérez Bayón, Álvaro");
        alumnos.add("Pradera San José, Daniel");
        alumnos.add("Prieto Mediavilla, Gabriel");
        alumnos.add("Robles González, Miguel Ángel");
        alumnos.add("Sánchez Manzano, Adán");
        alumnos.add("Serrano García, Verónica");
        alumnos.add("Tascón González, Anibal");
    }

    /**
     * metodo para crear parejas segun sea par o impar el numero de alumnos
     */

    public void aleatoriosParejas()
    {
        //de esta las hace aleatoriamente y en pareja 
        Collections.shuffle(alumnos);
        boolean parejaConDosMiembros = true;
        int saberPar = alumnos.size()%2;
        int contador = 0;
        if (saberPar == 0){
            for(String alumno : alumnos){
                if (parejaConDosMiembros){
                    contador = contador +1;
                    parejaConDosMiembros = false;
                }
                else{
                    parejaConDosMiembros = true;
                }
                String muestra = String.format("%02d",contador);
                System.out.println("00" + muestra + alumno);
            }
        }
        else {
            for(String alumno : alumnos){
                if (contador == (alumnos.size()/2)){

                }
                else if (parejaConDosMiembros){
                    contador = contador +1;
                    parejaConDosMiembros = false;
                }
                else{

                    parejaConDosMiembros = true;
                }
                String muestra = String.format("%02d",contador);
                System.out.println("00" + muestra + alumno);
            }
        }

    }

    /**
     * metodo para crear parejas segun sea par o impar el numero de alumnos de otra forma .
     */

    public void aleatoriosParejas2()
    {
        //de esta forma solo los hace aleatoriamente 
        Collections.shuffle(alumnos);
        int contador = 0;
        boolean parejaConDosMiembros = true;
        while (contador<alumnos.size()){
            String alumno = alumnos.get(contador);
            contador = contador +1;
            String muestra = String.format("%02d",contador);
            System.out.println("00" + muestra + alumno);
            
        }
        
        


        
    }

    /**
     * mostrar parejas segun el numero que se le asigne 
     */
    public void mostrarAlumnos(int numeroGrupo)
    {

    }
}
