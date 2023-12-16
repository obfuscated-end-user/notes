/* Final Exam */
#include <stdio.h>
int a[5]={5, 10, 15, 20, 25};
int x, temp, size=5;
main() 
{
    printf("BEFORE:\n\n");
    for (x=0; x<=4; x++)
    {
        printf ("Element [%d] is %d\n", x, a[x]);
    }
    loop1();
    printf("\n======================\nAFTER:\n\n");
    loop2();
}
loop1()
{
    for (x=0; x<=2; x++)
    {
        temp= a[x];
        a[x] = a[(size-1)-x];
        a[(size-1)-x] = temp;
    }
}
loop2()
{
    for (x=0; x<=4; x++)
    {
        printf ("Element [%d] is %d\n", x, a[x]);
    }
}