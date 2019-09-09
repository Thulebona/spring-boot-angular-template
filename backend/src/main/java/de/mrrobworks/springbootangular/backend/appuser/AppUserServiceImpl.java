package de.mrrobworks.springbootangular.backend.appuser;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AppUserServiceImpl implements AppUserService {

  @NonNull private AppUserRepository appUserRepository;

  @Override
  public Optional<AppUser> getByUserId(String id) {
    return appUserRepository.findById(id);
  }

  @Override
  public void createAppUser(AppUser appUser) {
    appUserRepository.save(appUser);
  }

  @Override
  public List<AppUser> getAllAppUsers() {
    return appUserRepository.findAll();
  }

  @Override
  public void save(AppUser appUser) {
    appUserRepository.save(appUser);
  }
}