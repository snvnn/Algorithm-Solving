#include <stdio.h>

int main() {
    int x;
    scanf("%d", &x);

    int zeros = x/5 + x/25 + x/125;

    printf("%d",zeros);        

    return 0;
}
