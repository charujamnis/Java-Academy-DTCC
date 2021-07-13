package assignment_3.people_package;
/*
    This is the class you need to work on
    If you were to create a class from scratch, please remember that the name of the class should match
    the name of the file the class resides in. (this is more of a convention thing)

    Reference:
    1) https://stackoverflow.com/questions/1841847/can-i-compile-a-java-file-with-a-different-name-than-the-class
 */

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int ID;

    public Person(){
        int min=1;
        int max=1000;
        int range=(max-min)-1;
        this.ID= (int)(Math.random()*range)+min;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public String toString(){

        return "Name : "+this.name+"\nPerson's Age: "+this.age+"\nID: "+this.ID+"\n-----------";
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
