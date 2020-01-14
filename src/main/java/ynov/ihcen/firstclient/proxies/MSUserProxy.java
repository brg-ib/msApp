package ynov.ihcen.firstclient.proxies;
import ynov.ihcen.firstclient.model.User;

import java.util.List;
import java.util.Optional;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "firstms", url="localhost:9001")
public interface MSUserProxy {
	
	@GetMapping(value= "/users")
	List<User> getUsers();
	
	@GetMapping(value= "/users/{id}")
	Optional<User> getUser(@PathVariable("id") Long id);
	
}
