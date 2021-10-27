package kitchenpos.integration.menu;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import kitchenpos.domain.MenuGroup;
import kitchenpos.integration.IntegrationTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class MenuGroupServiceIntegrationTest extends IntegrationTest {

    @DisplayName("메뉴 그룹을 등록한다.")
    @Nested
    class Create {

        @DisplayName("메뉴 그룹을 등록할 수 있다.")
        @Test
        void create_Valid_Success() {
            // given
            MenuGroup menuGroup = new MenuGroup();
            menuGroup.setName("시즌 메뉴");

            // when
            MenuGroup savedMenuGroup = menuGroupService.create(menuGroup);

            // then
            assertThat(savedMenuGroup)
                .usingRecursiveComparison()
                .ignoringFields("id")
                .isEqualTo(menuGroup);
        }
    }

    @DisplayName("메뉴 그룹의 목록을 조회한다.")
    @Nested
    class Read {

        @DisplayName("메뉴 그룹의 목록을 조회할 수 있다.")
        @Test
        void list_Valid_Success() {
            // given
            MenuGroup menuGroup = new MenuGroup();
            menuGroup.setName("시즌 메뉴");

            MenuGroup savedMenuGroup = menuGroupService.create(menuGroup);

            // when
            List<MenuGroup> menuGroups = menuGroupService.list();

            // then
            assertThat(menuGroups).hasSize(5);
            assertThat(menuGroups.get(4))
                .usingRecursiveComparison()
                .isEqualTo(savedMenuGroup);
        }
    }
}
