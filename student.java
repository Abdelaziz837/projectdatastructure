
package projectdatastructure;



public class student {
    
   
    static int id = 1;
    private llnode_student head = null;
    private llnode_student next = null;
    
    public void addstudent (int id ){
    
        llnode_student newnode = new llnode_student(id);
        newnode.next = head;
        head = newnode;
        student.id ++;
 
    }
    
    public void removestudent(int id ) {
    
        int counter = 1;  
        llnode_student helperpt = head;
        if (id == 1) { 
            
            head = head.next;
        }
        else {
        
        while (counter < id -1  ) {
         
         helperpt = helperpt.next;
         counter++;
         }
         helperpt.next = helperpt.next.next;
         
         
        }
    
    
    
    }
    
    public void laststudentadded () {
    
    llnode_student helperpt = head;
    if (helperpt == null ) {
    
        System.out.println("Linkedlist is empty");
        return;
    }
    while (helperpt.next != null) {
        
        helperpt = helperpt.next;
        
    }
    
    System.out.println("the id of last student added is : " + helperpt.id);
    
    
    
    
    
    
    }

}
