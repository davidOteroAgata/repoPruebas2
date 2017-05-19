package net.agata.pruebaHazelcast;

import java.util.Map;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class consumidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     System.out.println( "Hello World!" );
	        Config cfg = new Config();
	        
	        HazelcastInstance hazelCast = Hazelcast.newHazelcastInstance(cfg);
	         
	        Map<Integer, String> mapUsuarios = hazelCast.getMap("usuarios");
	         
	        System.out.println(mapUsuarios.get(1));
	         
	}

}
