package hybernate;

import hybernate.config.DatabaseConnectionConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        DatabaseConnectionConfig.entityManagerFactory();
    }
}
