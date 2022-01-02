package ma.education.tp5.collections;
import java.lang.String;
import java.util.Objects;
//import com.sun.org.apache.xpath.internal.operations.String;

public class Client implements Comparable{
    //Q8
    Integer code;
    String name;
    public  Client (Integer code,String name){
        this.code=code;
        this.name=name;

}
    @Override
    public String toString() {
        return "Client{" +
                "code=" + code +
                ", name=" + name +

                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(code, client.code) && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }
//Q16
    @Override
    public int compareTo(Object o) {
        Client client= (Client) o;
       // int clientCmp = name.compareTo(name);
        return -client.code+ this.code ;

    }
}
