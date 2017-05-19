package net.agata.pruebaHazelcast;

import java.util.Map;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Config cfg = new Config();
        
        HazelcastInstance hazelCast = Hazelcast.newHazelcastInstance(cfg);
         
        Map<Integer, String> mapUsuarios = hazelCast.getMap("usuarios");
         
        mapUsuarios.put(1, "user 1");
         
        mapUsuarios.put(2, "user 2");
         
        mapUsuarios.put(3, "user 3");
         
    }
}
