.model small    ;directive
.stack 100h     ;directive
.data
    n1 db 'First Input:$'
    n2 db 10,13,'Second Input:$'
    n3 db 10,13,'The sum is:$' 
    
.code

mov ax,@data
mov ds,ax

mov ah,09h  ;to request to display string
mov dx,offset n1
int 21h

mov ah,01h
int 21h
sub al,30h
mov bh,al

mov ah,09h  ;to request to display string
mov dx,offset n2
int 21h

mov ah,01h
int 21h
sub al,30h
mov bl,al 

mov ax,0
mov al,bh
add al,bl
aaa
mov ch,ah   ;tens place
mov cl,al   ;ones place 




mov ah,02h 
mov dl,10
int 21h

add ch,30h
mov dl,ch  
int 21h
         
add cl,30h
mov dl,cl  
int 21h         

mov ah,4ch
int 21h
