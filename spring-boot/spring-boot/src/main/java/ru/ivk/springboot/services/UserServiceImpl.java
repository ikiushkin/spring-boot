package ru.ivk.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.ivk.springboot.model.User;

import java.util.List;

@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getUsers() {
        RowMapper<User> userRowMapper = (rs, row) -> new User(
                rs.getLong("ID"),
                rs.getString("name"),
                rs.getString("surname"),
                rs.getTimestamp("CREATED_DATE").toLocalDateTime()
        );

        return jdbcTemplate.query("SELECT * from spring_boot.users", userRowMapper);
    }
}
