
public class feladatok_0907 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		int térfogat = a*b*c;
		int felszín = 2*(a*b+a*c+b*c);
		
		System.out.println("A téglatest téfogata: "+térfogat);
		System.out.println("A téglatest felszíne: "+felszín);
		
		System.out.println("\n2.feladat:\n");
		
		int szam1 = Integer.parseInt(args[3]);
		int szam2 = Integer.parseInt(args[4]);
		
		int ossz = szam1+szam2;
		int kul = szam1-szam2;
		int szor = szam1*szam2;
		float oszt = (float)szam1/szam2;
		
		System.out.println("A két szám összege: "+ossz);
		System.out.println("A két szám különbsége: "+kul);
		System.out.println("A két szám szorzata: "+szor);
		System.out.println("A két szám hányada: "+oszt);
		
		System.out.println("\n3.feladat:\n");
		
		int szam3 = Integer.parseInt(args[5]);
		int szam4 = Integer.parseInt(args[6]);
		int szam5 = Integer.parseInt(args[7]);
		int szam6 = Integer.parseInt(args[8]);
		int szam7 = Integer.parseInt(args[9]);
		
		int szamossz=5;
		float kozep = (float)(szam3+szam4+szam5+szam6+szam7)/szamossz;
		System.out.println("A számok számtani közepe: "+kozep);
		
		System.out.println("\n4.feladat:\n");
		
		int szam8 = Integer.parseInt(args[10]);
		int szam9 = Integer.parseInt(args[11]);
		int szam10 = Integer.parseInt(args[12]);
		
		double megold1 = (-1*(double)szam9+Math.sqrt(szam9*szam9-4*szam8*szam10))/(2*szam8);
		double megold2 = (-1*(double)szam9-Math.sqrt(szam9*szam9-4*szam8*szam10))/(2*szam8);
		
		System.out.println("A másodfokú megoldó egyenlet alapján az első megoldás: "+megold1);
		System.out.println("A másodfokú megoldó egyenlet alapján a második megoldás: "+megold2);
		
		

	}

}
