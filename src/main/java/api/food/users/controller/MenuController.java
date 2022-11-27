package api.food.users.controller;

import api.food.users.dto.MenuDto;
import api.food.users.model.Menu;
import api.food.users.service.MenuService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenuController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private MenuService service;

    @GetMapping
    public ResponseEntity<List<MenuDto>> getAllMenus() throws Exception{
        List<Menu> menus = service.findAll();
        List<MenuDto> menusDTO = modelMapper.map(menus, new TypeToken<List<MenuDto>>() {}.getType());
        return new ResponseEntity<>(menusDTO, HttpStatus.OK);
    }

    //@GetMapping("/user")
    @PostMapping("/user")
    public ResponseEntity<List<MenuDto>> getMenusByUser(@RequestBody String username) throws Exception{
        List<Menu> menus = service.getMenusByUsername(username);
        List<MenuDto> menusDTO = modelMapper.map(menus, new TypeToken<List<MenuDto>>() {}.getType());
        return new ResponseEntity<>(menusDTO, HttpStatus.OK);
    }


}
