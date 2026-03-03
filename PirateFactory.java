// Concrete Creator cho Pirate
public class PirateFactory implements GachaFactory {
    @Override
    public AnimeCharacter rollCharacter() {
        return new Pirate();
    }
}