# Ruby

# 2 - Conceitos Fundamentais de Programação

## 2.1 - Comentários

Comentários em linguagens de programação são trechos de texto que não são executados pelo computador, mas desempenham um papel essencial na clareza e documentação do código. Eles são usados para explicar o propósito de partes do código, fornecer informações úteis aos programadores, facilitar a depuração de erros e, às vezes, desativar temporariamente seções do código. Comentários são uma prática fundamental para tornar o código mais compreensível, colaborativo e fácil de manter.

[Acesse o código](../../../../Languages/Ruby/02/Ruby-01-00-00.rb)

#### Maneira 1

Permite comentar apenas uma linha

```Ruby

# Comentário

```

#### Maneira 2

Permite comentar várias linhas

```Ruby

=begin

Comentário

=end

```

#### Maneira 3

Permite criar um Rdoc, o qual são formatados de maneira especial para gerar documentação.

```Ruby

# :Comentário:

```
<br>

## 2.2 - Tipos, Variáveis e Atribuições simples

Tipos referem-se às categorias de dados, como inteiros, strings ou booleanos, determinando como os valores são armazenados e manipulados.

Variáveis são contêineres que mantêm valores desses tipos, permitindo aos programadores armazenar informações e manipulá-las dinamicamente no código.

Atribuições são ações que associam um valor a uma variável, possibilitando o armazenamento de dados e a execução de cálculos, facilitando o controle e a manipulação das informações dentro de um programa.

Os tipos de dados em Ruby são inferidos automaticamente pelo interpretador. No entanto, existem alguns tipos básicos em Ruby, onde abaixo pode-se ve-los, com a atribuição simples de tipos de valores esperados:

[Acesse o código](../../../../Languages/Ruby/02/Ruby-02-00-00.rb)

```Ruby

var_int = 5

var_float = 1.5

var_boolean = true

var_string = "nome"

var_nil = nil

var_range = 1..5

var_array = [0,1,2,3,4,5]

var_hash = {"nome" => "Jabuti", "idade" => 50}

var_symbol = :symbol

var_classe = String

```
<br>

### Em Ruby, a tipagem é forte e dinâmica.

#### Tipagem Forte

A "tipagem forte" significa que a linguagem impõe regras rígidas para a conversão de tipos, garantindo que as operações sejam realizadas apenas entre tipos compatíveis, o que pode ajudar a prevenir erros de tipo durante a execução do programa.

[Acesse o código](../../../../Languages/Ruby/02/Ruby-02-01-00.rb)

```Ruby
#Atribui-se o tipo inteiro
var_int = 5

#Atribui-se o tipo string
var_string = "10"

#Busca-se somar um inteiro com uma string
var_result = var_int + var_string

puts var_result

```
##### Saída:
Erro de Tipos. Não se pode somar Inteiro com String

<br>

#### Tipagem Dinâmica

Por outro lado, a "tipagem dinâmica" permite que os tipos de dados sejam determinados em tempo de execução, o que dá mais flexibilidade ao código.

[Acesse o código](../../../../Languages/Ruby/02/Ruby-02-01-01.rb)

```Ruby
#Atribui-se o tipo inteiro
var_int = 5

#Atribui-se o tipo string
var_string = "10"

#Permite-se alterar a variavel, ao mudar de String para Inteiro
var_string = 10

#Agora permite-se realizar o calculo
var_result = var_int + var_string

puts var_result

```
##### Saída:
10

<br>

## 2.3 - Operadores

### Duas maneiras de operar
[Acesse o código](../../../../Languages/Ruby/02/Ruby-03-00-00.rb)

```Ruby

var_int1 = 10.0
var_int2 = 3

#Soma com variaveis
puts var_int1 + var_int2

#Soma direta
puts 10 + 3

```
##### Saída:
13.0 <br>
13.0 <br>
<br>

### Operadores Aritméticos

[Acesse o código](../../../../Languages/Ruby/02/Ruby-03-01-00.rb)

```Ruby

#Soma
puts 10.0 + 3

#Subtração
puts 10.0 - 3

#Multiplicação
puts 10.0 * 3

#Divisão, obtendo o divisor da divisão
puts 10.0 / 3

#Divisão, obtendo apenas a parte inteira do divisor
puts 10.0.div(3)

#Módulo, obtendo o resto da divisão
puts 10.0 % 3

#Exponenciação
puts 10.0 ** 3

#Arredondamento
puts (3.3333333333333335).round

#Valor absoluto
puts (-3).abs

```
##### Saída:
13.0 <br>
7.0  <br>
30.0 <br>
3.3333333333333335  <br>
3  <br>
1.0  <br>
1000.0  <br>
3  <br>
3  <br>
<br>

### Operadores de Atribuição

[Acesse o código](../../../../Languages/Ruby/02/Ruby-03-02-00.rb)

