# Java

# 2 - Conceitos Fundamentais de Programação

## 2.1 - Comentários

Comentários em linguagens de programação são trechos de texto que não são executados pelo computador, mas desempenham um papel essencial na clareza e documentação do código. Eles são usados para explicar o propósito de partes do código, fornecer informações úteis aos programadores, facilitar a depuração de erros e, às vezes, desativar temporariamente seções do código. Comentários são uma prática fundamental para tornar o código mais compreensível, colaborativo e fácil de manter.

[Acesse o código](../../../../Languages/Java/02/Java_01_00_00.java)

#### Maneira 1

Permite comentar apenas uma linha

```Java

// Comentário

```

#### Maneira 2

Permite comentar várias linhas

```Java

/*

Comentário

*/

```

#### Maneira 3

Comentários de documentação são usados para gerar documentação automática usando ferramentas como o Javadoc.

```Java

/**

Este é um comentário de documentação.
@param var_int -> variavel de número inteiro

*/

```
<br>

## 2.2 - Tipos, Variáveis e Atribuições simples

Tipos referem-se às categorias de dados, como inteiros, strings ou booleanos, determinando como os valores são armazenados e manipulados.

Variáveis são contêineres que mantêm valores desses tipos, permitindo aos programadores armazenar informações e manipulá-las dinamicamente no código.

Atribuições são ações que associam um valor a uma variável, possibilitando o armazenamento de dados e a execução de cálculos, facilitando o controle e a manipulação das informações dentro de um programa.

Os tipos de dados em Java são inferidos estaticamente, o que significa que o tipo de uma variável deve ser declarado explicitamente no momento da criação da variável e é verificado em tempo de compilação. Alguns dos tipos mais comuns:

[Acesse o código](../../../../Languages/Java/02/Java_02_00_00.java)

```Java

public class Java_02_00_00 {
  public static void main(String[] args) {

    //Armazena valores inteiros de 8 bits
    byte var_byte = 5;

    //Armazena valores inteiros de 16 bits
    short var_short = 5;

    //Armazena valores inteiros de 32 bits
    int var_int = 5;

    //Armazena valores inteiros de 64 bits
    long var_long = 5;

    //Armazena valores de ponto flutuante de precisão simples
    float var_float = 1.5;

    //Armazena valores de ponto flutuante de precisão dupla
    double var_double = 10.55;

    //Armazena valores verdadeiros ou falsos
    boolean var_boolean = true

    //Armazena sequências de caracteres
    String var_string = "nome"

    //Armazena coleções de elementos do mesmo tipo
    Array var_array = [0,1,2,3,4,5]
  }
}

```
<br>

### Em Java, a tipagem é forte e estática.

#### Tipagem Forte

A "tipagem forte" significa que a linguagem impõe regras rígidas para a conversão de tipos, garantindo que as operações sejam realizadas apenas entre tipos compatíveis, o que pode ajudar a prevenir erros de tipo durante a execução do programa.

[Acesse o código](../../../../Languages/Java/02/Java_02_01_00.java)

```Java

public class Java_02_01_00 {
  public static void main(String[] args) {

    //Atribui-se o tipo inteiro "int" a variavel "var_int" e "var_result"
    int var_int = 5;
    int var_result;

    //Atribui-se o tipo string "String" a variavel "var_string"
    String var_string = "10";

    //Busca-se somar um inteiro com uma string
    var_result = var_int + var_string;

    System.out.println(var_result);
  }
}

```
##### Saída:
Erro de Tipos. Falha na Compilação.
Isto pois não se permite realizar operações com tipos diferentes.

<br>

#### Tipagem Estática

Já a "tipagem estática" obriga que se declare o tipo de uma variável no momento da criação, com esse tipo sendo verificado em tempo de compilação. Isso significa que o tipo da variável não pode mudar durante a execução do programa.

[Acesse o código](../../../../Languages/Java/02/Java_02_01_01.java)

```Java

public class Java_02_01_01 {
  public static void main(String[] args) {

    //Atribui-se o tipo inteiro
    int var_int = 5;
    int var_result;

    //Atribui-se o tipo string
    String var_string = "10";

    //Não é permitido alterar a variavel, ao mudar atribuição de String para Inteiro
    var_string = 10;

    //E não se pode realizar o calculo
    var_result = var_int + var_string

    System.out.println(var_result);
  }
}

```
##### Saída:
Ocorrem dois Erros de tipos incompatíveis.
Um ao tentar armazenar um inteiro numa variavel String e outro ao tentar somar inteiro com string.

