package mx.com.gigantito.services.service;

import mx.com.gigantito.commons.to.UserTO;
import java.util.List;

public interface IUserService {

    List<UserTO> getUsers();
}
