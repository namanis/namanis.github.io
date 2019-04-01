
<!DOCTYPE html>
 <html lang = " pt - br " >
 <head >
 <meta http - equiv = " Content - Type " content = " text / html ; charset = UTF -8 " >
 <title > Programar em Java</title >
 </head >
 <body>
<h1>1-Entendendo  a estrutura  Java</h1>
<p>No progrma java, classes são basico construtor de blocos. Quando define uma class, você descreve todas as partes e caracteristicas 
destes construtores de blocos. Para usar mais classes, voce tem que criar objetos. </p>
<p>Um objeto é uma instancia de uma classe em memoria no tempo de execução.
Todos os varios objetos de todas as diferentes classes representa o estado de esu programa.</p> 
<p style="overflow: hidden; display: inline-block; width: 12em; height: 6em; border: dotted;"><code>overflow: hidden</code><br>
 Class Arvore{}</p>


-campos e metodos
As variaveis são conhecidas como campo é o que aguarda o estado do programa
Metodos São conheciod como função ou pocedimentos em outras linguagens
Juntos são chamados de membros da classe
1-public class Arvore{
2-private string nome;
3-public String getName(){
4-return nome;
5-}
6-public void setNome(String novoNome){
7-name=novoName;
8-}
9-}
1- Cria um classe que pode ser publica e não publica 
2- declara variavel como privada (significa que sua variavel só acessivel ao membro desta classe
   
3-5 define o primeiro metodo. Um metodo é uma operação que pode ser chamado e o nome public significa que este metodo pode ser chamado de outras classes.
Este vem com um tipode retorno . Neste caso o metodo retorna uma String.
6-8 Outo metodo . Esse tem um tipo de retorno especial chamado void. Void significa que nenhuma valor neste é retornado.
Este método requer que informações sejam fornecidas para ele a partir do método de chamada;
Esta informçaõ é chamada de parametro. setNome tem um parametro nomeado novoNome, e é um tipo de String.
Isto siginifica que o chamador devera passar um parametro string e esperar nada ser retornado.

<h2>-Comentarios</>
<p>Os comentário em java  são importantes para deixar o programa mais legível.</p>
<p>Existe algumas maneiras de comentar o programa que será mostrado logo abaixo: </p>
// comentario até o fim da linha
/* Multipla
* comentar linha
*/
/**
* javadoc multipla linha comentario
* @author alan Santos
*/
<h2>Classes vs Arquivos</h2>
<p>Você pode colocar duas classes no mesmo arquivo. Quando fizer isso em mais de uma classe o arquivo é permitido para ser publico.<\p>;

public class Arvore{
private string nome;
}
class Arvore2{
}

Escrevendo um metodo main
 O progrma java inicia a execução com este metodo main(). Um meodo main() é o gateway entre o 
iniciode um processo java, que é gerenciado pelo java virtual machin 9JVM), e e inicando os codigos dos progamas.
O JVM chama no systema subjacente para alocar memoria , tempo de CPU, acessar arquivos e mais.
O mmetodo main() nos permite ligar nosso codigo neste processo, mantendo-o vivo por tempo suficiente
para fazer o trabalho que codificamos.
public class Planta{
public static void main(String[] args){}
}
Este codigo não é util. Este não tem declaraçoes nem instruçoes. somente para ilustrar 
para compilar execute e este codigo abixo
$ javac Planta.java
$ java Planta
Executando argumentos no metodo main
public class Planta{
public static void main(String[] args){
System.out.println(args[0]);
System.out.println(args[1]);
}
}
$ javac Planta.java
$ java Planta Hortela , Mastruz
 
//print Hortela
//       Mastruz

2 Entendendo Pacotess Declaracao e imports

Java coloca classes em Pacotes (package "name package";)
E quando necessitamos de classes que são predefinidas precisamos importalas para dentro da nossa classe
para que as classes funcionem. Nos casos abaixo estamos tentando usar a Classe Random para numeros aleatorios.

// sem import não funciona
public class ImportExample {
public static void main(String[] args) {
Random r = new Random(); // DOES NOT COMPILE
System.out.println(r.nextInt(10)); 
}
}

import java.util.Random; // import nos conta onde encontrar o Random
public class ImportExample {
public static void main(String[] args) {
Random r = new Random(); 
System.out.println(r.nextInt(10)); // print a number between 0 and 9
}
}
-wildcards(Asterisitico *)
Usando o asteristico dentro da pastas que contem as classes vocE^importa nõa somente a que vc quer e também deixa disponivel todas as outras.

import java.util.*; // importa java.util.Random além de outras coisas
public class ImportExample {
public static void main(String[] args) {
Random r = new Random();
System.out.println(r.nextInt(10));
}
}
imports redundantes
 java lang é um pacote especial e é automaticamente importado

 import java.lang.System; // desnecessario
import java.lang.*;// desnecessario
 import java.util.Random;// necessario
 import java.util.*;// neste caso não é necessario pois já importou o Random acima
 public class ImportExample {
 public static void main(String[] args) {
 Random r = new Random();
 System.out.println(r.nextInt(10));
 }
 }

