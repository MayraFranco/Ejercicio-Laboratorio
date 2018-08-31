import java.util.ArrayList;

public class Laboratorio
{
    public ArrayList<Alumno>alumnos;
    public Laboratorio ()
    {
        alumnos = new ArrayList<Alumno>();
    }
    
    public void inscribe(int clave, String nombre)
    {
        Alumno al = new Alumno(clave, nombre);
        alumnos.add(al);
        System.out.println("La clave ha sido capturada");
    }
    
    public int regresaAlumnos()
    {
        return alumnos.size();
    }
    
    public void darBaja(int clave)
    {
        for( int i=0; i < alumnos.size(); i++)
        {
            if (clave == (alumnos.get(i).dimeClave()))
            {
                alumnos.remove(i);
                System.out.println("Alumno eliminado");
            }
            else
            {
                System.out.println("Alumno no eliminado");
            }
        }
    }
    
    public void imprimirLista()
    {
        System.out.println("Lista de alumnos\n");
        for (int i=0; i<alumnos.size(); i++)
        {
            System.out.println("El alumno: "+alumnos.get(i).dimeNombre() + 
            " con clave: " + alumnos.get(i).dimeClave() + "\n");
        } 
    }
}