<br>

## 2.3 - Operadores

### Duas maneiras de operar
[Acesse o código](../../../../Languages/Java/02/Java_03_00_00.java)

```Java

public class Java_03_00_00 {
  public static void main(String[] args) {
    double var_double = 10.0; //para permitir casas depois da virgula
    int var_int = 3;

    //Soma com variaveis
    System.out.println(var_int1 + var_int2);

    //Soma direta
    System.out.println(10 + 3);
  }
}

```
##### Saída:
13.0 <br>
13.0 <br>
<br>

### Operadores Aritméticos

[Acesse o código](../../../../Languages/Java/02/Java_03_01_00.java)

```Java

public class Java_03_01_00 {
  public static void main(String[] args) {

    //Soma
    System.out.println(10.0 + 3);

    //Subtração
    System.out.println(10.0 - 3);

    //Multiplicação
    System.out.println(10.0 * 3);

    //Divisão, obtendo o divisor da divisão
    System.out.println(10.0 / 3);

    //Módulo, obtendo o resto da divisão
    System.out.println(10.0 % 3);

    //Exponenciação
    System.out.println(10.0 ** 3);
  }
}

```
##### Saída:
13.0 <br>
7.0  <br>
30.0 <br>
3.3333333333333335  <br>
1.0  <br>
1000.0  <br>
<br>

### Operadores de Atribuição

[Acesse o código](../../../../Languages/Java/02/Java_03_02_00.java)

```Java

public class Java_03_02_00 {
  public static void main(String[] args) {
    double var_double = 10.0;

    //Soma
    System.out.println(var_double += 3);

    var_double = 10.0;
    //Subtração
    System.out.println(var_double -= 3);

    var_double = 10.0;
    //Multiplicação
    System.out.println(var_double *= 3);

    var_double = 10.0;
    //Divisão, obtendo o divisor da divisão
    System.out.println(var_double /= 3);

    var_double = 10.0;
    //Módulo, obtendo o resto da divisão
    System.out.println(var_double %= 3);
  }
}

```
##### Saída:
13.0 <br>
7.0  <br>
30.0 <br>
3.3333333333333335  <br>
1.0  <br>
1000.0  <br>
<br>

### Operadores de Comparação

[Acesse o código](../../../../Languages/Java/02/Java_03_03_00.java)

```Java
public class Java_03_03_00 {
  public static void main(String[] args) {

    //Igual a
    System.out.println(10 == 3);

    //Diferente de
    System.out.println(10 != 3);

    //Menor que
    System.out.println(10 < 3);

    //Maior que
    System.out.println(10 > 3);

    //Menor ou igual a
    System.out.println(10 <= 3);

    //Maior ou igual a
    System.out.println(10 >= 3);
  }
}

```
##### Saída:
false <br>
true <br>
false <br>
true <br>
false <br>
true <br>
<br>

### Operador de Incremento/Decremento

[Acesse o código](../../../../Languages/Java/02/Java_03_04_00.java)

```Java

public class Java_03_04_00 {
  public static void main(String[] args) {

    int var_int = 10;

    // Adiciona 1
    var_int++;
    System.out.println(var_int);

    var_int = 10;
    
    // Reduz 1
    var_int--;
    System.out.println(var_int);
  }
}

```
##### Saída:
11 <br>
9 <br>
<br>


### Operadores Lógicos

[Acesse o código](../../../../Languages/Java/02/Java_03_05_00.java)

```Java

public class Java_03_05_00 {
  public static void main(String[] args) {
    //e
    System.out.println("true && true => " + (true && true));
    System.out.println("true && false => " + (true && false));
    System.out.println("false && true => " + (false && true));
    System.out.println("false && false => " + (false && false));

    //ou
    System.out.println("true || true => " + (true || true));
    System.out.println("true || false => " + (true || false));
    System.out.println("false || true => " + (false || true));
    System.out.println("false || false => " + (false || false));

    //não
    System.out.println("!true => " + (!true));
    System.out.println("!false => " + (!false));
  }
}

```
##### Saída:
true && true => true
true && false => false
false && true => false
false && false => false
true || true => true
true || false => true
false || true => true
false || false => false
!true => false
!false => true

<br>

### Operador Ternário

O operador ternário é uma maneira eficiente e concisa de lidar com expressões condicionais simples e pode ser útil para atribuir valores com base em uma única condição.

Estrutura:

condicao ? valor_se_verdadeiro : valor_se_falso

