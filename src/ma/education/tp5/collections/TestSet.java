package ma.education.tp5.collections;
import sun.plugin2.message.SetChildWindowHandleMessage;

import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.lang.String;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
     //Q6
        Set <String> set1= new HashSet<>();
        set1.add("ABC1");
        set1.add("ABC2");
        set1.add("ABC3");
        set1.add("ABC1");
        set1.add("ABC4");
        set1.forEach(i-> System.out.println(i));
     //Q7
        // ABC1
        //ABC4
        //ABC2
        //ABC3
        //doesn't accept doubles, doesn't respect the order of insertion
    //Q9
      Set<Client> set2=new HashSet<Client>();
        set2.add(new Client(1,"sara"));
        set2.add(new Client(1,"sara"));
        set2.add(new Client(3,"chaimae"));

        set2.forEach(i-> System.out.println(i));
    //Q12
        Set<Integer> set3=new TreeSet<Integer>();
        set3.add(22);
        set3.add(11);
        set3.add(15);
        set3.add(9);
        set3.forEach(i-> System.out.println(i));

        //Q17
        Comparator<Client> d = new NameComparotor();
        Set<Client> set4= new TreeSet<Client>(d);
        set4.add(new Client(2,"taeyon"));
        set4.add(new Client(3,"IU"));
        set4.add(new Client(4,"key"));
        set4.forEach(i-> System.out.println(i));

//////Q18
        Comparator<Client> c = new CodeComparator();
        Set<Client> set5 = new TreeSet<>(c);
        set5.add(new Client(5,"OMAR"));
        set5.add(new Client(3,"SAID"));
        set5.add(new Client(2,"HASSAN"));
        set5.forEach(i-> System.out.println(i));
//Q20
        Set<Client> set6 = new TreeSet<>((c1,c2) -> c1.code-c2.code);
        set6.add(new Client(8,"kHADIJA"));
        set6.add(new Client(5,"NAIMA"));
        set6.add(new Client(9,"HASSAN"));
        set6.forEach(i-> System.out.println(i));
 //Q21

        Set<Client> set7 = new TreeSet<>((c6,c7) -> c6.name.compareToIgnoreCase(c7.name));
        set7.add(new Client(7,"SOFIA"));
        set7.add(new Client(4,"HALIMA"));
        set7.add(new Client(10,"ABDELLAH"));
        set7.forEach(i-> System.out.println(i));
    }
}
