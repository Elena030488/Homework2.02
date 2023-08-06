public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int witchcraftPower, int apparitionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, witchcraftPower, apparitionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
    public int getWit() {
        return wit;
    }
    public void setWit(int wit) {
        this.wit = wit;
    }
    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public void printStudent() {
        super.printStudent();
        System.out.println(", Ум: " + getIntelligence() +
                ", Мудрость: " + getWisdom() +
                ", Остроумие: " + getWit() +
                ", Творчество: " + getCreativity());
    }
    public void bestRavenclawStudent(Ravenclaw ravenclaw) {
        int student1Power = this.getWitchcraftPower() + this.getApparitionDistance() + this.getIntelligence() + this.getWisdom() + this.getWit() + this.getCreativity();
        int student2Power = ravenclaw.getWitchcraftPower() + ravenclaw.getApparitionDistance() + ravenclaw.getIntelligence() + ravenclaw.getWisdom() + ravenclaw.getWit() + ravenclaw.getCreativity();
        if (student1Power > student2Power) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + ravenclaw.getName());
        } else if (student1Power < student2Power) {
            System.out.println(ravenclaw.getName() + " лучший Когтевранец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + ravenclaw.getName() + " равные по характеристикам ученики Когтеврана");
        }
    }
}
