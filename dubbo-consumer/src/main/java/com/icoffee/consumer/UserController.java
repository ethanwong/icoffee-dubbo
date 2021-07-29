package com.icoffee.consumer;

import com.icoffee.api.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Name UserController
 * @Description
 * @Author huangyingfeng
 * @Create 2021-07-29 19:55
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @DubboReference
    private UserService userService;

    @GetMapping("/{username}")
    public ResponseEntity<String> sayHello(@PathVariable("username") String username) {
        return ResponseEntity.ok(userService.getUser(username));
    }

}
