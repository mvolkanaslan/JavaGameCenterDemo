package JavaGameCenterDemo.business.abstracts;

import JavaGameCenterDemo.entities.concretes.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
}
