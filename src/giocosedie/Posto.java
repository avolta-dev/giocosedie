package giocosedie;

class Posto

{
	private boolean occupato;

	public Posto()

	{
		occupato = false;
	}

	public synchronized boolean libero() {
		return (!occupato);
	}

	public synchronized boolean occupa() {
		if (occupato)
			return false;
		else
			return occupato = true;
	}
}