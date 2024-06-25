package com.princess.teamconector.services;

import com.princess.teamconector.models.Profile;
import com.princess.teamconector.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public Profile saveProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public Profile getProfileById(Long id) {
        return profileRepository.findById(id).orElse(null);
    }
}
