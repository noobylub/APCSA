
package com.company;
//THe way to import an array list
import  java.util.ArrayList;
class Person{
    int age;
    String gender;
    String name;
    public Person(int age, String gender, String name){
        this.age = age;
        this.gender = gender;
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }
    public String getName(){
        return this.name;
    }

}
class  arrayList{
    public static void main(String[] args){
        //arraylist is mutable, it can be changed
        //First import the arraylist, the imported class like a scanner
        Person Muhammad = new Person(16,"male","Muhammad");
        Person Loka = new Person(18, "Female", "Loka");
        ArrayList<Person> Group1 = new ArrayList<Person>();
        Group1.add(Loka);
        Person Kolo = new Person(54,"male", "Kola");
        Group1.add(Kolo);





        //then we define it and initialize it
        //The type of arraylist is within the <> bracket
        //This is an empty list
        ArrayList<Integer> firstArrayList = new ArrayList<Integer>();
        //Like javascript, you put it values
        firstArrayList.add(56);
        firstArrayList.add(65);
        //then you can have a get
        System.out.println(firstArrayList.get(1));
        //array list methods

        //size() like a length
        System.out.println(firstArrayList.size());

        //isEmpty();
        System.out.println(firstArrayList.isEmpty());

        //add(object a)
       firstArrayList.add(1,420);

        //ad(int index, object 0)

        //add(int index, object 0);

        //get(int index);

        //remove(int index);
        firstArrayList.remove(0);
        System.out.println(firstArrayList.get(0));

        for(int x:firstArrayList){
            System.out.println("Number" + x);
        }

    }
}