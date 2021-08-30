/*package com.ibm.authorization.services;

import static java.lang.String.format;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ibm.authorization.exception.UserAlreadyExistException;
import com.ibm.authorization.exception.UserNotFoundException;
import com.ibm.authorization.model.User;
import com.ibm.authorization.repository.UserRepository;


@Service
public class UserServiceIml implements UserService,UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;


	
	
	@Override
	public User getUserByUserId(Long id) throws UserNotFoundException {
		Optional<User> user=userRepository.findById(id);
		if(user.isPresent())
			return user.get();
		else
			throw new UserNotFoundException("id:"+id);
	}

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		return userRepository.getUserByUserName(username).orElseThrow(()->new UsernameNotFoundException(format("User with username - %s, not found", username)));
	}

	@Override
	public User save(User user) throws UserAlreadyExistException {
		// TODO Auto-generated method stub
		return null;
	}

}
*/