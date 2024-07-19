# Java

## 2 - Printar texto sem quebra de linha

[Acesse o código](../../../../Languages/Java/01/Java_01_02_01_00.java)

### 1 - Via biblioteca out:

```Java

public class Java_01_02_01_00 {
    public static void main(String[] args) {
        System.out.print("Olá Mundo!");
        System.out.print("Olá Mundo!");
    }
}

```
##### Saída:
Olá Mundo!Olá Mundo!

### 2 - Via System:

[Acesse o código](../../../../Languages/Java/01/Java_01_02_02_00.java)

O método 

```Java

public class Java_01_02_02_00 {
    public static void main(String[] args) {
        System.console().printf("Olá Mundo!");
        System.console().printf("Olá Mundo!");
    }
}

```
##### Saída:
Olá Mundo!Olá Mundo!

<br>

### 3 - Via biblioteca err:

[Acesse o código](../../../../Languages/Java/01/Java_01_02_03_00.java)

O método 

```Java

public class Java_01_02_03_00 {
    public static void main(String[] args) {
        System.err.print("Olá Mundo!");
        System.err.print("Olá Mundo!");
    }
}

```
##### Saída:

Olá Mundo!Olá Mundo!

<br>

<br><br>

### [Voltar ao Menu Olá Mundo](../Ola-Mundo.md)