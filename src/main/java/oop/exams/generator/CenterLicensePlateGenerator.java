package oop.exams.generator;

public class CenterLicensePlateGenerator implements LicensePlateGenerator {
    private int contState;
    @Override
    public String generate(String state)
    {
        contState++;
        return state;

    }
}
