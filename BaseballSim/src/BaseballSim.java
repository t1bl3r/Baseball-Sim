
public class BaseballSim {
	public static boolean FirstBase = false;
	public static boolean SecondBase = false;
	public static boolean ThirdBase = false; // current occupation of bases, reset every switch of batting
	public static int score1 = 0; // home runs
	public static int score2 = 0; // away runs
	public static int outs = 0; // 0-3
	public static int totalouts = 0; // 0-54
	public static boolean batting = false; // determine what team is up to bat
	public static int position1 = 0; // home position in batting order 
	public static int position2 = 0; // away position in batting order
	public static int pitcherPosition1 = 9; // home position of pitcher
	public static int pitcherPosition2 = 9; // away position of pitcher
	public static int inning = 1;  // current inning, used for pitcher position
	public static Team home;
	public static String homeName;
	public static Team away;
	public static String awayName;

	public static void main(String[] args) {
		Team Rockies = new Team("Rockies");
		Rockies.organizeTeam(Rockies.name);
		home = Rockies;
		homeName = Rockies.name;
		Team Rays = new Team("Rays");
		Rays.organizeTeam(Rays.name);;
		away = Rays;
		awayName = Rays.name;
		
		PlayBall(Rockies, Rays);
		System.out.println("The final score of the simulation is " + home.name + ": " + score1 + " " + away.name + ": " + score2);
		
	}
	
	public static void PlayBall(Team home, Team away) {
		home.home = true;
		while (totalouts != 54) {
			outs = 0;
			if (batting == false) { // if away team is up to bat
					while (outs != 3) {
					String atBat = atBat(home,away);
					System.out.println(home.team[position2].name + " " + atBat);
					if (atBat.equals("out")) {
						outs += 1;
						totalouts += 1;
						if (outs == 3) {
							FirstBase = false;
							SecondBase = false;
							ThirdBase = false;
							batting = true;
						}
					}
					if (atBat.equals("single")) {
							if (ThirdBase == true) {
								ThirdBase = false;
								score2 += 1;
							}
							if (SecondBase == true) {
								SecondBase = false;
								score2 += 1;
							}
							if (FirstBase == true) {
								SecondBase = true;
							}
							FirstBase = true;
							
						}
					if (atBat.equals("double")) {
						if (ThirdBase == true) {
							ThirdBase = false;
							score2 += 1;
						}
						if (SecondBase == true) {
							SecondBase = false;
							score2 += 1;
						}
						if (FirstBase == true) {
							FirstBase = false;
							ThirdBase = true;
						}
						SecondBase = true;
					}
					if (atBat.equals("triple")) {
						if (ThirdBase == true) {
							ThirdBase = false;
							score2 += 1;
						}
						if (SecondBase == true) {
							SecondBase = false;
							score2 += 1;
						}
						if (FirstBase == true) {
							FirstBase = false;
							score2 += 1;
						}
						ThirdBase = true; 
					}
					if (atBat.equals("home run")) {
						if (ThirdBase == true) {
							ThirdBase = false;
							score2 += 1;
						}
						if (SecondBase == true) {
							SecondBase = false;
							score2 += 1;
						}
						if (FirstBase == true) {
							FirstBase = false;
							score2 += 1;
						}
						score2 += 1; 
					}
					if (atBat.equals("walk")) {
						if ((ThirdBase == true) & (SecondBase == true) & (FirstBase == true))  {
							score2 += 1;
						}
						else if ((SecondBase == true) & (FirstBase == true)) {
							ThirdBase = true;
						}
						else if ((ThirdBase == true) & (FirstBase == true)) {
							SecondBase = true;
						}
						else if (FirstBase == true) {
							SecondBase = true;
						}
						else {
							FirstBase = true;
						}
					}
					if (position2 != 8) {
						position2 += 1;
					}
					else {
						position2 = 0;
					}
					System.out.println(FirstBase + " " + SecondBase + " " + ThirdBase + " " + outs);
					
				}
			}
			else if (batting == true) {
				while (outs != 3) {
					String atBat = atBat(away,home);
					if (atBat.equals("out")) {
						outs += 1;
						totalouts += 1;
						if (outs == 3) {
							FirstBase = false;
							SecondBase = false;
							ThirdBase = false;
							batting = false;
						}
					}
					if (atBat.equals("single")) {
							if (ThirdBase == true) {
								ThirdBase = false;
								score1 += 1;
							}
							if (SecondBase == true) {
								SecondBase = false;
								score1 += 1;
							}
							if (FirstBase == true) {
								SecondBase = true;
							}
							FirstBase = true;
							
						}
					if (atBat.equals("double")) {
						if (ThirdBase == true) {
							ThirdBase = false;
							score1 += 1;
						}
						if (SecondBase == true) {
							SecondBase = false;
							score1 += 1;
						}
						if (FirstBase == true) {
							FirstBase = false;
							ThirdBase = true;
						}
						SecondBase = true;
					}
					if (atBat.equals("triple")) {
						if (ThirdBase == true) {
							ThirdBase = false;
							score1 += 1;
						}
						if (SecondBase == true) {
							SecondBase = false;
							score1 += 1;
						}
						if (FirstBase == true) {
							FirstBase = false;
							score1 += 1;
						}
						ThirdBase = true; 
					}
					if (atBat.equals("home run")) {
						if (ThirdBase == true) {
							ThirdBase = false;
							score1 += 1;
						}
						if (SecondBase == true) {
							SecondBase = false;
							score1 += 1;
						}
						if (FirstBase == true) {
							FirstBase = false;
							score1 += 1;
						}
						score1 += 1; 
					}
					if (atBat.equals("walk")) {
						if ((ThirdBase == true) & (SecondBase == true) & (FirstBase == true))  {
							score1 += 1;
						}
						else if ((SecondBase == true) & (FirstBase == true)) {
							ThirdBase = true;
						}
						else if ((ThirdBase == true) & (FirstBase == true)) {
							SecondBase = true;
						}
						else if (FirstBase == true) {
							SecondBase = true;
						}
						else {
							FirstBase = true;
						}
					}
					if (position1 != 8) {
						position1 += 1;
					}
					else {
						position1 = 0;
					}
				}
			}
		}
	}
	
