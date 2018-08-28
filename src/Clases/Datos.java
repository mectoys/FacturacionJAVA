 
package Clases;
 
public class Datos {
    //los metodos comienzan con minuscula y la otra palabra en mayuscula
    public boolean validarUsuario (String usuario, String clave){
        if (usuario.equals("zulu")&& clave.equals("123")) {
            return true;
        }else 
        {
            return false;
        }
    }
}
