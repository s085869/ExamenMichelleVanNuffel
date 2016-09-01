package domotica.model;

@SuppressWarnings("serial")
public class House extends DomoticaObject {

	private static House house;
	
	private Bathroom bathroom;
	private Bedroom bedroom;
	private Kitchen kitchen;
	private Living living;

	private House(String id) {
		super(id);
		bathroom = new Bathroom("bathroom@"+id);
		bedroom = new Bedroom("bedroom@" + id);
		kitchen = new Kitchen("kitchen@" + id);
		living = new Living("living@" + id);
	}
	
	public static synchronized House getInstance(String id){
		if(house == null){
			house = new House(id);
		}
		
		return house;
	}

	public Bathroom getBathroom()	{	return bathroom; }
	public Bedroom getBedroom() 	{	return bedroom;	}
	public Kitchen getKitchen() 	{	return kitchen;	}
	public Living getLiving() 		{	return living; }

}
