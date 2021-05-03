package problems.general.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * Consider a game where there are warriors coming from different direction. The warriors will have direction and a power given
 * Warrior coming from opposite direction can collide. If they do the warrior with higher power will win. You need to return how many warriors will remain.
 * 
 * W1  W2  W3  W4  w5
 * ->  ->  <-  ->   <-
 * 7   6   9   10   12  */


public class WarriorsProblem {

	public static void main(String[] args) {
		List<Warrior> result;
		
		List<Warrior> warriorList = new ArrayList<>();
		warriorList.add(new Warrior("w1", true, 7));
		warriorList.add(new Warrior("w2", true, 6));
		warriorList.add(new Warrior("w3", false, 9));
		warriorList.add(new Warrior("w4", true, 10));
		warriorList.add(new Warrior("w5", false, 12));
		
		
		result = getListWarrior(warriorList);
		result.stream().forEach(System.out::println);
	}
	
	
	
	public static List<Warrior> getListWarrior(List<Warrior> warriorList) {
		Stack<Warrior> stack = new Stack<>();
		List<Warrior> result = new ArrayList<>();
		if(!warriorList.isEmpty()) {
			stack.push(warriorList.get(0));
		}
		
		boolean flag = false;
		for(int i =1; i < warriorList.size(); i++) {
			Warrior curr = warriorList.get(i);
			int size = stack.size();
			for(int j = 0; j < size; j++) {
				Warrior w = stack.get(size-1-j);
				if(w.isLToR && !curr.isLToR) {
					if(w.power < curr.power) {
						stack.pop();
						flag = true;
					}
					else {
						flag = false;
					}
				}
				
			}
			if(flag) {
				stack.push(curr);
			}
		}
		for(Warrior w: stack) {
			result.add(w);
		}
		
		return result;
		
		
	}
	
}

class Warrior{
	
	public String name;
	public boolean isLToR;
	public int power;
	
	public Warrior(String name, boolean isLToR, int power){
		this.name = name;
		this.isLToR = isLToR;
		this.power = power;
	}

	@Override
	public String toString() {
		return "Warrior [name=" + name + ", isLToR=" + isLToR + ", power=" + power + "]";
	}
	
	
	
}
