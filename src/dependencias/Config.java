package dependencias;
import org.springframework.context.annotation.*;

@Configuration
public class Config {
   @Bean 
   public DirectorEmpleados DirectorEmpleadosBean(){
      return new DirectorEmpleados();
   }
   
   @Bean 
   public IntendenteEmpleados IntendenteEmpleadosBean(){
      return new IntendenteEmpleados();
   }
   
   @Bean 
   public JefeEmpleados JefeEmpleadosBean(){
      return new JefeEmpleados();
   }
   
   @Bean 
   public ProfesorEmpleados ProfesorEmpleadosBean(){
      return new ProfesorEmpleados();
   }
   
   @Bean 
   public SecretariaEmpleados SecretariaEmpleadosBean(){
      return new SecretariaEmpleados();
   }   
}