# Java

## 3 - Printar com formatação de texto

### 1 - Via biblioteca out:

[Acesse o código](../../../../Languages/Java/01/Java_01_03_01_00.java)

O método 

```Java

public class Java_01_03_01_00 {
    public static void main(String[] args) {
        System.out.printf("Texto: %s, Letras: %d", "Olá Mundo", 8);
        System.out.printf("Texto: %s, Letras: %d", "Olá Mundo", 8);
    }
}

```
##### Saída:
Texto: Olá Mundo, Letras: 8Texto: Olá Mundo, Letras: 8

<br>

### 2 - Via System:

[Acesse o código](../../../../Languages/Java/01/Java_01_03_02_00.java)

O método 

```Java

public class Java_01_03_02_00 {
    public static void main(String[] args) {
        System.console().printf("Texto: %s, Letras: %d", "Olá Mundo", 8);
        System.console().printf("Texto: %s, Letras: %d", "Olá Mundo", 8);
    }
}

```
##### Saída:
Texto: Olá Mundo, Letras: 8Texto: Olá Mundo, Letras: 8

<br>

### 3 - Via biblioteca err:

[Acesse o código](../../../../Languages/Java/01/Java_01_03_03_00.java)

O método 

```Java

public class Java_01_03_03_00 {
    public static void main(String[] args) {
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

<br><br>

### [Voltar ao Menu Olá Mundo](../Ola-Mundo.md)