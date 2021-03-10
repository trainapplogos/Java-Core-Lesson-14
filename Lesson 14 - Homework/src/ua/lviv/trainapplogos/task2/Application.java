package ua.lviv.trainapplogos.task2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		LinkedHashSet<Commodity> goods = new LinkedHashSet<Commodity>();
		
		Commodity commodity = new Commodity();
		Scanner sc = new Scanner(System.in);
		
		//******************** Create an initial list ********************
		goods.add(new Commodity("iPhone 11", 75, 245, 250, 1200));
		goods.add(new Commodity("iPhone Xs", 72, 224, 253, 600));
		goods.add(new Commodity("OnePlus 8", 67, 211, 300, 800));
		goods.add(new Commodity("Android Phone 1", 55, 232, 320, 340));
		goods.add(new Commodity("Google Pixel 5 XL", 77, 200, 340, 620));
		goods.add(new Commodity("Pocophone", 81, 201, 311, 250));
		//*****************************************************************
		
		System.out.println("\nInitial List of Goods:");
		commodity.OutputCurrentList(goods);
		
		while (true) {
			System.out.println("\n------------------------------------------------------");
			System.out.println("> Choose your action:");
			System.out.println("  0: Show current List of goods ");
			System.out.println("  1: Show first item of List of goods ");
			System.out.println("  2: Add goods");
			System.out.println("  3: Delete goods");
			System.out.println("  4: Replace goods");
			System.out.println("  5: Sort goods by name");
			System.out.println("  6: Sort goods by length");
			System.out.println("  7: Sort goods by width");
			System.out.println("  8: Sort goods by weight");
			System.out.println("  9: Sort goods by price");
			System.out.println("  -: Exit");
			System.out.println("------------------------------------------------------\n");
			
			String action = sc.nextLine();
			switch (action) {
			case "0":
				System.out.println("\n------------------------------------------------------");
				System.out.println("Current List of Goods:");
				commodity.OutputCurrentList(goods);
				
				break;
			case "1":
				commodity.OutputFirstGoods(goods);
				break;
			case "2":		
				commodity.AddCommodity(goods);
				break;
			case "3":
				commodity.DeleteCommodity(goods);	
				break;
			case "4":
				commodity.ReplaceCommodity(goods);
				break;
			case "5":
				commodity.SortGoodsByName(goods);
				break;
			case "6":
				commodity.SortGoodsByLength(goods);
				break;
			case "7":
				commodity.SortGoodsByWidth(goods);
				break;
			case "8":
				commodity.SortGoodsByWeight(goods);
				break;
			case "9":
				commodity.SortGoodsByPrice(goods);
				break;
			case "-":
				sc.close();
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}


 