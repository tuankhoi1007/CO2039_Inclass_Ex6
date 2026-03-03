// Concrete Creator cho Ninja
public class NinjaFactory implements GachaFactory {
    @Override
    public AnimeCharacter rollCharacter() {
        return new Ninja();
    }
}