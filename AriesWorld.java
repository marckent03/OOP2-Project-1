public class AriesWorld extends GameWorld {

    public AriesWorld() {
        super("Aries World");
    }

    @Override
    public void enterWorld(Player player) {
        System.out.println(player.getName() + " entered Aries World!");
        System.out.println("Fire battle initiated!");
    }
}