nomeando conflitos
criar novo pacote
Crie essas pastas packagea e pakageb em seu diretorio com suas devidas classes ClasseA e ClasseB

C:\seudiretorio\packagea\ClasseA.java
package packagea;
public class ClassA {
}
C:\seudiretorio\packageb\ClasseB.java
package packageb;
import packagea.ClasseA;
public class ClasseB {
public static void main(String[] args) {
ClassA a;
System.out.println("Got it");
}
}
Apos criar as pastas(pacotes) e as classess execute estes comandos no console
javac packagea/ClasseA.java packageb/ClassB.java 

java packageb.ClasseB
Se a saido for "Go it" então funcionou bem.

3 Criando Objetos
Um objeto é uma instancia da classe
para cria uma instancia de classe faz o seguinte
ex: Randon r = new Random();
onde o "r" será a referencia que será utilizado para acessar o objeto em memoria.
-contrutores Tem o mesmo nome da classe é não existe retorno
public class Folha {
public Folha() {
System.out.println("no construtor");
}
}
Contrutor também serve para inializar campos
public class Fruta {
int numManga = 0;// initializa na linha
String nome;
public Fruta() {
name = "Manga";// initializa no constructor
} }

-Lendo e escrevendo campos e Objetos
è possivel ler e escrever ivariaveis de intancia de dentro do chamado
public class Baleia {
int numFilhote;// variavel de instancia
public static void main(String[] args) {
Baleia mae = new Baleia();
mother.numFilhote = 5; // set variable escrever na vairavel conhecido como "set"
System.out.println(mae.numFilhote); // read variable / Ler a variavel conhecio como "get'
}
}
 Voce pode ler e escrever campos na declaração
public class Name {
String first = "Theodore";
String last = "Moose";
 String full = first + last;
}

-Instanciar e inicializar Blocks
-Orderde inicalizaçao
Campos e blocos inicializadores de instância são executados na ordem em que aparecem
o arquivo.
 O construtor é executado depois que todos os campos e blocos de inicialização de instância são executados.
 public class Fruta {
 private String name = "Manga";
 { System.out.println("setting field"); }
 public Fruta() {
name = "Pera";
 System.out.println("setting constructor");
 }
 public static void main(String[] args) {
Fruta  fruta = new Fruta();
 System.out.println(fruta.name); } }

Execuando este exemplo imprime isto:
setting field
setting constructor
Pera

4 Disitnguir entre Objeto Referencias e Primitivos
Aplicaçoes jva contem 2 tipos de dados: tipo primitivo e tipos referencia.
Tipos primitivos
java tem oito tipos de  daods embutido que é referrido como Typos primitivos de dados.
boolean true or false true
byte 8-bit integral value 123
short 16-bit integral value 123
int 32-bit integral value 123
long 64-bit integral value 123
float 32-bit floating-point value 123.45f
double 64-bit floating-point value 123.456
char 16-bit Unicode value 'a'
-float e double são usados com ponto flutantes(decimal) valores 
- Um float requer a letra f seguido do numero.
- byte, short, int e long são numeros usados sem casas decimais
Tipos referencia
Um tipo de referência refere-se a um objeto (uma instância de uma classe). Ao contrário dos tipos primitivos que contêm
seus valores na memória onde a variável é alocada, referências não mantêm o valor
do objeto a que se referem. Em vez disso, uma referência "aponta" para um objeto armazenando a memória
endereço onde o objeto está localizado, um conceito referido como um ponteiro.
Referencia do tipo java.util.Date e uma referencia do tipo string
java.util.Date hoje;
String cumprimento;
- A variavel "hoje" é uma referencia do tipo Date é pode somente apontar para Date objeto.
Assim como "cumprimento" só pode apontar para String.
Uma referência pode ser atribuída a outro objeto do mesmo tipo.
¦ Uma referência pode ser atribuída a um novo objeto usando a nova palavra-chave.
hoje = new java.util.Date();
cumprimento = "Como está voCê?";

Diferença chave
Tipos primitivo não podem ser adcionando valor nulo.

5 Declrando e inicializando Variaveis

declarandoo variaveis
String zooName;
int numberAnimals;

Inicializando variaveis
String zooName = "The Best Zoo";
int numberAnimals = 100;
Declarar multiplas variaveis
String s1, s2;
String s3 = "yes", s4 = "no";
Identificadores
Prepare-se para ser testado nessas regras. Os exemplos a seguir são legais:
okidentifier
$OK2Identifier 
_alsoOK1d3ntifi3r
__SStillOkbutKnotsonice$ 
Estes examples são ilegais: 
3DPointClass // identifiers cannot begin with a number
hollywood@vine // @ is not a letter, digit, $ or _
*$coffee // * is not a letter, digit, $ or _
public // public is a reserved word  
plavras reservadas 
Você não pode usar o mesmo nome que uma palavra reservada do Java.
abstract assert boolean break byte
case catch char class const*
continue default do double else
enum extends false final finally
float for goto* if implements
import instanceof int interface long
native new null package private
protected public return short static
strictfp super switch synchronized this
throw throws transient true try
void volatile while

