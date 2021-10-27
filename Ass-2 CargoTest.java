/** Name(s) and ID(s): Gulnoor Kaur (40114998) , Vraj Patel (40155059) COMP 249
 * Assignment #2 PART 1 Due Date 04/08/2021
 */

import java.util.Scanner;
public class CargoTest {
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyIn = new Scanner(System.in);
		// Printing necessary output
		System.out.println("What would you like to do?\r\n"
				+ "\t1. Start a cargo\r\n"
				+ "\t\ta. Driver name\r\n"
				+ "\t\tb. Unload weight(kg; lb)\r\n"
				+ "\t\tc. Originating city\r\n"
				+ "\t\td. Destination city\r\n"
				+ "\t2. Load the truck with packages\r\n"
				+ "\t\ta. Package tracking number\r\n"
				+ "\t\tb. Package weight(oz; lb)\r\n"
				+ "\t\tc. Package shipping cost\r\n"
				+ "\t3. Unload a package\r\n"
				+ "\t4. The number of packages loaded\r\n"
				+ "\t5. The gross income earned by shipping of the cargo\r\n"
				+ "\t6. Weight the truck(after it has been completely loaded)\r\n"
				+ "\t7. Drive the truck to destination\r\n"
				+ "\t0. To quit\r\n"
				+ "Please enter your choice and press <Enter>:");

		// Validating user input
		int nb = keyIn.nextInt();
		if(nb<0 || nb>7)
		{
			boolean a = true;
			int i=0;
			while(a)
			{
				System.out.println("Invalid choice please try again: ");
				i = keyIn.nextInt();
				if(i<0 & i>7)
					a = true;
				else
					a=false;
			}
			nb=i;
		}

		Truck truck = new Truck();
		truck.setdriver("Steve");
		truck.setunloadweight(14000);
		truck.setorigin("Toronto");
		truck.setdestination("Montreal");
		if (nb == 1)
		{
			System.out.println("The cargo is ready: \n"
					+ "a. Driver name: " + truck.getdriver() +"\n"
					+ "b. Unload weight(kg; lb)"+ truck.getunloadweight()+"\n"
					+ "c. Originating city"+ truck.getorigin()+"\n"
					+ "d. Destination city" + truck.getdestination());
			System.out.println("What would you like to do next?\r\n"
					+ "\t1. Start a cargo\r\n"
					+ "\t\ta. Driver name\r\n"
					+ "\t\tb. Unload weight(kg; lb)\r\n"
					+ "\t\tc. Originating city\r\n"
					+ "\t\td. Destination city\r\n"
					+ "\t2. Load the truck with packages\r\n"
					+ "\t\ta. Package tracking number\r\n"
					+ "\t\tb. Package weight(oz; lb)\r\n"
					+ "\t\tc. Package shipping cost\r\n"
					+ "\t3. Unload a package\r\n"
					+ "\t4. The number of packages loaded\r\n"
					+ "\t5. The gross income earned by shipping of the cargo\r\n"
					+ "\t6. Weight the truck(after it has been completely loaded)\r\n"
					+ "\t7. Drive the truck to destination\r\n"
					+ "\t0. To quit\r\n"
					+ "Please enter your choice and press <Enter>:");
			nb = keyIn.nextInt();
			// verifying user input
			if(nb<0 || nb>7)
			{
				boolean a = true;
				int i=0;
				while(a)
				{
					System.out.println("Invalid choice please try again: ");
					i = keyIn.nextInt();
					if(i<0 & i>7)
						a = true;
					else
						a=false;
				}
				nb=i;
			}
		}

		// initializing 200 packages to load in truck 
		Letter pack1= new Letter();
		MetalCrate pack2= new MetalCrate();
		Box pack3= new Box();
		WoodCrate pack4= new WoodCrate();
		Letter pack5= new Letter();
		MetalCrate pack6= new MetalCrate();
		Box pack7= new Box();
		WoodCrate pack8= new WoodCrate();
		Letter pack9= new Letter();
		MetalCrate pack10= new MetalCrate();
		Box pack11= new Box();
		WoodCrate pack12= new WoodCrate();
		Letter pack13= new Letter();
		MetalCrate pack14= new MetalCrate();
		Box pack15= new Box();
		WoodCrate pack16= new WoodCrate();
		Letter pack17= new Letter();
		MetalCrate pack18= new MetalCrate();
		Box pack19= new Box();
		WoodCrate pack20= new WoodCrate();
		Letter pack21= new Letter();
		MetalCrate pack22= new MetalCrate();
		Box pack23= new Box();
		WoodCrate pack24= new WoodCrate();
		Letter pack25= new Letter();
		MetalCrate pack26= new MetalCrate();
		Box pack27= new Box();
		WoodCrate pack28= new WoodCrate();
		Letter pack29= new Letter();
		MetalCrate pack30= new MetalCrate();
		Box pack31= new Box();
		WoodCrate pack32= new WoodCrate();
		Letter pack33= new Letter();
		MetalCrate pack34= new MetalCrate();
		Box pack35= new Box();
		WoodCrate pack36= new WoodCrate();
		Letter pack37= new Letter();
		MetalCrate pack38= new MetalCrate();
		Box pack39= new Box();
		WoodCrate pack40= new WoodCrate();
		Letter pack41= new Letter();
		MetalCrate pack42= new MetalCrate();
		Box pack43= new Box();
		WoodCrate pack44= new WoodCrate();
		Letter pack45= new Letter();
		MetalCrate pack46= new MetalCrate();
		Box pack47= new Box();
		WoodCrate pack48= new WoodCrate();
		Letter pack49= new Letter();
		MetalCrate pack50= new MetalCrate();
		Box pack51= new Box();
		WoodCrate pack52= new WoodCrate();
		Letter pack53= new Letter();
		MetalCrate pack54= new MetalCrate();
		Box pack55= new Box();
		WoodCrate pack56= new WoodCrate();
		Letter pack57= new Letter();
		MetalCrate pack58= new MetalCrate();
		Box pack59= new Box();
		WoodCrate pack60= new WoodCrate();
		Letter pack61= new Letter();
		MetalCrate pack62= new MetalCrate();
		Box pack63= new Box();
		WoodCrate pack64= new WoodCrate();
		Letter pack65= new Letter();
		MetalCrate pack66= new MetalCrate();
		Box pack67= new Box();
		WoodCrate pack68= new WoodCrate();
		Letter pack69= new Letter();
		MetalCrate pack70= new MetalCrate();
		Box pack71= new Box();
		WoodCrate pack72= new WoodCrate();
		Letter pack73= new Letter();
		MetalCrate pack74= new MetalCrate();
		Box pack75= new Box();
		WoodCrate pack76= new WoodCrate();
		Letter pack77= new Letter();
		MetalCrate pack78= new MetalCrate();
		Box pack79= new Box();
		WoodCrate pack80= new WoodCrate();
		Letter pack81= new Letter();
		MetalCrate pack82= new MetalCrate();
		Box pack83= new Box();
		WoodCrate pack84= new WoodCrate();
		Letter pack85= new Letter();
		MetalCrate pack86= new MetalCrate();
		Box pack87= new Box();
		WoodCrate pack88= new WoodCrate();
		Letter pack89= new Letter();
		MetalCrate pack90= new MetalCrate();
		Box pack91= new Box();
		WoodCrate pack92= new WoodCrate();
		Letter pack93= new Letter();
		MetalCrate pack94= new MetalCrate();
		Box pack95= new Box();
		WoodCrate pack96= new WoodCrate();
		Letter pack97= new Letter();
		MetalCrate pack98= new MetalCrate();
		Box pack99= new Box();
		WoodCrate pack100= new WoodCrate();
		Letter pack101= new Letter();
		MetalCrate pack102= new MetalCrate();
		Box pack103= new Box();
		WoodCrate pack104= new WoodCrate();
		Letter pack105= new Letter();
		MetalCrate pack106= new MetalCrate();
		Box pack107= new Box();
		WoodCrate pack108= new WoodCrate();
		Letter pack109= new Letter();
		MetalCrate pack110= new MetalCrate();
		Box pack111= new Box();
		WoodCrate pack112= new WoodCrate();
		Letter pack113= new Letter();
		MetalCrate pack114= new MetalCrate();
		Box pack115= new Box();
		WoodCrate pack116= new WoodCrate();
		Letter pack117= new Letter();
		MetalCrate pack118= new MetalCrate();
		Box pack119= new Box();
		WoodCrate pack120= new WoodCrate();
		Letter pack121= new Letter();
		MetalCrate pack122= new MetalCrate();
		Box pack123= new Box();
		WoodCrate pack124= new WoodCrate();
		Letter pack125= new Letter();
		MetalCrate pack126= new MetalCrate();
		Box pack127= new Box();
		WoodCrate pack128= new WoodCrate();
		Letter pack129= new Letter();
		MetalCrate pack130= new MetalCrate();
		Box pack131= new Box();
		WoodCrate pack132= new WoodCrate();
		Letter pack133= new Letter();
		MetalCrate pack134= new MetalCrate();
		Box pack135= new Box();
		WoodCrate pack136= new WoodCrate();
		Letter pack137= new Letter();
		MetalCrate pack138= new MetalCrate();
		Box pack139= new Box();
		WoodCrate pack140= new WoodCrate();
		Letter pack141= new Letter();
		MetalCrate pack142= new MetalCrate();
		Box pack143= new Box();
		WoodCrate pack144= new WoodCrate();
		Letter pack145= new Letter();
		MetalCrate pack146= new MetalCrate();
		Box pack147= new Box();
		WoodCrate pack148= new WoodCrate();
		Letter pack149= new Letter();
		MetalCrate pack150= new MetalCrate();
		Box pack151= new Box();
		WoodCrate pack152= new WoodCrate();
		Letter pack153= new Letter();
		MetalCrate pack154= new MetalCrate();
		Box pack155= new Box();
		WoodCrate pack156= new WoodCrate();
		Letter pack157= new Letter();
		MetalCrate pack158= new MetalCrate();
		Box pack159= new Box();
		WoodCrate pack160= new WoodCrate();
		Letter pack161= new Letter();
		MetalCrate pack162= new MetalCrate();
		Box pack163= new Box();
		WoodCrate pack164= new WoodCrate();
		Letter pack165= new Letter();
		MetalCrate pack166= new MetalCrate();
		Box pack167= new Box();
		WoodCrate pack168= new WoodCrate();
		Letter pack169= new Letter();
		MetalCrate pack170= new MetalCrate();
		Box pack171= new Box();
		WoodCrate pack172= new WoodCrate();
		Letter pack173= new Letter();
		MetalCrate pack174= new MetalCrate();
		Box pack175= new Box();
		WoodCrate pack176= new WoodCrate();
		Letter pack177= new Letter();
		MetalCrate pack178= new MetalCrate();
		Box pack179= new Box();
		WoodCrate pack180= new WoodCrate();
		Letter pack181= new Letter();
		MetalCrate pack182= new MetalCrate();
		Box pack183= new Box();
		WoodCrate pack184= new WoodCrate();
		Letter pack185= new Letter();
		MetalCrate pack186= new MetalCrate();
		Box pack187= new Box();
		WoodCrate pack188= new WoodCrate();
		Letter pack189= new Letter();
		MetalCrate pack190= new MetalCrate();
		Box pack191= new Box();
		WoodCrate pack192= new WoodCrate();
		Letter pack193= new Letter();
		MetalCrate pack194= new MetalCrate();
		Box pack195= new Box();
		WoodCrate pack196= new WoodCrate();
		Letter pack197= new Letter();
		MetalCrate pack198= new MetalCrate();
		Box pack199= new Box();
		WoodCrate pack200= new WoodCrate();



		// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Setting tracking numbers for each of the packages
		pack1.settrackingnb(315436460);
		pack2.settrackingnb(453445533);
		pack3.settrackingnb(434553451);
		pack4.settrackingnb(464656652);
		pack5.settrackingnb(544464560);
		pack6.settrackingnb(546456543);
		pack7.settrackingnb(654464641);
		pack8.settrackingnb(546456452);
		pack9.settrackingnb(654564560);
		pack10.settrackingnb(655465643);
		pack11.settrackingnb(564456541);
		pack12.settrackingnb(456456452);
		pack13.settrackingnb(315436460);
		pack14.settrackingnb(756544553);
		pack15.settrackingnb(255465341);
		pack16.settrackingnb(655344542);
		pack17.settrackingnb(564564560);
		pack18.settrackingnb(564456453);
		pack19.settrackingnb(465464641);
		pack20.settrackingnb(564456452);
		pack21.settrackingnb(564645440);
		pack22.settrackingnb(756465463);
		pack23.settrackingnb(258684651);
		pack24.settrackingnb(655465462);
		pack25.settrackingnb(456546460);
		pack26.settrackingnb(755466453);
		pack27.settrackingnb(255465461);
		pack28.settrackingnb(655645642);
		pack29.settrackingnb(456456870);
		pack30.settrackingnb(755454563);
		pack31.settrackingnb(254565641);
		pack32.settrackingnb(654524252);
		pack33.settrackingnb(453456540);
		pack34.settrackingnb(752453543);
		pack35.settrackingnb(255343541);
		pack36.settrackingnb(654363452);
		pack37.settrackingnb(354535540);
		pack38.settrackingnb(756456453);
		pack39.settrackingnb(254554651);
		pack40.settrackingnb(655465652);
		pack41.settrackingnb(456564560);
		pack42.settrackingnb(754564563);
		pack43.settrackingnb(255654451);
		pack44.settrackingnb(654564562);
		pack45.settrackingnb(465645650);
		pack46.settrackingnb(456456453);
		pack47.settrackingnb(465645651);
		pack48.settrackingnb(654641562);
		pack49.settrackingnb(456456340);
		pack50.settrackingnb(453456463);
		pack51.settrackingnb(546456451);
		pack52.settrackingnb(464564562);
		pack53.settrackingnb(456456450);
		pack54.settrackingnb(654645643);
		pack55.settrackingnb(644565461);
		pack56.settrackingnb(546564562);
		pack57.settrackingnb(564564650);
		pack58.settrackingnb(546654553);
		pack59.settrackingnb(564564541);
		pack60.settrackingnb(546656452);
		pack61.settrackingnb(456456540);
		pack62.settrackingnb(464564563);
		pack63.settrackingnb(564564561);
		pack64.settrackingnb(564565462);
		pack65.settrackingnb(654564560);
		pack66.settrackingnb(546456563);
		pack67.settrackingnb(641365441);
		pack68.settrackingnb(655634562);
		pack69.settrackingnb(535657450);
		pack70.settrackingnb(545645653);
		pack71.settrackingnb(653463451);
		pack72.settrackingnb(655345352);
		pack73.settrackingnb(543645360);
		pack74.settrackingnb(754563543);
		pack75.settrackingnb(254536451);
		pack76.settrackingnb(654563452);
		pack77.settrackingnb(464563540);
		pack78.settrackingnb(754392623);
		pack79.settrackingnb(256551661);
		pack80.settrackingnb(656565162);
		pack81.settrackingnb(616165150);
		pack82.settrackingnb(755456653);
		pack83.settrackingnb(255465661);
		pack84.settrackingnb(655464562);
		pack85.settrackingnb(564645560);
		pack86.settrackingnb(755654663);
		pack87.settrackingnb(256544641);
		pack88.settrackingnb(655646452);
		pack89.settrackingnb(564564560);
		pack90.settrackingnb(756445653);
		pack91.settrackingnb(254564641);
		pack92.settrackingnb(645645562);
		pack93.settrackingnb(456456540);
		pack94.settrackingnb(754645643);
		pack95.settrackingnb(256445651);
		pack96.settrackingnb(656456652);
		pack97.settrackingnb(654564550);
		pack98.settrackingnb(765445653);
		pack99.settrackingnb(264456451);
		pack100.settrackingnb(64655552);
		pack101.settrackingnb(531126330);
		pack102.settrackingnb(453445533);
		pack103.settrackingnb(434553451);
		pack104.settrackingnb(464656652);
		pack105.settrackingnb(544464560);
		pack106.settrackingnb(546456543);
		pack107.settrackingnb(654464641);
		pack108.settrackingnb(546456452);
		pack109.settrackingnb(654564560);
		pack110.settrackingnb(655465643);
		pack111.settrackingnb(564456541);
		pack112.settrackingnb(456456452);
		pack113.settrackingnb(315436460);
		pack114.settrackingnb(756544553);
		pack115.settrackingnb(255465341);
		pack116.settrackingnb(655344542);
		pack117.settrackingnb(564564560);
		pack118.settrackingnb(564456453);
		pack119.settrackingnb(465464641);
		pack120.settrackingnb(564456452);
		pack121.settrackingnb(564645440);
		pack122.settrackingnb(756465463);
		pack123.settrackingnb(258684651);
		pack124.settrackingnb(655465462);
		pack125.settrackingnb(456546460);
		pack126.settrackingnb(755466453);
		pack127.settrackingnb(255465461);
		pack128.settrackingnb(655645642);
		pack129.settrackingnb(456456870);
		pack130.settrackingnb(755454563);
		pack131.settrackingnb(254565641);
		pack132.settrackingnb(654524252);
		pack133.settrackingnb(453456540);
		pack134.settrackingnb(752453543);
		pack135.settrackingnb(255343541);
		pack136.settrackingnb(654363452);
		pack137.settrackingnb(354535540);
		pack138.settrackingnb(756456453);
		pack139.settrackingnb(254554651);
		pack140.settrackingnb(655465652);
		pack141.settrackingnb(456564560);
		pack142.settrackingnb(754564563);
		pack143.settrackingnb(255654451);
		pack144.settrackingnb(654564562);
		pack145.settrackingnb(465645650);
		pack146.settrackingnb(456456453);
		pack147.settrackingnb(465645651);
		pack148.settrackingnb(654641562);
		pack149.settrackingnb(456456340);
		pack150.settrackingnb(453456463);
		pack151.settrackingnb(546456451);
		pack152.settrackingnb(464564562);
		pack153.settrackingnb(456456450);
		pack154.settrackingnb(654645643);
		pack155.settrackingnb(644565461);
		pack156.settrackingnb(546564562);
		pack157.settrackingnb(564564650);
		pack158.settrackingnb(546654553);
		pack159.settrackingnb(564564541);
		pack160.settrackingnb(546656452);
		pack161.settrackingnb(456456540);
		pack162.settrackingnb(464564563);
		pack163.settrackingnb(564564561);
		pack164.settrackingnb(564565462);
		pack165.settrackingnb(654564560);
		pack166.settrackingnb(546456563);
		pack167.settrackingnb(641365441);
		pack168.settrackingnb(655634562);
		pack169.settrackingnb(535657450);
		pack170.settrackingnb(545645653);
		pack171.settrackingnb(653463451);
		pack172.settrackingnb(655345352);
		pack173.settrackingnb(543645360);
		pack174.settrackingnb(754563543);
		pack175.settrackingnb(254536451);
		pack176.settrackingnb(654563452);
		pack177.settrackingnb(464563540);
		pack178.settrackingnb(754392623);
		pack179.settrackingnb(256551661);
		pack180.settrackingnb(656565162);
		pack181.settrackingnb(616165150);
		pack182.settrackingnb(755456653);
		pack183.settrackingnb(255465661);
		pack184.settrackingnb(655464562);
		pack185.settrackingnb(564645560);
		pack186.settrackingnb(755654663);
		pack187.settrackingnb(256544641);
		pack188.settrackingnb(655646452);
		pack189.settrackingnb(564564560);
		pack190.settrackingnb(756445653);
		pack191.settrackingnb(254564641);
		pack192.settrackingnb(645645562);
		pack193.settrackingnb(456456540);
		pack194.settrackingnb(754645643);
		pack195.settrackingnb(256445651);
		pack196.settrackingnb(656456652);
		pack197.settrackingnb(654564550);
		pack198.settrackingnb(765445653);
		pack199.settrackingnb(264456451);
		pack200.settrackingnb(64655552);
		// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		// Stting weight of each packages
		pack1.setweight(0.5);
		pack2.setweight(75);
		pack3.setweight(25);
		pack4.setweight(65);
		pack5.setweight(0.5);
		pack6.setweight(75);
		pack7.setweight(25);
		pack8.setweight(65);
		pack9.setweight(0.5);
		pack10.setweight(75);
		pack11.setweight(25);
		pack12.setweight(65);
		pack13.setweight(0.5);
		pack14.setweight(75);
		pack15.setweight(25);
		pack16.setweight(65);
		pack17.setweight(0.5);
		pack18.setweight(75);
		pack19.setweight(25);
		pack20.setweight(65);
		pack21.setweight(0.5);
		pack22.setweight(75);
		pack23.setweight(25);
		pack24.setweight(65);
		pack25.setweight(0.5);
		pack26.setweight(75);
		pack27.setweight(25);
		pack28.setweight(65);
		pack29.setweight(0.5);
		pack30.setweight(75);
		pack31.setweight(25);
		pack32.setweight(65);
		pack33.setweight(0.5);
		pack34.setweight(75);
		pack35.setweight(25);
		pack36.setweight(65);
		pack37.setweight(0.5);
		pack38.setweight(75);
		pack39.setweight(25);
		pack40.setweight(65);
		pack41.setweight(0.5);
		pack42.setweight(75);
		pack43.setweight(25);
		pack44.setweight(65);
		pack45.setweight(0.5);
		pack46.setweight(75);
		pack47.setweight(25);
		pack48.setweight(65);
		pack49.setweight(0.5);
		pack50.setweight(75);
		pack51.setweight(25);
		pack52.setweight(65);
		pack53.setweight(0.5);
		pack54.setweight(75);
		pack55.setweight(25);
		pack56.setweight(65);
		pack57.setweight(0.5);
		pack58.setweight(75);
		pack59.setweight(25);
		pack60.setweight(65);
		pack61.setweight(0.5);
		pack62.setweight(75);
		pack63.setweight(25);
		pack64.setweight(65);
		pack65.setweight(0.5);
		pack66.setweight(75);
		pack67.setweight(25);
		pack68.setweight(65);
		pack69.setweight(0.5);
		pack70.setweight(75);
		pack71.setweight(25);
		pack72.setweight(65);
		pack73.setweight(0.5);
		pack74.setweight(75);
		pack75.setweight(25);
		pack76.setweight(65);
		pack77.setweight(0.5);
		pack78.setweight(75);
		pack79.setweight(25);
		pack80.setweight(65);
		pack81.setweight(0.5);
		pack82.setweight(75);
		pack83.setweight(25);
		pack84.setweight(65);
		pack85.setweight(0.5);
		pack86.setweight(75);
		pack87.setweight(25);
		pack88.setweight(65);
		pack89.setweight(0.5);
		pack90.setweight(75);
		pack91.setweight(25);
		pack92.setweight(65);
		pack93.setweight(0.5);
		pack94.setweight(75);
		pack95.setweight(25);
		pack96.setweight(65);
		pack97.setweight(0.5);
		pack98.setweight(75);
		pack99.setweight(25);
		pack100.setweight(65);
		pack101.setweight(0.5);
		pack102.setweight(75);
		pack103.setweight(25);
		pack104.setweight(65);
		pack105.setweight(0.5);
		pack106.setweight(75);
		pack107.setweight(25);
		pack108.setweight(65);
		pack109.setweight(0.5);
		pack110.setweight(75);
		pack111.setweight(25);
		pack112.setweight(65);
		pack113.setweight(0.5);
		pack114.setweight(75);
		pack115.setweight(25);
		pack116.setweight(65);
		pack117.setweight(0.5);
		pack118.setweight(75);
		pack119.setweight(25);
		pack120.setweight(65);
		pack121.setweight(0.5);
		pack122.setweight(75);
		pack123.setweight(25);
		pack124.setweight(65);
		pack125.setweight(0.5);
		pack126.setweight(75);
		pack127.setweight(25);
		pack128.setweight(65);
		pack129.setweight(0.5);
		pack130.setweight(75);
		pack131.setweight(25);
		pack132.setweight(65);
		pack133.setweight(0.5);
		pack134.setweight(75);
		pack135.setweight(25);
		pack136.setweight(65);
		pack137.setweight(0.5);
		pack138.setweight(75);
		pack139.setweight(25);
		pack140.setweight(65);
		pack141.setweight(0.5);
		pack142.setweight(75);
		pack143.setweight(25);
		pack144.setweight(65);
		pack145.setweight(0.5);
		pack146.setweight(75);
		pack147.setweight(25);
		pack148.setweight(65);
		pack149.setweight(0.5);
		pack150.setweight(75);
		pack151.setweight(25);
		pack152.setweight(65);
		pack153.setweight(0.5);
		pack154.setweight(75);
		pack155.setweight(25);
		pack156.setweight(65);
		pack157.setweight(0.5);
		pack158.setweight(75);
		pack159.setweight(25);
		pack160.setweight(65);
		pack161.setweight(0.5);
		pack162.setweight(75);
		pack163.setweight(25);
		pack164.setweight(65);
		pack165.setweight(0.5);
		pack166.setweight(75);
		pack167.setweight(25);
		pack168.setweight(65);
		pack169.setweight(0.5);
		pack170.setweight(75);
		pack171.setweight(25);
		pack172.setweight(65);
		pack173.setweight(0.5);
		pack174.setweight(75);
		pack175.setweight(25);
		pack176.setweight(65);
		pack177.setweight(0.5);
		pack178.setweight(75);
		pack179.setweight(25);
		pack180.setweight(65);
		pack181.setweight(0.5);
		pack182.setweight(75);
		pack183.setweight(25);
		pack184.setweight(65);
		pack185.setweight(0.5);
		pack186.setweight(75);
		pack187.setweight(25);
		pack188.setweight(65);
		pack189.setweight(0.5);
		pack190.setweight(75);
		pack191.setweight(25);
		pack192.setweight(65);
		pack193.setweight(0.5);
		pack194.setweight(75);
		pack195.setweight(25);		
		pack196.setweight(65);
		pack197.setweight(0.5);
		pack198.setweight(75);
		pack199.setweight(25);
		pack200.setweight(65);


		// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
		// loading the packages in truck
		if (nb==2)
		{
			System.out.println("The loading is in progress.........");
			try{truck.load(pack1);
			truck.load(pack2);
			truck.load(pack3);
			truck.load(pack4);
			truck.load(pack5);
			truck.load(pack6);
			truck.load(pack7);
			truck.load(pack8);
			truck.load(pack9);
			truck.load(pack10);
			truck.load(pack11);
			truck.load(pack12);
			truck.load(pack13);
			truck.load(pack14);
			truck.load(pack15);
			truck.load(pack16);
			truck.load(pack17);
			truck.load(pack18);
			truck.load(pack19);
			truck.load(pack20);
			truck.load(pack21);
			truck.load(pack22);
			truck.load(pack23);
			truck.load(pack24);
			truck.load(pack25);
			truck.load(pack26);
			truck.load(pack27);
			truck.load(pack28);
			truck.load(pack29);
			truck.load(pack30);
			truck.load(pack31);
			truck.load(pack32);
			truck.load(pack33);
			truck.load(pack34);
			truck.load(pack35);
			truck.load(pack36);
			truck.load(pack37);
			truck.load(pack38);
			truck.load(pack39);
			truck.load(pack40);
			truck.load(pack41);
			truck.load(pack42);
			truck.load(pack43);
			truck.load(pack44);
			truck.load(pack45);
			truck.load(pack46);
			truck.load(pack47);
			truck.load(pack48);
			truck.load(pack49);
			truck.load(pack50);
			truck.load(pack51);
			truck.load(pack52);
			truck.load(pack53);
			truck.load(pack54);
			truck.load(pack55);
			truck.load(pack56);
			truck.load(pack57);
			truck.load(pack58);
			truck.load(pack59);
			truck.load(pack60);
			truck.load(pack61);
			truck.load(pack62);
			truck.load(pack63);
			truck.load(pack64);
			truck.load(pack65);
			truck.load(pack66);
			truck.load(pack67);
			truck.load(pack68);
			truck.load(pack69);
			truck.load(pack70);
			truck.load(pack71);
			truck.load(pack72);
			truck.load(pack73);
			truck.load(pack74);
			truck.load(pack75);
			truck.load(pack76);
			truck.load(pack77);
			truck.load(pack78);
			truck.load(pack79);
			truck.load(pack80);
			truck.load(pack81);
			truck.load(pack82);
			truck.load(pack83);
			truck.load(pack84);
			truck.load(pack85);
			truck.load(pack86);
			truck.load(pack87);
			truck.load(pack88);
			truck.load(pack89);
			truck.load(pack90);
			truck.load(pack91);
			truck.load(pack92);
			truck.load(pack93);
			truck.load(pack94);
			truck.load(pack95);
			truck.load(pack96);
			truck.load(pack97);
			truck.load(pack98);
			truck.load(pack99);
			truck.load(pack100);
			truck.load(pack101);
			truck.load(pack102);
			truck.load(pack103);
			truck.load(pack104);
			truck.load(pack105);
			truck.load(pack106);
			truck.load(pack107);
			truck.load(pack108);
			truck.load(pack109);
			truck.load(pack110);
			truck.load(pack111);
			truck.load(pack112);
			truck.load(pack113);
			truck.load(pack114);
			truck.load(pack115);
			truck.load(pack116);
			truck.load(pack117);
			truck.load(pack118);
			truck.load(pack119);
			truck.load(pack120);
			truck.load(pack121);
			truck.load(pack122);
			truck.load(pack123);
			truck.load(pack124);
			truck.load(pack125);
			truck.load(pack126);
			truck.load(pack127);
			truck.load(pack128);
			truck.load(pack129);
			truck.load(pack130);
			truck.load(pack131);
			truck.load(pack132);
			truck.load(pack133);
			truck.load(pack134);
			truck.load(pack135);
			truck.load(pack136);
			truck.load(pack137);
			truck.load(pack138);
			truck.load(pack139);
			truck.load(pack140);
			truck.load(pack141);
			truck.load(pack142);
			truck.load(pack143);
			truck.load(pack144);
			truck.load(pack145);
			truck.load(pack146);
			truck.load(pack147);
			truck.load(pack148);
			truck.load(pack149);
			truck.load(pack150);
			truck.load(pack151);
			truck.load(pack152);
			truck.load(pack153);
			truck.load(pack154);
			truck.load(pack155);
			truck.load(pack156);
			truck.load(pack157);
			truck.load(pack158);
			truck.load(pack159);
			truck.load(pack160);
			truck.load(pack161);
			truck.load(pack162);
			truck.load(pack163);
			truck.load(pack164);
			truck.load(pack165);
			truck.load(pack166);
			truck.load(pack167);
			truck.load(pack168);
			truck.load(pack169);
			truck.load(pack170);
			truck.load(pack171);
			truck.load(pack172);
			truck.load(pack173);
			truck.load(pack174);
			truck.load(pack175);
			truck.load(pack176);
			truck.load(pack177);
			truck.load(pack178);
			truck.load(pack179);
			truck.load(pack180);
			truck.load(pack181);
			truck.load(pack182);
			truck.load(pack183);
			truck.load(pack184);
			truck.load(pack185);
			truck.load(pack186);
			truck.load(pack187);
			truck.load(pack188);
			truck.load(pack189);
			truck.load(pack190);
			truck.load(pack191);
			truck.load(pack192);
			truck.load(pack193);
			truck.load(pack194);
			truck.load(pack195);		
			truck.load(pack196);
			truck.load(pack197);
			truck.load(pack198);
			truck.load(pack199);
			truck.load(pack200); }
			catch(PackageException e)
			{
				System.out.println(e);
			}
			catch(CloneNotSupportedException r)
			{
				System.out.println(r);
			}
			System.out.println("Loading is complete.");
			System.out.println("What would you like to do next?\r\n"
					+ "\t1. Start a cargo\r\n"
					+ "\t\ta. Driver name\r\n"
					+ "\t\tb. Unload weight(kg; lb)\r\n"
					+ "\t\tc. Originating city\r\n"
					+ "\t\td. Destination city\r\n"
					+ "\t2. Load the truck with packages\r\n"
					+ "\t\ta. Package tracking number\r\n"
					+ "\t\tb. Package weight(oz; lb)\r\n"
					+ "\t\tc. Package shipping cost\r\n"
					+ "\t3. Unload a package\r\n"
					+ "\t4. The number of packages loaded\r\n"
					+ "\t5. The gross income earned by shipping of the cargo\r\n"
					+ "\t6. Weight the truck(after it has been completely loaded)\r\n"
					+ "\t7. Drive the truck to destination\r\n"
					+ "\t0. To quit\r\n"
					+ "Please enter your choice and press <Enter>:");
			nb = keyIn.nextInt();
			if(nb!=0 & nb!=1 & nb!=2 & nb!=3 & nb!=4 & nb!=5 & nb!=6 & nb!=7)
			{
				boolean a = true;
				int i =0;
				while(a)
				{
					System.out.println("Invalid choice please try again: ");
					i = keyIn.nextInt();
					if(i!=0 & i!=1 & i!=2 & i!=3 & i!=4 & i!=5 & i!=6 & i!=7)
						a = true;
					else
						a=false;
				}
				nb=i;
			}
		}
		//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Setting shipping cost for each packages
		pack1.setshippingcost();
		pack2.setshippingcost();
		pack3.setshippingcost();
		pack4.setshippingcost();
		pack5.setshippingcost();
		pack6.setshippingcost();
		pack7.setshippingcost();
		pack8.setshippingcost();
		pack9.setshippingcost();
		pack10.setshippingcost();
		pack11.setshippingcost();
		pack12.setshippingcost();
		pack13.setshippingcost();
		pack14.setshippingcost();
		pack15.setshippingcost();
		pack16.setshippingcost();
		pack17.setshippingcost();
		pack18.setshippingcost();
		pack19.setshippingcost();
		pack20.setshippingcost();
		pack21.setshippingcost();
		pack22.setshippingcost();
		pack23.setshippingcost();
		pack24.setshippingcost();
		pack25.setshippingcost();
		pack26.setshippingcost();
		pack27.setshippingcost();
		pack28.setshippingcost();
		pack29.setshippingcost();
		pack30.setshippingcost();
		pack31.setshippingcost();
		pack32.setshippingcost();
		pack33.setshippingcost();
		pack34.setshippingcost();
		pack35.setshippingcost();
		pack36.setshippingcost();
		pack37.setshippingcost();
		pack38.setshippingcost();
		pack39.setshippingcost();
		pack40.setshippingcost();
		pack41.setshippingcost();
		pack42.setshippingcost();
		pack43.setshippingcost();
		pack44.setshippingcost();
		pack45.setshippingcost();
		pack46.setshippingcost();
		pack47.setshippingcost();
		pack48.setshippingcost();
		pack49.setshippingcost();
		pack50.setshippingcost();
		pack51.setshippingcost();
		pack52.setshippingcost();
		pack53.setshippingcost();
		pack54.setshippingcost();
		pack55.setshippingcost();
		pack56.setshippingcost();
		pack57.setshippingcost();
		pack58.setshippingcost();
		pack59.setshippingcost();
		pack60.setshippingcost();
		pack61.setshippingcost();
		pack62.setshippingcost();
		pack63.setshippingcost();
		pack64.setshippingcost();
		pack65.setshippingcost();
		pack66.setshippingcost();
		pack67.setshippingcost();
		pack68.setshippingcost();
		pack69.setshippingcost();
		pack70.setshippingcost();
		pack71.setshippingcost();
		pack72.setshippingcost();
		pack73.setshippingcost();
		pack74.setshippingcost();
		pack75.setshippingcost();
		pack76.setshippingcost();
		pack77.setshippingcost();
		pack78.setshippingcost();
		pack79.setshippingcost();
		pack80.setshippingcost();
		pack81.setshippingcost();
		pack82.setshippingcost();
		pack83.setshippingcost();
		pack84.setshippingcost();
		pack85.setshippingcost();
		pack86.setshippingcost();
		pack87.setshippingcost();
		pack88.setshippingcost();
		pack89.setshippingcost();
		pack90.setshippingcost();
		pack91.setshippingcost();
		pack92.setshippingcost();
		pack93.setshippingcost();
		pack94.setshippingcost();
		pack95.setshippingcost();
		pack96.setshippingcost();
		pack97.setshippingcost();
		pack98.setshippingcost();
		pack99.setshippingcost();
		pack100.setshippingcost();
		pack101.setshippingcost();
		pack102.setshippingcost();
		pack103.setshippingcost();
		pack104.setshippingcost();
		pack105.setshippingcost();
		pack106.setshippingcost();
		pack107.setshippingcost();
		pack108.setshippingcost();
		pack109.setshippingcost();
		pack110.setshippingcost();
		pack111.setshippingcost();
		pack112.setshippingcost();
		pack113.setshippingcost();
		pack114.setshippingcost();
		pack115.setshippingcost();
		pack116.setshippingcost();
		pack117.setshippingcost();
		pack118.setshippingcost();
		pack119.setshippingcost();
		pack120.setshippingcost();
		pack121.setshippingcost();
		pack122.setshippingcost();
		pack123.setshippingcost();
		pack124.setshippingcost();
		pack125.setshippingcost();
		pack126.setshippingcost();
		pack127.setshippingcost();
		pack128.setshippingcost();
		pack129.setshippingcost();
		pack130.setshippingcost();
		pack131.setshippingcost();
		pack132.setshippingcost();
		pack133.setshippingcost();
		pack134.setshippingcost();
		pack135.setshippingcost();
		pack136.setshippingcost();
		pack137.setshippingcost();
		pack138.setshippingcost();
		pack139.setshippingcost();
		pack140.setshippingcost();
		pack141.setshippingcost();
		pack142.setshippingcost();
		pack143.setshippingcost();
		pack144.setshippingcost();
		pack145.setshippingcost();
		pack146.setshippingcost();
		pack147.setshippingcost();
		pack148.setshippingcost();
		pack149.setshippingcost();
		pack150.setshippingcost();
		pack151.setshippingcost();
		pack152.setshippingcost();
		pack153.setshippingcost();
		pack154.setshippingcost();
		pack155.setshippingcost();
		pack156.setshippingcost();
		pack157.setshippingcost();
		pack158.setshippingcost();
		pack159.setshippingcost();
		pack160.setshippingcost();
		pack161.setshippingcost();
		pack162.setshippingcost();
		pack163.setshippingcost();
		pack164.setshippingcost();
		pack165.setshippingcost();
		pack166.setshippingcost();
		pack167.setshippingcost();
		pack168.setshippingcost();
		pack169.setshippingcost();
		pack170.setshippingcost();
		pack171.setshippingcost();
		pack172.setshippingcost();
		pack173.setshippingcost();
		pack174.setshippingcost();
		pack175.setshippingcost();
		pack176.setshippingcost();
		pack177.setshippingcost();
		pack178.setshippingcost();
		pack179.setshippingcost();
		pack180.setshippingcost();
		pack181.setshippingcost();
		pack182.setshippingcost();
		pack183.setshippingcost();
		pack184.setshippingcost();
		pack185.setshippingcost();
		pack186.setshippingcost();
		pack187.setshippingcost();
		pack188.setshippingcost();
		pack189.setshippingcost();
		pack190.setshippingcost();
		pack191.setshippingcost();
		pack192.setshippingcost();
		pack193.setshippingcost();
		pack194.setshippingcost();
		pack195.setshippingcost();
		pack196.setshippingcost();
		pack197.setshippingcost();
		pack198.setshippingcost();
		pack199.setshippingcost();
		pack200.setshippingcost();

		// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// calculating gross income when the truck is full
		Truck grossincome = new Truck();
		grossincome.shippingcost = 0;
		grossincome.shippingcost = pack1.getshippingcost() + pack2.getshippingcost() + pack3.getshippingcost() + pack4.getshippingcost() + 
				pack5.getshippingcost() + pack6.getshippingcost() + pack7.getshippingcost() + pack8.getshippingcost() + pack9.getshippingcost() + 
				pack10.getshippingcost() + pack11.getshippingcost() + pack12.getshippingcost() + pack13.getshippingcost() + pack14.getshippingcost() +
				pack15.getshippingcost() + pack16.getshippingcost() +	pack17.getshippingcost() + pack18.getshippingcost() + pack19.getshippingcost() + 
				pack20.getshippingcost() + pack21.getshippingcost() + pack22.getshippingcost() + pack23.getshippingcost() + pack24.getshippingcost() + 
				pack25.getshippingcost() + pack26.getshippingcost() + pack27.getshippingcost() + pack28.getshippingcost() + pack29.getshippingcost() + 
				pack30.getshippingcost() + pack31.getshippingcost() + pack32.getshippingcost() + pack33.getshippingcost() + pack34.getshippingcost() +
				pack35.getshippingcost() + pack36.getshippingcost() +	pack37.getshippingcost() + pack38.getshippingcost() + pack39.getshippingcost() + 
				pack40.getshippingcost() +pack41.getshippingcost() + pack42.getshippingcost() + pack43.getshippingcost() + pack44.getshippingcost() + 
				pack45.getshippingcost() + pack46.getshippingcost() + pack47.getshippingcost() + pack48.getshippingcost() + pack49.getshippingcost() + 
				pack50.getshippingcost() + pack51.getshippingcost() + pack52.getshippingcost() + pack53.getshippingcost() + pack54.getshippingcost() +
				pack55.getshippingcost() + pack56.getshippingcost() +	pack57.getshippingcost() + pack58.getshippingcost() + pack59.getshippingcost() + 
				pack60.getshippingcost() +pack61.getshippingcost() + pack62.getshippingcost() + pack63.getshippingcost() + pack64.getshippingcost() + 
				pack65.getshippingcost() + pack66.getshippingcost() + pack67.getshippingcost() + pack68.getshippingcost() + pack69.getshippingcost() + 
				pack70.getshippingcost() + pack71.getshippingcost() + pack72.getshippingcost() + pack73.getshippingcost() + pack74.getshippingcost() +
				pack75.getshippingcost() + pack76.getshippingcost() +	pack77.getshippingcost() + pack78.getshippingcost() + pack79.getshippingcost() + 
				pack80.getshippingcost() +pack81.getshippingcost() + pack82.getshippingcost() + pack83.getshippingcost() + pack84.getshippingcost() + 
				pack85.getshippingcost() + pack86.getshippingcost() + pack87.getshippingcost() + pack88.getshippingcost() + pack89.getshippingcost() + 
				pack90.getshippingcost() + pack91.getshippingcost() + pack92.getshippingcost() + pack93.getshippingcost() + pack94.getshippingcost() +
				pack95.getshippingcost() + pack96.getshippingcost() +	pack97.getshippingcost() + pack98.getshippingcost() + pack99.getshippingcost() + 
				pack100.getshippingcost() + pack101.getshippingcost() + pack102.getshippingcost() + pack103.getshippingcost() + pack104.getshippingcost() + 
				pack105.getshippingcost() + pack106.getshippingcost() + pack107.getshippingcost() + pack108.getshippingcost() + pack109.getshippingcost() + 
				pack110.getshippingcost() + pack111.getshippingcost() + pack112.getshippingcost() + pack113.getshippingcost() + pack114.getshippingcost() +
				pack115.getshippingcost() + pack116.getshippingcost() +	pack117.getshippingcost() + pack118.getshippingcost() + pack119.getshippingcost() + 
				pack120.getshippingcost() + pack121.getshippingcost() + pack122.getshippingcost() + pack123.getshippingcost() + pack124.getshippingcost() + 
				pack125.getshippingcost() + pack126.getshippingcost() + pack127.getshippingcost() + pack128.getshippingcost() + pack129.getshippingcost() + 
				pack130.getshippingcost() + pack131.getshippingcost() + pack132.getshippingcost() + pack133.getshippingcost() + pack134.getshippingcost() +
				pack135.getshippingcost() + pack136.getshippingcost() +	pack137.getshippingcost() + pack138.getshippingcost() + pack139.getshippingcost() + 
				pack140.getshippingcost() +pack141.getshippingcost() + pack142.getshippingcost() + pack143.getshippingcost() + pack144.getshippingcost() + 
				pack145.getshippingcost() + pack146.getshippingcost() + pack147.getshippingcost() + pack148.getshippingcost() + pack149.getshippingcost() + 
				pack150.getshippingcost() + pack151.getshippingcost() + pack152.getshippingcost() + pack153.getshippingcost() + pack154.getshippingcost() +
				pack155.getshippingcost() + pack156.getshippingcost() +	pack157.getshippingcost() + pack158.getshippingcost() + pack159.getshippingcost() + 
				pack160.getshippingcost() +pack161.getshippingcost() + pack162.getshippingcost() + pack163.getshippingcost() + pack164.getshippingcost() + 
				pack165.getshippingcost() + pack166.getshippingcost() + pack167.getshippingcost() + pack168.getshippingcost() + pack169.getshippingcost() + 
				pack170.getshippingcost() + pack171.getshippingcost() + pack172.getshippingcost() + pack173.getshippingcost() + pack174.getshippingcost() +
				pack175.getshippingcost() + pack176.getshippingcost() +	pack177.getshippingcost() + pack178.getshippingcost() + pack179.getshippingcost() + 
				pack180.getshippingcost() +pack181.getshippingcost() + pack182.getshippingcost() + pack183.getshippingcost() + pack184.getshippingcost() + 
				pack185.getshippingcost() + pack186.getshippingcost() + pack187.getshippingcost() + pack188.getshippingcost() + pack189.getshippingcost() + 
				pack190.getshippingcost() + pack191.getshippingcost() + pack192.getshippingcost() + pack193.getshippingcost() + pack194.getshippingcost() +
				pack195.getshippingcost() + pack196.getshippingcost() +	pack197.getshippingcost() + pack198.getshippingcost() + pack199.getshippingcost() + 
				pack200.getshippingcost();

