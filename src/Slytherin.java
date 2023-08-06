public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int ambitionchcraftPower, int apparitionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, ambitionchcraftPower, apparitionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }
    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }
    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    public void printStudent() {
        super.printStudent();
        System.out.println(", Хитрость: " + getCunning() +
                ", Решительность: " + getDetermination() +
                ", Амбициозность: " + getAmbition() +
                ", Находчивость: " + getResourcefulness() +
                ", Жажда власти: " + getLustForPower());
    }
    public void bestSlytherinStudent(Slytherin slytherin) {
        int student1Power = this.getWitchcraftPower() + this.getApparitionDistance() + this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getLustForPower();
        int student2Power = slytherin.getWitchcraftPower() + slytherin.getApparitionDistance() + slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getLustForPower();
        if (student1Power > student2Power) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + slytherin.getName());
        } else if (student1Power < student2Power) {
            System.out.println(slytherin.getName() + " лучший Слизеринец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + slytherin.getName() + " равные по характеристикам ученики Слизерина");
        }
    }
}