6-Entendendo o padraõ de inicalizção das variaveis
Variaveis Locais são definido dentro do metodo. Variaveis locais deve ser inicalizad antes de usar.
public int notValid() {
 int y = 10; 
 int x; 
 int reply = x + y; // DOES NOT COMPILE
 return reply;
 }

public int valid() {
int y = 10;
int x; // x is declared here
x = 3; // and initialized here
int reply = x + y;
return reply;
}


Instancia e Variaveis de classe
As variaveis que não são locais são conhecidas como vriavel de instancia or variavel de classes. Variaveis de instancia são chamadas de cmpos. Variaveis de classes são compartilhadas com multiplos objetose carrega a plavra chave static antes dele.
Variable type            Default initialization value
boolean                   false
byte, short, int, long   0(in the type’s bit-length)
float, double            0.0(in the type’s bit-length)
char                    '\u0000'(NUL)
All object references (everything else) null
Entendendo a variavel de Escoppo
Existe duas variaveis local nest metodo. "bitOfcheese é declarado no lado de dentro do metodo. "pieceOfCheese um metdo paramentro é chamado.
Ambas as variáveis ??são ditas como tendo um escopo local para o método. Isso significa que eles não podem ser
usado fora do métodos, exemplo: 
 public void eatIfHungry(boolean hungry) {
 if (hungry) {
 int bitesOfCheese = 1;
 } // bitesOfCheese goes out of scope here
 System.out.println(bitesOfCheese);// DOES NOT COMPILE
 }

Ordenando elementos na classe

Package declaration package abc; No Primeira linha do arquivo
Import statements import java.util.*; No Imediatamente depois do pacote
Class declaration public class C Yes Imediatamente depois do pacote
Field declarations int value; No Qualquer lugar dentro da classe
Method declarationsvoid method() No Qualquer lugar dentro da classe
7-Destruindo Objetos
Java fornece coletores de lixo (garbge colletion) automaticamente para procurar objetos que não necessita mais
Garbage Collecios
refere-se ao processo de liberar memoria automaticamente no heap deletando objetos que esta distante de ser alcançavel no seu programa.
finalize()



public class WaterBottle {
 private String brand;
 private boolean empty;
 public static void main(String[] args) {
 WaterBottle wb = new WaterBottle();
 System.out.print("Empty = " + wb.empty);
System.out.print(", Brand = " + wb.brand);
 } }



 capitulo 2

 Entendendo operadores em java.

 Um operador Java é um simbolo especial que pode ser aplicado para um conjunto de variaveis, valores, ou literais- referido como operando - e este retona o resultado.
 São tres operadores acessiveis em java: unario, binario, ternario. Estes tipos de operadores pode ser aplicado
 para uma, duas ou tres operandos, respectivamente.

   Operadores java são avaliaos da esquerda para direita
   ex:
   int y = 2;
   double x =4 + 3  * --y;

   Neste exemplo primeiro decrementa y para 1 e então multiplicao resultado do valor por 3 
   e finalmente adciona 4. O valor final de x e y  seria 7.0 ( fica 7.0 utomaitcamente por o tipo ser double ) e 1 respectivamente .

   TABLE 2.1  Order of operator precedence
Operator Symbols and examples
Post-unary operators expression++, expression--Pre-unary operators ++expression, --expression

Operator Symbols and examples
Other unary operators +, -, !
Multiplication/Division/Modulus *, /, %
Addition/Subtraction +, -
Shift operators <<, >>, >>>
Relational operators <, >, <=, >=, instanceof
Equal to/not equal to ==, !=
Logical operators &, ^, |
Short-circuit logical operators &&, ||
Ternary operators boolean expression ?expression1 :expression2
Assignment operators =, +=, -=, *=, /=, %=, &=, ^=, !=, <<=,>>=, >>>=


Trabalhando com Opeerdores binarios Aritimetico

Operadors binarios são comumente combiando em experssões complexas com mais do que duas variaveis, contudo, operador precedente
é muito importe em avaliar expressões.

Operadores Aritimetico inclui adicção(+), ubtração(-), multiplicação(*), divisão(/), e modulo(%). eles também inclui o perador unario ++ e --.
Os operadores(*, /, %) tem maaior prioridade em relaçãoao operadores (+,-). Isso significaquando voce ver uma expressão assim:
 int x = 3*5 + 2*5 -10;

 Primeiro avalia 3*5 e 2*5 que reduz a expressaõ ficando assim:

 int x = 15 + 10 - 8;

 então voce avalia o termo da esquerda e atribui o valor a variavel da direira resultando no valor de x = 17

 Você pode mudar a ordem da operação adcionando parenteses ao redor da seção que será avaliada primeiro.
  int x= 2 *((5+3) * 4-8)

  int x= 2*(8*4-8);
   int x= 2*(32-8);
   int x= 2*24
   int x = 48;


   Todos dos operadores aritmetico pode ser aplicado para qualquer Java primitivos, exceto boolean e String. Aplicadno operadores + e += pode ser aplicado em valores String
   que result em Concatenação de String.

   entendendo a diferença emtre divis~~ao aritimetica e modulos.
   Para valores inteiros, a divisão resulta no valor mínimo do inteiro mais próximo que cumpre a operação, enquanto o módulo é o valor restante.

   exemplo da saida no console:
   System.out.print(9 / 3); // saida 3
