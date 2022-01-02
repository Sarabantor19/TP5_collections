package ma.education.tp5.collections;

import java.util.Comparator;

public class NameComparotor implements Comparator<Client> {
    @Override
    public int compare(Client o3, Client o4) {
       return  o4.name.compareToIgnoreCase(o3.name);


    }
}
