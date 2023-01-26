package Home_Works15;

public interface StandartOzellik extends Optional  {
	
	public default int tekerlekSayisi() {
		
		return 4;
		}
		
	public default   boolean absFrenSistemi() {
		
		return true;
	
	}
	
	public default boolean koltukDoseme () {
		
		return true;
		
	}

	public default boolean bagajHacmi () {
		
		return true;
	}
	
	public default boolean iklimlendirme () {
		
		
		return true;
	}
}