		// displaying number of packages in truck.
		if (nb==4)
		{
			System.out.println("The number of packages is 200.");
			System.out.println("What would you like to do next?\r\n"
					+ "\t1. Start a cargo\r\n"
					+ "\t\ta. Driver name\r\n"
					+ "\t\tb. Unload weight(kg; lb)\r\n"
					+ "\t\tc. Originating city\r\n"
					+ "\t\td. Destination city\r\n"
					+ "\t2. Load the truck with packages\r\n"
					+ "\t\ta. Package tracking number\r\n"
					+ "\t\tb. Package weight(oz; lb)\r\n"
					+ "\t\tc. Package shipping cost\r\n"
					+ "\t3. Unload a package\r\n"
					+ "\t4. The number of packages loaded\r\n"
					+ "\t5. The gross income earned by shipping of the cargo\r\n"
					+ "\t6. Weight the truck(after it has been completely loaded)\r\n"
					+ "\t7. Drive the truck to destination\r\n"
					+ "\t0. To quit\r\n"
					+ "Please enter your choice and press <Enter>:");
			nb = keyIn.nextInt();
			if(nb!=0 & nb!=1 & nb!=2 & nb!=3 & nb!=4 & nb!=5 & nb!=6 & nb!=7)
			{
				boolean a = true;
				int i =0;
				while(a)
				{
					System.out.println("Invalid choice please try again: ");
					i = keyIn.nextInt();
					if(i!=0 & i!=1 & i!=2 & i!=3 & i!=4 & i!=5 & i!=6 & i!=7)
						a = true;
					else
						a=false;
				}
				nb=i;
			}
		}
		if (nb==5)
		{
			System.out.println("The gross income earn from shipping is $" + grossincome.getshippingcost());
			System.out.println("What would you like to do next?\r\n"
					+ "\t1. Start a cargo\r\n"
					+ "\t\ta. Driver name\r\n"
					+ "\t\tb. Unload weight(kg; lb)\r\n"
					+ "\t\tc. Originating city\r\n"
					+ "\t\td. Destination city\r\n"
					+ "\t2. Load the truck with packages\r\n"
					+ "\t\ta. Package tracking number\r\n"
					+ "\t\tb. Package weight(oz; lb)\r\n"
					+ "\t\tc. Package shipping cost\r\n"
					+ "\t3. Unload a package\r\n"
					+ "\t4. The number of packages loaded\r\n"
					+ "\t5. The gross income earned by shipping of the cargo\r\n"
					+ "\t6. Weight the truck(after it has been completely loaded)\r\n"
					+ "\t7. Drive the truck to destination\r\n"
					+ "\t0. To quit\r\n"
					+ "Please enter your choice and press <Enter>:");
			nb = keyIn.nextInt();
			if(nb!=0 & nb!=1 & nb!=2 & nb!=3 & nb!=4 & nb!=5 & nb!=6 & nb!=7)
			{
				boolean a = true;
				int i =0;
				while(a)
				{
					System.out.println("Invalid choice please try again: ");
					i = keyIn.nextInt();
					if(i!=0 & i!=1 & i!=2 & i!=3 & i!=4 & i!=5 & i!=6 & i!=7)
						a = true;
					else
						a=false;
				}
				nb=i;
			}
		}
		// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// calculating total weight of truck when truck is load
		double d = pack1.getweight() + pack2.getweight() + pack3.getweight() + pack4.getweight() + 
				pack5.getweight() + pack6.getweight() + pack7.getweight() + pack8.getweight() + pack9.getweight() + 
				pack10.getweight() + pack11.getweight() + pack12.getweight() + pack13.getweight() + pack14.getweight() +
				pack15.getweight() + pack16.getweight() +	pack17.getweight() + pack18.getweight() + pack19.getweight() + 
				pack20.getweight() + pack21.getweight() + pack22.getweight() + pack23.getweight() + pack24.getweight() + 
				pack25.getweight() + pack26.getweight() + pack27.getweight() + pack28.getweight() + pack29.getweight() + 
				pack30.getweight() + pack31.getweight() + pack32.getweight() + pack33.getweight() + pack34.getweight() +
				pack35.getweight() + pack36.getweight() +	pack37.getweight() + pack38.getweight() + pack39.getweight() + 
				pack40.getweight() +pack41.getweight() + pack42.getweight() + pack43.getweight() + pack44.getweight() + 
				pack45.getweight() + pack46.getweight() + pack47.getweight() + pack48.getweight() + pack49.getweight() + 
				pack50.getweight() + pack51.getweight() + pack52.getweight() + pack53.getweight() + pack54.getweight() +
				pack55.getweight() + pack56.getweight() +	pack57.getweight() + pack58.getweight() + pack59.getweight() + 
				pack60.getweight() +pack61.getweight() + pack62.getweight() + pack63.getweight() + pack64.getweight() + 
				pack65.getweight() + pack66.getweight() + pack67.getweight() + pack68.getweight() + pack69.getweight() + 
				pack70.getweight() + pack71.getweight() + pack72.getweight() + pack73.getweight() + pack74.getweight() +
				pack75.getweight() + pack76.getweight() +	pack77.getweight() + pack78.getweight() + pack79.getweight() + 
				pack80.getweight() +pack81.getweight() + pack82.getweight() + pack83.getweight() + pack84.getweight() + 
				pack85.getweight() + pack86.getweight() + pack87.getweight() + pack88.getweight() + pack89.getweight() + 
				pack90.getweight() + pack91.getweight() + pack92.getweight() + pack93.getweight() + pack94.getweight() +
				pack95.getweight() + pack96.getweight() +	pack97.getweight() + pack98.getweight() + pack99.getweight() + 
				pack100.getweight() + pack101.getweight() + pack102.getweight() + pack103.getweight() + pack104.getweight() + 
				pack105.getweight() + pack106.getweight() + pack107.getweight() + pack108.getweight() + pack109.getweight() + 
				pack110.getweight() + pack111.getweight() + pack112.getweight() + pack113.getweight() + pack114.getweight() +
				pack115.getweight() + pack116.getweight() +	pack117.getweight() + pack118.getweight() + pack119.getweight() + 
				pack120.getweight() + pack121.getweight() + pack122.getweight() + pack123.getweight() + pack124.getweight() + 
				pack125.getweight() + pack126.getweight() + pack127.getweight() + pack128.getweight() + pack129.getweight() + 
				pack130.getweight() + pack131.getweight() + pack132.getweight() + pack133.getweight() + pack134.getweight() +
				pack135.getweight() + pack136.getweight() +	pack137.getweight() + pack138.getweight() + pack139.getweight() + 
				pack140.getweight() +pack141.getweight() + pack142.getweight() + pack143.getweight() + pack144.getweight() + 
				pack145.getweight() + pack146.getweight() + pack147.getweight() + pack148.getweight() + pack149.getweight() + 
				pack150.getweight() + pack151.getweight() + pack152.getweight() + pack153.getweight() + pack154.getweight() +
				pack155.getweight() + pack156.getweight() +	pack157.getweight() + pack158.getweight() + pack159.getweight() + 
				pack160.getweight() +pack161.getweight() + pack162.getweight() + pack163.getweight() + pack164.getweight() + 
				pack165.getweight() + pack166.getweight() + pack167.getweight() + pack168.getweight() + pack169.getweight() + 
				pack170.getweight() + pack171.getweight() + pack172.getweight() + pack173.getweight() + pack174.getweight() +
				pack175.getweight() + pack176.getweight() +	pack177.getweight() + pack178.getweight() + pack179.getweight() + 
				pack180.getweight() +pack181.getweight() + pack182.getweight() + pack183.getweight() + pack184.getweight() + 
				pack185.getweight() + pack186.getweight() + pack187.getweight() + pack188.getweight() + pack189.getweight() + 
				pack190.getweight() + pack191.getweight() + pack192.getweight() + pack193.getweight() + pack194.getweight() +
				pack195.getweight() + pack196.getweight() +	pack197.getweight() + pack198.getweight() + pack199.getweight() + 
				pack200.getweight() + truck.getunloadweight();
		truck.setweight(d);
		// displaying weight of truck to user in pounds and kgs
		if (nb==6)
		{
			System.out.print("The total weigth of truck is " + truck.getweight() + " lb and ");
			double k = truck.toKilograms(d);
			truck.setweight(k);
			System.out.println( truck.getweight() + " kgs");
			System.out.println("What would you like to do next?\r\n"
					+ "\t1. Start a cargo\r\n"
					+ "\t\ta. Driver name\r\n"
					+ "\t\tb. Unload weight(kg; lb)\r\n"
					+ "\t\tc. Originating city\r\n"
					+ "\t\td. Destination city\r\n"
					+ "\t2. Load the truck with packages\r\n"
					+ "\t\ta. Package tracking number\r\n"
					+ "\t\tb. Package weight(oz; lb)\r\n"
					+ "\t\tc. Package shipping cost\r\n"
					+ "\t3. Unload a package\r\n"
					+ "\t4. The number of packages loaded\r\n"
					+ "\t5. The gross income earned by shipping of the cargo\r\n"
					+ "\t6. Weight the truck(after it has been completely loaded)\r\n"
					+ "\t7. Drive the truck to destination\r\n"
					+ "\t0. To quit\r\n"
					+ "Please enter your choice and press <Enter>:");
			nb = keyIn.nextInt();
			if(nb!=0 & nb!=1 & nb!=2 & nb!=3 & nb!=4 & nb!=5 & nb!=6 & nb!=7)
			{
				boolean a = true;
				int i =0;
				while(a)
				{
					System.out.println("Invalid choice please try again: ");
					i = keyIn.nextInt();
					if(i!=0 & i!=1 & i!=2 & i!=3 & i!=4 & i!=5 & i!=6 & i!=7)
						a = true;
					else
						a=false;
				}
				nb=i;
			}
		}
		if (nb==7)
		{
			System.out.println("The truck starts journey from " + truck.getorigin() + ".");
			System.out.println("The driver drives truck ,and reach " + truck.getdestination() + "." );
			System.out.println("The workers starts to unload the truck and the found following packages in the  truck.");
			System.out.println("What would you like to do next?\r\n"
					+ "\t1. Start a cargo\r\n"
					+ "\t\ta. Driver name\r\n"
					+ "\t\tb. Unload weight(kg; lb)\r\n"
					+ "\t\tc. Originating city\r\n"
					+ "\t\td. Destination city\r\n"
					+ "\t2. Load the truck with packages\r\n"
					+ "\t\ta. Package tracking number\r\n"
					+ "\t\tb. Package weight(oz; lb)\r\n"
					+ "\t\tc. Package shipping cost\r\n"
					+ "\t3. Unload a package\r\n"
					+ "\t4. The number of packages loaded\r\n"
					+ "\t5. The gross income earned by shipping of the cargo\r\n"
					+ "\t6. Weight the truck(after it has been completely loaded)\r\n"
					+ "\t7. Drive the truck to destination\r\n"
					+ "\t0. To quit\r\n"
					+ "Please enter your choice and press <Enter>:");
			nb = keyIn.nextInt();
			if(nb!=0 & nb!=1 & nb!=2 & nb!=3 & nb!=4 & nb!=5 & nb!=6 & nb!=7)
			{
				boolean a = true;
				int i =0;
				while(a)
				{
					System.out.println("Invalid choice please try again: ");
					i = keyIn.nextInt();
					if(i!=0 & i!=1 & i!=2 & i!=3 & i!=4 & i!=5 & i!=6 & i!=7)
						a = true;
					else
						a=false;
				}
				nb=i;
			}
		}

