public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 80, 100, 80, 80, 90);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 85, 100, 85, 85, 85);
        Gryffindor ronaldWeasley = new Gryffindor("Рон Уизли", 60,70,60,70,70);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 70, 80, 85, 80, 85, 85, 85);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 60, 60, 70, 60, 85, 70, 70);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 50, 30, 40, 70, 50, 65, 60);
        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 60, 70, 75, 70, 70);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 85, 100, 90, 80, 90);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 70, 60, 75, 75, 80);
        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг", 60, 70, 75, 70, 60, 65);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 70, 75, 80, 75, 80, 75);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 60, 70, 70, 70, 60, 70);
        harryPotter.printStudent();
        hermioneGranger.printStudent();
        padmaPatil.printStudent();
        harryPotter.bestStudent(hermioneGranger);
        harryPotter.bestStudent(cedricDiggory);
        dracoMalfoy.bestStudent(harryPotter);
        ronaldWeasley.bestGriffindorStudent(hermioneGranger);
        cedricDiggory.bestHufflepuffStudent(justinFinchFletchley);
        choChang.bestRavenclawStudent(marcusBelby);
        dracoMalfoy.bestSlytherinStudent(grahamMontague);
    }
}
