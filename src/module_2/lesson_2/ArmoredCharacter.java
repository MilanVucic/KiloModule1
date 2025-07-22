package module_2.lesson_2;

public abstract class ArmoredCharacter extends GameCharacter {
    private int armorAmount;

    @Override
    public void takeDamage(int a) {
        super.takeDamage(a - armorAmount);
    }
}
