public class SagittariusWorld extends GameWorld {

    public SagittariusWorld() {
        super("Sagittarius World");
    }

    @Override
    public void enterWorld(Player player) {
        System.out.println(player.getName() + " entered Sagittarius World!");
        System.out.println("Adventure begins!");
    }
}