System.out.print(9 % 3); // saida 0

System.out.print(10 / 3); // saida  3
System.out.print(10 % 3); // saida  1
System.out.print(11 / 3); // saida  3
System.out.print(11 % 3); // saida 2
System.out.print(12 / 3); // saida  4
System.out.print(12 % 3); // saida 0

Promoção numerica.
regras
1. Se dois valores de tipos de dados diferentes. Java ira automaticamente promover  um dos valores
mais largo dos dois tipos de dados.
Qual é o tipo de dados x * y?
int x = 1;
long y = 33;
O valor será promovido para long pois long é mais largo do que int.


2. Se um dos valores é integral e o outro é ponto flutoante, /java ira automatiamente promover o valor integral ao tipo de dados ponto flutoante valores.

Qual é o tipo de dados x + y?
double x = 39.21;
float y = 2.1

3.Pequenos tipos de dados nomaedamente byte, short, e char, são promividos primeiros para int em qualquer momento eles serão usados com um operador aritimeitco binario java,
memso se nenhum dos operaonso for int. 

Qual é o tipo de dados x / y?
short x = 10;
short y = 3;

Antes da operacao x e y serão pomovidos para int, resultando na saida do tipo int.

4. Após toda a promoção ter ocorrido e os operandos terem o mesmo tipo de dados, o valor resultante terá o mesmo tipo de dados que seus operandos promovidos.
Qual é o tipo de dados x * y / z?
short x = 14;
float y = 13;
double z = 30;

Neste caso , primeiro x seria automaticamente promovido para int, porque este é um short e está sendo usado em uma operação binaria ariimetica.
O valor x promoovido sera automaticamene promovido para float então este pode ser multiplicado com y.
O resultado de x*y seria então automaticamente promovida par double~, assim então este pode ser multiplica com z, resultando em um valor double.



Trabalhando com Operadores Unario

Por definição um operador unario é um que requer exatamente um operando, or variavel, para função.

Operador Unario    Descricao
+                   Indica um numero está positivo
-                   Indica um numero literal está negativo ou uma expressão negativa.
++                  Incrementa um valor por 1
--                  Decrementa um valor por 1
!                   Invert um valor logica Boleana


Complemento Logico e Negção de opeeradores

o operado de complemento logico , ! , gira o valor de uma expressão booleana. Por exemplo se o valor é verdadeiro será cnvertido para falso, e vice verrsa.

boolean x = false;

system.out.println(x); // false 
x=!x;
system.out.println(x); // verdadeiro (true)

Da mesma forma, o  operador negação, - , reverte o sinal de uma expressão numerica.
ex:
double x=1.21

System.out.println(x); // 1.21
 
 x = -x;

 System.out.println(x); // -1.21
 
   x = -x;
 
  System.out.println(x); // 1.21

int x = !5; // NÃO COMPILA , JAVA NÃO PODE PERFORMAR UMA INVERÃO LOGICA DE UMA VALOR NUMERICO
boolean y = -true; // NÃO COMPILA, nÃO PODE NEGAR NUMERICAMENTE UM VALOR BOOLEANO.
boolean z = !0; // NÃO COMPILA , NÃO PODE ATRIBUIR UM INTEIRO PARA UMA VARIAVEL BOOLEANA.

Operadores Incremento e Decremento

Operadores Incremento e Decremento ++ e -- repecivmente pode ser aplicado a operandos numéricos e ter a ordem ou precedência mais alta, em comparação aos operadores binários.
Eles são aplicado primeiro para uma expressão.
Se o operdor é colocado antes do operando, refere como operadro pre-incremento e o operador pos-incremento. Então o operador é aplicado primeiro e o valor retornado é o novo valor da expressão.
Se o operaor é colocado depois do operando refere como o operado pos-incremente e o operador pos-decremente, neste caso o valor original da expressão é retornado , com operador aplicado depois do valor é retornado.
Teecho ilustrando estas distinçoes.

int counter = 0;
System.out.println(counter); // Saída 0
System.out.println(++counter); // Saída 1
System.out.println(counter); // Saída 1
System.out.println(counter--); // Saída 1
System.out.println(counter); // Saída 0

O primeiro operador pre-incremento atulaiza o valor para counter e a saida do novo valor 1. O proximo operador pos-decrement também atualiza o valor de counter mas ants do valor de saida o ddecremete ocorre.

Como você ler ese código?

int x = 3;
int y = ++x * 5 / x-- + --x;
System.out.println("x is " + x);
System.out.println("y is " + y);

