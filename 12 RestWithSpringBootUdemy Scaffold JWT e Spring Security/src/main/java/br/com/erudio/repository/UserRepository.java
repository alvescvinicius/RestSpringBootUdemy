package br.com.erudio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.erudio.data.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	/*
	 * A implmentação deste repositorio é feita via JPQL para exemplo
	 * Não é necessario ser implementada desta maneira
	 */
	
	@Query("SELECT u FROM User u WHERE u.username :=userName")
	User findByUsername(@Param("username") String username);
	
}