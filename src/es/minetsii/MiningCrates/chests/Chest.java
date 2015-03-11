package es.minetsii.MiningCrates.chests;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;

public class Chest {
	private String name;
	private String type;
	private int probability;
	private int amount;
	private List<ItemStack> items;
	
	public Chest(String name, String type, int probability){
		// Nombre;Probabilidad;tipo:argumentos
		// Cofre1;15;cash:1500,15-1100,6
		// Cofre2;5;items:Item1#amount#enchant,lvl-Item2#amount#enchant,lvl
		this.name = name;
		this.type = type;
		this.probability = probability;
		this.amount = 0;
		this.items = new ArrayList<ItemStack>();
	}
	
	public String getName(){
		return name;
	}
	public String getType(){
		return type;
	}
	public int getProbability(){
		return probability;
	}
	public int getAmount(){
		return amount;
	}
	public List<ItemStack> getItems(){
		return new ArrayList<ItemStack>(items);
	}
	
	public void setAmount(int amount){
		this.amount = amount;
	}
	public void setItems(List<ItemStack> items){
		this.items = items;
	}
}