# Java

# 1 - Escreva na Tela "Olá Mundo!":

Escrever na tela "Olá Mundo!", são programas simples que servem como uma introdução ao aprendizado de uma linguagem de programação. Eles são usados principalmente como um primeiro exemplo de código em uma nova linguagem para demonstrar os conceitos básicos de sintaxe e estrutura.

Além disso, os "Olá Mundo!" também são úteis para verificar se o ambiente de desenvolvimento está configurado corretamente e funcionando. Esses programas são uma tradição comum na programação e servem como um ponto de partida para iniciantes explorarem os fundamentos de uma linguagem de programação.

## 1.1 - Escrevendo na tela a mensagem "Olá Mundo!"

### 1 - Via biblioteca out:

[Acesse o código](../../../../Languages/Java/01/Java_01_00_00.java)

#### Maneira 1

O método 

```Java

public class Java_01_00_00 {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
        System.out.println("Olá Mundo!");
    }
}

```
##### Saída:
Olá Mundo!<br>
Olá Mundo!

<br>

#### Maneira 2

O método 

```Java

public class Java_01_00_00 {
    public static void main(String[] args) {
        System.out.print("Olá Mundo!");
        System.out.print("Olá Mundo!");
    }
}

```
##### Saída:
Olá Mundo!Olá Mundo!

<br>

#### Maneira 3

O método 

```Java

public class Java_01_00_00 {
    public static void main(String[] args) {
        System.out.printf("Texto: %s, Letras: %d", "Olá Mundo", 8);
        System.out.printf("Texto: %s, Letras: %d", "Olá Mundo", 8);
    }
}

```
##### Saída:
Texto: Olá Mundo, Letras: 8Texto: Olá Mundo, Letras: 8

<br>

### 2 - Direto de System:

[Acesse o código](../../../../Languages/Java/01/Java_01_01_00.java)

O método 

```Java

public class Java_01_01_00 {
    public static void main(String[] args) {
        System.console().printf("Texto: %s, Letras: %d", "Olá Mundo", 8);
        System.console().printf("Texto: %s, Letras: %d", "Olá Mundo", 8);
    }
}

```
##### Saída:
Texto: Olá Mundo, Letras: 8Texto: Olá Mundo, Letras: 8

<br>

### 3 - Por via da biblioteca err:

[Acesse o código](../../../../Languages/Java/01/Java_01_02_00.java)

O método 

```Java

public class Java_01_02_00 {
    public static void main(String[] args) {
        System.err.println("Olá Mundo!");
        System.err.println("Olá Mundo!");

        System.err.print("Olá Mundo!");
        System.err.print("Olá Mundo!");

        System.err.printf("Texto: %s, Letras: %d", "Olá Mundo", 8);
        System.err.printf("Texto: %s, Letras: %d", "Olá Mundo", 8);
    }
}

```
##### Saída:
Olá Mundo!<br>
Olá Mundo!

Olá Mundo!Olá Mundo!

Texto: Olá Mundo, Letras: 8Texto: Olá Mundo, Letras: 8

<br>

### Dica útil:

Existe uma forma de quebrar linha nos exemplos acima, com o uso do termo "\n".

```Java

public class Java_01_03_00 {
    public static void main(String[] args) {
        System.out.print("Olá Mundo!\n");
        System.out.print("Olá Mundo!\n");
    }
}

```
##### Saída:
Olá Mundo!<br>
Olá Mundo!

<br><br>

### [Voltar ao Menu Olá Mundo](../Ola-Mundo.md)