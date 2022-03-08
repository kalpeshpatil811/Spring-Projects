package petstoreproject.petstoreapp;

public class PetHelpLineService {
	private String helplineNumber;

	private PetHelpLineService() {
		this.helplineNumber = "+91-9876543210";
	}

	public String getHelplineNumber() {
		return helplineNumber;
	}

	private static PetHelpLineService petHelpLineService = new PetHelpLineService();

	public static PetHelpLineService createPetHelpLineServiceInstance() {
		return petHelpLineService;
	}
}
