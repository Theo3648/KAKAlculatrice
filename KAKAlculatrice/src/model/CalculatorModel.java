package model;
import java.util.Stack;

public class CalculatorModel implements CalculatorModelInterface{
	public String accu;
	public Stack<Double> pile = new Stack<Double>();

	public void add() {
		pile.add(pile.pop() + pile.pop());
	}

	public void substract() {
		pile.add(pile.pop() - pile.pop());
	}

	public void multiply() {
		pile.add(pile.pop() * pile.pop());
	}

	public void divide() {
		p1 = pile.pop();
		p2 = pile.pop();
		if (p2 != 0) {
			pile.add(p1 / p2);
		}
		else {
			pile.add(p2);
			pile.add(p1);
		}
		
	}

	public void opposite() {
		pile.add(- pile.pop());
	}

	public void push() {
		pile.add(Double.parseDouble(accu));
	}

	public double pop() {
		double p = pile.pop();
		pile.add(p);
		return p;
	}

	public void drop() {
		pile.pop();
	}

	public void swap() {
		double p1 = pile.pop();
		double p2 = pile.pop();
		pile.add(p1);
		pile.add(p2);
	}
	
	public void clear() {
		accu = "";
	}

	public void clearAll() {
		while(pile.equals(new Stack<Double>())) {
			pile.pop();
		}
	}
}
