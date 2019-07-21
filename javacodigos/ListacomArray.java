import java.util.*;

public class ListacomArray{

public static void main(String [] args){

ArrayList<String> safer = new ArrayList<>();
safer.add("sparrow");
//safer.add(Boolean.True); não compila
System.out.println(safer);



List<String> passaros = new ArrayList<>();

passaros.add("Canario");
passaros.add(1,"Bem ti vi");
passaros.add(0,"PassoPreto");
passaros.add(1,"Papagaio");
passaros.add(2,"Sangue de Boi");
passaros.add(3, "Sofre");
passaros.set(3 ,"cubango");// alterar sem mudar o tamando do array

System.out.println(passaros);
System.out.println(passaros.contains("Bem ti vi"));
System.out.println(passaros.size());
System.out.println(passaros.isEmpty());
System.out.println(passaros.remove("Canario"));
System.out.println(passaros.remove(1));
System.out.println(passaros);
passaros.clear();
System.out.println(passaros.isEmpty());
System.out.println(passaros);
}

}