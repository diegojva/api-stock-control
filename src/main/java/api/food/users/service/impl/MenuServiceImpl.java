package api.food.users.service.impl;

import api.food.users.model.Menu;
import api.food.users.repository.MenuRepository;
import api.food.users.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl  implements MenuService {

    @Autowired
    private MenuRepository repo;

    @Override
    public Menu save(Menu menu) {
        return null;
    }

    @Override
    public Menu update(Menu menu) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Menu findById(Integer id) {
        return null;
    }

    @Override
    public List<Menu> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Menu> getMenusByUsername(String username) {
        //String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return repo.getMenusByUsername(username);
    }


}
