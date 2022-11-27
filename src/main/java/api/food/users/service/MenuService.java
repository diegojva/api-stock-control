package api.food.users.service;

import api.food.users.model.Menu;

import java.util.List;

public interface MenuService {

    Menu save(Menu menu);
    Menu update(Menu menu);
    void delete(Integer id);
    Menu findById(Integer id);

    List<Menu> findAll();
    List<Menu> getMenusByUsername(String username);
}
