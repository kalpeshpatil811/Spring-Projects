package petstoreproject.petstoreapp;

import java.util.List;
import java.util.Map;

public class PetService {
	private PetStore petStore;
	private PetHelpLineService petHelpLineService;
	private Map<Integer, String> cityList;
	private List<RescueChamp> rescueChamp;

	public PetService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PetService(PetStore petStore) {
		super();
		this.petStore = petStore;
	}

	public PetStore getPetStore() {
		return petStore;
	}

	public void setPetStore(PetStore petStore) {
		this.petStore = petStore;
	}

	public PetHelpLineService getPetHelpLineService() {
		return petHelpLineService;
	}

	public void setPetHelpLineService(PetHelpLineService petHelpLineService) {
		this.petHelpLineService = petHelpLineService;
	}

	public Map<Integer, String> getCityList() {
		return cityList;
	}

	public void setCityList(Map<Integer, String> cityList) {
		this.cityList = cityList;
	}

	public List<RescueChamp> getRescueChamp() {
		return rescueChamp;
	}

	public void setRescueChamp(List<RescueChamp> rescueChamp) {
		this.rescueChamp = rescueChamp;
	}

}
