package io.anhkhue.more.repositories;

import io.anhkhue.more.models.dto.AccountRateMovie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRateMovieRepository extends JpaRepository<AccountRateMovie, Integer> {

    AccountRateMovie findByAccountUsernameAndMovieId(String username, int movieId);

    List<AccountRateMovie> findByMovieId(int movieId);
}
