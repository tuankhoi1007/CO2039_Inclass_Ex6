// Concrete Creator cho Saiyan
public class SaiyanFactory implements GachaFactory {
    @Override
    public AnimeCharacter rollCharacter() {
        return new Saiyan();
    }
}