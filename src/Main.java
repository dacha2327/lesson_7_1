public class Main {
    public static void main(String[] args) {
        Magic magic =new Magic(23, 23 , "jh");
        Warrior warrior= new Warrior(45, 45 , "jnj");
        Medic medic=new Medic(56,56, 20, "kmkm");
        Hero[] heroes = {medic,warrior,magic};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            System.out.println(heroes[i].info());
            if (heroes[i] == medic){
                System.out.println(medic.increaseExperience());
            }

        }
    }
}