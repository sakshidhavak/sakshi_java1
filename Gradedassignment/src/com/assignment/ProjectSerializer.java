package com.assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectSerializer implements Serializable {
	 HashMap<Project, ArrayList<Employee>> projectMap1 = new HashMap<>();

	    public void serializeProjectDetails(HashMap<Project, ArrayList<Employee>> dataMap, String fileName) {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
	            oos.writeObject(dataMap);
	            System.out.println("Serialization Successful");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public HashMap<Project, ArrayList<Employee>> deserializeProjectDetails(String fileName) {
	        HashMap<Project, ArrayList<Employee>> resultMap = new HashMap<>();
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
	            resultMap = (HashMap<Project, ArrayList<Employee>>) ois.readObject();
	            System.out.println("Deserialization Successful");
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        return resultMap;
	    }
	}