	public static String atBat(Team first, Team second) {
		double temp = Math.random();
		
		if (first.home == true) {
			
		
			double singleChance = (first.team[position1].singleAvg + second.team[pitcherPosition2].singleAvg) / 2;
			double doubleChance = (first.team[position1].doubleAvg + second.team[pitcherPosition2].doubleAvg) / 2;
			double tripleChance = (first.team[position1].tripleAvg + second.team[pitcherPosition2].tripleAvg) / 2;
			double homerunChance = (first.team[position1].homerunAvg + second.team[pitcherPosition2].homerunAvg) / 2;
			double walkChance = (first.team[position1].walkAvg + second.team[pitcherPosition2].walkAvg) / 2;
			
			if (temp < singleChance) {
				return "single";
			}
			if (temp < (singleChance + doubleChance)) {
				return "double";
			}
			if (temp < (singleChance + doubleChance + tripleChance)) {
				return "triple";
			}
			if (temp < (singleChance + doubleChance + tripleChance + homerunChance)) {
				return "home run";
			}
			if (temp < (singleChance + doubleChance + tripleChance + homerunChance + walkChance)) {
				return "walk";
			}
					
		}
		
		if (first.home == false) {
			
			
			double singleChance = (first.team[pitcherPosition1].singleAvg + second.team[position2].singleAvg) / 2;
			double doubleChance = (first.team[pitcherPosition1].doubleAvg + second.team[position2].doubleAvg) / 2;
			double tripleChance = (first.team[pitcherPosition1].tripleAvg + second.team[position2].tripleAvg) / 2;
			double homerunChance = (first.team[pitcherPosition1].homerunAvg + second.team[position2].homerunAvg) / 2;
			double walkChance = (first.team[pitcherPosition1].walkAvg + second.team[position2].walkAvg) / 2;
			
			if (temp < singleChance) {
				return "single";
			}
			if (temp < (singleChance + doubleChance)) {
				return "double";
			}
			if (temp < (singleChance + doubleChance + tripleChance)) {
				return "triple";
			}
			if (temp < (singleChance + doubleChance + tripleChance + homerunChance)) {
				return "home run";
			}
			if (temp < (singleChance + doubleChance + tripleChance + homerunChance + walkChance)) {
				return "walk";
			}
					
		}
		return "out";
		
	}

}
