# First Example of Spring Boot

## USAGE

The configuration of MySQL is the same as [hello-springboot](../spring-boot-hello/README.md).

```bash
mvn install
java -jar target/rest-springboot-1.0-SNAPSHOT.jar
```

It will try to start a server at `127.0.0.1:8080`.

## Explanation

We have revised the `HomeController.java`, and added the following lines (a few imports are needed):

```java
	@ResponseBody
	@GetMapping("/users")
	public List<User> getUsers()
	{
		return userRepo.findAll();
	}
	@ResponseBody
	@PostMapping("/user/add")
	public User addUser(@RequestBody User user)
	{
		User savedUser = userRepo.save(user);
		return savedUser;
	}
```

  * `@GetMapping` is a shortcut for `@RequestMapping(method = RequestMethod.GET)`
  * `@PostMapping` is a shortcut for `@RequestMapping(method = RequestMethod.POST)`
  * `@ResponseBody` automatically converts the returned `List<User>` or `User` to a JSON object
  * `@RequestBody` automatically parses the JSON data in the request header to a `User` parameter. Note that, the `id` field of the `User` is automatically generated, so user doesnot need to provide an `id` field, and `savedUser` has a generated `id` field.

There are two scripts to test the two APIS based on `curl`:
  * `get.sh`
  * `post.sh`

## Reference

  * Beginning Spring Boot 2 - Application and Microservices with the Spring Framework, 2017

