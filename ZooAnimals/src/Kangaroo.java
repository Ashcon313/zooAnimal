
public class Kangaroo implements iAnimal {
	
	private String animalType; 
	private int idTag;
	private int minTemp;
	private int maxTemp;
	
	public Kangaroo() {
		animalType = "Kangaroo";
		minTemp = 20;
		maxTemp = 49;
	}
	
	
	@Override
	public String getAnimalType() {
		return animalType;
	}

	@Override
	public int getIdTag() {
		return idTag;
	}

	@Override
	public void setIdTag(int anIdTag) {
		idTag = anIdTag;
		
	}

	@Override
	public int getMinTemperature() {
		return minTemp;
	}

	@Override
	public int getMaxTemperature() {
		return maxTemp;
	}


	@Override
	public int compareTo(Object o) {
		// If this object is greater than o return +1
		// If this object is less than o return -1
		// If this object is the same as o return 0
		if(idTag > ((Kangaroo) o).getIdTag()){
			return 1;
		}else if(idTag > ((Kangaroo) o).getIdTag()){
			return -1;
		}else {
			return 0;
		}
		
	}

	
}