```Ruby

#Soma
var_int = 10.0
puts var_int += 3

#Subtração
var_int = 10.0
puts var_int -= 3

#Multiplicação
var_int = 10.0
puts var_int *= 3

#Divisão, obtendo o divisor da divisão
var_int = 10.0
puts var_int /= 3

#Módulo, obtendo o resto da divisão
var_int = 10.0
puts var_int %= 3

#Exponenciação
var_int = 10.0
puts var_int **= 3

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

[Acesse o código](../../../../Languages/Ruby/02/Ruby-03-03-00.rb)

```Ruby

#Igual a
puts 10 == 3

#Diferente de
puts 10 != 3

#Menor que
puts 10 < 3

#Maior que
puts 10 > 3

#Menor ou igual a
puts 10 <= 3

#Maior ou igual a
puts 10 >= 3

#Está contido
p (var_range = 1..5) === 2

```
##### Saída:
false <br>
true <br>
false <br>
true <br>
false <br>
true <br>
true <br>
<br>


[Acesse o código](../../../../Languages/Ruby/02/Ruby-03-03-01.rb)

```Ruby

#Comparação de valores -> Retorna -1 se a primeira for menor, 0 se forem iguais e 1 se a primeira for maior.
puts ("aa" <=> "ab"), (3 <=> 10)

puts ("aa" <=> "aa"), (3 <=> 3)

puts ("ab" <=> "aa"), (10 <=> 3)

```
##### Saída:
-1 <br>
-1 <br>
0 <br>
0 <br>
1 <br>
1 <br>
<br>

### Operador de Intervalo

São utilizados para criar sequências de valores com base em um início, fim e, em alguns casos, um incremento. Existem dois principais operadores de intervalo em Ruby.

[Acesse o código](../../../../Languages/Ruby/02/Ruby-03-04-00.rb)

```Ruby

var_range1 = 1..5 #Imprime de 1 a 5

var_range2 = 1...5 #Imprime de 1 a 4

#Para visualização, é necessário usar o método to_a, para conversão do valor
p var_range1.to_a
p var_range2.to_a

```

### Operadores Lógicos

#### Lógico de alta precedência

[Acesse o código](../../../../Languages/Ruby/02/Ruby-03-05-00.rb)

```Ruby

#e
puts true && true, true && false, false && true, false && false

#ou
puts true || true, true || false, false || true, false || false

#não
puts !true, !false

```
##### Saída:
true <br>
false <br>
false <br>
false <br>
<br>
true <br>
true <br>
true <br>
false <br>
<br>
false <br>
true <br>

<br>

#### Lógico de baixa precedência ou Lógico Curto-Circuito

Os operadores "and", "or" e "not", possuem a mesma ação dos operadores anteriores, respectivamente "&&", "||" e "!", todavia com menor precedência, havendo necessidade do uso de parenteses para não ocasionar em imprecisão da operação.

[Acesse o código](../../../../Languages/Ruby/02/Ruby-03-05-01.rb)

```Ruby

#e
puts (true and true), (true and false), (false and true), (false and false)

#ou
puts (true or true), (true or false), (false or true), (false or false)

#não
puts (not true), (not false)

```
##### Saída:
true <br>
false <br>
false <br>
false <br>
<br>
true <br>
true <br>
true <br>
false <br>
<br>
false <br>
true <br>

<br>

Todavia, por haver menos precedência, pode ocorrer eventos não tão esperados, mas também, auxiliar em realizar ações de comparação mais complexas, o qual podem ser necessárias a depender da necessidade.

[Acesse o código](../../../../Languages/Ruby/02/Ruby-03-05-02.rb)

```Ruby

#Se não utilizar parenteses, o método puts passa a ter maior precedencia, printando o primeiro termo "true". Os parenteses resolvem este problema, obtendo o valor "false".
puts true and false
puts (true and false)

puts (true and true) and false
puts (true and true and false)

#Precedencia do || é maior que o próprio puts, retornando "true". Todavia, não ocorre comparação and, pois é menor que puts, com este logo imprimindo "true".
puts false || true and false
#Um simples parenteses resolve o problema
puts (false || true and false)

```
##### Saída:
true <br>
false <br>
<br>
true <br>
false <br>
<br>
true <br>
false <br>

<br>

#### Lógico Bit a Bit

[Acesse o código](../../../../Languages/Ruby/02/Ruby-03-05-03.rb)

```Ruby

#e (Bit a Bit)
puts (10 & 3)
#1010 & 0011 = 0010

#ou (Bit a Bit)
puts (10 | 3)
#1010 | 0011 = 1011

#não (Bit a Bit) - Positivo
puts (~ 10), (~ 3)
#0 1010 (10) -> 1 0101 (-11)
#0 0011 (3) -> 1 1100 (-4)

#não (Bit a Bit) - Negativo
puts (~ -10), (~ -3)
#1 0110 (-10) -> 0 1001 (9)
#1 1101 (-3) -> 0 0010 (2)

```
##### Saída:
2 <br>
11 <br>
-11 <br>
-4 <br>
9 <br>
2 <br>

<br>

### Operadores de deslocamento

#### Operador (<<)

Este operador é usado para manipular strings e arrays, como também realizar operações de deslocamento de bits a esquerda.

[Acesse o código](../../../../Languages/Ruby/02/Ruby-03-06-00.rb)

```Ruby

