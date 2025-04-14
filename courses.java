
package projectdatastructure;



public class courses {

  static int id = 1;
  private llnode_courses head = null;
  private llnode_courses  next = null;
  
  public void addcourse (int id ) {
  
      llnode_courses newnode = new llnode_courses( id );
      newnode.next = head;
      head = newnode;
      courses.id ++;

  
  }  
  
  public void removecourse (int id ) {
     
      int counter = 1;
      llnode_courses helperpt = head;
      
      if ( id == 1 ) {
          
          head = head.next;
      }
      else {
           while (counter < id -1 ) {
           
           helperpt = helperpt.next;
           counter++;
           
           }
      helperpt.next = helperpt.next.next;
      
      
      
      
      }
      
      
      
      
      
      
  }
  
  public void lastcourseadded () {
      
      llnode_courses helperpt = head;
      if (helperpt == null) {
          
          System.out.println("linked list is empty");
          return;
          
      }
      
      while (helperpt.next != null) {
          
          helperpt = helperpt.next;
          
      }
       
       System.out.println("last course added id's is : " + helperpt.id);
      
      
      
  }



    
}
