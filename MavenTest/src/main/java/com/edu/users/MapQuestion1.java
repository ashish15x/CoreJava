package com.edu.users;
import java.util.HashMap;
import java.util.Scanner;



public class MapQuestion1 {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        HashMap<String, double[]> hm = new HashMap<>();
	        hm.put("Hyderabad", new double[]{17.36, 17.54});
	        hm.put("Mumbai", new double[]{19.07, 19.30});
	        hm.put("Chennai", new double[]{13.06, 13.24});
	        hm.put("Kolkata", new double[]{22.57, 22.72});
	        hm.put("Bihar", new double[]{24.48, 27.00});

	        System.out.println("Enter city name:");
	        String cityName = sc.nextLine();

	        if (hm.containsKey(cityName)) {
	            System.out.println("Latitude:" +hm.get(cityName)[0]);
	            System.out.println("Longitude:" +hm.get(cityName)[1]);
	       
	        } else {
	            System.out.println("Invalid city name.");
	        }
	    }
	}

