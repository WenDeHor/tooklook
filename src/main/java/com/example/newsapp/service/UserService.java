package com.example.newsapp.service;

import com.example.newsapp.models.User;
import com.example.newsapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return (UserDetails) repository.findByLogin(username);
    }


//    @CacheEvict(value = "users", allEntries = true)
//    public User create(User user) {
//        Assert.notNull(user, "user must not be null");
//        return repository.save(user);
//    }
//
//    @CacheEvict(value = "users", allEntries = true)
//    public void delete(int id) {
//        checkNotFoundWithId(repository.delete(id), id);
//    }
//
//    public User get(int id) {
//        return checkNotFoundWithId(repository.get(id), id);
//    }
//
//    public User getByEmail(String email) {
//        Assert.notNull(email, "email must not be null");
//        return checkNotFound(repository.getByEmail(email), "email=" + email);
//    }
//
//    @Cacheable("users")
//    public List<User> getAll() {
//        return repository.getAll();
//    }
//
//    @CacheEvict(value = "users", allEntries = true)
//    public void update(User user) {
//        Assert.notNull(user, "user must not be null");
////      checkNotFoundWithId : check works only for JDBC, disabled
//        repository.save(user);
//    }
//
//    @CacheEvict(value = "users", allEntries = true)
//    @Transactional
//    public void enable(int id, boolean enabled) {
//        User user = get(id);
//        user.setEnabled(enabled);
//        repository.save(user);  // !! need only for JDBC implementation
//    }


}
