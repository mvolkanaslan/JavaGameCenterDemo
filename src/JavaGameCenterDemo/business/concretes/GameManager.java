package JavaGameCenterDemo.business.concretes;


import JavaGameCenterDemo.business.abstracts.GameService;
import JavaGameCenterDemo.dataAccess.abstracts.GameDao;
import JavaGameCenterDemo.entities.concretes.Game;

public class GameManager implements GameService{

	GameDao gameDao;
	
	public GameManager(GameDao gameDao) {
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		this.gameDao.add(game);
		
	}

	@Override
	public void delete(Game game) {
		this.gameDao.delete(game);
		
	}

	@Override
	public void update(Game game) {
		this.gameDao.update(game);
		
	}

}