int y=4*5/ x-- + --x; // para x é atribuido o valor 4
Proximo x é decrementado, mas o original valor de 4 é usado na expressão:

int y = 4*5 / 4 + --x // para x é atribuido o valor de 3

A atribuição final de x reduz para o valor 2, e este é um operador pre-increment, que o valor é retornado assim:

int y = 4 * 5 / 4 +2; // para x é atribuido o valor 2
Finalmente, nos avaliamos a multiplicação e divisão da esquerda pra direita.
o resultado imprimido é:
x é 2;
y é 7;

Usando Operadores Binario Adicional.

Um operador atribuição  é um operador binario que modifica, ou atribui a variavel ma mão-esquerda  lado do operador, com o resultado do valor na mão-direita lado da equação.
int x =1
Esta declaração atribui para x o valor de 1.

int x = 1.0; // DOES NOT COMPILE
short y = 1921222; // DOES NOT COMPILE
int z = 9f; // DOES NOT COMPILE
long t = 192301398193810323; // DOES NOT COMPILE

A primeira declaração não compila por que voc~e está tentando atribuir um double 1.0 para um valor inteiro.
Quando adiciona o .0 automaticamente Java atribui ao tipo de dados double .
A segunda declaração não compila porque o valor literal 192122 esta fora do alcance de short e o compilador detecta isto.
A terceira declaraçãa não compila porque ao adionar f no final do numero o compilador trata esta intrução como  valor ponto flutoante.
Finalmente, o ultimo não compila porque java interpreta o literal como int e nota que o valor é mais extenso do que o int permite. O literal necessitaria adicionar  L no final do numero para ser considerado long.

Casting Valores Primitivos


Casting primitivos é requrido em qualquer momento que você esta indo de um tipo de dados numerico mais extendo para tipo de dados  numerico  de menor extensão, ou convertendo de um numero ponto flutoante para um numero interio.

int x = (int) 1.0;
short y = (short) 1921222 // armazenado como 20678 
int z =(int)9l;
long t = 19230139810323L;

As expressões do exemplo anterior agora compilam, embora haja um custo. O segundo valor, 1.921.222, é muito grande para ser armazenado como um short, portanto ocorre um excesso numérico e ele se torna 20.678. 
Overflow é quando um número é tão grande que não cabe mais dentro do tipo de dados, então o sistema “envolve” o próximo valor mais baixo e conta a partir daí. Há também um underflow análogo, quando o número é muito baixo para caber no tipo de dados

Operadores de Atribuição Composta

int x = 2, z=3;
x= x*z;  // operador de atribuição simples
x *= z; // operador atribuição composta 

O lado esquedo do operador composto pode ser somente aplicado para variavel que já está definido e não pode ser usada para declarar uma nova variavel.
Se x não estivesse definido a expressão x*=z não compilaria.

o operador composto são util para abreviar e também pode nos slavar de fazer um cast explicito. Exemplo:
 long x = 10;
 int y = 5
 y= y*x; // não compila

 Esta ultima linha poderia ser ficado com um cast explicito para (int), mas existe uma mlehor maneira atribuindo ooperador composto.

 long x = 10
 int y = 5
 y *=x; // compila



 Operadores Relacional

Operadores realcional compara duas expressoes e retorna um valor booleano.


< menor do que
<= menor igual
> maior do que
>= maior igual 

int x = 10, y = 20, z = 10;
System.out.println(x < y); // Outputs true
System.out.println(x <= y); // Outputs true
System.out.println(x >= z); // Outputs true
System.out.println(x > z); // Outputs false

a instanceof b    Verdadeiro se a referência para a qual aponta é uma instância de
uma classe, subclasse ou classe que implementa uma determinada
interface, como mencionado em b

O operador instanceof, é util para determinar se um objeto arbitrario é um membro de uma classe prticular ou interface.

Operadores Logicos

Os operadores logico, (&), (|), e (^), pode ser aplicado para ambos tipos de dados , numerico e booleano.
quando eles são aplocados para um tipo de dados boolean, eles são referidos como operadores logicos. Alternativamente, quando eles são aplicados para um tipo de dados numericos, eles são referidos como operadores bitwise (bit a bit).

Logica da tabela verdade para & | e ^

    x & y                                                
     (E)       
 -----------  y=   Verdade   y=false  
  x=Verdade |      Verdade      false
  x=false   |      false        false             


  x | y                                                
 (OU Inclusivo)       
 -----------   y=   Verdade    y=false  
  x=Verdade |       Verdade      Verdade
  x=false   |       Verdade       false

  x ^ y                                                
    (OU Exclusivo)       
 -----------  y=   Verdade    y=false  
  x=Verdade |      false         Verdade
  x=false   |      Verdade        false


  . E (&) é somente verdade se ambos operandos são verdadeiro
  . OU Inclusivo é somente falso se ambos operndos são falso
  . OU Exclusivo é somente verdade se os operandos são diferentes

  operadores && e || são conhecidos como operadores curto-circuito. Eles são quase identicos aos operadores logico & e | , respectivamente
  espera que o o lado direito da expressão nunca pode ser avaliado se o resultado final pode ser determinado pela expressão logica do lado esquerdo. Exe:
  boolean x = true || (y<4);
  Referendo a tabela verdade, o vlor de x pode ser somente false se ambos os lados da expresão forem falso.

  if(x != null && x.getValue() < 5) { // expressão ok
// fazer algo
}if(x != null & x.getValue() < 5) { // Lança uma excessão se x for nulo
// Dfazer algo
}


