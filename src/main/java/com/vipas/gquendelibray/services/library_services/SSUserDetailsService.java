package com.vipas.gquendelibray.services.library_services;


import com.vipas.gquendelibray.models.library_models.Role;
import com.vipas.gquendelibray.models.library_models.User;
import com.vipas.gquendelibray.repository.library_repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class SSUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    public SSUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        try {
            UserDetails userDetails;
            User user= userRepository.findByUsername(username);
            if(user==null)
                return null;

            return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(), getAuthorities(user));


        }

        catch (Exception e){
            throw new UsernameNotFoundException("User not found");
        }


    }

    private Set<GrantedAuthority> getAuthorities(User user){
        Set<GrantedAuthority> authorities= new HashSet<>();
        for(Role role: user.getRoles()){
            GrantedAuthority grantedAuthority= new SimpleGrantedAuthority(role.getRole());
            authorities.add(grantedAuthority);
        }
        return  authorities;


    }


}