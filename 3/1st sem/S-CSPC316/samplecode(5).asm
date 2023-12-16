.model small    ;directive
.stack 100h     ;directive
.code

mov ah,02h      ;request to display character
mov dl,65       ;A
int 21h

mov dl,10       ;return
int 21h

mov dl,13       ;Cret
int 21h

mov dl,42h      ;B
int 21h 


mov ah,01h      ;request for input  
int 21h
mov ch,al 

mov ah,02h      ;request to display character
mov dl,10       ;X-axis
mov dh,5        ;Y-axis
mov bh,0        ;page number
int 10h

call hline
call hline
call hline

mov dl,10       ;return
int 21h 


mov dl,ch
int 21h



mov ah,4ch
int 21h
        
        
hline:
mov ah,02h        
mov dl,95       ;line
int 21h
mov dl,95       ;line
int 21h
mov dl,95       ;line
int 21h
mov dl,95       ;line
int 21h
ret
