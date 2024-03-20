import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sfd =new SimpleDateFormat("dd/MM/yyyy");
        List<Emplayee> emplayee = new ArrayList<>();
        emplayee.add(new Emplayee(1, "dao", "hn", sfd.parse("20/1/2004"), 2000, 1.2f));
        emplayee.add(new Emplayee(2, "Hao", "hn", sfd.parse("20/2/2004"), 2000, 1.2f));
        emplayee.add(new Emplayee(3, "Gao", "hn", sfd.parse("20/2/2004"), 2000, 1.2f));
        Collections.sort(emplayee);
        System.out.println(emplayee);
        Collections.sort(emplayee, Comparator.comparing(Emplayee::getBirthday).reversed());
        System.out.println(emplayee);

        Collections.sort(emplayee, (o1, o2) ->Double.compare(o1.total(), o2.total()));
        System.out.println(emplayee);

        Collections.sort(emplayee, (o1, o2) -> o1.getId()-o2.getId());
        System.out.println(emplayee);

        Collections.sort(emplayee, (o1, o2) -> {
            if(o1.getFullName().compareTo(o2.getFullName())!=0){
                return o1.getFullName().compareTo(o2.getFullName());
            }
            else{
              return o1.getId()-o2.getId();
            }
        });
        System.out.println(emplayee);

        }
    }

