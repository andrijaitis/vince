import java.io.*;
import java.util.*;
public class StartTeamDELTA
{
   public static void main(String[] args)
   {  StartTeamDELTA test = new StartTeamDELTA();
      test.optionsMenu();
      test.print("YOU DID IT CODEMAN");
    
   
   }
   
   public void print(String text)
   {
      System.out.println(text);
   }
   
   public void optionsMenu()
   {
      Scanner scan = new Scanner(System.in);
      Member [] member = new Member[21];
      Elite [] elite = new Elite[member.length];
      String temp;
      int temp2;
      int userID = 0;
      int eliteID = 0;
      int choose;
     
   
   
   
      try{                                         
         Scanner scan1 = new Scanner (new File("data.txt"));     // loading user data from database
         Scanner input1 = new Scanner (System.in);
         System.out.println("Loading members from database...");            
         for (int z=0; z<= member.length-1; z++)
         {
            elite[z] = new Elite();// creates new elite user
            member[z] = new Member();
            member[z].setUserID(z);// 
            String a = scan1.next();
            String b = scan1.next();
            String c = scan1.next();
            String d = scan1.next();
            String e = scan1.next();
            String f = scan1.next();
            String g = scan1.next();
            String h = scan1.next();// 
            member[z].loadMember(z,Integer.parseInt(b),Integer.parseInt(c),Double.parseDouble(d),e,f,g); // calls constructor for member class
            userID++;
         }
      
      
      }
      catch(FileNotFoundException e){   } 
      
      catch (NoSuchElementException exception) {      //throws exeption if database file is empty     
         for (int i=0; i<= member.length-1; i++)
         {
            member[i] = new Member();
            elite[i] = new Elite();// creates  elite user
            member[i].loadMember(i,0,0,0,"null","null","null");
         
         }
      }
   
   
    
     
      do
      { 
         print("***Greetings. Type Username/password***");
         choose = Login();// new login
         switch(choose)
         {
            case 1 ://CEO block 
               do
               {
                  print("Greetings CEO. \n1# Register User \n2# Update User \n3# Register elite swimmer\n4# Info about regular swimmer \n5# Info about regular elite swimmer \n6# Logout");
                  choose = scan.nextInt();
                  switch (choose)
                  {
                     case 1   :
                        print("Please Register a new user, sir.");
                        //member[userID] = new Member(); // creater new member
                        System.out.println("enter the name");
                        temp = scan.next();
                        member[userID].setName(temp);
                        System.out.println("enter the age");
                        temp2 = scan.nextInt();
                        member[userID].setAge(temp2);
                        member[userID].setID(userID);
                        System.out.println("New user ID is " + userID);
                        System.out.println("please enter prefered membership(active or passive)");
                        temp = scan.next();
                        member[userID].setType(temp);
                        System.out.println("New user type is " + member[userID].getType());
                        userID++;
                        Write(Arrays.toString(member));// updates database
                     
                     
                        break;
                  
                     case 2   :
                        print(" enter ID of  user you want to update: ");
                        int change = scan.nextInt ();
                        System.out.println( "*********************************************");
                        System.out.println( "current user ID " + member[change].getID());
                        System.out.println( "current user  name " + member[change].getName());
                        System.out.println( "current user age " + member[change].getAge());
                        System.out.println( "*********************************************");
                        System.out.println("enter the new name");
                        temp = scan.next();
                        member[change].setName(temp);
                        System.out.println("enter the new age");
                        temp2 = scan.nextInt();
                        member[change].setAge(temp2);
                        Write(Arrays.toString(member));// updates database
                     
                     
                        break;
                  
                     case 3   :
                        print("Please Register a new user, sir.");
                        //elite[eliteID] = new Elite();// creates new elite user
                        System.out.println("enter the name");
                        temp = scan.next();
                        elite[eliteID].setName(temp);
                        System.out.println("enter the age");
                        temp2 = scan.nextInt();
                        elite[eliteID].setID(eliteID);
                        System.out.println("New elite user ID is " + eliteID);
                        System.out.println("please enter prefered membership(active or passive)");
                        temp = scan.next();
                        elite[eliteID].setType(temp);
                        System.out.println("New user type is " + elite[eliteID].getType());
                        eliteID++;
                        Write(Arrays.toString(elite));// updates database
                     
                        break;
                  
                     case 4   :
                           
                        print(" enter ID of  user you want information: ");
                        int info = scan.nextInt ();
                        System.out.println( "*********************************************");
                        System.out.println( "member ID " + member[info].getID());
                        System.out.println( "member  name " + member[info].getName());
                        System.out.println( "member age " + member[info].getAge());
                        System.out.println( "member discipline " + member[info].getDiscipline());
                        System.out.println( "member type " + member[info].getType());
                        System.out.println( "*********************************************");
                     
                           
                            
                        break;
                        
                     case 5   :
                           
                        print(" enter ID of elite member you want information: ");
                        int info2 = scan.nextInt ();
                        System.out.println( "*********************************************");
                        System.out.println( "elite member ID " + elite[info2].getID());
                        System.out.println( "elite member  name " + elite[info2].getName());
                        System.out.println( "elite member age " + elite[info2].getAge());
                        System.out.println( "elite member discipline " + elite[info2].getDiscipline());
                        System.out.println( "elite member type " + elite[info2].getType());
                        System.out.println( "*********************************************");
                     
                           
                            
                        break;
                  
                  }
               }while(choose != 6);
               break;
                          
            case 2 ://Coach
               do
               {
                  //print("Greetings Coach. \n1# See top 5 \n2# Register Results of a Elite Swimmer \n3# Tournament\n4# Regular swimmer Disciplines\n5# elite disciplines \n6# Log out");
                  print("Greetings Coach. \n1# See top 5 swimmers \n2# Register Results of a regular swimmer \n3# Tournament\n4# Regular swimmer Disciplines\n5# elite disciplines\n6# Swimmer time  \n7# Log out");
               
                  choose = scan.nextInt();
               
                  switch (choose)
                  {
                     case 1 :
                        List<String> Top5 = new ArrayList<String>();
                        
                        for (int i=0; i <userID; i++) {
                           double a = member[i].getTime();
                           if (a > 0.1) {
                              Top5.add( Double.toString(a) +" "+ member[i].getName() );
                           }
                        }int y=1;
                        Collections.sort(Top5);
                         
                       
                                                              
                        /*for(String temp6: Top5){
                      System.out.println("Top5: " + temp6 ); prints all times
                               }  */
                         
                        for(int i=0; i < 5; i++){
                           System.out.println(y +": " +Top5.get(i));
                           y++;
                        }
                         
                        break;
                  
                     case 2 :
                        print("Set the times");
                        System.out.println("Total users in the system: "+ userID );
                        System.out.println("Enter user ID ");
                        int change = scan.nextInt ();
                        System.out.println("Enter time ");
                        double time = scan.nextDouble();
                        member[change].setTime(time);
                        Write(Arrays.toString(member));// updates database
                     
                        break;
                  
                     case 3 :
                        print("Set the times for the tournamment");
                        System.out.println("Total users in the system: "+ eliteID );
                        System.out.println("Enter elite user ID ");
                        int change1 = scan.nextInt();
                        System.out.println("Enter tournament time");
                        double time1 = scan.nextDouble();
                        elite[change1].setTime(time1);
                        Write(Arrays.toString(member));// updates database
                     
                     
                        break;
                     case 4 :
                                    
                        System.out.println("Total  regular swimmers in the system: "+ userID );
                        print("Assign discipline for a user. Enter user ID");
                     
                        int change3 = scan.nextInt();
                     
                        System.out.println("Enter the type of discipline you want to assign ");
                        System.out.println("#1 100m Freestyle,#2 200m Backstroke and #3 100m Butterfly");
                     
                     
                        int discipline = scan.nextInt();// selects discipline
                        member[change3].setDiscipline(discipline);
                        System.out.println("regular swimmer: " + member[change3].getName()+" have been assigned to: " + member[change3].getDiscipline());
                        Write(Arrays.toString(member));// updates database
                     
                     
                        break;
                  
                     case 5 :
                                    
                        System.out.println("Total  elite swimmers in the system: "+ eliteID );
                        print("Assign discipline for a elite user. Enter ilite user ID");
                     
                        int change4 = scan.nextInt();
                     
                        System.out.println("Enter the type of discipline you want to assign ");
                        System.out.println("#1 100m Freestyle,#2 200m Backstroke and #3 100m Butterfly");
                     
                        int discipline1 = scan.nextInt();// selects discipline
                        elite[change4].setDiscipline(discipline1);
                        System.out.println("Elite swimmer: " + elite[change4].getName()+" have been assigned to: " + elite[change4].getDiscipline());
                        Write(Arrays.toString(member));// updates database
                     
                     
                        break;
                     case 6 :
                                    
                        print("enter ID of swimmer you want time ");
                        int info3 = scan.nextInt();
                        System.out.println("swimmer: " + member[info3].getName()+" Time: " + member[info3].getTime());
                     
                     
                     
                        break;
                  
                  }         
               }while(choose != 7);
               break;
             
            case 3 ://Tresurer
               do
               {
                  print("Greetings Tresurar. \n1# Check payment. \n2# Logout");
                  choose = scan.nextInt();
                  switch(choose)
                  {
                     case 1 :
                        System.out.println("Enter user ID");
                        int change = scan.nextInt ();
                     
                           System.out.println("Member name: "+member[change].getName());

                            System.out.println(GetAmmount(change)+"$");
                     if (member[change].setPayment(GetAmmount(change),member[change].getType()) == true) {
                     System.out.println("Status: Paid");
                     } else {
                        System.out.println("Status: Not paid biccchhh!!!!");

                     }

                     
                        break;
                  } 
               }while(choose != 2);
               break;
            
         }
      }while(choose != 5);
   }
      
