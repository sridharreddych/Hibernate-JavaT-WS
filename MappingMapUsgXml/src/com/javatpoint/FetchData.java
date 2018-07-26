package com.javatpoint;  
import java.util.*;  
import org.hibernate.*;  
import org.hibernate.cfg.*;  
public class FetchData {  
public static void main(String[] args) {  
 Session session=new Configuration().configure().buildSessionFactory().openSession();  
          
 Query query=session.createQuery("from Question ");  
 List<Question> list=query.list();  
          
 Iterator<Question> iterator=list.iterator();  
 while(iterator.hasNext()){  
  Question question=iterator.next();  
  System.out.println("question id:"+question.getId());  
  System.out.println("question name:"+question.getName());  
  System.out.println("question posted by:"+question.getUsername());  
  System.out.println("answers.....");  
  Map<String,String> map=question.getAnswers();  
  Set<Map.Entry<String,String>> set=map.entrySet();  
              
  Iterator<Map.Entry<String,String>> iteratoranswer=set.iterator();  
  while(iteratoranswer.hasNext()){  
   Map.Entry<String,String> entry=(Map.Entry<String,String>)iteratoranswer.next();  
   System.out.println("answer name:"+entry.getKey());  
   System.out.println("answer posted by:"+entry.getValue());  
  }  
 }  
session.close();  
}  
}  
