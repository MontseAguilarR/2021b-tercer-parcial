package oop.exams.generator;

import oop.exams.exception.BadRegionException;

public interface LicensePlateGenerator{

    String generate(String state);
}
