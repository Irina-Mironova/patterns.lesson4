package ru.geekbrains.patterns.lesson6;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserMapper {

    private Map<Long, User> userMap;

    public UserMapper() {
        this.userMap = new HashMap<>();
    }

    public Optional<User> findById(Long id) {
        if (userMap.containsKey(id)) {
            return Optional.of(userMap.get(id));

        }
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/userDB?currentSchema=hiber", "postgres", "postgres");
            PreparedStatement findUser = connection.prepareStatement("select * from users where id = ?;");
            findUser.setLong(1, id);
            ResultSet rs = findUser.executeQuery();
            if (rs.next()) {
                User user = new User(rs.getLong(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getInt(5), rs.getString(6));
                userMap.put(id, user);
                return Optional.of(user);
            }
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }

        return Optional.empty();
    }
}
