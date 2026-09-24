
//                                                           location stuff
// Make new coordinate Coordinate point = new Coordinate(x, y);
// x:  point.x()
// y:  point.y()



//                                                           player stuff
// player.name / player.location -> Strings
// player.strength / player.speed / player.health / player.smarts -> ints
// player.inventory -> ArrayList<String>
// read a stat:      System.out.println(player.health);
// change a stat:    player.health -= 5;   player.strength += 2;
// change location:  player.location = "Popcorn Village";
// add to inv:       player.inventory.add("sword");
// remove from inv:  player.inventory.remove("armor");
// check inv:        player.inventory.contains("armor");
// inv as string:    String.join(", ", player.inventory);
// only works if "player" is in scope (inside main, or a method with Player player as a param)



import java.util.*;
import java.util.*;

public class Game {
	static class Player {
	    String name, location;
	    int strength, speed, health, smarts;
	    ArrayList<String> inventory = new ArrayList<>();
	    ArrayList<String> locationLog = new ArrayList<>(); //add locations log
	    
	}
	public record Coordinate(int x, int y) {} //creates coordinate thing
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		 int tick = 0;
		 tick = 0;
		    while (tick != 100) {
		    	System.out.println();
		    	tick ++;
		    }
		    tick = 0;
		System.out.println("========={ Welcome to Console RPG }=========");
		System.out.println("               press 1 to play              ");
		System.out.println("            press 2 for settings            ");
		System.out.println("               press 3 to quit              ");
		int mMenuChoice = in.nextInt();
		in.nextLine(); // clears newline from the input thing
		tick = 0;
	    while (tick != 100) {
	    	System.out.println();
	    	tick ++;
	    }
	    tick = 0;
		switch (mMenuChoice) {
			case 1:
		System.out.println("--------------------------------------------");
			System.out.print("Please enter your characters name: ");
			String pName = in.nextLine();
			Player player = new Player();
			player.name = pName;
			player.location = "Red Sand Desert"; //initial declaration of playerLoc

		System.out.println("Hello "+pName);
		System.out.println("--------------------------------------------");
		System.out.print("You will now create your characters stats. (press enter to continue)");
		in.nextLine(); 
		tick = 0;
	    while (tick != 100) {
	    	System.out.println();
	    	tick ++;
	    }
	    tick = 0;
		System.out.println();
		System.out.println("You have 20 points to spend on 4 different categories.");
		int statPoints = 20; 
		System.out.println();
		System.out.println("Category 1: Strength");
		System.out.println("Category 2: Speed");
		System.out.println("Category 3: Health");
		System.out.println("Category 4: Smarts");
			int statChange = 0;
		System.out.println("(continue)");
		in.nextLine();
				while (statPoints > 0) {
					System.out.println("Please enter the number of the category you want to add points to ");
					System.out.println("You have "+statPoints+" points remaining.");
							int statMenuChoice = in.nextInt();
							switch (statMenuChoice) {
							case 1:
					System.out.println("How many points would you like to put into Strength? ");
								statChange = Math.abs(in.nextInt());
								player.strength += statChange;
								statPoints -= statChange;
								statChange = 0;
					System.out.println("Strength now has: "+player.strength+" points.");
					System.out.println();
							break;
							case 2:
					System.out.println("How many points would you like to put into Speed? ");
								statChange = Math.abs(in.nextInt());
								player.speed += statChange;
								statPoints -= statChange;
								statChange = 0;
					System.out.println("Speed now has: "+player.speed+" points.");
					System.out.println();
							break;
							case 3:
					System.out.println("How many points would you like to put into Health? ");
								statChange = Math.abs(in.nextInt());
								player.health += statChange;
								statPoints -= statChange;
								statChange = 0;
					System.out.println("Health now has: "+player.health+" points.");
					System.out.println();
							break;
							case 4:
					System.out.println("How many points would you like to put into Smarts? ");
								statChange = Math.abs(in.nextInt());
								player.smarts += statChange;
								statPoints -= statChange;
								statChange = 0;
					System.out.println("Smarts now has: "+player.smarts+" points.");
					System.out.println();
							break;
							}
					
				} // end of while for statpoints
				System.out.println("You have spent all of your points");
					System.out.println("Strength: "+player.strength+" points.");
					System.out.println("Speed: "+player.speed+" points.");
					System.out.println("Health: "+player.health+" points.");
					System.out.println("Smarts: "+player.smarts+" points.");
		System.out.println("(continue)");
		in.nextLine();
		in.nextLine();
		tick = 0;
	    while (tick != 100) {
	    	System.out.println();
	    	tick ++;
	    }
	    tick = 0;

			int intro = (rand.nextInt(3))+1;
				if (intro == 1) {
					System.out.println("            You open your eyes to a view of the blazing sun. Last night you \n"
							+ " took shelter in a cave in the Red Sand Desert, spires of perfectly balanced\n"
							+ " rock soar into the sky and arches frame the blazing sun. Even under the shelter\n"
							+ " of the cave you are drenched in sweat and parched. Your skin is peeling from where \n"
							+ "the sun could reach you through your armor, and small sand crabs are scuttling\n"
							+ " out of your bag as you sit up. You came from a city in the east where you were raised\n"
							+ " as a knight for the royal family, and you set out on your adventure in search of a \n"
							+ "suitable bride for the prince. After brushing the sand off of your chestplate and standing \n"
							+ "up you take out your map.\n"
							+ "(Armor has been added to inventory) (you lose 1 health)");
					System.out.println("(continue)");
					in.nextLine();
					tick = 0;
				    
					player.location = "Red Sand Desert";
					player.inventory.add("Armor");
					player.health -= 1;
				} else {}
				if (intro == 2){
					player.inventory.add("Armor");
					
				} else {}
				if (intro == 3) {
					player.inventory.add("Armor");
					
				} else {}
				tick = 0;
			    while (tick != 100) {
			    	System.out.println();
			    	tick ++;
			    }
			    tick = 0;
				System.out.println("_______________________________________________________________________________________\n"
								+ "|                                                                                       |\n"
								+ "|                                                            Great Blue River End (2)   |\n"
								+ "|                     Red Sand Desert (1)                                    *          |\n"
								+ "|                                 *                                                     |\n"
								+ "|                                                                                       |\n"
								+ "|                                                                                       |\n"
								+ "|                                                                                       |\n"
								+ "|                                                                                       |\n"
								+ "|              *                                                                        |\n"
								+ "|          Trader Caravan (3)                                                           |\n"
								+ "|                                                                                       |\n"
								+ "|                                                                                       |\n"
								+ "|                                                                                       |\n"
								+ "|                                                             East City Royal Palace (4)|\n"
								+ "|                                                                          *            |\n"
								+ "|                                                                                       |\n"
								+ "|                                                                                       |\n"
								+ "|                                                                                       |\n"
								+ "|                            Death Mauntain Mining (5)                                  |\n"
								+ "|                                          *                                            |\n"
								+ "|                                                                                       |\n"
								+ "|                                                                                       |\n"
								+ "|                                                                                       |\n"
								+ "|                                                                                       |\n"
								+ "|                                                            Popcorn Village (7)        |\n"
								+ "| Great Blue River Start (6)                                    *                       |\n"
								+ "|   *                                                                                   |\n"
								+ "|                                                                                       |\n"
								+ "|                                      *                                                |\n"
								+ "|                      Frozen Glacier Forest (8)                                        |\n"
								+ "|                                                                                       |\n"
								+ "|                                                                                       |\n"
								+ "|_______________________________________________________________________________________|");
				System.out.println("(continue)");
				in.nextLine();
				tick = 0;
			    while (tick != 100) {
			    	System.out.println();
			    	tick ++;
			    }
			    tick = 0;
				HashMap<String, Coordinate> locations = new HashMap<>(); //add locations log

				locations.put("Red Sand Desert", new Coordinate(30, 90));
				locations.put("Great Blue River End", new Coordinate(90, 95));
				locations.put("Trader Caravan", new Coordinate(15, 80));
				locations.put("East City Royal Palace", new Coordinate(90, 65));
				locations.put("Death Mountain Mining", new Coordinate(50, 50));
				locations.put("Great Blue River Start", new Coordinate(5, 20));
				locations.put("Popcorn Village", new Coordinate(75, 25));
				locations.put("Frozen Glacier Forest", new Coordinate(40, 15));
				
				while (player.health > 0) {
				System.out.println();
				System.out.println("Press 1 for travel");
				System.out.println("Press 2 for inventory");
				System.out.println("Press 3 for stats");
				System.out.println("Press 4 for map");
				int gameLoopChoice = in.nextInt();
				in.nextLine();
				tick = 0;
			    while (tick != 100) {
			    	System.out.println();
			    	tick ++;
			    }
			    tick = 0;
				if (gameLoopChoice == 1) { //GLC for travel menu
					System.out.println("You are at "+player.location);
					System.out.println("Where do you want to go?");
					System.out.println();
					System.out.println("Red Sand Desert");
				    System.out.println("Great Blue River End");
				    System.out.println("Trader Caravan");
				    System.out.println("East City Royal Palace");
				    System.out.println("Death Mountain Mining");
				    System.out.println("Great Blue River Start");
				    System.out.println("Popcorn Village");
				    System.out.println("Frozen Glacier Forest");
				    System.out.println("(Please type where you want to go, case sensitive. Type exit to cancel travel.");
				    String locationName = in.nextLine();
				    
				    
				    if (locationName.equals("exit")) {} else  {
				    	System.out.print("You are traveling to " + locationName);
				    
				    	System.out.println(" From "+ player.location);
				   
				    	Coordinate playerPoint = locations.get(player.location);
				    	Coordinate destPoint = locations.get(locationName);
				    	//System.out.println("Dev. Trav "+playerPoint.x()+", "+playerPoint.y());
				    	//System.out.println("Dev. To "+destPoint.x()+", "+destPoint.y());
				    	int distanceTrav = (int) Math.sqrt(Math.abs(  Math.pow((destPoint.x()-playerPoint.x()), 2)  +  Math.pow((destPoint.y()-playerPoint.y()), 2)  ));
				   
				    	System.out.println("Distance: "+distanceTrav+" miles");
				    	System.out.println("Travel time: "+distanceTrav/10+" sec");
				    	System.out.println("Travelling...");
				   
				    
				 
				    	try {
				        Thread.sleep(distanceTrav*100);
				    	} catch (InterruptedException e) {
				        e.printStackTrace();
				    	}
				    
				    
				    
				    	tick = 0;
				    	while (tick != 100) {
				    	System.out.println();
				    	tick ++;
				    	}
				    	tick = 0;
				  
				    
				    
				    	System.out.println("You have arrived!");
				    	System.out.println("You travelled for "+distanceTrav/player.speed+" days");
				    	player.location = locationName;
				    	System.out.println("You are now at: "+player.location);
				    	System.out.println("(Continue)");
				    	in.nextLine();
				    	tick = 0;
				    	while (tick != 100) {
					    	System.out.println();
					    	tick ++;
					    }
					    tick = 0;
					    triggerLocationEvent(player, in, rand);
				    }
					    
				} else {}
				
				if (gameLoopChoice == 2) { //GLC for inventory
					String invAsString = String.join(", ", player.inventory);
					System.out.println(invAsString);
						System.out.println("(continue)");
						in.nextLine();
						tick = 0;
					    while (tick != 100) {
					    	System.out.println();
					    	tick ++;
					    }
					    tick = 0;
				} else {}
				
				if (gameLoopChoice == 3) { //GLC for stats
					System.out.println("Strength: "+player.strength+" points.");
					System.out.println("Speed: "+player.speed+" points.");
					System.out.println("Health: "+player.health+" points.");
					System.out.println("Smarts: "+player.smarts+" points.");
						System.out.println("(continue)");
							in.nextLine();
							tick = 0;
						    while (tick != 100) {
						    	System.out.println();
						    	tick ++;
						    }
						    tick = 0;
				} else {}
				
				if (gameLoopChoice == 4) { //GLC for map
					System.out.println("_______________________________________________________________________________________\n"
							+ "|                                                                                       |\n"
							+ "|                                                            Great Blue River End (2)   |\n"
							+ "|                     Red Sand Desert (1)                                    *          |\n"
							+ "|                                 *                                                     |\n"
							+ "|                                                                                       |\n"
							+ "|                                                                                       |\n"
							+ "|                                                                                       |\n"
							+ "|                                                                                       |\n"
							+ "|              *                                                                        |\n"
							+ "|          Trader Caravan (3)                                                           |\n"
							+ "|                                                                                       |\n"
							+ "|                                                                                       |\n"
							+ "|                                                                                       |\n"
							+ "|                                                             East City Royal Palace (4)|\n"
							+ "|                                                                          *            |\n"
							+ "|                                                                                       |\n"
							+ "|                                                                                       |\n"
							+ "|                                                                                       |\n"
							+ "|                            Death Mauntain Mining (5)                                  |\n"
							+ "|                                          *                                            |\n"
							+ "|                                                                                       |\n"
							+ "|                                                                                       |\n"
							+ "|                                                                                       |\n"
							+ "|                                                                                       |\n"
							+ "|                                                            Popcorn Village (7)        |\n"
							+ "| Great Blue River Start (6)                                    *                       |\n"
							+ "|   *                                                                                   |\n"
							+ "|                                                                                       |\n"
							+ "|                                      *                                                |\n"
							+ "|                      Frozen Glacier Forest (8)                                        |\n"
							+ "|                                                                                       |\n"
							+ "|                                                                                       |\n"
							+ "|_______________________________________________________________________________________|");
			System.out.println("(continue)");
			in.nextLine();
			tick = 0;
		    while (tick != 100) {
		    	System.out.println();
		    	tick ++;
		    }
		    tick = 0;
				} else {}
				
		} // health while for game loop
			break; // breaks case 1 of mMenu
			
			case 2:
				
			break; // breaks case 2 of mMenu
			
			case 3:
				System.out.println("Thanks for playing!");
			break; // breaks case 3 of mMenu
		} // closes switch
		
	}
	
	static void triggerLocationEvent(Player player, Scanner in, Random rand) {
	    switch (player.location) {
	    case "Trader Caravan" -> traderCaravanEvent(player, in, rand);
        case "Frozen Glacier Forest" -> glacierForestEvent(player, in, rand);
        case "Death Mountain Mining" -> deathMountainEvent(player, in, rand);
        case "Red Sand Desert" -> redSandDesertEvent(player, in, rand);
        case "Great Blue River End" -> greatBlueRiverEndEvent(player, in, rand);
        case "Great Blue River Start" -> greatBlueRiverStartEvent(player, in, rand);
        case "East City Royal Palace" -> eastCityRoyalPalaceEvent(player, in, rand);
        case "Popcorn Village" -> popcornVillageEvent(player, in, rand);
        
	      
	    }
	}

	
	static void traderCaravanEvent(Player player, Scanner in, Random rand) {
	    // trader stuff (trading and ambush and proitect and reward and allat)
		System.out.println("You walk up to the trader camp after a long journey.");
		System.out.println("(continue)");
		in.nextLine();
		int tick = 0;
	    while (tick != 100) {
	    	System.out.println();
	    	tick ++;
	    }
	    tick = 0;
	    System.out.println("A nomad greets you; \" welcome to our camp\" \n"
	    		+ "\"We travel across the land to trade goods. What would you like to trade? \"");
	   boolean doTradeLoop = true;
	    while (doTradeLoop == true) {
	   System.out.println("(type what you would like to trade) \n"
	    		+ "Your inventory: ");
	    String invAsString = String.join(", ", player.inventory);
		System.out.println(invAsString);
			String pTrade = in.nextLine();
				
			
			int category = rand.nextInt(2)+1;
				String traderOffer = "";
				if (category == 1) {
					String[] stringArray = {"Sword", "Armor", "Bow", "Shield"};
	        
				
					int randomIndex = rand.nextInt(stringArray.length);
	        
					traderOffer = stringArray[randomIndex];
					System.out.println("Trader Offer: " + traderOffer);
				} else {}
				if (category == 2) {
					String[] stringArray = {"Loaf of Bread", "Cooked Meat", "Cooked Chicken", "Shrimp", "Lobster", "Swordfish", "Shark", "Red Berry Pie", "Meat Pie", "Apple Pie", "Baked Potato", "Potato with Cheese", "Stew", "Curry", "Cabbage", "Onion", "Chocolate Cake", "Jug of Wine", "Pot of Cream", "Bowl of Soup"};
			        
					
					int randomIndex = rand.nextInt(stringArray.length);
		        
					traderOffer = stringArray[randomIndex];
					System.out.println("Trader Offer: " + traderOffer);
				} else {
					traderOffer = "";
				}
				System.out.println("Accept? (y) decline? (n)");
					String traderOffAns = in.nextLine();
						if (traderOffAns.equals("y")) {
							player.inventory.remove(pTrade);
							
							player.inventory.add(traderOffer); //not working? wont add to list
							
						} else {}
						if (traderOffAns.equals("n")) {
							System.out.println("Trade cancelled. ");
							System.out.println("(continue)");
							tick = 0;
						    while (tick != 100) {
						    	System.out.println();
						    	tick ++;
						    }
						    tick = 0;
							
							
						} else {}
						System.out.print("Do you want to trade again? (y) (n)");
						String doTradeLoopString = in.nextLine();
						if (doTradeLoopString.equals("y")) {
							doTradeLoop = true;
						} else {}
						if (doTradeLoopString.equals("n")) { doTradeLoop = false;
						} else {}
						tick = 0;
					    while (tick != 100) {
					    	System.out.println();
					    	tick ++;
					    }
					    tick = 0;
	    }
				
		//int cEvent = rand.nextInt(5)+1;
	    int cEvent = 1; // forces event one TODO change this latercback
			if (cEvent == 1 && player.locationLog.contains("cEvent1") == false) {
				System.out.println("As you and the nomad finish exchanging items a group of thugs suddenly jump from the bushes \n "
						+ "and brandish their swords. \"give us all your goods or well slaughter you!\n they shout. \n"
						+ "Would you like to (g) give them one of your items or (f) fight back?");
				String ambushDec = in.next();
				
				if (ambushDec.equals("g") && player.inventory.isEmpty() == false) {
					System.out.println("(type what you would like to give) \n"
				    		+ "Your inventory: ");
				    String invAsString = String.join(", ", player.inventory);
					System.out.println(invAsString);
						String pTrade = in.nextLine();
						player.inventory.remove(pTrade);
					
				}else {}
				if (ambushDec.equals("f") || player.inventory.isEmpty() == true) {
					System.out.println("You have entered combat with the boss thug. ");
					// combat loop
					int enemyHp = 2;
					int enemySmarts = 3;
					int punchDMG = 0;
					int swordDMG = 0;
					int bowDMG = 0;
					
					boolean playerCTurn = true;
					while (player.health > 0 && enemyHp > 0) {
						
						if (playerCTurn == true) {
							int atkChance = 0;
							System.out.println("You have: "+player.health+" health");
							System.out.println("The enemy has: "+enemyHp+" health");
							
							System.out.println("Your attacks are: ");
							 punchDMG = player.strength/10;
							System.out.println("(p) punch DMG: "+punchDMG);
							if (player.inventory.contains("Sword") == true) {
								 swordDMG = player.strength/2;
								System.out.println("(s) sword DMG: "+swordDMG);
							}
							if (player.inventory.contains("Bow") == true) {
								 bowDMG = player.strength/3;
								System.out.println("(b) Bow DMG: "+bowDMG);
							}
							System.out.println("What attack would you like to use? ");
							String atkP = in.next();
							
							atkChance = rand.nextInt(player.smarts);
							boolean pHitLand = (atkChance == 0 || atkChance > enemySmarts);
						if (pHitLand == true) {
							if (atkP.equals("p")) {
							enemyHp -= punchDMG;
							System.out.println("Your attack did "+punchDMG+" damage.");
								} else {}
						
							if (atkP.equals("s")) {
							enemyHp -= swordDMG;
							System.out.println("Your attack did "+swordDMG+" damage.");
								} else {}
							
							if (atkP.equals("s")) {
								enemyHp -= bowDMG;
								System.out.println("Your attack did "+bowDMG+" damage.");
									} else {}
							
						} else { System.out.println("Your attack missed.");}
							playerCTurn = false;
						} else {}
						if (playerCTurn == false) {
							
							
							
							
							
							
							
							playerCTurn = true;
						} else {}
						
						
						
						
						
						
					
						
						
						
						
					}
				}else {}
				
				player.locationLog.add("cEvent1");
			} else {cEvent = rand.nextInt(4)+2; }
			if (cEvent == 2 && player.locationLog.contains("cEvent2") == false) {
				
				
				player.locationLog.add("cEvent2");
			} else {cEvent = rand.nextInt(3)+3;}
			if (cEvent == 3 && player.locationLog.contains("cEvent3") == false) {
				
				
				player.locationLog.add("cEvent3");
			} else {cEvent = rand.nextInt(2)+4;}
			if (cEvent == 4 && player.locationLog.contains("cEvent4") == false) {
				
				
				player.locationLog.add("cEvent3");
			} else {cEvent = 5;}
			if (cEvent != 1 || cEvent != 2 || cEvent != 3 || cEvent != 4) {
				
				
			} else {}
			
			
			
		
	}
	static void glacierForestEvent(Player player, Scanner in, Random rand) {
		// forest stuff (wild with animals and village and stuff)
	}
	static void deathMountainEvent(Player player, Scanner in, Random rand) {
		// mountain stuff (mining and top of mauntain has something)
	}
	static void redSandDesertEvent(Player player, Scanner in, Random rand) {
		// desert stuff (like a sandstorm where you random find shelter and damage also like thirst and hunger something)
	}
	static void greatBlueRiverEndEvent(Player player, Scanner in, Random rand) {
		// river end stuff (add like exploring a forest or sum)
	}
	static void greatBlueRiverStartEvent(Player player, Scanner in, Random rand) {
		// river start stuff (able to ride to end of river with half food cost and half time)
	}
	static void eastCityRoyalPalaceEvent(Player player, Scanner in, Random rand) {
		// east palace stuff (idk anything royal maybe a quest or sum)
	}
	static void popcornVillageEvent(Player player, Scanner in, Random rand) {
		// pop village stuff (make like crime city typa shi)
	}
	
	
	
	}

// TODO make all random events
// TODO make a random encounter storage system where theres a string list and it adds the encounter name to it if it happens and if statement in randomizer so it skips if hte string has it in it