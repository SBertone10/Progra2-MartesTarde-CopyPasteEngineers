public class PilaString implements PilaInterfaz{
    private static int max = 100;
    public String datos[];
    public int cantidad;

    public PilaString() {
    }

    @Override
    public void InicializarPila(){
        datos = new String [max];
        cantidad=0;

    }

    @Override
    public void Apilar(String x){
        if(cantidad < max){
            datos [cantidad] = x;
            cantidad = cantidad + 1;
        }

    }
    @Override
    public void Desapilar(){
        if (!PilaVacia()){
            
            cantidad = cantidad -1; //el proximo apilar va a sobreescribir cantidad

        }
    }

    @Override
    public String Tope(){
        return datos[cantidad -1];
    }

    @Override
    public boolean PilaVacia(){
        if (cantidad == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void MostrarPila(){        
        for(int i=0;i<cantidad;i++){
            System.out.println(datos[i]);
        }
    }
    
}