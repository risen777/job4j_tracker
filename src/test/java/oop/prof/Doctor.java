package oop.prof;

/**
 * Created by Sergey
 */
public class Doctor extends Profession {
    Diagnose diagnose = new Diagnose();
    public Diagnose heal(Pacient pacient) {

        return diagnose;
    }

    @Override
    public int getName() {
        return super.getName();
    }

    @Override
    public int getSurname() {
        return super.getSurname();
    }

    @Override
    public int getEducation() {
        return super.getEducation();
    }

    @Override
    public int getBirthday() {
        return super.getBirthday();
    }
}
