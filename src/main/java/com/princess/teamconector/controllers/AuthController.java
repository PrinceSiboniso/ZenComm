//package com.princess.teamconector.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/auth")
//public class AuthController {
//
//    @Autowired
//    private AuthService authService;
//
//    @PostMapping("/register/intern")
//    public void registerIntern(@RequestParam String username, @RequestParam String password) {
//        authService.registerIntern(username, password);
//    }
//
//    @PostMapping("/register/manager")
//    public void registerManager(@RequestParam String username, @RequestParam String password) {
//        authService.registerManager(username, password);
//    }
//}
