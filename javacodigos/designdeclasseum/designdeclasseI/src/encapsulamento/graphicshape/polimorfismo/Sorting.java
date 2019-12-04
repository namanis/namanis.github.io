package encapsulamento.graphicshape.polimorfismo;

import java.awt.List;
interface Sorting {
List sort(List list);
}
class MergeSort implements Sorting {
public List sort(List list) {
// sort implementation
	list.add("Carla");
	list.add("Anderson");
	list.add("Lai");
return list;
}
}
class QuickSort implements Sorting {
public List sort(List list) {
// sort implementation
	list.add("Malan");
	list.add("alana");
	list.add("alex");
return list;
}
}
class DynamicDataSet {
Sorting sorting;
public DynamicDataSet() {
sorting = new MergeSort();
}
// DynamicDataSet implementation
}
class SnapshotDataSet {
Sorting sorting;
public SnapshotDataSet() {
sorting = new QuickSort();
}
}
// SnapshotDataSet implementation

/* Use herança quando uma subclasse especifica uma classe base, para que você possa explorar o polimorfismo dinâmico.
em outros casos, use a composição para obter um código que seja fácil de alterar e acoplado de maneira pouco flexível.
 em resumo, favorece a composição sobre a herança */