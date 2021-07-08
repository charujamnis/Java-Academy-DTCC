package assignment_3.item_package;

import assignment_3.people_package.Person;

import java.util.ArrayList;

public class driver {
    public static void main (String args []) {
        /*
            This can be where you attempt to test constructing your objects!

            Additionally, you can create a main method in your item class if you so choose.
         */

        // Example construction of root class Object
        Object o = new Object();
        Item i1=new Item("TV","Samsung 50 inch 4K LED SMART TV ","Electronics",1200.00);
        Item i2=new Item("Ipad","ipad mini","Computers",320);
        Item i3=new Item("Effective Java","Java book Third edition","Books",35.00);
        Item i4=new Item("Chair","Outdoor Wooden Chair","Furniture",149.99);

        ArrayList<Item> items=new ArrayList<>();
        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);

        for(Item e:items){
            System.out.println(e);
        }

        System.out.println("Item names are listed below: ");
        for(int i=0;i<items.size();i++){  //access names using getName() method and not by name variable directly.
            System.out.println(items.get(i).getName());
        }
    }
}
