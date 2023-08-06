public abstract class Hogwarts {
    private String name;
    private int witchcraftPower;
    private int apparitionDistance;

    public Hogwarts(String name, int witchcraftPower, int apparitionDistance) {
        this.name = name;
        this.witchcraftPower = witchcraftPower;
        this.apparitionDistance = apparitionDistance;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWitchcraftPower() {
        return witchcraftPower;
    }

    public void setWitchcraftPower(int witchcraftPower) {
        this.witchcraftPower = witchcraftPower;
    }
    public int getApparitionDistance() {
        return apparitionDistance;
    }

    public void setApparitionDistance(int apparitionDistance) {
        this.apparitionDistance = apparitionDistance;
    }

    public void printStudent() {
        System.out.print("Имя: " + getName() +
                ", Мощность магии: "+ getWitchcraftPower() +
                ", Расстояние трансгресси: " + getApparitionDistance());
    }
    public void bestStudent(Hogwarts hogwarts) {
        int student1Power = this.getWitchcraftPower() + this.getApparitionDistance();
        int student2Power = hogwarts.getWitchcraftPower() + hogwarts.getApparitionDistance();
        if (student1Power > student2Power) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + hogwarts.getName());
        } else if (student1Power < student2Power) {
            System.out.println(hogwarts.getName() + " обладает большей мощностью магии, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + hogwarts.getName() + " равны по мощности магии");
        }
    }
}
