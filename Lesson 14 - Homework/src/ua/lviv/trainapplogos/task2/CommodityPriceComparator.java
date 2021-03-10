package ua.lviv.trainapplogos.task2;

import java.util.Comparator;

public class CommodityPriceComparator implements Comparator <Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		return o1.getPrice() - o2.getPrice();
	}

}
