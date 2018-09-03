 
package Clases;
 
public class Datos {
    
  private Usuario misUsuarios[]=new Usuario[50];
  private int conUsuario =0;
   
   public Datos() 
   {
       //constructor 
       Usuario miUsuario = new 
               Usuario("zulu", "Jose", "Ponciano", "123", 1);
       
      misUsuarios[conUsuario] =miUsuario;
      conUsuario++;
      
   }
   //metodo que nos devuelva los datos usuario
   public Usuario[] getUsuarios(){
       return misUsuarios;
   }
   //metodo si el user existe o no.
    public boolean existeUsuario (String usuario){
       boolean aux=false;
        for (int i = 0; i < conUsuario; i++) {
            if (misUsuarios[i].getIdUsuario().equals(usuario))
            {
                return true;
            }
        }
        return false;
    }
    
    //los metodos comienzan con minuscula y la otra palabra en mayuscula
    public boolean validarUsuario (String usuario, String clave){
       boolean aux=false;
        for (int i = 0; i < conUsuario; i++) {
            if (misUsuarios[i].getIdUsuario().equals(usuario) &&
                    misUsuarios[i].getClave().equals(clave))
                    {
                return true;
            }
        }
        return false;
    }
    
        public int posicionUsuario (String usuario){
        
        for (int i = 0; i < conUsuario; i++) {
            if (misUsuarios[i].getIdUsuario().equals(usuario))
            {
                return i;
            }
        }
        return -1;
    }
}
