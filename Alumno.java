
public class Alumno
{ 
    private String nombre;
    private int clave;
    
    public Alumno(int clave, String nombre)
    {
        this.nombre = nombre;
        clave = clave;
    }
    
   public int dimeClave()
   {
       return clave;
   }
   
   public String dimeNombre()
   {
       return nombre;
   }
}
