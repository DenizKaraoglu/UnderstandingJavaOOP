public class Main {

    public static void main(String[] args){
    
   Lectures lecture1 = new Lectures("Introducing the CS",1,68); 
   Lectures lecture2 = new Lectures("Chem01",2,34);
   Authors author1 = new Authors ("Berkay",1); 
   Authors author2 = new Authors ("Deniz",2);
   LectureManager lecturemanager = new LectureManager();
  
   
   lecturemanager.addList(lecture1);
   
   
   Lectures [] lectures = {lecture1,lecture2};
   Authors[] authors = {author1,author2}; 
 
    
    
    
    
    
    
    
    
    
    }

    
}
