public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int witchcraftPower, int apparitionDistance, int nobility, int honor, int bravery) {
        super(name, witchcraftPower, apparitionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }
    public int getBravery() {
        return bravery;
    }
    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void printStudent() {
        super.printStudent();
        System.out.println(", Благородство: " + getNobility() +
                ", Честь: " + getHonor() +
                ", Храбрость: " + getBravery());
    }
    public void bestGriffindorStudent(Gryffindor gryffindor) {
        int student1Power = this.getWitchcraftPower() + this.getApparitionDistance() + this.getNobility() + this.getHonor() + this.getBravery();
        int student2Power = gryffindor.getWitchcraftPower() + gryffindor.getApparitionDistance() + gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBravery();
        if (student1Power > student2Power) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + gryffindor.getName());
        } else if (student1Power < student2Power) {
            System.out.println(gryffindor.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + gryffindor.getName() + " равны по характеристикам ученики Гриффиндора" );
        }
    }
}