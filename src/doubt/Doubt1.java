/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 04-Dec-19
 *  Time: 4:12 PM
 */
package doubt;

import java.util.ArrayList;
import java.util.Collections;

public class Doubt1 implements Comparable<Doubt1>{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return id + "\t" + name;
    }

    public static void main(String[] args) {
        Doubt1 d = new Doubt1();
        d.setId(12);
        d.setName("Avinah");
        System.out.println(d.toString() );
        Doubt1 d1 = new Doubt1();
        d1.setName("Vikram");
        d1.setId(23);
//        int result = d1.compareTo(d);
//        if(result == 0){
//            System.out.println("same objects");
//        }else if(result < 0 ){
//            System.out.println("d1 is smaller");
//        }else{
//            System.out.println("d1 is greater");
//        }
        Doubt1 d2 = new Doubt1();
        d2.setId(12);
        d2.setName("Avinah");
        Doubt1 d3 = new Doubt1();
        d3.setId(12);
        d3.setName("Avinah");
        ArrayList<Doubt1> list = new ArrayList<>();
        list.add(d1);
        list.add(d);
        list.add(d2);
        list.add(d3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("sorted list");
        System.out.println(list);



    }

    @Override
    public int compareTo(Doubt1 o) {
        System.out.println("mehtod called");
        if(this.id < o.id){
            return -1;
        }else if(this.id > o.id){
            return 1;
        }else{
            return 0;
        }


    }
}
