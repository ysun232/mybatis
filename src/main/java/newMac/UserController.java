package newMac;

import newMac.mappers.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/sun")
public class UserController {

    private UserMapper userMapper;

    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    @GetMapping("/all")
    public List<User> getAll(){
        return userMapper.findAll();
    }

}
