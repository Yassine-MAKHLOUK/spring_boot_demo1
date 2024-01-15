package ma.org.licence.spring_boot_demo1.services;

import ma.org.licence.spring_boot_demo1.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService(){
        userList = new ArrayList<>();

        User user1 = new User(1, "Yassine", 28, "yassine@email.com", "123456");
        User user2 = new User(2, "Saad", 29, "saad@email.com", "123456");
        User user3 = new User(3, "Abdou", 26, "abdou@email.com", "123456");
        User user4 = new User(4, "Amine", 17, "amine@email.com", "123456");

        userList.addAll(Arrays.asList(user1, user2, user3, user4));
    }
    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user:userList ){
            if (id == user.getId()) {
                optional = Optional.of(user);

                return optional;
            }

        }
        return optional;
    }
}
