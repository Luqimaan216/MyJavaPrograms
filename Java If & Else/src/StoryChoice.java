import java.util.Scanner;

public class StoryChoice {
	
	public static void main(String [] args) {
		String spartan;
		String alien;
		String evilEmpire;
		String alienLeader;
		String location;
		String weapon1;
		String weapon2;
		String nuke;
		String decision1;
		String decision2;
		String decision3;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Give the futuristic Spartan Soldier a name");
		spartan = in.nextLine();
		System.out.println("Give the friedly Elite Alien a name");
		alien = in.nextLine();
		System.out.println("Give the evil Empire a name");
		evilEmpire = in.nextLine();
		System.out.println("Give the evil "+evilEmpire+" Alien Leader a name");
		alienLeader = in.nextLine();
		System.out.println("Give the Planet a name");
		location = in.nextLine();
		System.out.println("Give the weapon of mass destruction a name");
		nuke = in.nextLine();
		System.out.println("Give a murder weapon that is a gun");
		weapon1 = in.nextLine();
		System.out.println("Give a murder weapon that is a blade");
		weapon2 = in.nextLine();
		
		System.out.println("The generated stroy is as follows;");
		System.out.println("");
		System.out.println(spartan+" and "+alien+ " broke into the main headquarters of the "+evilEmpire+"");
		System.out.println(spartan+" killed all the enemies in the room and aimed his "+weapon1+" at "+alienLeader); /*" at fired his "+weapon1+" at "+alienLeader);*/
		System.out.println("Should "+spartan+" kill "+alienLeader+" or injure him? ('kill' or 'injure')");
		decision1 = in.nextLine();
		if (decision1.equals("injure")){
			System.out.println(spartan+" fired his "+weapon1+" at "+alienLeader);
			System.out.println(alienLeader+" fell to the ground wounded");
			System.out.println("'Stop the "+nuke+"', shouted "+alien);
			System.out.println(alienLeader+" crawled weakly towards "+alien);
			System.out.println("'Can you see, "+alien+"? The moment of salvation is at hand', uttered "+alienLeader);
			System.out.println(alien+" looked down on "+alienLeader+" as he lay there helpless");
			System.out.println("Should "+alien+" grab "+alienLeader+" by the throat or leave him on the floor? ('grab' to grab him and 'leave' to leave him)");
			decision2 = in.nextLine();
			if(decision2.equals("grab")) {
				System.out.println(alien+" grabbed "+alienLeader+" by the throat");
				System.out.println("'It will not last', said "+alien);
				System.out.println("'Your kind...never believed in the promise of the sacred "+nuke+"s', said "+alienLeader);
				System.out.println("'I will have my revenge!', shouted "+alien);
				System.out.println("'My feet tread the path, I shall become a god!', exclaimed "+alienLeader);
				System.out.println("'You will not destroy "+location+"!', assirted "+alien);
				System.out.println(spartan+" approached the "+nuke+" control panel");
				System.out.println("'NO!', screamed "+alienLeader);
				System.out.println(spartan+" deactivated the "+nuke+" and then proceeded to destrying the console");
				System.out.println(alien+ " lifted "+alienLeader+" in the air by the neck");
				System.out.println("'I...am..."+alienLeader+"! The voice of the "+evilEmpire+"!', shouted "+alienLeader);
				System.out.println(alien+" turned "+alienLeader+" away form him and grabbed his neck viciously");
				System.out.println("'And so, you must be silenced', snapped "+alien);
				System.out.println("Should "+alien+" stab "+alienLeader+" through his chest or through his stomach?('chest' or 'stomach')");
				decision3 = in.nextLine();
				if (decision3.equals("chest")) {
					System.out.println(alien+" stabbed his "+weapon2+" through "+alienLeader+"'s back. It went clean through him");
					System.out.println("The points of the "+weapon2+" poked through his chest as he writhed and screamed in pain");
					System.out.println(alien+" let "+alienLeader+"'s corpse fall to the floor");
					System.out.println("He then let out a roar of triumpth and retreated his "+weapon2);
				}
				else {
					System.out.println(alien+" stabbed his "+weapon2+" through "+alienLeader+"'s back. It went clean through him");
					System.out.println("The points of the "+weapon2+" poked through his stomach as he writhed and screamed in pain");
					System.out.println(alien+" let "+alienLeader+"'s corpse fall to the floor");
					System.out.println("He then let out a roar of triumpth and retreated his "+weapon2);
				}
			}
			else {
				System.out.println("'It will not last', said "+alien);
				System.out.println("'Your kind...never believed in the promise of the sacred "+nuke+"s', said "+alienLeader);
				System.out.println("'I will have my revenge!', shouted "+alien);
				System.out.println("'My feet tread the path, I shall become a god!', exclaimed "+alienLeader);
				System.out.println("'You will not destroy "+location+"!', assirted "+alien);
				System.out.println(spartan+" approached the "+nuke+" control panel");
				System.out.println("'NO!', screamed "+alienLeader);
				System.out.println(spartan+" deactivated the "+nuke+" and then proceeded to destrying the console");
				System.out.println(alien+" raised his "+weapon2+" ready to pierce "+alienLeader);
				System.out.println("'I...am..."+alienLeader+"! The voice of the "+evilEmpire+"!', shouted "+alienLeader);
				System.out.println("'And so, you must be silenced', snapped "+alien);
				System.out.println("Should "+alien+" stab "+alienLeader+" through his chest or through his stomach?('chest' or 'stomach')");
				decision3 = in.nextLine();
				if (decision3.equals("chest")) {
					System.out.println(alien+" stabbed his "+weapon2+" through "+alienLeader+"'s back. It went clean through him");
					System.out.println("The points of the "+weapon2+" poked through his chest as he writhed and screamed in pain");
					System.out.println(alien+" let "+alienLeader+"'s corpse fall to the floor");
					System.out.println("He then let out a roar of triumpth and retreated his "+weapon2);
				}
				else {
					System.out.println(alien+" stabbed his "+weapon2+" through "+alienLeader+"'s back. It went clean through him");
					System.out.println("The points of the "+weapon2+" poked through his stomach as he writhed and screamed in pain");
					System.out.println(alien+" let "+alienLeader+"'s corpse fall to the floor");
					System.out.println("He then let out a roar of triumpth and retreated his "+weapon2);
				}
				
			}
			
			
		}
		else {
		System.out.println(spartan+" shot "+alienLeader+" in the head");
		System.out.println(alienLeader+"s corpse fell to the floor");
		System.out.println("'Stop the "+nuke+"', shouted "+alien);
		System.out.println(spartan+" approached the "+nuke+" control panel");
		System.out.println(spartan+" deactivated the "+nuke+" and then proceeded to destrying the console");
		System.out.println("The planet "+location+" has been saved, cheered "+alien);
		System.out.println("He then let out a roar of triumpth");
		}
	}

}
