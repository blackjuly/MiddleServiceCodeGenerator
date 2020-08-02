package cn.whdream;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        String file =  App.class.getResource("Service.ftl").getFile();
        System.out.println(file);
    }
}
