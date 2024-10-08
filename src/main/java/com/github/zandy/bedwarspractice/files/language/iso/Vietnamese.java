package com.github.zandy.bedwarspractice.files.language.iso;

import com.github.zandy.bamboolib.utils.BambooFile;
import com.github.zandy.bedwarspractice.files.language.Language;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Vietnamese extends BambooFile {
    public Vietnamese() {
        super("Language_VN", "Languages");
        this.add(Language.MessagesEnum.PLUGIN_LANGUAGE_DISPLAY, "Vietnamese");
        this.add(Language.MessagesEnum.PLUGIN_NO_CONSOLE, "&cBạn không thể sử dụng lệnh này trong bảng điều khiển!");
        this.add(Language.MessagesEnum.PLUGIN_NO_PERMISSION, "&cBạn không có quyền sử dụng lệnh này!");
        this.add(Language.MessagesEnum.PLUGIN_LOBBY_NOT_SET, Arrays.asList("&4&lERROR! &cSảnh chưa được thiết lập!", "&7&lSử dụng: &f/bwpa setLobby"));
        this.add(Language.MessagesEnum.COMMAND_HEADER_DEFAULT, "        &f[&a&lBW Practice &8- &7Help&f]");
        this.add(Language.MessagesEnum.COMMAND_HEADER_ADMIN, "      &f[&a&lBW Practice Admin &8- &7Help&f]");
        this.add(Language.MessagesEnum.COMMAND_CLICK_TO_SUGGEST, "&7Click to suggest this command.");
        this.add(Language.MessagesEnum.COMMAND_CLICK_TO_RUN, "&7Nhấp để chạy lệnh.");
        this.add(Language.MessagesEnum.COMMAND_WRONG_USAGE, "&7Câu lệnh đã được sử dụng sai cách.");
        this.add(Language.MessagesEnum.COMMAND_NOT_AVAILABLE_IN_PRACTICE, "&cCâu lệnh này không có sẵn khi bạn đang trong chế độ Practice.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SET_LOBBY_SUCCEEDED, "&7Sảnh đã được đặt ở chỗ của bạn.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_DISPLAY_HEADER, "      &f[&a&lBW Practice &8- &7Tạo Schematic&f]");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_DISPLAY_CREATE, "&a⦁ &f/bwpa schem create &8- &7&oTạo schematics cho map practice");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_DISPLAY_LEAVE, "&a⦁ &f/bwpa schem leave &8- &7&oRời chế độ tạo schematic");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_DISPLAY_LOAD, "&a⦁ &f/bwpa schem load &8- &7&oLoad BedWars Practice schematic");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_DISPLAY_LIST, "&a⦁ &f/bwpa schem list &8- &7&oDanh sách với những schematic yêu cầu");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_DISPLAY_POS, "&a⦁ &f/bwpa schem pos &8- &7&oThiết lập góc của schematic");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_DISPLAY_SAVE, "&a⦁ &f/bwpa schem save &8- &7&oLưu schematic");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_CREATE_INFO_TELEPORTED, "&7Bạn đã được dịch chuyển đến thế giới để tạo schematic!");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_CREATE_INFO_TUTORIAL, Arrays.asList("&7Để taọ schematics cho Bedwars Practice; hãy xem hướng dẫn của plugin trên trang Spigot hoặc xem các video hướng dẫn trên Youtube.", "&7Đường dẫn đến SpigotMC: &f[spigotLink]", "&7Đường dẫn đến YouTube: &f[youtubeLink]"));
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_LOAD_USAGE, "&a⦁ &f/bwpa schem load <&aTên Schematic &f>");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_LOAD_LOADING, "&eĐang tải '&a[schemName]&e' schematic...");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_LOAD_LOADED_AND_PASTED, "&fSchematic đã được tải và dán ra &aThành công&f!");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_LOAD_FILE_NOT_FOUND, "&c&oSchematic '[schemName]' mà bạn đang muốn tải không tồn tại.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_LIST_REQUIRED_SCHEMATICS, "&7Các schematic dưới đây cần được tạo:");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_LIST_INFO, "&c&lNOTE! &7Tất cả các schematic được yêu cầu để chạy plugin này.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_LIST_ALL_CREATED, "&7Bạn đã tạo tất cả các schematic cần thiết.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_POS_SET, "Schematic đã được thiết lập &egóc [posNumber].");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_POS_WAND_RECEIVED, "Gậy thiết lập góc đã được để vào slot thứ nhất.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_SAVE_USAGE, Arrays.asList("&a⦁ &f/bwpa schem save <&aSchematic Name&f>", "&c&lCHÚ Ý!", "&7Tên của schematic phải là tên của scheamtic được yêu cầu.", "&7Để biết thêm chi tiết về những scheamtic cần thiết; sử dụng:", "&a⦁ &f/bwpa schem list"));
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_SAVE_WRONG_SCHEMATIC_NAME, Arrays.asList("&c&lSchematic có tên sai!", "&7Tên của schematic phải là tên của scheamtic được yêu cầu.", "&7Để biết thêm chi tiết về những scheamtic cần thiết; sử dụng:", "&a⦁ &f/bwpa schem list"));
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_SAVE_STARTED, "&eViệc lưu sẽ mất một chút thời gian. Hãy chờ đợi!");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_SAVE_SUCCESSFULLY, "&aBạn vừa lưu schematic có tên là &f&o'[schemName]'.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_LEAVE_SETUP_NOT_FINISHED, Arrays.asList("&cBạn đang trong quá trình thiết lập.", "&7Hủy bỏ nó bằng cách dùng: &f/bwpa setup quit"));
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_LEAVE_SUCCESSFULLY, Arrays.asList("&7Bạn vừa rời khu tạo schematic.", "Bạn đã được dịch chuyển về sảnh!"));
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_ALREADY_IN_SCHEMATIC_WORLD, "&cBạn đã ở trong thế giới để tạo schematic rồi.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_NOT_IN_SCHEMATIC_WORLD, Arrays.asList("&cHiện bạn đang không ở thế giới để tạo schematic.", "&7Để đến thế giới tạo schematic; sử dụng:", "&a⦁ &f/bwpa schem create"));
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SCHEMATIC_WRONG_SUBCOMMAND, "&cMệnh lệnh phụ tên &f'[subCommand]' &ckhông tồn tại.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_DISPLAY_HEADER, "      &f[&a&lBW Practice &8- &7Thiết lập Practice&f]");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_DISPLAY_SET, "&a⦁ &f/bwpa setup set &8- &7&oBắt đầu thiết lập trò chời Practice");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_DISPLAY_LIST, "&a⦁ &f/bwpa setup list &8- &7&oDanh sách các loại Practice cần thiết");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_DISPLAY_POS, "&a⦁ &f/bwpa setup pos &8- &7&oThiết lập góc kết thúc của Practice");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_DISPLAY_SAVE, "&a⦁ &f/bwpa setup save &8- &7&oLưu trận đấu Practice lại");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_DISPLAY_QUIT, "&a⦁ &f/bwpa setup quit &8- &7&oRời trạng thái thiết lập Practice");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_INVALID_SETUP_SESSION, Arrays.asList("&cBạn đang không trong trạng thái thiết lập!", "&7Để vào trạng thái thiết lập; sử dụng:", "&a⦁ &f/bwpa setup set <&aTên Practice&f>"));
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_LIST_ALL_CREATED, "&7Bạn đã tạo những thiết lập cần thiết.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_LIST_REQUIRED_SETUPS, "&7Những loại Practice dưới đấy cần được thiết lập:");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_LIST_INFO, "&c&lCHÚ Ý! &7Tất cả các loại Practice đều được yêu cầu thiết lập để chạy plugin.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_SET_USAGE, "&a⦁ &f/bwpa setup set <&aTên Practice&f>");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_SET_ALREADY_IN_SETUP, Arrays.asList("&cBạn đã thiết lập trận đấu Practice.", "Tên trận đấu: &7[Name]", "&7Nếu bạn muốn thoát trạng thái thiết lập; sử dụng: &f/bwpa setup quit"));
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_SET_WRONG_PRACTICE_NAME, Arrays.asList("&cTên loại Practice sai.", "&7Tên của các loại Practice có thể được tìm thấy bằng cách sử dụng:", "&a⦁ &f/bwpa setup list"));
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_SET_SCHEMATIC_NOT_FOUND, Arrays.asList("&cSchematic tên '&f[schemName]&c' không tìm thấy.", "&7Quay lại và tạo schematic với lệnh:", "&a⦁ &f/bwpa schem save"));
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_SET_LOADING_SCHEMATIC, "&eĐang tại schematic '&a[schemName]&e' .....");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_SET_SCHEMATIC_LOADED, "Schematic đã được tải &athành công&f!");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_SET_INFO_TUTORIAL, Arrays.asList("&7Để thiết lập; hãy xem hướng dẫn của plugin trên trang Spigot hoặc xem các video hướng dẫn trên Youtube.", "&7Đường dẫn đến SpigotMC: &f[spigotLink]", "&7Đường dẫn đến YouTube: &f[youtubeLink]"));
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_POS_SET_SUCCESSFULLY, "&7Bạn vừa thiết lập góc &f[posNumber] của &f[practiceName]'s .");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_POS_WAND_RECEIVED, "Gậy thiết lập góc đã được để vào slot thứ nhất.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_SAVE_POSITION_NOT_SET, Arrays.asList("&cGóc &f[posNumber] của Practice &cchưa được thiết lập!", "&7Thiết lập nó bằng cách sử dụng: &f/bwpa setup pos <&aSố thứ tự của góc&f>"));
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_SAVE_SUCCESSFULLY, "&fBạn đã lưu thành công trận đấu '&e[practiceName]&f' practice .");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_QUIT_NOT_IN_SETUP, "&cBạn không thể thoát quá trình thiết lập khi đang không có một quá trình thiết lập nào.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_QUIT_SUCCESSFULLY, Arrays.asList("&7Bạn đã rời quá trình thiết lập thành công!", "Bạn đã được dịch chuyển đến xưởng tạo schematic!"));
        this.add(Language.MessagesEnum.COMMAND_ADMIN_SETUP_WRONG_SUBCOMMAND, "&cMệnh lệnh phụ &f'[subCommand]' &ckhông tồn tại.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_BUILD_ENABLED, "&7Bây giờ bạn đã có thể xây dựng ở sảnh.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_BUILD_DISABLED, "&7Bây giờ bạn đã không thể xây dựng ở sảnh.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_NPC_SET_WRONG_USAGE, Arrays.asList("&7Sử dụng câu lệnh: &f/bwpa setNPC <&aLoại NPC&f>", "&7Những loại NPC có sẵn:", "&c➥ &fDefault &c&l[&e&lCLICK HERE&c&l]", "&c➥ &fBridging &c&l[&e&lCLICK HERE&c&l]", "&c➥ &fMLG &c&l[&e&lCLICK HERE&c&l]", "&c➥ &fFireball/TNT Jumping &c&l[&e&lCLICK HERE&c&l]"));
        this.add(Language.MessagesEnum.COMMAND_ADMIN_NPC_SET_CLICK_TO_APPLY, "&7Nhấp vào &lNPC Citizens &7mà bạn muốn dùng để làm NPC Practice.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_NPC_SET_ALREADY_EXISTS, "&cNPC mà bạn click đã được chọn làm từ trước.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_NPC_SET_ADDED, "&aNPC bạn chọn đã được chọn làm NPC Practice thành công.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_NPC_SET_TYPE_ADDED, "&7Loại NPC Practice: &a&l[practiceType]");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_NPC_DELETE_NO_NPCS_SET, "&7Hiện đang không có một NPC Practice nào được thiết lập.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_NPC_DELETE_CLICK_TO_DELETE, "&7Chọn một &lNPC Citizens &7đã được chọn là Practice NPC từ trước như mong muốn để xóa bỏ.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_NPC_DELETE_NOT_PRACTICE, "&cNPC bạn click không phải là Practice NPC.");
        this.add(Language.MessagesEnum.COMMAND_ADMIN_NPC_DELETE_DELETED, "&aNPC bạn chọn đã được chuyển về &lNPC Citizens bình thường &a.");
        this.add(Language.MessagesEnum.COMMAND_PLAYER_PRACTICE_USAGE, Arrays.asList("&7Các cách sử dụng sẵn có của &a/bwp&7:", "&a⦁ &f/bwp &8[&7Mở giao diện chọn mode&8]", "&a⦁ &f/bwp bridging &8[&7Tham gia chế độ đặt cầu&8]", "&a⦁ &f/bwp mlg &8[&7Tham gia chế độ MLG&8]", "&a⦁ &f/bwp fireballtntjumping &8[&7Tham gia chế độ nhảy bằng Fireball/TNT&8]", "&a⦁ &f/bwp spectate &8[&7Quan sát 1 người chơi&8]", "&a⦁ &f/bwp quit &7or &fleave &8[&7Rời khỏi trạng thái luyện tập&8]"));
        this.add(Language.MessagesEnum.COMMAND_PLAYER_MENU_SCHEMATICS_NOT_SET, Arrays.asList("&cCó một vài scheamtic bắt buộc bị thiếu!", "&7Để kiểm tra chúng; sử dụng:", "&a⦁ &f/bwpa schem list"));
        this.add(Language.MessagesEnum.COMMAND_PLAYER_MENU_CONFIGURATIONS_NOT_SET, Arrays.asList("&cCó một vài cấu hình bắt buộc bị thiếu!", "&7Để kiểm tra chúng; sử dụng:", "&a⦁ &f/bwpa setup list"));
        this.add(Language.MessagesEnum.COMMAND_PLAYER_QUIT, "&cBạn đang không trong trận đấu Practice!");
        this.add(Language.MessagesEnum.COMMAND_PLAYER_LANGUAGE_USAGE, Arrays.asList("&7Câu lệnh sử dụng sai cách! Sử dụng:", "&a⦁ &f/bwpl <&aKý tự viết tắt của ngôn ngữ&f>"));
        this.add(Language.MessagesEnum.COMMAND_PLAYER_LANGUAGE_NOT_FOUND, "&7Ngôn ngữ này không tìm thấy! Những ngôn ngữ sẵn có:");
        this.add(Language.MessagesEnum.COMMAND_PLAYER_LANGUAGE_CHANGED, "&7Đã đổi ngôn ngữ thành &f[languageName] &7[&e[languageAbbreviation]&7]!");
        this.add(Language.MessagesEnum.COMMAND_PLAYER_SPECTATE_WRONG_USAGE, Arrays.asList("&7Câu lệnh sử dụng sai cấch! Sử dụng:", "&a⦁ &f/bwp spectate <&aNgười chơi&f>"));
        this.add(Language.MessagesEnum.COMMAND_PLAYER_SPECTATE_TARGET_NULL, "&cNgười chơi tên &f[player_name] &cđang không online!");
        this.add(Language.MessagesEnum.COMMAND_PLAYER_SPECTATE_TARGET_NOT_IN_PRACTICE, "&cNgười chơi tên &f[player_name] &cđang không trong trạng thái luyện tập.");
        this.add(Language.MessagesEnum.COMMAND_PLAYER_SPECTATE_ALREADY_SPECTATING, "&cBạn đã và đang xem người chơi tên &f[player_name]&c!");
        this.add(Language.MessagesEnum.COMMAND_PLAYER_SPECTATE_IN_COOLDOWN, "&cBạn có thể theo dõi người chơi tiếp theo sau [seconds] giây!");
        this.add(Language.MessagesEnum.MODE_SELECTOR_ITEM_NAME, "&a&lChọn chế độ &7(Chuột phải)");
        this.add(Language.MessagesEnum.MODE_SELECTOR_ITEM_LORE, Arrays.asList("&7Chuột phải để mở menu", "&7chọn chế độ."));
        this.add(Language.MessagesEnum.MODE_SELECTOR_BRIDGING_LORE, Arrays.asList("&7Luyện tập đặt cầu qua", "&7khoảng không với len.", " ", "&eNhấp để chơi!"));
        this.add(Language.MessagesEnum.MODE_SELECTOR_MLG_LORE, Arrays.asList("&7Luyện tập phòng ngừa cú ngã", "&7gây sát thương với xô nước", "&7và thang leo", " ", "&eNhấp để chơi!"));
        this.add(Language.MessagesEnum.MODE_SELECTOR_FIREBALL_TNT_JUMPING_LORE, Arrays.asList("&7Luyện tập nhảy qua", "&7khoảng không bằng cách sử dụng Quả cầu lửa và", "&7TNT.", " ", "&eNhấp để chơi!"));
        this.add(Language.MessagesEnum.MODE_SELECTOR_GO_BACK_NAME, "&aQuay lại");
        this.add(Language.MessagesEnum.MODE_SELECTOR_GO_BACK_LORE, Collections.singletonList("&7Về Chơi Bed Wars"));
        this.add(Language.MessagesEnum.MODE_SELECTOR_CLOSE_NAME, "&cĐóng");
        this.add(Language.MessagesEnum.MODE_SELECTOR_RETURN_TO_LOBBY_NAME, "&cQuay chở về sảnh");
        this.add(Language.MessagesEnum.MODE_SELECTOR_ALREADY_SELECTED, "&cBạn đã chọn chế độ luyện tập này rồi!");
        this.add(Language.MessagesEnum.MODE_SELECTOR_COOLDOWN, "&cBạn có thể chọn chế độ mỗi [seconds] giây!");
        this.add(Language.MessagesEnum.GAME_SETTINGS_ITEM_NAME, "&a&lCài đặt &7(Right Click)");
        this.add(Language.MessagesEnum.GAME_SETTINGS_ITEM_LORE, Arrays.asList("&7Chuột phải để mở menu", "&7cài đặt của chế độ.", "&7Thay đổi cài đặt của chế độ", "&7cho phép nhiều loại", "&7bài tập thực hành và", "&7mức độ khó của", "&7độ khó."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_WRONG_SLOTS_NUMBER, Arrays.asList("&cGiao diện cài đặt game có một số thứ tự ô bất hợp lý.", "&7Những ô với số thứ tự được cho phép: &8[&f9&7; &f18&7; &f27&7; &f36&7; &f45&7; &f54&8]"));
        this.add(Language.MessagesEnum.GAME_SETTINGS_WRONG_SLOTS_ITEM, Arrays.asList("&cGiao diện cài đặt game có số ô bất hợp lý", "&7Số ô tối đa: &8[&f[inventorySlots]&8]"));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_TITLE, "Cài đặt đặt cầu");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_BLOCKS_30_NAME, "&a30 Khối");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_BLOCKS_30_LORE, Arrays.asList("&7Hoàn thành đặt cầu đến nơi", "&7cách đến 30 khối"));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_BLOCKS_50_NAME, "&a50 Khối");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_BLOCKS_50_LORE, Arrays.asList("&7Hoàn thành đặt cầu đến nơi", "&7cách đến 50 khối"));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_BLOCKS_100_NAME, "&a100 Khối");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_BLOCKS_100_LORE, Arrays.asList("&7Hoàn thành đặt cầu đến nơi", "&7cách đến 100 khối"));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_BLOCKS_INFINITE_NAME, "&aVô tận!");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_BLOCKS_INFINITE_LORE, Arrays.asList("&7Không có kết thúc của đảo", "&7và xem bạn có thể đặt bao xa."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_LEVEL_NONE_NAME, "&aMặc định");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_LEVEL_NONE_LORE, Arrays.asList("&7Đặt mức độ cao của", "&7nơi hoàn thành đảo về", "&7mặc định."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_LEVEL_SLIGHT_NAME, "&aCao hơn 1 chút");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_LEVEL_SLIGHT_LORE, Arrays.asList("&7Đặt mức độ cao của", "&7nơi hoàn thành đảo lên", "&7cao hơn 1 chút."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_LEVEL_STAIRCASE_NAME, "&aRất cao");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_LEVEL_STAIRCASE_LORE, Arrays.asList("&7Đặt mức độ cao của", "&7nơi hoàn thành đảo lên", "&7rất cao."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_ANGLE_STRAIGHT_NAME, "&aThẳng");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_ANGLE_STRAIGHT_LORE, Arrays.asList("&7Đặt góc của nơi", "&7hoàn thành đảo theo hướng", "&7thẳng."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_ANGLE_DIAGONAL_NAME, "&aChéo");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_BRIDGING_ANGLE_DIAGONAL_LORE, Arrays.asList("&7Đặt góc của nơi", "&7hoàn thành đảo theo hướng", "&7chéo."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_TITLE, "Cài đặt MLG");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_SIZE_LARGE_NAME, "&aKích cỡ bề mặt tiếp xúc: Lớn");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_SIZE_LARGE_LORE, Arrays.asList("&7Kích cỡ bề mặt tiếp xúc sẽ là 5x5", "&7khối."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_SIZE_MEDIUM_NAME, "&aKích cỡ bề mặt tiếp xúc: Medium");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_SIZE_MEDIUM_LORE, Arrays.asList("&7Kích cỡ bề mặt tiếp xúc sẽ là 3x3", "&7khối."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_SIZE_SMALL_NAME, "&aKích cỡ bề mặt tiếp xúc: Small");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_SIZE_SMALL_LORE, Arrays.asList("&7Kích cỡ bề mặt tiếp xúc sẽ là 1", "&7khối duy nhất."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_HEIGHT_HIGH_NAME, "&aĐộ cao với bề mặt tiếp xúc: Cao");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_HEIGHT_HIGH_LORE, Arrays.asList("&7Độ cao với bề mặt tiếp xúc sẽ", "&7cao lên; nên bạn sẽ chỉ", "&7rơi xuống một chút khoảng cách."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_HEIGHT_MEDIUM_NAME, "&aPlatform Height: Trung bình");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_HEIGHT_MEDIUM_LORE, Arrays.asList("&7Độ cao với bề mặt tiếp xúc sẽ", "&7cao lên; nên bạn sẽ", "&7rơi xuống xa hơn."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_HEIGHT_LOW_NAME, "&aPlatform Height: Thấp");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_HEIGHT_LOW_LORE, Arrays.asList("&7Độ cao với bề mặt tiếp xúc sẽ", "&7cao lên; nên bạn sẽ", "&7rơi xuống rất xa."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_POSITION_CENTERED_NAME, "&aVị trí của bề mặt tiếp xúc: Luôn ở trung tâm");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_POSITION_CENTERED_LORE, Arrays.asList("&7Vị trí của bề mặt tiếp xúc sẽ luôn được", "&7đặt ở phía trước đảo của", "&7bạn."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_POSITION_RANDOM_NAME, "&aVị trí của bề mặt tiếp xúc: Ngẫu nhiên");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_POSITION_RANDOM_LORE, Arrays.asList("&7Vị trí của bề mặt tiếp xúc sẽ được đặt", "&7ngẫu nhiên."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_TALLNESS_1_BLOCKS_NAME, "&aĐộ dày của bề mặt tiếp xúc: 1 Khối");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_TALLNESS_1_BLOCKS_LORE, Arrays.asList("&7Đặt độ dài của bề mặt tiếp xúc cao", "&71 khối.", " ", "&7Hữu ích khi cố gắng bám vào", "&7bề mặt tiếp xúc."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_TALLNESS_2_BLOCKS_NAME, "&aĐộ dày của bề mặt tiếp xúc: 2 Blocks");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_TALLNESS_2_BLOCKS_LORE, Arrays.asList("&7Đặt độ dài của bề mặt tiếp xúc cao", "&72 khối.", " ", "&7Hữu ích khi cố gắng bám vào", "&7bề mặt tiếp xúc."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_TALLNESS_3_BLOCKS_NAME, "&aĐộ dày của bề mặt tiếp xúc: 3 Blocks");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_TALLNESS_3_BLOCKS_LORE, Arrays.asList("&7Đặt độ dài của bề mặt tiếp xúc cao", "&73 khối.", " ", "&7Hữu ích khi cố gắng bám vào", "&7bề mặt tiếp xúc."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_ITEM_WATER_BUCKET_NAME, "&aVật phẩm: Xô nước");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_ITEM_WATER_BUCKET_LORE, Arrays.asList("&7Đặt xô nước trên mặt", "&7đất."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_ITEM_LADDER_NAME, "&aVật phẩm: Thang leo");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_ITEM_LADDER_LORE, Arrays.asList("&7Đặt thang leo vào mặt đối diện.", "&7của block."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_SHUFFLE_NONE_NAME, "&aKhông thay đổi vị trí vật phẩm.");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_SHUFFLE_SHUFFLED_NAME, "&aXáo trộn vị trí vật phẩm.");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_MLG_SHUFFLE_SHUFFLED_LORE, Arrays.asList("&7Xáo trộn vật phẩm", "&7của bạn sau khi nhảy xuống. Việc này", "&7yêu cầu bạn cần nhanh tay", "&7đổi slot của bạn để", "&7sử dụng vật phẩm."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_FIREBALL_TNT_JUMPING_TITLE, "Cài đặt");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_FIREBALL_TNT_JUMPING_ITEMS_1_NAME, "&a1 Vật phẩm");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_FIREBALL_TNT_JUMPING_ITEMS_1_LORE, Arrays.asList("&7Bắt đầu với một vật phẩm", "&7đã chọn."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_FIREBALL_TNT_JUMPING_ITEMS_2_NAME, "&a2 Vật phẩm");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_FIREBALL_TNT_JUMPING_ITEMS_2_LORE, Arrays.asList("&7Bắt đầu với hai vật phẩm", "&7đã chọn."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_FIREBALL_TNT_JUMPING_ITEMS_5_NAME, "&a5 Vật phẩm");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_FIREBALL_TNT_JUMPING_ITEMS_5_LORE, Arrays.asList("&7Bắt đầu với năm vật phẩm", "&7đã chọn."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_FIREBALL_TNT_JUMPING_ITEM_FIREBALL_NAME, "&aQuả cầu lửa");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_FIREBALL_TNT_JUMPING_ITEM_FIREBALL_LORE, Collections.singletonList("&7Bạn sẽ bắt đầu với quả cầu lửa."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_FIREBALL_TNT_JUMPING_ITEM_TNT_NAME, "&aTNT");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_FIREBALL_TNT_JUMPING_ITEM_TNT_LORE, Collections.singletonList("&7Bạn sẽ bắt đầu với TNT."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_FIREBALL_TNT_JUMPING_WOOL_DISABLE_NAME, "&cTắt khối len");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_FIREBALL_TNT_JUMPING_WOOL_DISABLE_LORE, Collections.singletonList("&7Bạn sẽ bắt đầu với không khối len."));
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_FIREBALL_TNT_JUMPING_WOOL_ENABLE_NAME, "&aBật khối len");
        this.add(Language.MessagesEnum.GAME_SETTINGS_GUI_FIREBALL_TNT_JUMPING_WOOL_ENABLE_LORE, Arrays.asList("&7Bạn sẽ bắt đầu với 32 khối", "&7len.", " ", "&7Khối len không thể được đặt quá", "&72 khối từ rìa của bề mặt tiếp xúc."));
        this.add(Language.MessagesEnum.GAME_FAILED, "&cThất bại!");
        this.add(Language.MessagesEnum.GAME_SUCCESSFUL, "&aThành công!");
        this.add(Language.MessagesEnum.GAME_BLOCK_NOT_PLACEABLE, "&cBạn không thể đặt khối ở đây!");
        this.add(Language.MessagesEnum.GAME_UPDATED_YOUR_SETTINGS, "&aĐã cập nhật cài đặt của bạn.");
        this.add(Language.MessagesEnum.GAME_SCOREBOARD_BRIDGING_DEFAULT_LINES, Arrays.asList("&7[month]/[day]/[year]", " ", "Chế độ: &a[game_mode]", " ", "Tốc dộ: &a[average_speed] m/s", " ", "Kỷ lục: &a[personal_best]", " ", "&emc.yourserver.org"));
        this.add(Language.MessagesEnum.GAME_SCOREBOARD_BRIDGING_INFINITE_LINES, Arrays.asList("&7[month]/[day]/[year]", " ", "Chế độ: &a[game_mode]", " ", "Tốc độ: &a[average_speed] m/s", " ", "Kỷ lục: &a[blocks_placed]", " ", "&emc.yourserver.org"));
        this.add(Language.MessagesEnum.GAME_SCOREBOARD_MLG_LINES, Arrays.asList("&7[month]/[day]/[year]", " ", "Chế độ: &a[game_mode]", " ", "&emc.yourserver.org"));
        this.add(Language.MessagesEnum.GAME_SCOREBOARD_FIREBALL_TNT_JUMPING_LINES, Arrays.asList("&7[month]/[day]/[year]", " ", "Chế độ: &a[game_mode]", "Nhảy xa nhất: &a[longest_jump] Khối", " ", "&emc.yourserver.org"));
        this.add(Language.MessagesEnum.GAME_SCOREBOARD_PERSONAL_BEST_NONE, "&cKhông có!");
        this.add(Language.MessagesEnum.GAME_BRIDGING_ACTION_BAR_START_TIMER, "&6&lĐặt khối để bắt đầu!");
        this.add(Language.MessagesEnum.GAME_BRIDGING_FINISHED_MESSAGE, "&aHoàn thành! Tốn [seconds] giây.");
        this.add(Language.MessagesEnum.GAME_BRIDGING_FINISHED_TITLE, "&a[seconds] giây");
        this.add(Language.MessagesEnum.GAME_BRIDGING_FINISHED_INFINITE_MESSAGE, "&aTốn [seconds] giây; với [blocks_placed] khối đã đặt được!");
        this.add(Language.MessagesEnum.GAME_MLG_ITEM_NAME_WATER, "&aĐặt nước trước khi tiếp đất.");
        this.add(Language.MessagesEnum.GAME_MLG_ITEM_NAME_LADDER, "&aĐặt thang leo và bám vào nó ở hướng đối diện của block.");
        this.add(Language.MessagesEnum.GAME_MLG_ACTION_BAR, "&6&lChạm vào khối vàng với không sát thương.");
        this.add(Language.MessagesEnum.GAME_FIREBALL_TNT_JUMPING_FINISHED_MESSAGE, "&aThành công! [blocks] khối!");
        this.add(Language.MessagesEnum.GAME_FIREBALL_TNT_JUMPING_ACTION_BAR, "&6&lSử dụng vật phẩm để nhảy một cách xa nhất!");
        this.add(Language.MessagesEnum.TABLIST_HEADER, List.of("&bBạn đang chơi ở máy chủ &e&lMC.YOURSERVER.NET"));
        this.add(Language.MessagesEnum.TABLIST_FOOTER, List.of("&aRanks; Boosters & Nhiều nữa! &c&lSTORE.YOURSERVER.NET"));
        this.add(Language.MessagesEnum.SPECTATE_SPECTATING, Arrays.asList("&7Đang theo dõi &f[player_name]&7:", "&7Chế độ hiện tại: &f[practice_mode]", "&7Cài đặt: &f[current_settings]"));
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_CHANGED, Arrays.asList("&f[player_name] &7đã thay đổi cài đặt Practice:", "&7Chế độ hiện tại: &f[practice_mode]", "&7Cài đặt: &f[current_settings]"));
        this.add(Language.MessagesEnum.SPECTATE_PRACTICE_MODE_CHANGED, Arrays.asList("&f[player_name] &7đã đội chế độ practice thành &f[practice_mode]", "&7Cài đặt: &f[current_settings]"));
        this.add(Language.MessagesEnum.SPECTATE_TITLE, "&aĐang theo dõi");
        this.add(Language.MessagesEnum.SPECTATE_PLAYER_QUIT, "&7Người chơi bạn theo dõi đã thoát ra.");
        this.add(Language.MessagesEnum.SPECTATE_QUIT, "&7Bạn vừa bỏ theo dõi người chơi tên &f[player_name]&7.");
        this.add(Language.MessagesEnum.SPECTATE_GAMEMODE_NOT_CHANGEABLE, "&cBạn không thể thay đổi chế độ chơi khi bạn đang theo dõi người khác.");
        this.add(Language.MessagesEnum.SPECTATE_NOT_SPECTATING, "&cBạn đang không theo dõi người nào cả.");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_BRIDGING_BLOCKS, "&f[block_number] Khối");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_BRIDGING_ANGLE, "&fHướng [angle_type]");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_BRIDGING_ELEVATION, "&f[elevation_type] Độ cao");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_MLG_SIZE, "&fKích cỡ [size_type]");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_MLG_HEIGHT, "&fĐộ cao [height_type]");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_MLG_POSITION, "&fVị trí [position_type]");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_MLG_TALLNESS, "&fĐộ dày [tallness_type]");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_FIREBALL_TNT_JUMPING_WOOL, "&fKhối len [wool_type]");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_BRIDGING_BLOCKS_INFINITE, "Vô tận");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_BRIDGING_ANGLE_STRAIGHT, "Thẳng");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_BRIDGING_ANGLE_DIAGONAL, "Chéo");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_BRIDGING_ELEVATION_NONE, "Mặc định");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_BRIDGING_ELEVATION_SLIGHT, "Hơi cao");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_BRIDGING_ELEVATION_STAIRCASE, "Rất cao");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_MLG_SIZE_LARGE, "Rộng");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_MLG_SIZE_MEDIUM, "Vừa");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_MLG_SIZE_SMALL, "Nhỏ");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_MLG_HEIGHT_HIGH, "Cao");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_MLG_HEIGHT_MEDIUM, "Bình thường");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_MLG_HEIGHT_LOW, "Thấp");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_MLG_POSITION_CENTER, "Trung tâm");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_MLG_POSITION_RANDOM, "Ngẫu nhiên");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_FIREBALL_TNT_JUMPING_ITEM_FIREBALL_SINGULAR, "Cầu lửa");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_FIREBALL_TNT_JUMPING_ITEM_FIREBALL_PLURAL, "Những quả cầu lửa");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_FIREBALL_TNT_JUMPING_ITEM_TNT_SINGULAR, "TNT");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_FIREBALL_TNT_JUMPING_ITEM_TNT_PLURAL, "Những quả TNT");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_FIREBALL_TNT_JUMPING_WOOL_ENABLED, "Bật");
        this.add(Language.MessagesEnum.SPECTATE_SETTINGS_DISPLAY_FIREBALL_TNT_JUMPING_WOOL_DISABLED, "Tắt");
        this.add(Language.MessagesEnum.SPECTATE_SPECTATING_AREA_NOT_LEAVEABLE, "&cBạn không thể rời khỏi khu vực theo dõi.");
        this.add(Language.MessagesEnum.NPC_HOLOGRAM_DEFAULT, Arrays.asList("&e&lCLICK TO PLAY", "&bPractice &7[0.1]", "&e&l[practice_player] Players"));
        this.add(Language.MessagesEnum.NPC_HOLOGRAM_BRIDGING, Arrays.asList("&aBRIDGING", "&e&lCLICK TO PLAY", "&bPractice &7[0.1]", "&e&l[bridging_player] Players"));
        this.add(Language.MessagesEnum.NPC_HOLOGRAM_MLG, Arrays.asList("&aMLG", "&e&lCLICK TO PLAY", "&bPractice &7[0.1]", "&e&l[mlg_player] Players"));
        this.add(Language.MessagesEnum.NPC_HOLOGRAM_FIREBALL_TNT_JUMPING, Arrays.asList("&aFIREBALL/TNT JUMPING", "&e&lCLICK TO PLAY", "&bPractice &7[0.1]", "&e&l[fireball_tnt_jumping_player] Players"));
        this.copyDefaults();
        this.save();
    }

    private void add(Language.MessagesEnum message, Object object) {
        this.addDefault(message.getPath(), object);
    }
}
