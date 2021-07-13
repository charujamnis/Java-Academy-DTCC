package assignment_3.people_package;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class PeopleOperations {
    public static void main (String args []) throws Exception {
        /*
            Please ensure that you create an ArrayList of Person(s) with at least
            4 members
         */
        ArrayList<String> names=new ArrayList<>();
        names.add("Jennifer");
        names.add("Rihanna");
        names.add("Selena");
        names.add("Taylor");
        names.add("Ariana");

        ArrayList<Person> people = new ArrayList<Person>();
        int limit=1000;
        int counter=0;
        int ageRange=100-1;

        while(counter<limit){
            int index= ThreadLocalRandom.current().nextInt(0,names.size());
            String name=names.get(index)+Integer.valueOf(counter);
            Person p=new Person();
            p.setName(name);
            p.setAge((int)(Math.random()*ageRange)+1);
            people.add(p);
            counter++;
        }

       /* people.add( new Person("Lia",(int)(Math.random()*ageRange)+1));
        people.add( new Person("Shakira",(int)(Math.random()*ageRange)+1));
        people.add( new Person("Adley",(int)(Math.random()*ageRange)+1));
        people.add( new Person("Lorie",(int)(Math.random()*ageRange)+1));
        people.add( new Person("Ramona",(int)(Math.random()*ageRange)+1));*/

        System.out.println("\n******Original List*******");
        for(Person p : people) {
            System.out.println(p);
        }

        Person youngestPerson = getYoungestPerson(people);
        Person oldestPerson = getOldestPerson(people);
        double average=getAverageAge(people);

        ArrayList<Person> sortedByAgeList = getSortedListByAge(people);
        ArrayList<Person> sortedByNameList = getSortedListByName(people, false);


        /*
            For the below to work where you can see what you've done, you must have
            done the section 1 recap portion where you override the toString() method of the
            Person class!
         */

        System.out.println("\n******* Sorting by Age ********");
        for(Person p : sortedByAgeList) {
            System.out.println(p);
        }

        System.out.println("\n******* Sorting by Name ********");
        for(Person p : sortedByNameList) {
            System.out.println(p);
        }
    }

    public static Person getYoungestPerson(ArrayList<Person> list) throws Exception {
        //throw new Exception("Please implement this method");
        Person pObject=list.get(0);
        int minAge=list.get(0).getAge();
        for(int i=1;i<list.size();i++){
            if(minAge>list.get(i).getAge()){
                minAge=list.get(i).getAge();
                pObject=list.get(i);
            }
        }
        System.out.println("The minimum aged person is "+pObject.getName()+" whose age is "+pObject.getAge());
        return pObject;
    }

    public static Person getOldestPerson(ArrayList<Person> list) throws Exception {
        //throw new Exception("Please implement this method");
        Person pObject=list.get(0);
        int maxAge=list.get(0).getAge();
        for(int i=1;i<list.size();i++){
            if(maxAge<list.get(i).getAge()){
                maxAge=list.get(i).getAge();
                pObject=list.get(i);
            }
        }
        System.out.println("The maximum aged person is "+pObject.getName()+" whose age is "+pObject.getAge());
        return pObject;
    }

    public static double getAverageAge(ArrayList<Person> p){
        double average=0;
        double sum=0;
        for(int i=0;i<p.size();i++){
            sum+=p.get(i).getAge();
        }
        average=sum/p.size();
        System.out.println("The average age of a Person in our list is "+average);
        return average;
    }

    public static ArrayList<Person> getSortedListByAge(ArrayList<Person> list) throws Exception {
        //throw new Exception("Please implement this method");
        Person[] myArray= new Person[list.size()];

        if(myArray.length!=0) {
            myArray= list.toArray(myArray);
            for(int i=0;i<myArray.length;i++){
                for(int j=i;j<myArray.length;j++){
                    if(myArray[i].getAge()> myArray[j].getAge()){   //Age ascending order
                        int temp=myArray[i].getAge();
                        String name=myArray[i].getName();
                        int id=myArray[i].getID();

                        myArray[i].setAge(myArray[j].getAge());
                        myArray[i].setName(myArray[j].getName());
                        myArray[i].setID(myArray[j].getID());

                        myArray[j].setAge(temp);
                        myArray[j].setName(name);
                        myArray[j].setID(id);
                    }
                }
            }
        }
        else{
            return null;
        }
        return new ArrayList<Person>(Arrays.asList(myArray));
    }

    public static ArrayList<Person> getSortedListByName(ArrayList<Person> list, boolean isAscending) throws Exception {
        //throw new Exception("Please implement this method");
        if(isAscending){
            Collections.sort(list);
        }else{
            Collections.sort(list, Collections.reverseOrder());
        }
        return list;
    }

}