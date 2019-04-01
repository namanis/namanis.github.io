public class SwitchSample {
public static void main(String[] args) {
FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
for (char x = 'a'; x <= 'c'; x++) {
if (a == 2 || x == 'b')
continue FIRST_CHAR_LOOP;
System.out.print(" " + a + x);
}
}
}
}

/* Com a estrutura definida, o loop retornará o controle ao loop pai a qualquer momento
o primeiro valor é 2 ou o segundo valor é b. Isso resulta em uma execução do loop interno
para cada uma das três chamadas de loop externas.

A saida será: 
1a 3a 4a

Se remover o FIRST_CHAR_LOOP label na instrução continue para que o controle seja retornado 
ao loop interno em vez do externo. 
Veja se você consegue entender como a saída será alterada
 para:
 1a 1c 3a 3c 4a 4c

 Se remover a declaração continue e a declaração if-then associada completamente

 1a 1b 1c 2a 2b 2c 3a 3b 3c 4a 4b 4c