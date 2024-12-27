package tw.brad.stest1;

import java.util.HashSet;

import org.springframework.stereotype.Component;

@Component
public class PowerLottery implements Lottery{

	@Override
	public HashSet<Integer> createLottery() {
		HashSet<Integer> set = new HashSet<Integer>();
		while (set.size() < 5) {
			set.add((int)(Math.random()*38+1));
		}
		return set;
	}

}
