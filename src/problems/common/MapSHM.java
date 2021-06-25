package problems.common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapSHM {
public static void main(String[] args) {
	Map<?,?> map = new HashMap<>();
	Collections.synchronizedMap(map);
	
}
	
}
