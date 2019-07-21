public class SearchSample {
public static void main(String[] args) {
int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
int searchValue = 2;
int positionX = -1;
int positionY = -1;
PARENT_LOOP: for(int i=0; i<list.length; i++) {
for(int j=0; j<list[i].length; j++) {
if(list[i][j]==searchValue) {
positionX = i;
positionY = j;
break PARENT_LOOP;
}
}
}
if(positionX==-1 || positionY==-1) {
System.out.println("Value "+searchValue+" not found");
} else {
System.out.println("Value "+searchValue+" found at: " +
"("+positionX+","+positionY+")");
}
}
}

/*

O parâmetro do rotulo opcional nos permite sair
de um loop externo de nível superior. No exemplo a seguir, procuramos pela primeira matriz (x, y)
posição de índice de um número dentro de uma matriz bidimensional não classificada:

Value 2 found at: (1,1)


Substitua o corpo do loop interno e teste o resultado



if(list[i][j]==searchValue) {
positionX = i;
positionY = j;
break;
}
// Value 2 found at: (2,0)

O que acontece se voce remover o break completamente?
if(list[i][j]==searchValue) {
positionX = i;
positionY = j;
}

//Value 2 found at: (2,2)