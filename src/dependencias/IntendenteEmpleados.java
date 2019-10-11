package dependencias;

/**
 *
 * @author manuel
 */
public class IntendenteEmpleados
{
   private String message;

   public void setNombre(String message){
      this.message  = message;
   }
   
   public void getTarea(){
      System.out.println("HOLA SOY "+this.message+" Y SOY EL INTENDENTE");
   }
}
