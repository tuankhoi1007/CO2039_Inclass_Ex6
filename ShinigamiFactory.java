public class ShinigamiFactory implements GachaFactory {
    @Override
    public AnimeCharacter rollCharacter() {
        return new Shinigami();
    }
}