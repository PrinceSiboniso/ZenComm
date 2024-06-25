package com.princess.teamconector.controllers;


import com.princess.teamconector.models.Profile;
import com.princess.teamconector.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {
    @Autowired
    private ProfileService profileService;

    @PostMapping
    public Profile createProfile(@RequestBody Profile profile) {
        return profileService.saveProfile(profile);
    }

    @GetMapping("/{id}")
    public Profile getProfile(@PathVariable Long id) {
        return profileService.getProfileById(id);
    }
}
