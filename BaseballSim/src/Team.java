
public class Team{
	public String name;
	public Player[] team;
	public boolean home = false;
	
	public Team(String name) {
		this.name = name;
	}
	
	public void organizeTeam(String name) {
		Player[] team = new Player[12];
		if (name.equals("Rockies")) {
			Player CharlieBlackmon = new Player("Charlie Blackmon", .1747211896, .0669144981, .0223048327, .0669144981, .0557620818);
			team[0] = CharlieBlackmon;
			Player TrevorStory = new  Player("Trevor Story", .1621621622, .0675675676, .0067567568, .0574324324, .0912162162);
			team[1] = TrevorStory;
			Player DavidDahl = new Player("David Dahl", .1929133858, .0787401575, .0157480315, .031496063, .0787401575);
			team[2] = DavidDahl;
			Player NolanArenado = new Player("Nolan Arenado", .1979865772, .0570469799, .0067114094, .0637583893, .1073825503);
			team[3] = NolanArenado;
			Player IanDesmond = new Player("Ian Desmond", .1403508772, .0877192982, .0087719298, .0438596491, .0877192982);
			team[4] = IanDesmond;
			Player RyanMcMahon = new Player("Ryan McMahon", .1666666, 0.0523809523809524, 0, 0.0285714285714286, 0.1142857142857143);
			team[5] = RyanMcMahon;
			Player DanielMurphy = new Player("Daniel Murphy", 0.1675392670157068, 0.0680628272251309, 0.0052356020942408, 0.031413612565445, 0.0680628272251309);
			team[6] = DanielMurphy;
			Player TonyWolters = new Player("Tony Wolters", 0.2298850574712644, 0.0632183908045977, 0.0057471264367816, 0.0057471264367816, 0.1091954022988506);
			team[7] = TonyWolters;
			Player RamielTapia = new Player("Ramiel Tapia", 0.1471861471861472, 0.0649350649350649, 0.0216450216450216, 0.025974025974026, 0.0562770562770563);
			team[8] = RamielTapia;
			Player GermanMarquez = new Player("German Marquez", 0.16875, 0.0333333333333333, 0.0041666666666667, 0.03125, 0.0541666666666667);
			team[9] = GermanMarquez;
			Player ScottOberg = new Player("Scott Oberg", 0.1125827814569536, 0.0132450331125828, 0.0066225165562914, 0.0198675496688742, 0.1059602649006623);
			team[10] = ScottOberg;
			Player WadeDavis = new Player("Wade Davis", 0.1709401709, 0.0341880342, 0.0085470085, 0.0256410256, 0.1367521368);
			team[11] = WadeDavis;
		}
		
		if (name.equals("Rays")) {
			Player AustinMeadows = new Player("Austin Meadows", .1794871795, .0512820513, .0146520147, .043956044, .0989010989);
			team[0] = AustinMeadows;
			Player BrandonLowe = new Player("Brandon Lowe", .1505376344, .0609318996, .0071684588, .0573476703, .0788530466);
			team[1] = BrandonLowe;
			Player WillyAdames = new Player("Willy Adames", .1644736842, .0394736842, .0032894737, .0328947368, .0822368421);
			team[2] = WillyAdames;
			Player TommyPham = new Player("Tommy Pham", .1882716049, .0462962963, .0061728395, .0401234568, .1512345679);
			team[3] = TommyPham;
			Player AvisailGarcia = new Player("Avisail Garcia", .1883116883, .045454545, .0032467532, .038961039, .0649350649);
			team[4] = AvisailGarcia;
			Player KevinKiermaier = new Player("Kevin Kiermaier", .1595744681, .0354609929, .0212765957, .0354609929, .0638297872);
			team[5] = KevinKiermaier;
			Player YandyDiaz = new Player("Yandy Diaz", .1615384615, .0692307692, .0038461538, .0423076923, .1192307692);
			team[6] = YandyDiaz;
			Player JiManChoi = new Player("Ji-Man Choi", .1867219917, .0373443983, .0035842294, .0322580645, .1244813278);
			team[7] = JiManChoi;
			Player MikeZunino = new Player("Mike Zunino", .0941176471, .0588235294, .0058823529, .0235294118, .0529411765);
			team[8] = MikeZunino;
			Player CharlieMorton = new Player("Charlie Morton", .11777777, .03333333, .00666666, .02, .08);
			team[9] = CharlieMorton;
			Player AndrewKittredge = new Player("Andrew Kittredge", .1395348837, .023255814, 0, .023255814, .0465116279);
			team[10] = AndrewKittredge;
			Player EmilioPagan = new Player("Emilio Pagan", 0.125, 0.0294117647, 0, 0.0294117647, 0.0661764706);
			team[11] = EmilioPagan;
		}
			
		
		this.team = team;
		
	}
			
}