   public static int Login()
   {
      System.out.println("*CHEAT SHEET* login: ceo 123,  treasurer 122, coach 123, logout"); //delete this
      try{
         String[ ] array = new String[4];
         Scanner scan = new Scanner (new File("vault.txt"));
         Scanner input = new Scanner (System.in);
         int i=0;
         
         while (scan.hasNext())
         {
            array[i] = scan.nextLine();
            i++;
         }
         
         String inputUser = input.nextLine();
         
         if(inputUser.equals(array[0]))
         { 
            return 1; //ceo
         }
         else if(inputUser.equals(array[1]))
         {
            return 3; // treasurer
         }
         else if(inputUser.equals(array[2]))
         {
            return 2; // coach
         }
         else if(inputUser.equals(array[3]))
         {
            return 5; // logOut
         }
      }
      catch(FileNotFoundException e){} 
      return -1;
   } 
   
   public static int GetAmmount(int accountNr)
   {
      System.out.println("Getting data from bank"); //delete this
      try{
         String[ ] bank = new String[20];
         Scanner scanner = new Scanner (new File("bank.txt"));
         int i=0;
         
         while (scanner.hasNext())
         {
            bank[i] = scanner.nextLine();
            i++;
         }
         int bankas = Integer.parseInt(bank[accountNr]);
         return bankas ;
      }
            
             
      catch(FileNotFoundException e){} 
      return -1;
   
   } 
   public static int Write(String memba)
   {
      System.out.println("Updating database......"); 
      try{
         FileOutputStream database=new FileOutputStream("data.txt");  
         PrintStream data=new PrintStream(database);
         data.println(memba);
         data.close();   
      }
      catch(FileNotFoundException e){} 
      return -1;
   } 
    
 
}