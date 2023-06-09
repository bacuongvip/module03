public class Main {
    private String name;
    private int age;

    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Main[] Mains = new Main[3];

        Mains[0] = new Main("Alice", 20);
        Mains[1] = new Main("Bob", 21);
        Mains[2] = new Main("Charlie", 19);

        for (Main e : Mains) {
            System.out.println("Name: " + e.getName());
            System.out.println("Age: " + e.getAge());
            System.out.println();
        }
    }
}
