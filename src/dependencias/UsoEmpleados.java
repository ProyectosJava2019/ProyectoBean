package dependencias;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author manuel
 */
public class UsoEmpleados
{
    public static void main(String[] args) 
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        DirectorEmpleados director; 
        director = ctx.getBean(DirectorEmpleados.class);
        director.setNombre("JUAN1");
        director.getTarea();

        IntendenteEmpleados inten; 
        inten = ctx.getBean(IntendenteEmpleados.class);
        inten.setNombre("JUAN2");
        inten.getTarea();

        JefeEmpleados jefe; 
        jefe = ctx.getBean(JefeEmpleados.class);
        jefe.setNombre("JUAN3");
        jefe.getTarea();

        ProfesorEmpleados profe; 
        profe = ctx.getBean(ProfesorEmpleados.class);
        profe.setNombre("JUAN4");
        profe.getTarea();

        SecretariaEmpleados secre; 
        secre = ctx.getBean(SecretariaEmpleados.class);
        secre.setNombre("JUAN5");
        secre.getTarea();        
        
        /*
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        //ApplicationContext ctx = new AnnotationConfigApplicationContext(Empleados.class);

        ctx.register(DirectorEmpleados.class);
        ctx.refresh();

        Empleados myService = ctx.getBean(DirectorEmpleados.class);
        myService.getTarea();
        */
        
        /*
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        DirectorEmpleados DirectorEmpleadosBean = ctx.getBean(DirectorEmpleados.class);
        DirectorEmpleadosBean.getTarea();
        */
        
        /*
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        String[] singletonNames = context.getDefaultListableBeanFactory().getSingletonNames();
        for (String singleton : singletonNames) {
            System.out.println("<<"+singleton);
        }
        */
        
        //Empleados myService = ctx.getBean(DirectorEmpleadosBean.class);
        
        /*
        Empleados e1= new DirectorEmpleados();
        System.out.println(e1.getTarea());
        Empleados e2= new DirectorEmpleados();
        System.out.println(e2.getTarea());
        */
    }
}
