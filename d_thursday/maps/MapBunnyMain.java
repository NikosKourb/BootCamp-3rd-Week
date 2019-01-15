package maps;

import java.util.HashMap;
import java.util.Iterator;

public class MapBunnyMain {

	public static void main(String[] args) {
		HashMap<String, Bunny> map = new HashMap<>();
		for (int i = 1; i <= 15; i++) {
			map.put("Bunny" + i, new Bunny(i, "Bunny" + i));
		}
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String name = it.next();
			Bunny b = map.get(name);
			b.hop();
		}
	}
}
