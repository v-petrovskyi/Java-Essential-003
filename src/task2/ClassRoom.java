package task2;

public class ClassRoom {
    public ClassRoom(Pupil pupil){
        pupil.study();
        pupil.read();
        pupil.write();
        pupil.relax();
    }

    public static void main(String[] args) {
        System.out.println("Bad Pupil");
        ClassRoom bad = new ClassRoom(new BadPupil());
        System.out.println("Good Pupil");
        ClassRoom good = new ClassRoom(new GoodPupil());
        System.out.println("Excellent Pupil");
        ClassRoom excellent = new ClassRoom(new ExcellentPupil());
       }
}
