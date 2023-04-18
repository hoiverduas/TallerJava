public class MayorEdad {

    private  int edad ;


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void esMayor(){
        if (this.edad >= 18){
            System.out.println("Usted es mayor de edad : " + edad);
        }
        else {
            System.out.println("Usted es menor de edad : " + edad);
        }
    }

}
