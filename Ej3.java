public class Ej3{
    public static void main(String[] args) {
        PilaString balanceo = new PilaString();
        balanceo.InicializarPila();
        String expresion = "((a*b)+c)";
        String [] simbolos = expresion.split("");
        for (String simbolo : simbolos) {
            if("(".equals(simbolo)){
                balanceo.Apilar(simbolo);
            }
            else if (")".equals(simbolo)){
                balanceo.Desapilar();
            }
            
        }
        if(balanceo.PilaVacia()){
            System.out.println("Los parentesis de la expresion estan balanceados");
        }
        else{
            System.out.println("Los parentesis NO estan balanceados");
        }
    }
}