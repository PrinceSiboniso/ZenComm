//package com.princess.teamconector.services;
//
//p
//import com.princess.teamconector.repository.InternRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    @Autowired
//    private InternRepository internRepository;
//
//    @Autowired
//    private ManagerRepository managerRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Intern intern = internRepository.findByUsername(username);
//        if (intern != null) {
//            return User.withUsername(intern.getUsername())
//                    .password(intern.getPassword())
//                    .roles("INTERN")
//                    .build();
//        }
//
//        Manager manager = managerRepository.findByUsername(username);
//        if (manager != null) {
//            return User.withUsername(manager.getUsername())
//                    .password(manager.getPassword())
//                    .roles("MANAGER")
//                    .build();
//        }
//
//        throw new UsernameNotFoundException("User not found with username: " + username);
//    }
//}
