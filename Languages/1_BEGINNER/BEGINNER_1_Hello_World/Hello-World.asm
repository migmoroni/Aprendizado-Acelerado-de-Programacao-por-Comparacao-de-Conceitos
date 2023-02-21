section .data
    hello db "Hello World",10 ; 10 = nova linha
section .text
    global _start
_start:
    ; write(1, hello, 12)
    mov rax, 1      ; chamada de sistema write
    mov rdi, 1      ; stdout
    mov rsi, hello  ; mensagem a ser escrita
    mov rdx, 12     ; tamanho da mensagem
    syscall         ; faz a chamada de sistema
    mov rax, 60     ; chamada de sistema exit
    xor rdi, rdi    ; código de saída 0
    syscall         ; termina o programa