Operadores de Igualdade

Vamos iniciar com  o basico, o operador igual == e operador não igual 1=. Como o operador relacional eles compara dois operandos e retorna um valor booleano
se  a expressões or valores são iguais, ou não iguais.
Os operadores de igualdade são usados neste tres cenarios;
1.Comparar dois tipos numericos primitivos. Se o valor numerico são de diferentes tipos de dados, os valores são automaticamente promovido . Por exemplo 5==5.00 retorna verdade desde que o lado esquerdo é promovido para um double.
2. Comparar dois valores booleano3. Comparar dois objetos , incluindo null e Valores String.

A comparação  por igualdade são limitado por este tres casos, então voce não pode miturar typos correspondentes:

EX:1
boolean x = true == 3; // NÃO COMPILA
boolean y = false != "Giraffe"; // NÃO COMPILA
boolean z = 3 == "Kangaroo"; // NÃO COMPILA

EX:2

boolean y = false;
boolean x = (y = true);
System.out.println(x); // SAIDA true

EX:3
File x = new File("myFile.txt");
File y = new File("myFile.txt");
File z = x;
System.out.println(x == y); // SAIDA false
System.out.println(x == z); // SAIDA true


DECLARAÇÃO IF-THEN

Frequentemente, somente queremos executar um bloco de codigo sob certa circunstania. A declaração IF-THENpermite nossa aplicação executar um bloco de codigo particular
se e somente se a expressão avaliada for verdade em tempo de execução.

Estrutura:
if(expressão booleana){ //As chaves requere para blocos de multipla declaração, é opcional para uma unica declaração.
	// ramo se verdade
}

Exemplo, imagine ter uma função que usa a hora do dia, um valor inteiro de 0 a 23 para mostrar uma mensagem ao usuario.
if(horaDoDia < 11)
	System.out.println("Bom dia");
Se a hora do dia for menor que 11 então a messagem será mostrada.


if(horaDodia < 11) {
System.out.println("Bomdia");
contSaudacao++;
}
Aqui é incrementado algum valor, contSaudacao, cada vez que saudação é imprimido na tela.

Declaração If-then-else

Estrutura:
if(expressão booleana){
	// ramo se verdade
} else{  //declaração else é opcional
	//ramo se falso
}


if(horaDoDia < 11){
	System.out.println("Bom dia!");
}else{
	System.out.pintln("Boa tarde!");
}


Agora nosso código está realmente ramificando entre uma das duas opções possíveis, com a avaliação booleana acontecendo apenas uma vez. O operador else usa uma instrução ou bloco de instrução, da mesma maneira que a declaração if. Dessa maneira, podemos acrescentar instruções if-then adicionais a um bloco else para chegar a um exemplo mais refinado:
if(horaDoDia < 11) {
System.out.println("Bom dia!");
} else if(horaDoDia < 15) {
System.out.println("Boa tarde!");
} else {
System.out.println("Boa Noite");
}

Operador Ternario

É somente operador que leva tres operando e é da form:
expressaoBoolena ? expressao1 : expressao2

O primeiro operando deve ser um boolean expressaõ, e a segunda e terceiro pode ser qualquer express~~ao que retorna um valor.
O operador ternario é relmente um condensada forma de um if-then-else declaração que returna um value. Por exemplo, 

int y=10;
final int x;
if(y > 5){
	x=2*y;
}else{
	x=3*y;
}

Compare o trecho de codigo anterior com a seguinte trecho de codigo ternario equivalente:
int y = 10;
int x = (y>5) ? (2*y) : (3*y);


Note que este é frequente util para readapidbilidde para adcionar parenteses ao redor expressão em operação ternario.


 System.out.println((y>5) ? 21 : "zebra");
int animal = (y>91) ? 9 : "Horse": // Não compila
 Ambas expressão similar avaliada  e valores booleano retorna um int  e uma String, apesar somente a primeira linha irá compilar.


   A declaração switch
   è um complexa estrutura de toamda de decisão no qual o unico valor é acessado e o fluxo é redirecionado para o ramo correspondente, conhecido como declaração case.
   Se nenhuma declaração de caso for encontrada que corresponda ao valor, um
declaração padrão opcional será chamada. Se tal opção default não estiver disponível, toda a instrução do switch será ignorada.


Estrutura da declaração switch

switch(TestVariavel) {// --> Inicando com a chavae(requere)

case ExpressaoConstante1;
// Ramo para case1:
break; //opcional

case ExpressaoConstante2;
//Ramo paraa case2;
break;//opcional
...

default: // Opcional default , este pode aparecer em qualquer lugar dentro da declaracao switch
//Ramo para default
} //-->Finalizando chaves(requere)

