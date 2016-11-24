import java.util.*;

public class Member
{
private int ID;
private String name;
private int age;
private int  elite;
private double userTime;
private boolean payment;
private String membershipType;
private String discipline;
private String data;
private int delete;
private int ammount;


public void setUserID(int asd){
   ID = asd;
   }


public int getAmmount(){
   return ammount;
   }


public String getDiscipline(){
   return discipline;
   }
public String getName(){
   return name;
   }
   
   
public int getAge(){
   return age;
   }
public int getID(){
   return ID;
   }
public double getTime(){
   return userTime;
   }
   public String getType(){
   return membershipType ;
   }
   
public void setName(String n){
   name = n;
   }

public String setDiscipline(int d){
   if (d == 1){
    return discipline = "100m Freestyle";
      } else if (d ==2) {
     return discipline = "200m Backstroke";
      } else if (d ==3) {
     return discipline = "100m Butterfly";
      }
      return "no value ";
   }

   public String toString(){  
  return ID+" "+elite+" "+age+" "+userTime+" "+membershipType+" "+discipline+ " " + name + " ";  
 }  
 
public void setID(int id){
   id = ID;
  } 
public void setAge(int m){
   age = m;
   }
public void setTime(double time){
   userTime = time;
   }
   
   public void getAmmount(int Ammount){
   ammount = ammount;
   }

public boolean setPayment(int money, String type2){
//String type = new String("passive");
   if (type2.equals("passive") && money >= 500) {
   payment = true;
   }else if (age < 18 && money >= 1000)  {
   payment = true;
   }else if (age > 18 && money >= 1200 && age >= 60)  {
     payment = true;
   }else if (age > 18 && money >= 1600 && age < 60)  {
   payment = true;
   }else if (age > 18 && money <= 1200 && age >= 60)  {
    payment = false;
   }else if (age > 18 && money <= 1600 && age < 60)  {
    payment = false;
   } else {
    payment = false;

   }

 return payment;

}
   
   public void setType(String type){
   membershipType = type;
   }
   
   public void loadMember(int a,int b,int c,double d, String e,String f, String g){
      ID = a;
      elite = b;
      age = c;
      userTime = d;
      membershipType = e;
      discipline = f ;
      name = g;

   }

   
  
  }