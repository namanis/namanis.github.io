package encapsulamento.graphicshape.polimorfismo;

import java.awt.*;

public class TestSorting{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 DynamicDataSet dynamic = new DynamicDataSet();
		 SnapshotDataSet snap = new SnapshotDataSet();
	//	QuickSort qui= new TestSorting();
		
		 Frame f= new Frame();  
		List list= new List();
		list.setBounds(100,100, 75,75);
		//qui.sort(list);
		//list.add("alan");
		//list.add("amor");
		f.add(dynamic.sorting.sort(list));  
		f.add(snap.sorting.sort(list));
		f.setSize(400,400);  
		f.setLayout(null);  
		f.setVisible(true); 
		
	
	
		
	}

}
