public class CancerWorld extends GameWorld {

    public CancerWorld() {
        super("Cancer World");
    }

    @Override
    public void enterWorld(Player player) {
        System.out.println(player.getName() + " entered Cancer World!");
        System.out.println("Emotional water challenges start!");
    }
}