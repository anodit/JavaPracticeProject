package com.practice.collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MapTestingForAPI {
	
	public static void main(String args[]) {
		System.out.println("Inside main method");
		HashMap<Object,Object> inputPayLoad = new HashMap<>();
		Map<String,String> header = new HashMap<>();
		Map<String,String> body = new HashMap<>();
		String uid = UUID.randomUUID().toString();
		System.out.println("uid is -> "+ uid);
		header.put("uid",uid);
		header.put("loggedInUser", "197669");
		System.out.println("Header map is -> "+ header);
		body.put("pinstid", "123456789");
		System.out.println("body map is -> "+ body);
		inputPayLoad.put("header", header);
		inputPayLoad.put("body", body);
		System.out.println("inputPayLoad map is -> "+ inputPayLoad);
 	}

}
// OUTPUT
//Inside main method
//uid is -> a4818cba-e92b-4421-94c4-56ec127ccdad
//Header map is -> {uid=a4818cba-e92b-4421-94c4-56ec127ccdad, loggedInUser=197669}
//body map is -> {pinstid=123456789}
//inputPayLoad map is -> {header={uid=a4818cba-e92b-4421-94c4-56ec127ccdad, loggedInUser=197669}, body={pinstid=123456789}}