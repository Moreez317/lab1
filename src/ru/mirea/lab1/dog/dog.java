package ru.mirea.lab1.dog;

public class dog {
    int AgeAtDogs;
    int AgeAtHumans;

    public void age(int a){
        AgeAtDogs = a;
        AgeAtHumans = a * 8;
    }

    @Override
    public String toString(){
        return AgeAtDogs+" in human age "+AgeAtHumans;
    }
}
