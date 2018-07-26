package com.javatpoint;  
  
import java.util.HashSet;
import java.util.List;
import java.util.Set;  
  
public class Question {  
private int id;  
private String qname;  
private List<Answer> answers;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQname() {
	return qname;
}
public void setQname(String qname) {
	this.qname = qname;
}
public HashSet<Answer> getAnswers() {
	return (HashSet<Answer>) answers;
}
public void setAnswers(Set<Answer> answers) {
	this.answers = (List<Answer>) answers;
}  
  
//getters and setters  



  
}  
