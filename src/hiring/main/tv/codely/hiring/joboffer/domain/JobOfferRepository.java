package tv.codely.hiring.joboffer.domain;

import tv.codely.shared.domain.criteria.Criteria;

import java.util.List;

public interface JobOfferRepository {
    void save(JobOffer jobOffer);

    List<JobOffer> searchAll();

    List<JobOffer> matching(Criteria criteria);
}
