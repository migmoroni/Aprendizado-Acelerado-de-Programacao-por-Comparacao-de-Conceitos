# Ruby

# 2 - Conceitos Fundamentais de Programação

## 2.1 - Comentários

Comentários em linguagens de programação são trechos de texto que não são executados pelo computador, mas desempenham um papel essencial na clareza e documentação do código. Eles são usados para explicar o propósito de partes do código, fornecer informações úteis aos programadores, facilitar a depuração de erros e, às vezes, desativar temporariamente seções do código. Comentários são uma prática fundamental para tornar o código mais compreensível, colaborativo e fácil de manter.

[Acesse o código](../../../../Languages/Ruby/02/Ruby-02-01.rb)
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

## 2.2 - Tipos, Variáveis e Atribuições

Tipos referem-se às categorias de dados, como inteiros, strings ou booleanos, determinando como os valores são armazenados e manipulados.

Variáveis são contêineres que mantêm valores desses tipos, permitindo aos programadores armazenar informações e manipulá-las dinamicamente no código.

Atribuições são ações que associam um valor a uma variável, possibilitando o armazenamento de dados e a execução de cálculos, facilitando o controle e a manipulação das informações dentro de um programa.

[Acesse o código](../../../../Languages/Ruby/02/Ruby-02-02.rb)

```Ruby

var_int = 5

var_float = 1.5

var_boolean = true

var_String = "nome"

var_Array = [0,1,2,3,4,5]

```

## 2.3 - Expressões e Operadores

#### Maneira 1
[Acesse o código](../../../../Languages/Ruby/02/Ruby-02-03-01.rb)
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

#### Maneira 2
[Acesse o código](../../../../Languages/Ruby/02/Ruby-02-03-02.rb)
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

## 2.4 - Tipagem e Conversão de Valores

### Em Ruby, a tipagem é forte e dinâmica.

#### Tipagem Forte

A "tipagem forte" significa que a linguagem impõe regras rígidas para a conversão de tipos, garantindo que as operações sejam realizadas apenas entre tipos compatíveis, o que pode ajudar a prevenir erros de tipo durante a execução do programa.

[Acesse o código](../../../../Languages/Ruby/02/Ruby-02-04-01-01.rb)
```Ruby

var_int = 5

var_string = "5"

var_result = var_int + var_string

#Saída: Erro de Tipos. Não se pode somar Inteiro com String
puts var_result

```

#### Tipagem Dinâmica

Por outro lado, a "tipagem dinâmica" permite que os tipos de dados sejam determinados em tempo de execução, o que dá mais flexibilidade ao código.

[Acesse o código](../../../../Languages/Ruby/02/Ruby-02-04-01-02.rb)

```Ruby

var_int = 5

var_string = "5"

#Permite-se alterar a variavel, convertendo os tipos. Ao converter String para Inteiro, permite-se realizar o calculo
var_result = var_int + var_string.to_i

#Saída: 10
puts var_result

```

### Converter valores para Inteiro
[Acesse o código](../../../../Languages/Ruby/02/Ruby-02-04-02.rb)

```Ruby

#Passado uma string "10"
var_string = "10"

#Usando metodo to_i para converter string em inteiro
var_result = var_string.to_i

#Saída: 20
puts var_result + 10

```

### Converter valores para Float

#### Maneira 1
[Acesse o código](../../../../Languages/Ruby/02/Ruby-02-04-03-01.rb)

```Ruby

#Passado uma string "3.14"
var_string = "3.14"

#Usando metodo to_f para converter string em float
var_float = var_string.to_f

#Saída: 3.14
puts var_float

```

#### Maneira 2
[Acesse o código](../../../../Languages/Ruby/02/Ruby-02-04-03-02.rb)

```Ruby

#Passado valores inteiros
var_int1 = 10
var_int2 = 3

#Usando metodo to_f, na última variavel, para converter inteiro em float
var_result = var_int1 / var_int2.to_f

#Saída: 3.3333333333333335
puts var_result

```

### Converter valores para String

#### Maneira 1
[Acesse o código](../../../../Languages/Ruby/02/Ruby-02-04-04-01.rb)

```Ruby

#Passado um inteiro "1"
var_int = 1

#Usando metodo to_s para converter inteiro em string
var_result = 10 - var_int

#Saída: 9 restantes
puts var_result.to_s + " restantes"

```

#### Maneira 2
[Acesse o código](../../../../Languages/Ruby/02/Ruby-02-04-04-02.rb)

```Ruby

#Passado um inteiro "1"
var_int = 1

#Usando interpolação para permitir apresentar o valor
var_result = 10 - var_int

#Saída: 9 restantes
puts "#{var_result} restantes"

```

#### Maneira 3
[Acesse o código](../../../../Languages/Ruby/02/Ruby-02-04-04-03.rb)

```Ruby

#Passado um inteiro "1"
var_int = 1

#Deixando o calculo dentro da interpolação
#Saída: 9 restantes
puts "#{10 - var_int} restantes"

```

## 2.5 - Funções

### 

```Ruby



```

<br><br>

### [Voltar ao Menu Principal](../Ola-Mundo.md)