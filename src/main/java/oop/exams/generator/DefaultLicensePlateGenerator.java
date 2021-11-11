package oop.exams.generator;

public class DefaultLicensePlateGenerator implements LicensePlateGenerator{

     private String contState;
    @Override
    public String generate(String state) {
        contState++;
        return state;
    }
    public void nPlacas(){
        if(contState != 5)
        {
            System.out.println("No hay más placas disponibles");
        }
    }
}
