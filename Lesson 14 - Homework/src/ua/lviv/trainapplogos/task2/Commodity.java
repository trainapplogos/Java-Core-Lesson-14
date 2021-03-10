package ua.lviv.trainapplogos.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Commodity {
	private String name;
	private int length;
	private int width;
	private int weight;
	private int price;
	
	public Commodity(String name, int length, int width, int weight, int price) {
		this.name = name;
		this.length = length;
		this.width = width;
		this.weight = weight;
		this.price = price;
	}
	
	public Commodity() {
		this.name = "";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + weight;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		if (length != other.length)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (weight != other.weight)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", length=" + length + ", width=" + width + ", weight=" + weight + ", price="
				+ price + "]";
	}
	
	public void getGoodsParametersFromKeyboard() {
		Scanner sc = new Scanner(System.in);

		System.out.println("  - Enter name of goods:");
		this.name = sc.nextLine();
		
		System.out.println("  - Enter length f goods:");
		this.length = Integer.valueOf(sc.nextLine());
		
		System.out.println("  - Enter width of goods:");
		this.width = Integer.valueOf(sc.nextLine());
		
		System.out.println("  - Enter weight of goods:");
		this.weight = Integer.valueOf(sc.nextLine());
		
		System.out.println("  - Enter price of goods:");
		this.price = Integer.valueOf(sc.nextLine());
	}
	
	/* Add Commodity*/
	public void AddCommodity(LinkedHashSet<Commodity> commodity) {
		System.out.println("> Enter goods parameters to add new one:");
		
		getGoodsParametersFromKeyboard();
		
		commodity.add(new Commodity(this.name, this.length, this.width, this.weight, this.price));
	}
	
	/* Delete Commodity*/
	public void DeleteCommodity(LinkedHashSet<Commodity> commodity) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("> Enter name of goods to delete:");
		String goodsname = sc.nextLine();
				
		System.out.println(">> Processing operation of removing of goods");

		boolean exists = false;
		
		System.out.println("   Searching goods in List to remove...");
		
		Iterator<Commodity> iterator = commodity.iterator(); 
		while(iterator.hasNext()) {
			Commodity next = iterator.next();  
			if (next.getName().equalsIgnoreCase(goodsname)) {
					iterator.remove();
					System.out.println("  Goods '" + next.getName() + "'  was found and removed! ");
					exists = true;
					break;
			}
		}
		if (!exists) System.out.println("There isn't such goods as " + goodsname);
	}
	
	/* Replace Commodity*/
	public void ReplaceCommodity(LinkedHashSet<Commodity> commodity) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("> Enter name of goods to replace:");
		String goodsname = sc.nextLine();

		ArrayList<Commodity> goodsArr = new ArrayList<Commodity>(commodity);
		
		boolean exists = false;
		
		System.out.println(">> Searching goods in List to remove...");
		
		for (int i = 0; i < goodsArr.size(); i++) {
			if (goodsArr.get(i).getName().equalsIgnoreCase(goodsname)) {
				System.out.println(">> Please enter parameters of new goods for replacing:");
				getGoodsParametersFromKeyboard();
				
				Commodity destinationGoods = new Commodity(this.name, this.length, this.width, this.weight, this.price);
				
				System.out.println(">> Processing operation of replacing of goods");
				
				goodsArr.set(i, destinationGoods);
//				commodity = new LinkedHashSet<>(goodsArr); //changes are not reflected on the side of the main method

				commodity.clear();
				commodity.addAll(goodsArr);
				
				System.out.println("  Goods '" + goodsname + "'  was found and replaced! ");
				exists = true;
				break;
			}
		}
		if (!exists) System.out.println("There isn't such goods as '" + goodsname + "'");
	}
	
	/* Sort Goods By Name*/
	public void SortGoodsByName(LinkedHashSet<Commodity> commodity) {
		TreeSet<Commodity> goodsByName = new TreeSet<>(new CommodityNameComparator());
		
		System.out.println("\n> Sort goods by name:");
		SortGoodsBy(commodity, goodsByName);
	}
	
	/*Sort Goods By Length*/
	public void SortGoodsByLength(LinkedHashSet<Commodity> commodity) {
		TreeSet<Commodity> goodsByLength = new TreeSet<>(new CommodityLengthComparator());
		
		System.out.println("\n> Sort goods by length");
		SortGoodsBy(commodity, goodsByLength);
	}
	
	/*Sort Goods By Width*/
	public void SortGoodsByWidth(LinkedHashSet<Commodity> commodity) {
		TreeSet<Commodity> goodsByWidth = new TreeSet<>(new CommodityWidthComparator());
		
		System.out.println("\n> Sort goods by width");
		SortGoodsBy(commodity, goodsByWidth);
	}
	
	/*Sort Goods By Weight*/
	public void SortGoodsByWeight(LinkedHashSet<Commodity> commodity) {
		TreeSet<Commodity> goodsByWeight = new TreeSet<>(new CommodityWeightComparator());
		
		System.out.println("\n> Sort goods by weight");
		SortGoodsBy(commodity, goodsByWeight);
	}
	
	/*Sort Goods By Price*/
	public void SortGoodsByPrice(LinkedHashSet<Commodity> commodity) {
		TreeSet<Commodity> goodsByPrice = new TreeSet<>(new CommodityPriceComparator());
		
		System.out.println("\n> Sort goods by price");
		SortGoodsBy(commodity, goodsByPrice);
	}
	
	/* Output initial List */
	public void OutputCurrentList(LinkedHashSet<Commodity> commodity) {
		int ind = 0;
		
		for (Commodity comm : commodity) {
			ind++;
			System.out.println(ind + ") " + comm);
		}
	}
	
	/* Output sorted List*/
	public void SortGoodsBy(LinkedHashSet<Commodity> commodity, TreeSet<Commodity> goods) {
		goods.addAll(commodity);
		int ind = 0;
		
		for (Commodity comm : goods) {
			ind++;
			System.out.println(ind + ") " + comm);
		}
	}
	
	/* The most unuseful method */
	public void OutputFirstGoods(LinkedHashSet<Commodity> commodity) {
		Iterator <Commodity> iter = commodity.iterator();
		
		if (iter.hasNext()) {
			System.out.println("> The first item of List of goods is:");
			System.out.println(iter.next());
		} else System.out.println("  The goods List is empty! " );
	}
}


