import java.util.Scanner;

public class ListOfLists {
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Pick a category from the list below:");
		System.out.println("");
		System.out.println("(a) UNSC");
		System.out.println("(b) The Covenant");
		System.out.println("(c) The Flood");
		char firstOption = in.nextLine().charAt(0);
		switch (firstOption) {
		case 'a':
			System.out.println("You have picked UNSC. Please select a sub-topic:");
			System.out.println("(a) MasterChief Legacy");
			System.out.println("(b) Noble Team");
			System.out.println("(c) ODST's");
			char unscOption = in.nextLine().charAt(0);
			switch (unscOption) {
			case 'a':
				System.out.println("Here is Masterchiefs Legacy:");
				System.out.println("");
				System.out.println("Master Chief Petty Officer John-117, more commonly known as the");
				System.out.println("Master Chief, is a SPARTAN-II commando of the UNSC Naval Special");
				System.out.println("Warfare Command. He is the protagonist and main character in both");
				System.out.println("the Halo trilogy and Reclaimer Saga. With over thirty years of active");
				System.out.println("duty, he has become one of the most decorated war veterans in the");
				System.out.println("United Nations Space Command, earning every known UNSC medal");
				System.out.println("except the Prisoner of War Medallion");
				break;
			case 'b':
				System.out.println("Here is information about Noble Team:");
				System.out.println("");
				System.out.println("Noble Team was a special fireteam sized unit of the UNSC Special Warfare");
				System.out.println("Command Group Three, composed mostly of SPARTAN-III supersoldiers");
				System.out.println("and one SPARTAN-II commando as of 2552. The Teams members were Commander");
				System.out.println("Carter-A259(Noble One), Lieutenant Commander Catherine-B320(Noble Two),");
				System.out.println("Warrant Officer Emile-A239(Noble Four), Chief Warrant Officer Jorge-052(Noble Five)");
				System.out.println("and Lieutenant Spartan-B312(Noble Six)");
				System.out.println("They fought as a team to defend the Planet Reach when it was invaded and destroyed by The Covenant");
				break;
			case 'c':
				System.out.println("Here is information about ODST's");
				System.out.println("");
				System.out.println("The Orbital Drop Shock Troopers (ODST) are a special operations");
				System.out.println("capable organization of the UNSC Marine Corps that specialize in");
				System.out.println("orbital-dropped shock infantry and special warfare tactics. The ODSTs");
				System.out.println("are one of the primary Special Operations units of the United Nations ");
				System.out.println("Space Command, and is under the supervision of Naval Special Warfare Command.");
				System.out.println("ODST primary HQ is located at Kenosha, Mars.");
				break;
			}
			break;
		case 'b':
			System.out.println("You have picked The Covenant. Please select a sub-topic:");
			System.out.println("(a) Elites");
			System.out.println("(b) Brutes");
			System.out.println("(c) Prophets");
			char covenantOption = in.nextLine().charAt(0);
			switch (covenantOption) {
			case'a':
				System.out.println("Here is informtion about The Elites:");
				System.out.println("");
				System.out.println("The Sangheili (Latin Macto cognatus meaning 'I glorify my kin') are a saurian sapient species");
				System.out.println("known for their warrior culture and combat skill. Named after their home planet, Sanghelios,");
				System.out.println("they have historically been known to humans as Elites for their former role in the Covenant's military");
				System.out.println("hierarchy. Originally one of the Covenant's two founding species, the Sangheili");
				System.out.println("formed the hegemony's military backbone until just before the end of its existence. They had a very strong");
				System.out.println("rivalry with the Brutes (Jiralhanae), which finally led to open conflict during the Great Schism at");
				System.out.println("the conclusion of the Human-Covenant War.");
				break;
			case'b':
				System.out.println("Here is information about the Brutes:");
				System.out.println("");
				System.out.println("The Jiralhanae (Latin, Servus ferox, translated to 'Wild Slave') known by humans as Brutes are the most recent members of the Covenant.");
				System.out.println("They are a large, bipedal, giant ape-like species from Doisac. The Jiralhanae have");
				System.out.println("been part of the Covenant since before the destruction of the UNSC agricultural colony on Harvest,");
				System.out.println("and were always resented by the Sangheili for their monomaniacal behavior.");
				break;
			case'c':
				System.out.println("Here is information about the Prophets:");
				System.out.println("");
				System.out.println("San'Shyuum(Latin Perfidia vermis meaning 'Worms of Treachery') also known as Prophets by humanity, are a");
				System.out.println("species who were the leadership caste within the Covenant, and one of the more mysterious member races of the hierarchy.");
				System.out.println("Prophets appear to exert complete control over religious and political affairs, thus fulfilling their role as leaders. The Prophets");
				System.out.println("enforce a misguided theology based on the false belief that firing the Halo Array will start the Great Journey, transcending");
				System.out.println("them into a god-like status. Although physically frail compared to other Covenant species, they wield near absolute power over");
				System.out.println("the Covenant. They have a strong religious importance throughout the Covenant Hierarchy.");
				break;
			}
			
			break;
		case 'c':
			System.out.println("You have picked The Flood. Please select a sub-topic:");
			System.out.println("(a) About The Flood");
			System.out.println("(b) Graveminds");
			System.out.println("(c) Halo Array");
			char floodOption = in.nextLine().charAt(0);
			switch(floodOption) {
			case'a':
				System.out.println("Here is information about The Flood:");
				System.out.println("");
				System.out.println("The Flood (Latin Inferi redivivus, meaning 'the dead reincarnated') or the Parasite, as they are known to the ");
				System.out.println("Covenant, are a species of highly virulent parasitic organisms that can reproduce and grow by consuming sentient life forms of");
				System.out.println("sufficient biomass and cognitive capability. The Flood was responsible for consuming most of the sentient life in the galaxy,");
				System.out.println("notably the Forerunners, during the 300-year-long Forerunner-Flood war.[4] The Flood presents the most variable faction in the");
				System.out.println("trilogy, as it can infect and mutate Humans and Covenant species, such as Sangheili, and Jiralhanae, into Combat Forms.");
				System.out.println("They are widely considered to be the greatest threat to the whole existence of life, or more accurately, biodiversity, in the Milky Way galaxy.");
				break;
			case'b':
				System.out.println("Here is information about Graveminds:");
				System.out.println("");
				System.out.println("The Gravemind is a parasitic, hive mind intelligence in the Halo universe. While only one Gravemind is ever seen");
				System.out.println("in the games, the title is given to the final stage of Flood evolution, in which the Flood becomes a superorganism.");
				System.out.println("The Flood is a highly-infectious parasite which is released several times during Halo's story. The Chief and");
				System.out.println("the Arbiter (Thel'Vadam, during the course of Halo 2 and Halo 3) are captured during their separate missions on Delta Halo,");
				System.out.println("or Installation 05, by a Gravemind, which resides in the bowels of the ancient Forerunner ringworld, where the Flood");
				System.out.println("creature forges an alliance between the two foes in order to stop the activation of the ringworld — an event");
				System.out.println("which would destroy all sentient life, and, therefore, starve the Flood.");
				break;
			case'c':
				System.out.println("Here is information about The Halo Array:");
				System.out.println("");
				System.out.println("The Halo Array, Halos, alternatively known as the Sacred Rings by the Covenant, Fortress Worlds by their creators,");
				System.out.println("Installations by the A.I. Monitors that run them, and the Great Wheels by prehistoric humans, are seven (of an original twelve)");
				System.out.println("massive ring-shaped installations constructed by the Forerunners throughout the galaxy over one hundred thousand years ago");
				System.out.println("as a last resort when combating the parasite known as the Flood. When nothing else could be done, they activated the rings which");
				System.out.println("killed all sentient life forms within three radii of the galactic center. Not only are they weapons of last resort, but the");
				System.out.println("Halo installations are also research facilities, mainly for the study of the Flood");
				break;
		
			}
			
		}
	}
}