Tipds de dados suportados pela declaracao switch:
.int e Integer
.byte e byte
.short e Short
. char e Character
.String
.enum values

Valores constantes de tempo de compilação
Os valroes em cada declaração case deve ser valores constantess de tempo de compilação do mesmo tipo de dados como do valor do switch.
Es significa que voce~pode usar somente literais, enum constantes, ou variveis constantes finaldo mesmo tippo de dados

Por constante final, queremos dizer que a variável

deve ser marcado com o modificador final e inicializado com um valor literal na mesma expressão na qual ele é declarado.
 Exemplo usando dias da semana com 0 par domingo, 1 para Segunda assim por diante:

int diasDaSemana = 5;
switch(dayOfWeek) {
default:
System.out.println("Quarta-Feira");
break;
case 0:
System.out.println("Domingo");
break;
case 6:
System.out.println("Sabado");
break;
}

Com o valor do diaDaSemana de 5, este codigo saira:
Quarta-Feira
}
A primeria coisa que pode notar é que existe um break no fim da declaração de cada seção case e default
É o break que termina a declaração switch e retorna o controle de fluxo para encerrar a declaração.

Outro Exemplo
int diaDaSemana = 5;
switch(diaDaSemana) {
case 0:
System.out.println("Domingo");
default:
System.out.println("DiaDaSemana");
case 6:
System.out.println("Sabado");
break;
}
 
 Este código se parece muito com o exemplo anterior, exceto que duas das instruções de break
foi removido e a ordem foi alterada. Isto significa que para o valor dado de diaDaSemana, 5, o código irá pular 
para o bloco default e então irá executar todos os procedimentos e declarações case em ordem até encontrar uma declaração ou terminar a estrutura:

Saida:

DiaDaSemana 
Sabado


A DECLARAÇÃO while
Uma estrutura de conrole de repeticao, que nos referimos como loop, executa uma declaraçõ de codigos multoplas vezes sucesiivamente.

A estrutura da declaração while

while(expressaoBooleana){ // Chaves é requerido para bolocs de multiplas declaraçoes , opcional para uma unic declaração.


  //Corpo

} //fecha chaves

Um while loop é similae a uma declaração if-then neste é composto de uma expressão booleana e a declaração, ou bloco de declaraçoes.

Durante a execucao ,a expressão~booleana é avaliada antes de cada iteração do loop e finaliza se a avaliação retornar falso.
é importante notar que o loop pode terminar antes da primeira avaliação da expressão booleana. Dessa maneira o bloco de declaração pode nunca ser executado.


exemplo:

int espacoNaBarriga = 5;
public void comeQueijo(int pedacosDequeijo) {
while (pedacosDequeijo > 0 && espacoNaBarriga > 0) { 
pedacoDequeijo--;
espacoNaBarriga--;
}
System.out.println(pedacosDeQueijo+" Saindo pedacos de queijo");
}

Este método leva uma quantidade de comida, neste caso queijo, e continua até que o rato não tenha espaço em sua barriga ou não haja comida para comer.
 Com cada iteração do loop, o mouse "come" uma mordida de comida e perde um ponto em sua barriga. 
 Usando uma declaração booleana composta, você assegura que o whileloop possa terminar para qualquer uma das condições. 
}


A Estrutura de Declaração  Do..While
Ao contrario de while loop, do-while loop garante que a declar~ção ou bloco se´r executada pelo menos uma vez.

A estrutura da declaração do..while
 

 //palavra chave--->
                   do{ // chaves opcional para unica declaração e requerida para multiplas declaraçoes

                  //Corpo
            } while(expressaoBooleana); //Requer Ponto e virgula
                | //requer parenteses
              //While palavra chave

  a diferença primaria entre a estrutua de um do-while loop a um while loop é que do-while loop 
  é que um do-whileloop propositadamente ordena a declaração ou o bloco de instruções antes da expressão condicional, a fim de reforçar que a declaração será executada antes que a expressão seja avaliada
Exempo:  
int x = 0;
do {
x++;
} while(false);
System.out.println(x); // Outputs 1
} 

Exemplo2:
Este whileloop:
while(x > 10) {
x--;
}
e Este do-whileloop:
if(x > 10) {
do {
x--;
} while(x > 10);
}
Exemplo3:
if(x > 10) {
do {
x--;
} while(x > 10);
} else {
x++;
}

A declaração for
Um loop for basico tem a mesma expressão booleana condicional e declaração, ou bloc de declaração, como outros loops: um bloco de inialização e uma declaração atualiza.

A estrutura basica da declaração for

for(inicializacao; expressaobooleana; declaracaoAtualizar){
  //Corpo
}

1- Executa a declaração inicialização
2- e ExpressaoBooleana é verdadeiro(true) continue, senão(else) finaliza loop
3- Executa o Corpo
4-Executa a declaracoAtualiza
5-Retona ao passo 2

