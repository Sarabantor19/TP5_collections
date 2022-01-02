package ma.education.tp5.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list1=  new ArrayList<Integer>();
        list1.add(12);
        list1.add(13);
        list1.add(15);
        list1.add(12);
      //aff boucle classique
          for (int i=0;i<list1.size();i++)
          {
              Integer e= (Integer) list1.get(i);
              System.out.println("element "+i + " is "+e);
          }

      //advanced for loop
        for (Integer e:list1)
        {
            System.out.println("element "+e);

        }
     //iterator
        Iterator<Integer> it=list1.iterator();
        while (it.hasNext())
        {
            Integer e = it.next();
            System.out.println("Element : "+e);
        }
     //forEach
        list1.forEach(i -> System.out.println("Element foreach "+i) );
        //Q4
        List<Integer> list2= Arrays.asList(1,9,6,5,16);
        list2.stream().map(i->i*i).filter(i->i>25).forEach(i-> System.out.println(i));
     //Q5
        List <Integer> list3=new ArrayList<>();
        list3.add(5);
        list3.add(10);
        list3.add(15);
        list3.add(20);
        list3.add(2,10);
        list3.forEach(i-> System.out.println(i));

    }}
