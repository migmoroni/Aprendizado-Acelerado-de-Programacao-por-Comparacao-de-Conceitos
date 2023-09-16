# Ruby

# 1 - Escreva na Tela "Olá Mundo!":

Escrever na tela "Olá Mundo!", são programas simples que servem como uma introdução ao aprendizado de uma linguagem de programação. Eles são usados principalmente como um primeiro exemplo de código em uma nova linguagem para demonstrar os conceitos básicos de sintaxe e estrutura.

Além disso, os "Olá Mundo!" também são úteis para verificar se o ambiente de desenvolvimento está configurado corretamente e funcionando. Esses programas são uma tradição comum na programação e servem como um ponto de partida para iniciantes explorarem os fundamentos de uma linguagem de programação.

## 1.1 - Escrevendo na tela a mensagem "Olá Mundo!"

[Acesse o código](../../../../Languages/Ruby/01/Ruby-01.rb)

#### Maneira 1

O método "puts" adiciona uma nova linha após a saída, tornando-o útil para imprimir mensagens de texto formatadas ou resultados de cálculos.

```Ruby

puts "Olá Mundo!"
puts "Olá Mundo!"

```
##### Saída:
Olá Mundo!<br>
Olá Mundo!

<br>

#### Maneira 2

O método "p" é usado para depuração, pois exibe o valor de uma expressão, incluindo detalhes internos, como aspas em strings e novas linhas.

```Ruby

p "Olá Mundo!"
p "Olá Mundo!"

```
##### Saída:
"Olá Mundo!"<br>
"Olá Mundo!"

<br>

#### Maneira 3

O método "print" não adiciona uma nova linha, permitindo que a saída seja impressa na mesma linha ou para formatar saídas sem quebras de linha.

```Ruby

print "Olá Mundo!"
print "Olá Mundo!"

```
##### Saída:
Olá Mundo!Olá Mundo!

<br>

#### Maneira 4

O método "printf" é usado para formatar a saída de acordo com um especificador de formato, semelhante à função "printf" em linguagens como C. E semelhante ao "print", não adiciona uma nova linha.

```Ruby

printf("Texto: %s, Letras: %d", "Olá Mundo", 8)
printf("Texto: %s, Letras: %d", "Olá Mundo", 8)

```
##### Saída:
Texto: Olá Mundo, Letras: 8Texto: Olá Mundo, Letras: 8

<br>

### Dica útil:

Existe uma forma de quebrar linha nos exemplos acima, com o uso do termo "\n".

```Ruby

print "Olá Mundo!\n"
print "Olá Mundo!\n"

```
##### Saída:
Olá Mundo!<br>
Olá Mundo!

<br><br>

### [Voltar ao Menu Principal](../Ola-Mundo.md)