		// Truck Unloading

		if (nb==3) {
			System.out.println("Truck unloading start.");
			truck.unload(pack1);
			truck.unload(pack2);
			truck.unload(pack3);
			truck.unload(pack4);
			truck.unload(pack5);
			truck.unload(pack6);
			truck.unload(pack7);
			truck.unload(pack8);
			truck.unload(pack9);
			truck.unload(pack10);
			truck.unload(pack11);
			truck.unload(pack12);
			truck.unload(pack13);
			truck.unload(pack14);
			truck.unload(pack15);
			truck.unload(pack16);
			truck.unload(pack17);
			truck.unload(pack18);
			truck.unload(pack19);
			truck.unload(pack20);
			truck.unload(pack21);
			truck.unload(pack22);
			truck.unload(pack23);
			truck.unload(pack24);
			truck.unload(pack25);
			truck.unload(pack26);
			truck.unload(pack27);
			truck.unload(pack28);
			truck.unload(pack29);
			truck.unload(pack30);
			truck.unload(pack31);
			truck.unload(pack32);
			truck.unload(pack33);
			truck.unload(pack34);
			truck.unload(pack35);
			truck.unload(pack36);
			truck.unload(pack37);
			truck.unload(pack38);
			truck.unload(pack39);
			truck.unload(pack40);
			truck.unload(pack41);
			truck.unload(pack42);
			truck.unload(pack43);
			truck.unload(pack44);
			truck.unload(pack45);
			truck.unload(pack46);
			truck.unload(pack47);
			truck.unload(pack48);
			truck.unload(pack49);
			truck.unload(pack50);
			truck.unload(pack51);
			truck.unload(pack52);
			truck.unload(pack53);
			truck.unload(pack54);
			truck.unload(pack55);
			truck.unload(pack56);
			truck.unload(pack57);
			truck.unload(pack58);
			truck.unload(pack59);
			truck.unload(pack60);
			truck.unload(pack61);
			truck.unload(pack62);
			truck.unload(pack63);
			truck.unload(pack64);
			truck.unload(pack65);
			truck.unload(pack66);
			truck.unload(pack67);
			truck.unload(pack68);
			truck.unload(pack69);
			truck.unload(pack70);
			truck.unload(pack71);
			truck.unload(pack72);
			truck.unload(pack73);
			truck.unload(pack74);
			truck.unload(pack75);
			truck.unload(pack76);
			truck.unload(pack77);
			truck.unload(pack78);
			truck.unload(pack79);
			truck.unload(pack80);
			truck.unload(pack81);
			truck.unload(pack82);
			truck.unload(pack83);
			truck.unload(pack84);
			truck.unload(pack85);
			truck.unload(pack86);
			truck.unload(pack87);
			truck.unload(pack88);
			truck.unload(pack89);
			truck.unload(pack90);
			truck.unload(pack91);
			truck.unload(pack92);
			truck.unload(pack93);
			truck.unload(pack94);
			truck.unload(pack95);
			truck.unload(pack96);
			truck.unload(pack97);
			truck.unload(pack98);
			truck.unload(pack99);
			truck.unload(pack100);
			truck.unload(pack101);
			truck.unload(pack102);
			truck.unload(pack103);
			truck.unload(pack104);
			truck.unload(pack105);
			truck.unload(pack106);
			truck.unload(pack107);
			truck.unload(pack108);
			truck.unload(pack109);
			truck.unload(pack110);
			truck.unload(pack111);
			truck.unload(pack112);
			truck.unload(pack113);
			truck.unload(pack114);
			truck.unload(pack115);
			truck.unload(pack116);
			truck.unload(pack117);
			truck.unload(pack118);
			truck.unload(pack119);
			truck.unload(pack120);
			truck.unload(pack121);
			truck.unload(pack122);
			truck.unload(pack123);
			truck.unload(pack124);
			truck.unload(pack125);
			truck.unload(pack126);
			truck.unload(pack127);
			truck.unload(pack128);
			truck.unload(pack129);
			truck.unload(pack130);
			truck.unload(pack131);
			truck.unload(pack132);
			truck.unload(pack133);
			truck.unload(pack134);
			truck.unload(pack135);
			truck.unload(pack136);
			truck.unload(pack137);
			truck.unload(pack138);
			truck.unload(pack139);
			truck.unload(pack140);
			truck.unload(pack141);
			truck.unload(pack142);
			truck.unload(pack143);
			truck.unload(pack144);
			truck.unload(pack145);
			truck.unload(pack146);
			truck.unload(pack147);
			truck.unload(pack148);
			truck.unload(pack149);
			truck.unload(pack150);
			truck.unload(pack151);
			truck.unload(pack152);
			truck.unload(pack153);
			truck.unload(pack154);
			truck.unload(pack155);
			truck.unload(pack156);
			truck.unload(pack157);
			truck.unload(pack158);
			truck.unload(pack159);
			truck.unload(pack160);
			truck.unload(pack161);
			truck.unload(pack162);
			truck.unload(pack163);
			truck.unload(pack164);
			truck.unload(pack165);
			truck.unload(pack166);
			truck.unload(pack167);
			truck.unload(pack168);
			truck.unload(pack169);
			truck.unload(pack170);
			truck.unload(pack171);
			truck.unload(pack172);
			truck.unload(pack173);
			truck.unload(pack174);
			truck.unload(pack175);
			truck.unload(pack176);
			truck.unload(pack177);
			truck.unload(pack178);
			truck.unload(pack179);
			truck.unload(pack180);
			truck.unload(pack181);
			truck.unload(pack182);
			truck.unload(pack183);
			truck.unload(pack184);
			truck.unload(pack185);
			truck.unload(pack186);
			truck.unload(pack187);
			truck.unload(pack188);
			truck.unload(pack189);
			truck.unload(pack190);
			truck.unload(pack191);
			truck.unload(pack192);
			truck.unload(pack193);
			truck.unload(pack194);
			truck.unload(pack195);		
			truck.unload(pack196);
			truck.unload(pack197);
			truck.unload(pack198);
			truck.unload(pack199);
			truck.unload(pack200);
			System.out.println("Truck unloading is complete.");
		}
		if(nb==0)
		{
			System.exit(0);
		}


		keyIn.close();

	}
}
