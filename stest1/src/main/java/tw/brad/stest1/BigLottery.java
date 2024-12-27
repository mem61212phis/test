package tw.brad.stest1;

import java.util.HashSet;

import org.springframework.stereotype.Component;

@Component
public class BigLottery implements Lottery {
	@Override
	public HashSet<Integer> createLottery() {
		HashSet<Integer> set = new HashSet<Integer>();
		while (set.size() < 6) {
			set.add((int)(Math.random()*49+1));
		}
		return set;
	}
}
