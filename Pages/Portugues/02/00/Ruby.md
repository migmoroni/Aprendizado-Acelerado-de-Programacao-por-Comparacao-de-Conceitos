# Ruby

# 2 - Conceitos Fundamentais de Programação

## 2.1 - Comentários

Comentários em linguagens de programação são trechos de texto que não são executados pelo computador, mas desempenham um papel essencial na clareza e documentação do código. Eles são usados para explicar o propósito de partes do código, fornecer informações úteis aos programadores, facilitar a depuração de erros e, às vezes, desativar temporariamente seções do código. Comentários são uma prática fundamental para tornar o código mais compreensível, colaborativo e fácil de manter.

[Acesse o código](../../../../Languages/Ruby/02/Ruby-01.rb)

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

## 2.2 - Tipos, Variáveis e Atribuições

Tipos referem-se às categorias de dados, como inteiros, strings ou booleanos, determinando como os valores são armazenados e manipulados.

Variáveis são contêineres que mantêm valores desses tipos, permitindo aos programadores armazenar informações e manipulá-las dinamicamente no código.

Atribuições são ações que associam um valor a uma variável, possibilitando o armazenamento de dados e a execução de cálculos, facilitando o controle e a manipulação das informações dentro de um programa.

Os tipos de dados em Ruby são inferidos automaticamente pelo interpretador. No entanto, existem alguns tipos básicos em Ruby:

[Acesse o código](../../../../Languages/Ruby/02/Ruby-02.rb)

```Ruby

var_int = 5

var_float = 1.5

var_boolean = true

var_string = "nome"

var_nil = nil

var_range = 1..5

var_array = [0,1,2,3,4,5]

var_hash = {"nome" => "João", "idade" => 30}

var_symbol = :symbol

var_classe = String

```
<br>

### Em Ruby, a tipagem é forte e dinâmica.

#### Tipagem Forte

A "tipagem forte" significa que a linguagem impõe regras rígidas para a conversão de tipos, garantindo que as operações sejam realizadas apenas entre tipos compatíveis, o que pode ajudar a prevenir erros de tipo durante a execução do programa.

[Acesse o código](../../../../Languages/Ruby/02/Ruby-04-01-01.rb)

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

[Acesse o código](../../../../Languages/Ruby/02/Ruby-04-01-02.rb)

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

## 2.3 - Expressões e Operadores

#### Maneira 1
[Acesse o código](../../../../Languages/Ruby/02/Ruby-03-01.rb)

```Ruby

#Soma
puts 10 + 5

#Subtração
puts 10 - 5

#Multiplicação
puts 10 * 5

#Divisão, obtendo o divisor
puts 10 / 5

#Divisão, obtendo o resto
puts 10 % 5

```
##### Saída:
10 <br>
5  <br>
50 <br>
2  <br>
0  <br>
<br>

#### Maneira 2
[Acesse o código](../../../../Languages/Ruby/02/Ruby-03-02.rb)

```Ruby

var_int1 = 10
var_int2 = 5

#Soma
puts var_int1 + var_int2

#Subtração
puts var_int1 - var_int2

#Multiplicação
puts var_int1 * var_int2

#Divisão, obtendo o divisor
puts var_int1 / var_int2

#Divisão, obtendo o resto
puts var_int1 % var_int2

```
##### Saída:
10 <br>
5  <br>
50 <br>
2  <br>
0  <br>
<br>

## 2.4 - Conversão de Valores

Conversão de valores refere-se à transformação de um tipo de dado em outro. Isso é útil para adequar dados a contextos específicos, realizar operações com tipos compatíveis e garantir que as informações sejam processadas corretamente.

### Converter valores para Inteiro
[Acesse o código](../../../../Languages/Ruby/02/Ruby-04-02.rb)

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
[Acesse o código](../../../../Languages/Ruby/02/Ruby-04-03-01.rb)

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
[Acesse o código](../../../../Languages/Ruby/02/Ruby-04-03-02.rb)

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

[Acesse o código](../../../../Languages/Ruby/02/Ruby-04-04-01.rb)

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

## 2.5 - Formatação de texto

### Concatenação

[Acesse o código](../../../../Languages/Ruby/02/Ruby-05-01-01.rb)

```Ruby

var_string = "Jabuti"
var_int = 50

puts "Um " + var_string
puts "Um " + var_string + " pode viver mais do que " + var_int + " anos!"

```
##### Saída:
Um Jabuti
Um Jabuti pode viver mais do que 50 anos!

### Interpolação

#### Maneira 1
[Acesse o código](../../../../Languages/Ruby/02/Ruby-05-02-01.rb)

```Ruby

var_string = "Jabuti"
var_int = 50

puts "Um #{var_string}"
puts "Um #{var_string} pode viver mais do que #{var_int} anos!"

```
##### Saída:
Um Jabuti
Um Jabuti pode viver mais do que 50 anos!

<br>

#### Maneira 2
[Acesse o código](../../../../Languages/Ruby/02/Ruby-05-02-02.rb)

```Ruby

var_string = "Jabuti"
var_int = 50

puts "Um #{var_string}"
puts "Um #{var_string} pode viver mais do que #{var_int} anos!"

```
##### Saída:
Um Jabuti
Um Jabuti pode viver mais do que 50 anos!

<br>

### Formatação direta

#### Maneira 1
[Acesse o código](../../../../Languages/Ruby/02/Ruby-05-03-01.rb)

```Ruby

var_string = "Jabuti"
var_int = 50

printf("Um %s", var_string)
printf("Um %s pode viver mais do que %d anos!", var_string, var_int)

```
##### Saída:
Um Jabuti
Um Jabuti pode viver mais do que 50 anos!

<br>

#### Maneira 2
[Acesse o código](../../../../Languages/Ruby/02/Ruby-05-03-02.rb)

```Ruby

var_string = "Jabuti"
var_int = 50

puts "Um %s" % [var_string]
puts "Um %s pode viver mais do que %d anos!" % [var_string, var_int]

```
##### Saída:
Um Jabuti
Um Jabuti pode viver mais do que 50 anos!

<br>

## 2.6 - Funções

Funções são blocos de código reutilizáveis que realizam uma tarefa específica.
As funções são usadas para modularizar o código, tornando-o mais organizado, legível e fácil de manter, uma vez que permitem que partes do programa sejam isoladas e reutilizadas em diferentes partes do código, promovendo a eficiência e a reutilização de lógica.

### Função Simples

```Ruby
def funcao(func_var_string)

puts "Olá, #{func_var_string}!"

end

funcao("Mundo")
funcao("Jabuti")

```
##### Saída:
Olá, Mundo!
Olá, Jabuti!
<br>

### Função com Retorno

```Ruby


```

### Função com Valores Padrão

```Ruby


```

<br><br>

### [Voltar ao Menu Principal](../Ola-Mundo.md)