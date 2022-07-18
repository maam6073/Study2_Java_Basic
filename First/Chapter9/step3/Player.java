package step3;

public class Player
{
	PlayerLevel level;
	
	public Player()
	{
		level = new BeginnerLevel();
		level.showLevel();
	}
	public void upgradeLevel(PlayerLevel level)
	{
		this.level = level;
		level.showLevel();
	}
	final public void Play(int count)
	{
		level.go(count);
	}
}