var_string = "Olá, "
var_string << "mundo!"
p var_string

var_array = [1, 2, 3]
var_array << 4
p var_array

var_int = 2
p var_int << 3

```
##### Saída:
"Olá, mundo!" <br>
[1, 2, 3, 4] <br>
16 <br>
<br>

#### Operador (>>)

Em suma, é usado para deslocar bits à direita em números inteiros.

[Acesse o código](../../../../Languages/Ruby/02/Ruby-03-06-01.rb)

```Ruby

var_int = 16
p var_int >> 2

```
##### Saída:
4 <br>
<br>

### Ordem de Precedencia dos Operadores

Por fim, como vimos diferentes precedencias nos exemplos acima, aqui ficará claro a ordem geral dos operadores que foram apresentados anteriormente:

[Acesse o código](../../../../Languages/Ruby/02/Ruby-03-07-00.rb)

```Ruby
#1 - Parenteses

#2 - Operadores unários (-, +, !, ~)

#3 - Operadores de exponenciação (**)

#4 - Operadores de multiplicação, divisão e módulo (*, /, %)

#5 - Operadores de adição e subtração (+, -)

#6 - Operadores de deslocamento (<<, >>)

#7 - Operadores de comparação (<, >, <=, >=, ==, !=, ===, <=>)

#8 - Operadores lógicos de alta precedencia (&&, ||, !)

#9 - Operadores lógicos de baixa precedencia (and, or, not)

#10 - Operadores de atribuição (=, +=, -=, *=, /=, %=, **=)

#11 - Operadores de intervalo (.., ...)

#12 - Operador de índice "[]" e acesso a propriedades "[] e {}"

```

## 2.4 - Conversão de Valores

Conversão de valores refere-se à transformação de um tipo de dado em outro. Isso é útil para adequar dados a contextos específicos, realizar operações com tipos compatíveis e garantir que as informações sejam processadas corretamente.

### Converter valores para Inteiro

[Acesse o código](../../../../Languages/Ruby/02/Ruby-04-00-00.rb)

```Ruby

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

[Acesse o código](../../../../Languages/Ruby/02/Ruby-04-01-00.rb)

```Ruby

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

[Acesse o código](../../../../Languages/Ruby/02/Ruby-04-01-01.rb)

```Ruby

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

[Acesse o código](../../../../Languages/Ruby/02/Ruby-04-02-00.rb)

```Ruby

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

[Acesse o código](../../../../Languages/Ruby/02/Ruby-04-03-00.rb)

```Ruby

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

[Acesse o código](../../../../Languages/Ruby/02/Ruby-05-00-00.rb)

```Ruby

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
[Acesse o código](../../../../Languages/Ruby/02/Ruby-05-01-00.rb)

```Ruby

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
[Acesse o código](../../../../Languages/Ruby/02/Ruby-05-01-01.rb)

```Ruby

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
[Acesse o código](../../../../Languages/Ruby/02/Ruby-05-01-02.rb)

```Ruby

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
[Acesse o código](../../../../Languages/Ruby/02/Ruby-05-02-00.rb)

```Ruby

var_string = "Jabuti"
var_int = 50

printf("Um %s", var_string)
printf("Um %s pode viver mais do que %d anos!", var_string, var_int)

```
##### Saída:
Um JabutiUm Jabuti pode viver mais do que 50 anos!<br>

<br>

#### Maneira 2
[Acesse o código](../../../../Languages/Ruby/02/Ruby-05-02-01.rb)

```Ruby

var_string = "Jabuti"
var_int = 50

puts "Um %s" % [var_string]
puts "Um %s pode viver mais do que %d anos!" % [var_string, var_int]

```
##### Saída:
Um Jabuti<br>
Um Jabuti pode viver mais do que 50 anos!<br>

<br>

## 2.6 - Funções

Funções são blocos de código reutilizáveis que realizam uma tarefa específica.
As funções são usadas para modularizar o código, tornando-o mais organizado, legível e fácil de manter, uma vez que permitem que partes do programa sejam isoladas e reutilizadas em diferentes partes do código, promovendo a eficiência e a reutilização de lógica.

### Função Simples

```Ruby

def salutation(func_var_string)
  puts "Olá, #{nome}!"
end

salutation("Mundo")
salutation("Jabuti")

```
##### Saída:
Olá, Mundo! <br>
Olá, Jabuti! <br>

<br>

### Função com Retorno

```Ruby

def salutation(func_var_string1, func_var_string2)
  return func_var_string1 + func_var_string2
end

puts var_result = salutation("Olá, ", "Mundo!")

```
##### Saída:
8 <br>

<br>

### Função com Valores Padrão

```Ruby

def salutation(func_var_string = "Mundo")
  puts "Olá, #{func_var_string}!"
end

salutation
salutation("Jabuti")

```
##### Saída:
Olá, Mundo! <br>
Olá, Jabuti! <br>

<br>


<br><br>

### [Voltar ao Menu Principal](../Ola-Mundo.md)