[Acesse o código](../../../../Languages/Ruby/02/Ruby_03_06_00.java)

```Java

public class Java_03_06_00 {
  public static void main(String[] args) {
    int var_int = 18;
    String var_string = (var_int >= 18) ? "Maior de idade" : "Menor de idade";
    System.out.println(var_string);
  }
}

```

### Operadores Bit a Bit

#### Lógica básica

[Acesse o código](../../../../Languages/Java/02/Java_03_07_00.java)

```Java

public class Java_03_07_00 {
  public static void main(String[] args) {
    // e (Bit a Bit)
    System.out.println("10 & 3 => " + (10 & 3)); // 1010 (10) & 0011 (3) = 0010 (2)

    // ou (Bit a Bit)
    System.out.println("10 | 3 => " + (10 | 3)); // 1010 (10) | 0011 (3) = 1011 (11)

    // não (Bit a Bit) - Positivo
    System.out.println("~ 10 => " + (~ 10)); // 0 1010 (10) -> 1 0101 (-11)
    System.out.println("~ 3 => " + (~ 3)); // 0 0011 (3) -> 1 1100 (-4)

    // não (Bit a Bit) - Negativo
    System.out.println("~ -10 => " + (~ -10)); // 1 0110 (-10) -> 0 1001 (9)
    System.out.println("~ -3 => " + (~ -3)); // 1 1101 (-3) -> 0 0010 (2)
  }
}

```
##### Saída:
10 & 3 => 2 <br>
10 | 3 => 11 <br>
~ 10 => -11 <br>
~ 3 => -4 <br>
~ -10 => 9 <br>
~ -3 => 2 <br>

<br>

#### Deslocamento Bit a Bit (<< , >> e >>>)

Este operador é usado para operações de deslocamento de bits em números inteiros, a esquerda (<<), a direita apenas (>>) e a direita, junto com inserção de zeros equivalentes a esquerda (>>>).

[Acesse o código](../../../../Languages/Java/02/Java_03_07_01.java)

```Java

public class Java_03_07_01 {
  public static void main(String[] args) {

    int var_int1 = 2; // Exemplo para <<
    int var_int2 = -16; // Exemplo para >> e >>>
    int var_result1, var_result2, var_result3; // Os tres resultados

    // As operações
    var_result1 = var_int1 << 3;
    var_result2 = var_int2 >> 2;
    var_result3 = var_int2 >>> 2;

    // Para vermos o binário
    String var_string_n1 = Integer.toBinaryString(var_int1);
    String var_string_n2 = Integer.toBinaryString(var_int2);
    String var_string1 = Integer.toBinaryString(var_result1);
    String var_string2 = Integer.toBinaryString(var_result2);
    String var_string3 = Integer.toBinaryString(var_result3);

    // Printando na tela
    System.out.println("2 << 3 => " + var_result1 + ", Binário: " + var_string_n1 + " << 3 => " + var_string1);

    System.out.println("-16 >> 2 => " + var_result2 + ", Binário: " + var_string_n2 + " >> 2 => " + var_string2);

    System.out.println("-16 >>> 2 => " + var_result3 + ", Binário: " + var_string_n2 + " >>> 2 => " + var_string3);
  }
}

```
##### Saída:
  2 <<  3 => 16,         Binário: 10 << 3                                =>                            10000 <br>
-16 >>  2 => -4,         Binário: 11111111111111111111111111110000 >> 2  => 11111111111111111111111111111100 <br>
-16 >>> 2 => 1073741820, Binário: 11111111111111111111111111110000 >>> 2 => 00111111111111111111111111111100 <br>
<br>

### Ordem de Precedencia dos Operadores

Por fim, como vimos diferentes precedencias nos exemplos acima, aqui ficará claro a ordem geral dos operadores que foram apresentados anteriormente:

[Acesse o código](../../../../Languages/Java/02/Java_03_08_00.java)

```Java
//1 - Parenteses

//2 - Operadores unários (-, +, !, ~)

//3 - Operadores de exponenciação (**)

//4 - Operadores de multiplicação, divisão e módulo (*, /, %)

//5 - Operadores de adição e subtração (+, -)

//6 - Operadores de deslocamento (<<, >>)

//7 - Operadores de comparação (<, >, <=, >=, ==, !=, ===)

//8 - Operadores lógicos de alta precedencia (&&, ||, !)

//9 - Operadores lógicos de baixa precedencia (and, or, not)

//10 - Operadores de atribuição (=, +=, -=, *=, /=, %=, **=)

//11 - Operador de índice "[]" e acesso a propriedades "[] e {}"

```