Note que cada seção é separada por ponto e virgula . A inicialização e seção atualizar pod econter multiplas declarações, sepradas por virgulas.

Exemplo 1
Este é um loop basico que imprime numeros de 0 a 9;
for(int i = 0; i < 10; i++) {
System.out.print(i + " ");
}
//Saida -> 0 1 2 3 4 5 6 7 8 9 

Criando um loop infinio
for( ; ; ) {
System.out.println("Hello World");
}
// Este Loop compila e executa sem problemas


Adcionar Multiplo Termo para declaração for 
int x = 0;
for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
System.out.print(y + " ");
}
System.out.print(x);
  
}
Este codigo demonstra tres variaçoes do loop for.
Primeiro, você pode declarar uma variável, como x neste exemplo, antes de iniciar o loop e usá-lo após a conclusão. Segundo, seu bloco de inicialização, expressão booleana e instruções de atualização
pode incluir variáveis ​​extras que podem não se referenciar. Por exemplo, z é definido no bloco de inicialização e nunca é usado. Finalmente, a atualização pode modificar várias variáveis.
Este codigo quando executar a saida é:
//0 1 2 3 4

A Declaraçao For-each
Esta declaração é especialmente desenhada para iteragir sobre arrays e objetos colletion. 

Estrutura de uma declaracao for For-each
                            // Requer, dois pontos :
for(tipodedados1 instancia : colecao) { //Abre chaves
    // |->membro da coleção do tipodedados1

  //Corpo                      |->iterage colecao de objetos

  }// fecha Chaves requerido para blocos de multiplas declaraççoes, opcional para uma unica declaração

A declaração loop For-each é composta de uma seção de inicialização e um objeto para ser iterado.
O lado direito da declaração loop for-each deve ser consttruido um array ou um objeto em que implemente a classe java.lang.Iterable, que inclui mais do framework Java Collections.
O lado esquerdo do  loop for-each deve incluir uma declaração para uma instancia da vriavel, em que tipos correspondentes do tipo de um membro do array ou colletion no lado direito da declaração.
em cada iteracao do loop, a variavel nomeada no lado esquerdo da declaração é atribuido um novo valor do array ou collection no lado direito da declaração.

Vamos ver alguns exemplos:
Qual será a saida deste codigo.

finl Sring[] nomes = new String[3];
nomes[0] = " Lisa";
nomes[1] ="Catia";
nomes[2]= "Alan";
for(String nome : names){

  System.out.println(nome + ", ");

  A saida será:
  Lisa , Catia, Alan

.Qual será a saida deste codigo?
  java.util.List<String> values = new java.util.ArrayList<String>();
values.add("Lisa");
values.add("Catia");
values.add("Alan");
for(String value : values) {
System.out.print(value + ", ");
}
Este codigo imprime os mesmos valores: 
Lisa, Catia, Alan,



LOOPS ANINHADOS

Loops pode conter outros loops.
Exemplo
int[][] meuComplexoArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
for(int[] meuSimplesArray : meuComplexoArray) {
for(int i=0; i<meuSimplesArray.length; i++) {
System.out.print(meuSimplesArray[i]+"\t");
}
System.out.println();
}

Note que está intecionaalmente misturado um for e for-each neste exemplo. O  loop exterior executar´um total de tres vezes.
Cada tempo que executo o loop exterios, o loop interior é executado 4 vezes.
A saida é essa:
5 2 1 3
3 9 8 9
5 7 12 7

Adcionar Rotulos opcionais
Um rotulo(Label) é um ponteiro opcional para o cabeçário da declaração que permite o fluxo da aplicação pular para ele ou brecar dele.
Esta é unica palavra prosseguida por dois ponteos(:).

Exemplo :
Colocando rotulo no exemplo anterior 

int[][] meuComplexoArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
OUTER_LOOP: for(int[] meuSimplesArray : meuComplexoArray) {
INNER_LOOP: for(int i=0; i<meuSimplesArray.length; i++) {
System.out.print(meuSimplesArray[i]+"\t");
}
System.out.println();
}

A Declração break
Esta declaração transfere a saida do fluxo de controle para o encerramento da declaraçao.

A estrutura da declaração break



Note que a declaração de break pode ter um parâmetro de rotulo opcional.
Sem um parâmetro rotulo, a declaração final terminará o loop interno mais próximo que está atualmente em processo de execução.



A DECLARACAO continue
uma declaracao que faz com que o fluxo termine a execução do loop atual

A estrutura da declaração continue

//Referencia opcional para o cabeçalho do loop
rotuloOpcional: while(expressaoBoolena){
  //Corpo     DoisPontos(Requerido se o rotuloOpcional está presente)
  //Algum lugar no loop
  continue rotuloOpcional; // Ponto e virgula(requerido)
  //|-> break palvra chave
}

Você pode notar que a sintax da declaração continue é um espelho da declaração break.
Enquanto a declaração break transfere o controle para o encerramento da declaração, 
a declaração continue transfere o controle para a expressão booleana que determina se o loop deve continuar.


}
}
}

<\body>