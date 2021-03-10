package ua.lviv.trainapplogos.task2;

import java.util.Comparator;

public class CommodityWidthComparator implements Comparator <Commodity> {

	@Override
	public int compare(Commodity o1, Commodity o2) {
		return o1.getWidth() - o2.getWidth();
	}

}