## 2.4 - Conversão de Valores

Conversão de valores refere-se à transformação de um tipo de dado em outro. Isso é útil para adequar dados a contextos específicos, realizar operações com tipos compatíveis e garantir que as informações sejam processadas corretamente.

### Converter valores para Inteiro

[Acesse o código](../../../../Languages/Java/02/Java_04_00_00.java)

```Java

#Passado uma string "10"
var_string = "10"

#Usando metodo to_i para converter string em inteiro
var_result = var_string.to_i

puts var_result + 10

```
##### Saída:
20

<br>

### Converter valores para Float

#### Maneira 1

[Acesse o código](../../../../Languages/Java/02/Java_04_01_00.java)

```Java

#Passado uma string "3.14"
var_string = "3.14"

#Usando metodo to_f para converter string em float
var_float = var_string.to_f

puts var_float

```
##### Saída:
3.14

<br>

#### Maneira 2

[Acesse o código](../../../../Languages/Java/02/Java_04_01_01.java)

```Java

#Passado valores inteiros
var_int1 = 10
var_int2 = 3

#Usando metodo to_f, na última variavel, para converter inteiro em float
var_result = var_int1 / var_int2.to_f

puts var_result

```
##### Saída:
3.3333333333333335

<br>

### Converter valores para String

[Acesse o código](../../../../Languages/Java/02/Java_04_02_00.java)

```Java

#Passado um inteiro "1"
var_int = 1

#Usando metodo to_s para converter inteiro em string
var_result = 10 - var_int

#A soma é agora entre strings, alterando a função para juntar em vez de somar
puts var_result.to_s + " restantes"

```
##### Saída:
9 restantes

<br>

### Converter valores para Array

[Acesse o código](../../../../Languages/Java/02/Java_04_03_00.java)

```Java

#Converte o objeto var_range em um array
var_range = 1..5
p var_array1 = var_range.to_a

#Converte o hash var_hash em um array
var_hash = {"nome" => "Jabuti", "idade" => 50}
p var_array2 = var_hash.to_a

#Converte cada algorismo do inteiro var_int em um array
var_int = 124816
p var_array3 = var_int.to_s.chars.map(&:to_i)

```
##### Saída:
[1, 2, 3, 4, 5] <br>
[["nome", "Jabuti"], ["idade", 50]] <br>
[1, 2, 4, 8, 1, 6] <br>

<br>

## 2.5 - Formatação de texto

### Concatenação

[Acesse o código](../../../../Languages/Java/02/Java_05_00_00.java)

```Java

var_string = "Jabuti"
var_int = 50

puts "Um " + var_string
puts "Um " + var_string + " pode viver mais do que " + var_int + " anos!"

```
##### Saída:
Um Jabuti<br>
Um Jabuti pode viver mais do que 50 anos!<br>

<br>

### Interpolação

#### Maneira 1 - Simples

[Acesse o código](../../../../Languages/Java/02/Java_05_01_00.java)

```Java

var_string = "Jabuti"
var_int = 50

puts "Um #{var_string}"
puts "Um #{var_string} pode viver mais do que #{var_int} anos!"

```
##### Saída:
Um Jabuti<br>
Um Jabuti pode viver mais do que 50 anos!<br>

<br>

#### Maneira 2 - Com expressões

[Acesse o código](../../../../Languages/Java/02/Java_05_01_01.java)

```Java

var_string = "Jabuti"
var_int = 50

puts "Um #{var_string}"
puts "Um #{var_string} pode viver mais do que #{var_int} anos!"
puts "Já alguns poucos #{var_string}s pode viver mais do que #{var_int + 70} anos!"

```
##### Saída:
Um Jabuti<br>
Um Jabuti pode viver mais do que 50 anos!<br>
Já alguns poucos Jabutis podem viver mais do que 120 anos!

<br>

#### Maneira 3 - Com bloco

[Acesse o código](../../../../Languages/Java/02/Java_05_01_02.java)

```Java

var_array = ["Jabuti", "Cágado", "Tartaruga"]

puts "Um #{var_array}"
puts "Nomes: #{var_array.map{ |nome| nome.upcase }.join(", ")}"

```
##### Saída:
Um Jabuti<br>
Um Jabuti pode viver mais do que 50 anos!<br>
Já alguns poucos Jabutis podem viver mais do que 120 anos!

<br>

### Formatação direta

#### Maneira 1

