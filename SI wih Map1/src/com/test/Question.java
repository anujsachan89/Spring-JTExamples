package com.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
private String name;
private int id;
private Map<String, String> answers;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Map<String, String> getAnswers() {
	return answers;
}
public void setAnswers(Map<String, String> answers) {
	this.answers = answers;
}
public void displayInfo(){
	System.out.println("Qusetion I.D is:" +id);
	System.out.println("Question Name : "+name);
	System.out.println("Answers..: ");
	 Set<Entry<String, String>> set=answers.entrySet();  
	    Iterator<Entry<String, String>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<String,String> entry=itr.next();  
	        System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
}
}
}
