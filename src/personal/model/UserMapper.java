package personal.model;

public interface UserMapper {
    String map(User user);

    User map(String line);
}
