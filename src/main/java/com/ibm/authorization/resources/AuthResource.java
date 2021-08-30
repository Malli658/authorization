/*package com.ibm.authorization.resources;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.authorization.config.JwtTokenUtil;

@Api(tags = "Authentication")
@RestController @RequestMapping(path = "/api/public")
public class AuthResource {
	@Autowired
	private  AuthenticationManager authenticationManager;
	
	@Autowired
    private  JwtTokenUtil jwtTokenUtil;
	
	
	@Autowired
    private  UserService userService;*/
	
	/*@PostMapping("/login")
    public ResponseEntity<UserView> login(@RequestBody @Valid AuthRequest request) {
		JMapper<UserView, User> dataMapper=new JMapper<>(UserView.class,User.class);
        try {
            Authentication authenticate = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));

            User user = (User) authenticate.getPrincipal();
            return ResponseEntity.ok()
                    .header(HttpHeaders.AUTHORIZATION, jwtTokenUtil.generateAccessToken(user))
                    .body(dataMapper.getDestination(user));
        } catch (BadCredentialsException ex) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }*/
	
	/*@PostMapping(value="/save")
	public ResponseEntity<Object> save(@RequestBody SignupDTO signUp) throws UserAlreadyExistException{
		JMapper<User, SignupDTO> newsfeedMapper=new JMapper<>(User.class, SignupDTO.class);
		User user=newsfeedMapper.getDestination(signUp);
		user=userService.save(user);
		URI uri=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}*/
//}
