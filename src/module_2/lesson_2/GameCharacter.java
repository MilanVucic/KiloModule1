package module_2.lesson_2;

public abstract class GameCharacter {
    private String name;
    private int health;

    public void takeDamage(int amount) {
        if (amount < 0) {
            return;
        }
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }

    public abstract void move(TerrainType terrainType);
}
