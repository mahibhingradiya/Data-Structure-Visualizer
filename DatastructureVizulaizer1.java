import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DatastructureVizulaizer1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("*************************");
        System.out.println("-----------------WELCOME TO DATA STRUCTURE VIZULAIZER------------------");
        System.out.println("what operation do you want to perform on the data structure?         ");
        System.out.println("1.....Stack\n2.....Queue\n3.....Linklist\n4.....exit                 ");
        System.out.println("*************************");
        int choice=sc.nextInt();
        switch(choice){
 //-----------------------------------------------------------------STACK----------------------------------------------------------------------------------------           
                    case 1:
                   
                         boolean flag=false;
                         Stacks s1=new Stacks();
                         do{
                                System.out.println("^^^which operation^^^");
                                System.out.println("1..push\n2..pop\n3..peep\n4..change\n5..display\n6..exit");
                                int ssubchoice1=sc.nextInt();
                                switch(ssubchoice1){
                        
                                    case 1: 
                                           // Stacks s1=new Stacks();
                                            System.out.println("how many element you want to insert?");
                                            int ele=sc.nextInt();
                                            

                                            
                        
                                            for(int i=0;i<ele;i++){
                                            System.out.println("which element you insert?");
                                            int inele=sc.nextInt();
                                            s1.push(inele);
                                            }
                                            System.out.println("do you want to insert another element?(yes/no)");
                                            String ans=sc.next();
                                            if(ans.equalsIgnoreCase("yes")){
                                                System.out.println("which element you insert?");
                                                int inele1=sc.nextInt();
                                                s1.push(inele1);
                                            }
                                            else{
                                                break;
                                            }
                                            break;
                                    case 2:
                                             //Stacks s2=new Stacks();
                                            s1.pop();
                                            System.out.println("do you want to delete another element?(yes/no)");
                                            String ans1=sc.next();
                                            if(ans1.equalsIgnoreCase("yes")){
                                                s1.pop();
                                            }
                                            else{
                                                break;
                                            }
                                            break;
                                    case 3: //Stacks s3=new Stacks();
                                            System.out.println("enter the index ");
                                            int index=sc.nextInt();
                                
                                            s1.peep(index);
                                            System.out.println("do you want to peep operation again?(yes/no)");
                                            String ans2=sc.next();
                                            if(ans2.equalsIgnoreCase("yes")){
                                                System.out.println("enter the index ");
                                                int index1=sc.nextInt();
                                                s1.peep(index1);
                                            }
                                            else{
                                                break;
                                            }
                                            break;
                                    case 4:
                                             //Stacks s4=new Stacks();
                                             System.out.println("enter index you want to change");
                                             int indx=sc.nextInt();
                                             System.out.println("enter the element to change");
                                             int elem=sc.nextInt();
                                            s1.change(elem,indx);
                                            System.out.println("do you want to change operation again?(yes/no)");
                                            String ans3=sc.next();
                                            if(ans3.equalsIgnoreCase("yes")){
                                                 System.out.println("enter index you want to change");
                                             int indx1=sc.nextInt();
                                             System.out.println("enter the element to change");
                                             int elem1=sc.nextInt();
                                                s1.change(elem1,indx1);
                                            }
                                            else{
                                                break;
                                            }
                                            break;
                                    case 5:
                                            // Stacks s5=new Stacks();
                                            s1.display();

                                            break;
                                    case 6: System.exit(0);
                                }
                                System.out.println("you want to another operation?");
                                System.out.println("1.yes\n2.no");
                                String check=sc.next();
                                if(check.equalsIgnoreCase("yes")){
                                    flag=false;
                                }
                                else{
                                    flag=true;
                                }
                            }while(flag);


 //-----------------------------------------------------------------QUEUEU------------------------------------------------------------------------------------------
 
 

                    case 2://Scanner sc=new Scanner(System.in);
                            System.out.println("which queue operation?");
                            System.out.println("1.queue\n2.cqueue\n3.dequeue\n4.exit");
                            int ch4=sc.nextInt();
                            switch(ch4){
                                case 1:
                                        //queue
                                        System.out.println("Enter Queue size:");
                                        int size=sc.nextInt();
                                        S_queue s=new S_queue(size);

                                        do
                                        {
                                            System.out.println("Enter your choice:-");
                                            System.out.println("1.insertAtRare");
                                            System.out.println("2.deleteAtFront");
                                            System.out.println("3.dispaly");
                                            System.out.println("4.EXIT");
                                            int choice5=sc.nextInt();
                                    
                                            switch(choice5){
                                            
                                                case 1:if(choice5==1){
                                                        s.insertAtrare();
                                                    }
                                                    break;
                                            
                                                case 2:if(choice5==2){
                                                        s.deleteAtFront();
                                                    }
                                                    break;
                                            
                                                case 3:s.display();
                                                        System.out.println();
                                                    break;

                                                case 4:System.exit(0);    

                                            
                                                default: System.out.println("invalid choice");
                                                    break;
                                                }
                                        }while(1==1);
        
                                case 2:
                    

                                        //cque
                                         System.out.println("Enter Queue size");
                                         int size4=sc.nextInt();
                                         cqueue d=new cqueue(size4);
       
                                        do{
                                            System.out.println("Enter your choice\n1.insertAtrear\n2.deleteAtFront\n3.display\n4.EXIT");
                                            int choice3=sc.nextInt();
                                            switch(choice3){
                                                case 1: d.insertAtRare();
                                                        break;
                                                case 2: d.deleteAtfront();
                                                        break;

                                                case 3:d.dispaly();
                                                        System.out.println();
                                                        break;
                                                case 4:System.exit(0);        
                                                default: System.out.println("invalid choice"); 
                                                }

                                            }while(1==1);



                
                                case 3:
                    
                                            //deque
                                            System.out.println("Enter Queue size");
                                            int size1=sc.nextInt();
                                            dqueue d1=new dqueue(size1);

                                            do{
                                                System.out.println("Enter your choice\n1.insertAtrear\n2.deleteAtFront\n3.insertAtfront\n4.deleteAtrear\n5.display\n6.EXIT");
                                                int choice1=sc.nextInt();

                                                switch(choice1){
                                                    case 1: d1.insertAtRare();
                                                        break;
                                                    case 2: d1.deleteAtfront();
                                                        break;
                                                    case 3: d1.insertAtfront();
                                                        break;
                                                    case 4: d1.deleteAtrear();
                                                        break;
                                                    case 5:d1.dispaly();
                                                        System.out.println();
                                                        break;
                                                    case 6:System.exit(0);

                                                    default: System.out.println("invalid choice"); 
                                                    }
            
                                            }while(1==1);

                                case 4:System.exit(0);
                    
                                    default:
                                        System.out.println("enter valid choice");
                                        break;
                            }


//---------------------------------------------------------------LINKED LIST-----------------------------------------------------------------------------------                


                    case 3:
                            System.out.println("---------------------------------------");
                            System.out.println("-------------LINKED LIST-------------");
                            System.out.println("which operation do you want to perform?");
                            System.out.println("1.singly linkedlist\n2.doubly linkedlist\n3.circular linkedlist\n4.exit");
                            int ch5=sc.nextInt();
                            
                            switch(ch5){
                        
                            case 1:
                                boolean check6=true;
                                linkedlist l=new linkedlist();
                    
                                do 
                                {
                                    System.out.println("ENTER OPERATION YOU WANT TO PERFORM");
                                    System.out.println("1.INSERT AT FIRST ");
                                    System.out.println("2.INSERT AT LAST");
                                    System.out.println("3.REMOVE AT FIRST ");
                                    System.out.println("4.REMOVE AT LAST");
                                    System.out.println("5.EXIT ");
                                    
                                    int ch=sc.nextInt();
                                    switch (ch) 
                                    {
                                case 1:
                                {
                                    System.out.println("ENTER NUM OF TIMES YOU WANT TO INSERT AT FIRST");
                                    int num_first=sc.nextInt();
                                    for(int i=1;i<=num_first;i++)
                                    {
                                        System.out.println("ENTER NUM "+i);
                                        int num1=sc.nextInt();
                                        l.addfirst(num1);
                                    }
                                    l.display();
                                    break;
                                }
                                case 2:
                                {
                                    System.out.println("ENTER NUM OF TIMES YOU WANT TO INSERT AT LAST");
                                    int num_first=sc.nextInt();
                                    for(int i=1;i<=num_first;i++)
                                    {
                                        System.out.println("ENTER NUM "+i);
                                        int num1=sc.nextInt();
                                        l.addlast(num1);
                                    }
                                    l.display();
                                    break;
                                }
                                case 3:
                                {
                                    System.out.println("ENTER NUM OF TIMES YOU WANT TO DELETE AT FIRST");
                                    int num_first=sc.nextInt();
                                    for(int i=1;i<=num_first;i++)
                                    {
                                        l.deletefirst();
                                    }
                                    l.display();
                                    break;
                                }
                                case 4:
                                {
                                    System.out.println("ENTER NUM OF TIMES YOU WANT TO DELETE AT LAST");
                                    int num_first=sc.nextInt();
                                    for(int i=1;i<=num_first;i++)
                                    {
                                        l.deletelast();
                                    }
                                    l.display();
                                    break;
                                }
                                case 5:
                                {
                                    check6=false;
                                    System.exit(0);
                                    break;
                                }
                                default:
                                {
                                    System.out.println("ENTER VALID CHOICE");
                                    break;
                                }
                        }
                    } while (check6);
                    System.out.println("---------------------------------------");

                    break;

                            case 2:
                                    System.out.println("---------------------------------------");
                                    System.out.println("-------------DOUBLY LINKED LIST-------------");
                                    doublylinkedlist dll=new doublylinkedlist();
                                    boolean check8=true;
                                do 
                                {
                                    System.out.println("ENTER OPERATION YOU WANT TO PERFORM");
                                    System.out.println("1.INSERT AT FIRST ");
                                    System.out.println("2.INSERT AT LAST");
                                    System.out.println("3.REMOVE AT FIRST");
                                    System.out.println("4.REMOVE AT LAST ");
                                    System.out.println("5.EXIT ");
                                    int ch=sc.nextInt();
                                    switch (ch) 
                                    {
                                        case 1:
                                        {
                                            System.out.println("ENTER NUM OF TIMES YOU WANT TO INSERT AT FIRST");
                                            int num_first=sc.nextInt();
                                            for(int i=1;i<=num_first;i++)
                                            {
                                                System.out.println("ENTER NUM "+i);
                                                int num1=sc.nextInt();
                                                dll.addfirst(num1);
                                            }
                                            dll.display();
                                            break;
                                        }
                                        case 2:
                                        {
                                            System.out.println("ENTER NUM OF TIMES YOU WANT TO INSERT AT LAST");
                                            int num_first=sc.nextInt();
                                            for(int i=1;i<=num_first;i++)
                                            {
                                                System.out.println("ENTER NUM "+i);
                                                int num1=sc.nextInt();
                                                dll.addlast(num1);
                                            }
                                            dll.display();
                                            break;
                                        }
                                        case 3:
                                        {
                                            System.out.println("ENTER NUM OF TIMES YOU WANT TO DELETE AT FIRST");
                                            int num_first=sc.nextInt();
                                            for(int i=1;i<=num_first;i++)
                                            {
                                                dll.deletefirst();
                                            }
                                            dll.display();
                                            break;
                                        }
                                        case 4:
                                        {
                                            System.out.println("ENTER NUM OF TIMES YOU WANT TO DELETE AT LAST");
                                            int num_first=sc.nextInt();
                                            for(int i=1;i<=num_first;i++)
                                            {
                                                dll.deletelast();
                                            }
                                            dll.display();
                                            break;
                                        }
                                        case 5:
                                        {
                                            check6=false;
                                            System.exit(0);
                                            break;
                                        }
                                        default:
                                        {
                                            System.out.println("ENTER VALID CHOICE");
                                            break;
                                        }
                                    }
                                }while (check8);
                                    System.out.println("---------------------------------------");
                                     break;
                   

                            case 3:
                                System.out.println("---------------------------------------");
                                System.out.println("-------------CIRCULAR LINKED LIST-------------");
                                
                                System.out.println();
                                circularlinkedlist l1=new circularlinkedlist();
                                boolean check7=true;
                                do 
                                {
                                    System.out.println("ENTER OPERATION YOU WANT TO PERFORM");
                                    System.out.println("1.INSERT AT FIRST ");
                                    System.out.println("2.INSERT AT LAST ");
                                    System.out.println("3.REMOVE AT FIRST");
                                    System.out.println("4.REMOVE AT LAST ");
                                    System.out.println("5.EXIT");
                                    int ch=sc.nextInt();
                                    switch (ch) 
                                    {
                                        case 1:
                                        {
                                            System.out.println("ENTER NUM OF TIMES YOU WANT TO INSERT AT FIRST");
                                            int num_first=sc.nextInt();
                                            for(int i=1;i<=num_first;i++)
                                            {
                                                System.out.println("ENTER NUM "+i);
                                                int num1=sc.nextInt();
                                                l1.addfirst(num1);
                                            }
                                            l1.display();
                                            break;
                                        }
                                        case 2:
                                        {
                                            System.out.println("ENTER NUM OF TIMES YOU WANT TO INSERT AT LAST");
                                            int num_first=sc.nextInt();
                                            for(int i=1;i<=num_first;i++)
                                            {
                                                System.out.println("ENTER NUM "+i);
                                                int num1=sc.nextInt();
                                                l1.addlast(num1);
                                            }
                                            l1.display();
                                            break;
                                        }
                                        case 3:
                                        {
                                            System.out.println("ENTER NUM OF TIMES YOU WANT TO DELETE AT FIRST");
                                            int num_first=sc.nextInt();
                                            for(int i=1;i<=num_first;i++)
                                            {
                                                l1.deletefirst();
                                            }
                                            l1.display();
                                            break;
                                        }
                                        case 4:
                                        {
                                            System.out.println("ENTER NUM OF TIMES YOU WANT TO DELETE AT LAST");
                                            int num_first=sc.nextInt();
                                            for(int i=1;i<=num_first;i++)
                                            {
                                                l1.deletelast();
                                            }
                                            l1.display();
                                            break;
                                        }
                                        case 5:
                                        {
                                            check6=false;
                                            System.exit(0);
                                            break;
                                        }
                                        default:
                                        {
                                            System.out.println("ENTER VALID CHOICE");
                                            break;
                                        }
                                    }
                                } while (check7);
                                    System.out.println("---------------------------------------");
                                    break;
                            }
                    
                        System.out.println();
                    
                   
                
                
                    
                   
                
                    
                    case 4:
                            
                        System.exit(0);
                            
                        break;
                            
                    default:
                            
                        System.out.println("ENTER VALID CHOICE");
                        break;            
        }
    
    }
}