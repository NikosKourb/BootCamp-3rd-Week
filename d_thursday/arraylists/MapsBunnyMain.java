package arraylists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapsBunnyMain {

	public MapsBunnyMain() {}

	public static void main(String[] args) {
		
		ArrayList<Bunny> al=new ArrayList<>();
		Map<Bunny,String> m1=new HashMap<Bunny,String>();
		
		for(int i=0;i<al.size();i++) {
			Bunny b=new Bunny(i);
			m1.put(b,b.getName());
		}
			
	}

}
