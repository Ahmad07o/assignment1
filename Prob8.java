public class Prob8{
	public static void main(String[]args){
		 double totalPopulation=80000;
		double noOfMen=0.52*totalPopulation;
		double litrateMen=0.35*totalPopulation;
		double iletrateMen=noOfMen-litrateMen;
		double totalWomen=0.48*totalPopulation;
		double litrateWomen=0.17*totalPopulation;
		double iletrateWomen=totalWomen-litrateWomen;
		System.out.println("iletrateMen:"+iletrateMen);
		System.out.println("iletrateWomen:"+iletrateWomen);
		
	}
}