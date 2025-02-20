package com.willgomeshub.my_price_tracker.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.willgomeshub.my_price_tracker.models.Role;
import com.willgomeshub.my_price_tracker.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Aqui você pode adicionar métodos personalizados para consultas específicas
    
    public Optional<User> findByUsername(String username);
    public List<User> findByRole(Role role);
}