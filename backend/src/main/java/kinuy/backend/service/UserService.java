package kinuy.backend.service;

import kinuy.backend.model.User;
import kinuy.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepo;

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
