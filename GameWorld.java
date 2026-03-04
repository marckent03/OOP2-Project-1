public abstract class GameWorld {

    protected String worldName;

    public GameWorld(String worldName) {
        this.worldName = worldName;
    }

    public String getWorldName() {
        return worldName;
    }

    public abstract void enterWorld(Player player);
}