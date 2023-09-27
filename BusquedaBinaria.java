public class BusquedaBinaria {
    public static void main(String[] args) {

        //El arreglo tiene que estar ordenado 
        int[] miArreglo = {1,2,3,4,5,6};
        int[] miArreglo2 = {22,27,30,35,45,47};

        BusquedaBinaria(miArreglo2,45);
        BusquedaBinaria(miArreglo,10);
    }

    public static void BusquedaBinaria(int[] arregloOrdenado, int numeroBuscar){
        int menorIndice;
        int mayorIndice;
        int mitadIndiceArreglo=0;
        boolean centinela = false;
        menorIndice=0;
        mayorIndice=arregloOrdenado.length;

        while(menorIndice <= mayorIndice){
            mitadIndiceArreglo= (mayorIndice+menorIndice)/2;

            if(arregloOrdenado[mitadIndiceArreglo]==numeroBuscar){
                System.out.println("Se encontro el numero ");
                centinela = true;
                break;
            }
            if(arregloOrdenado[mitadIndiceArreglo] > numeroBuscar){
                mayorIndice = mitadIndiceArreglo - 1;
            }
            if(arregloOrdenado[mitadIndiceArreglo] < numeroBuscar){
                menorIndice = mitadIndiceArreglo + 1;
            }
        }

        if(centinela==true){
            System.out.println("El numero se encontro en la posicion "+mitadIndiceArreglo);
        }else{
            System.out.println("No encontro el numero");
        }
    }
}
