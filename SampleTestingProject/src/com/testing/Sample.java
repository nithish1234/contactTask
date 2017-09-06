package com.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Sample {
//static String vechile[]= {"ambulance","helocopter","Crain"};
// static String drivers[][]= {
//{"nithish","dharshan","akash"},
//{"manny","nithish","sample"},
//{"sue","joe","john"}
//};
//public static void main(String[] args) {
//Map<String, Set<String>> driverMap=new HashMap<>();
//for(int i=0;i<=vechile.length;i++) {
//	String getVechile=vechile[i];
//	String[] driver=drivers[i];
//	Set<String> driverSet=new HashSet<>();
//	for(String diverlist: driver) {
//		driverSet.add(diverlist);
//	}
//	driverMap.put(getVechile ,driverSet );
//	for(String sample:driverMap.keySet()) {
//		System.out.println(sample);
//		Set<String>sampleSample=driverMap.get(vechile);
//		System.out.println(sampleSample);
//	}
//    
//
//}
//for (String samplrdrive:driverMap.keySet()) {
//
//}
//}

public static void main(String[] args) {
	

String sampleStr[]= {"nithish","bharath","sample"};
List<String> sample= new ArrayList<>( Arrays.asList(sampleStr));
sample.add("spencer");
System.out.println("the list is " + sample);
}


}