[Acesse o código](../../../../Languages/Java/02/Java_05_02_00.java)

```Java

var_string = "Jabuti"
var_int = 50

printf("Um %s", var_string)
printf("Um %s pode viver mais do que %d anos!", var_string, var_int)

```
##### Saída:
Um JabutiUm Jabuti pode viver mais do que 50 anos!<br>

<br>

#### Maneira 2

[Acesse o código](../../../../Languages/Java/02/Java_05_02_01.java)

```Java

var_string = "Jabuti"
var_int = 50

puts "Um %s" % [var_string]
puts "Um %s pode viver mais do que %d anos!" % [var_string, var_int]

```
##### Saída:
Um Jabuti<br>
Um Jabuti pode viver mais do que 50 anos!<br>

<br>

## 2.6 - Funções básicas

Funções são blocos de código reutilizáveis que realizam uma tarefa específica.
As funções são usadas para modularizar o código, tornando-o mais organizado, legível e fácil de manter, uma vez que permitem que partes do programa sejam isoladas e reutilizadas em diferentes partes do código, promovendo a eficiência e a reutilização de lógica.

Existem vários tipos de funções, onde neste primeiro momento, é apresentado de forma sucinta 3 das formas mais básicas, utilizando de 5 formas diferentes de expressar as mesmas.

### Função sem Retorno

[Acesse o código](../../../../Languages/Java/02/Java_06_00_00.java)

```Java

#Usando métodos
def salutation(func_var_string)
  puts "Olá, #{func_var_string}!"
end

salutation("Mundo")

#Usando procs
salutation = Proc.new do |func_var_string| puts "Olá, #{func_var_string}!" end
salutation.call("Mundo")

#Usando procs (simplificado)
salutation = Proc.new {|func_var_string| puts "Olá, #{func_var_string}!"}
salutation.call("Mundo")

#Usando lambdas
salutation = lambda {|func_var_string| puts "Olá, #{func_var_string}!"}
salutation.call("Mundo")

#Usando funções anônimas (lambda simplificado)
salutation = -> (func_var_string) {puts "Olá, #{func_var_string}!"}
salutation.call("Mundo")

```
##### Saída (Igual a todos):
Olá, Mundo! <br>

<br>

### Função com Retorno

[Acesse o código](../../../../Languages/Java/02/Java_06_01_00.java)

```Java

#Usando métodos
def salutation(func_var_string1, func_var_string2)
  return func_var_string1 + func_var_string2
end

puts salutation("Olá, ", "Mundo!")

#Usando procs
salutation = Proc.new do |func_var_string1, func_var_string2| func_var_string1 + func_var_string2 end
puts salutation.call("Olá, ", "Mundo!")

#Usando procs (simplificado)
salutation = Proc.new {|func_var_string1, func_var_string2| func_var_string1 + func_var_string2}
puts salutation.call("Olá, ", "Mundo!")

#Usando lambdas
salutation = lambda {|func_var_string1, func_var_string2| func_var_string1 + func_var_string2}
puts salutation.call("Olá, ", "Mundo!")

#Usando funções anônimas (lambda simplificado)
salutation = -> (func_var_string1, func_var_string2) {func_var_string1 + func_var_string2}
puts salutation.call("Olá, ", "Mundo!")

```
##### Saída:
Olá, Mundo! <br>

<br>

### Função com Valores Padrão

[Acesse o código](../../../../Languages/Java/02/Java_06_02_00.java)

```Java

#Usando métodos
def salutation(func_var_string = "Mundo")
  puts "Olá, #{func_var_string}!"
end

salutation
salutation("Amigo")

#Usando procs
salutation = Proc.new do |func_var_string = "Mundo"| "Olá, #{func_var_string}!" end
puts salutation.call
puts salutation.call("Amigo")

#Usando procs (simplificado)
salutation = Proc.new {|func_var_string = "Mundo"| "Olá, #{func_var_string}!"}
puts salutation.call
puts salutation.call("Amigo")

#Usando lambdas
salutation = lambda {|func_var_string = "Mundo"| "Olá, #{func_var_string}!"}
puts salutation.call
puts salutation.call("Amigo")

#Usando funções anônimas (lambda simplificado)
salutation = -> (func_var_string = "Mundo") {"Olá, #{func_var_string}!"}
puts salutation.call
puts salutation.call("Amigo")

```
##### Saída:
Olá, Mundo! <br>
Olá, Amigo! <br>

<br>

## Conclusão



<br><br>

### [Voltar ao Menu Principal](../Ola-Mundo.md)