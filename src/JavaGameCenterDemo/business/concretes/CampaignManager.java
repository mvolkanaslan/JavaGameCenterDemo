package JavaGameCenterDemo.business.concretes;

import JavaGameCenterDemo.business.abstracts.CampaignService;
import JavaGameCenterDemo.core.concretes.EntityBaseManager;
import JavaGameCenterDemo.dataAccess.abstracts.CampaignDao;
import JavaGameCenterDemo.entities.concretes.Campaign;

public class CampaignManager implements CampaignService{

	CampaignDao campaignDao;
	public CampaignManager(CampaignDao campaignDao) {
		this.campaignDao = campaignDao;
	}

	@Override
	public void add(Campaign campaign) {
		this.campaignDao.add(campaign);
		
	}

	@Override
	public void delete(Campaign campaign) {
		this.campaignDao.delete(campaign);
		
	}

	@Override
	public void update(Campaign campaign) {
		this.campaignDao.update(campaign);
		
	}

}
