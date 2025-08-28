#include <stdio.h>

int main(){
    int edad;
    printf("Ingrese su edad para determinar si es mayor o menor:");
    scanf("%d", &edad);
    if (edad<18)
    {
        printf("Usted es menor de edad");
    }
    else if (edad>18)
    {
        printf("Usted es mayor de edad");
    }
    else{
        printf("Respuesta invalida");
    }
    
    return 0;
}