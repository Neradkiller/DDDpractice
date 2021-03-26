package tv.codely.hiring.applications.domain;

import tv.codely.shared.domain.criteria.Criteria;

import java.util.List;
import java.util.Optional;

public interface ApplicationRepository {
    void save(Application application);

    Optional<Application> search(ApplicationId id);

    List<Application> matching(Criteria criteria);
}
