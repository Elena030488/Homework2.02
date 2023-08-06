public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int honesty;
    private int loyalty;

    public Hufflepuff(String name, int witchcraftPower, int apparitionDistance, int diligence, int honesty, int loyalty) {
        super(name, witchcraftPower, apparitionDistance);
        this.diligence = diligence;
        this.honesty = honesty;
        this.loyalty = loyalty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }
    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public int getLoyalty() {
        return loyalty;
    }
    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }
    public void printStudent() {
        super.printStudent();
        System.out.println(", Трудолюбие: " + getDiligence() +
                ", Верность: " + getLoyalty() +
                ", Честность: " + getHonesty());
    }
    public void bestHufflepuffStudent(Hufflepuff hufflepuff) {
        int student1Power = this.getWitchcraftPower() + this.getApparitionDistance() + this.getDiligence() + this.getHonesty() + this.getLoyalty();
        int student2Power = hufflepuff.getWitchcraftPower() + hufflepuff.getApparitionDistance() + hufflepuff.getDiligence() + hufflepuff.getHonesty() + hufflepuff.getLoyalty();
        if (student1Power > student2Power) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + hufflepuff.getName());
        } else if (student1Power < student2Power) {
            System.out.println(hufflepuff.getName() + " лучший Пуффендуец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + hufflepuff.getName() + " равные по характеристикам ученики Пуффендуя" );
        }
    }
}
