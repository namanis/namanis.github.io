 public class TernarioTeste {
 public static void main(String[] args) {
 int x = 5;
 System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
 

 // Observe quantas linhas tenho que fazer para obter o mesmo resultado:
 if(x>2) {
 	if(x<4){
 		x=10;
 	}
else{
 	x=8;
 	}
 	}
 	 else{
 x=7;
 	}
 

 
 

System.out.println(x);
}
}


