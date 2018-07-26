package com.javabrazzers.controller;

import com.javabrazzers.domain.User;
import com.javabrazzers.repository.UserRepository;
import com.javabrazzers.service.UserService;
import jdk.internal.jline.internal.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/index")
public class MainController {

    private static final Logger LOG = LoggerFactory.getLogger(MainController.class);

//    @Autowired
//    private UserRepository userRepo;

    @Autowired
    private UserService userService;

    // ЭТО ТО, КАК ДЕЛАЛ ДРЮ
//    public List<Map<String,String>> messages = new ArrayList<Map<String, String>>() {{
//        add(new HashMap<String,String>() {{put("id", "1"); put("text", "First"); }});
//        add(new HashMap<String,String>() {{put("id", "2"); put("text", "Second"); }});
//        add(new HashMap<String,String>() {{put("id", "3"); put("text", "Third"); }});
//    }};

//
//    @GetMapping
//    public Optional<Map<String, String>> getOne(@PathVariable String id) {
//        return messages.stream()
//                .filter(message -> message.get("id").equals(id))
//                .findFirst();
//    }

//    @GetMapping
//    public List<Map<String, String>> list() {
//        return messages;
//    }

//    @GetMapping
//    public String userList(Model model) {
//        model.addAttribute("users", userRepo.findAll());
//
//        return "userList";
//    }

//    @PostMapping
//    public String add(@RequestParam String text, @RequestParam String tag, Map<String, Object> model) {
//        User user = new User(text, tag);
//
//        userRepo.save(user);
//
//        Iterable<User> messages = userRepo.findAll();
//
//        model.put("messages", messages);
//
//        return "main";
//    }

    // Показать все
    @RequestMapping({"/list", "/"})
    @GetMapping
    public String listAll(Model model) {
        model.addAttribute("user", userService.listAll());
        return "index";
    }

    // Получить определенного пользователя
    @RequestMapping("/show/{id}")
    public String getUser(@PathVariable Long id, Model model) {
        userService.getById(id).ifPresent(o -> model.addAttribute("user", o)); // model("user", userService.getById(id)) не работает
        LOG.info("Reading user with id " + id + " from database.");
        return "user/show";
    }

    // Добавить пользователя
    @RequestMapping("/add")
    public String add(Model model) {
        model.addAttribute("user", new User());
        LOG.info("successfully added");
        return "user/userform";
    }

    // Сохранить пользователя в базе
    @GetMapping
    public String save(User user) {
        User newUser = (User) userService.saveOrUpdate(user);
        return "redirect:user/show/" + newUser.getId();
    }

    // Изменить пользователя(через форму)
    @RequestMapping("/edit/{id}")
    public String edit (@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.getById(id));
        return "user/userform";
    }

    // Удалить пользователя
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        userService.delete(id);
        return "redirect:/user/list";
    }

}
