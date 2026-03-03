public class Main {
    public static void main(String[] args) {
        System.out.println("=== ANIME GACHA ROLL ===");

        // Hệ thống random hoặc người chơi chọn banner Ninja
        GachaFactory ninjaBanner = new NinjaFactory();
        AnimeCharacter char1 = ninjaBanner.rollCharacter();
        char1.useUltimateSkill(); 

        // Quay banner Saiyan
        GachaFactory saiyanBanner = new SaiyanFactory();
        AnimeCharacter char2 = saiyanBanner.rollCharacter();
        char2.useUltimateSkill();

        // Bản cập nhật mới ra mắt: Quay banner Shinigami (Hoạt động trơn tru cùng hệ thống cũ)
        System.out.println("\n--- Bản cập nhật 1.1: Ra mắt Shinigami ---");
        GachaFactory shinigamiBanner = new ShinigamiFactory();
        AnimeCharacter char3 = shinigamiBanner.rollCharacter();
        char3.useUltimateSkill();
    }
}