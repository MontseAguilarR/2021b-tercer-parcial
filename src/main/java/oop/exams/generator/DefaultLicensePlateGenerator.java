package oop.exams.generator;

public class DefaultLicensePlateGenerator implements LicensePlateGenerator{

     private String state;
    @Override
    public String generate(String state) {
        return state;
    }
    public void nPlacas(int state){
        if(state != 5)
        {
            System.out.println("No hay más placas disponibles");
        }
    }
}
