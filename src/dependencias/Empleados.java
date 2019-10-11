package dependencias;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author manuel
 */

@Configuration
public interface Empleados 
{
    @Bean
    public String getTarea();    
}
