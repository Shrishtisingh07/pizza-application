import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Pizza implements ActionListener
{

	JFrame startFrame = new JFrame("Welcome page ");
	JFrame pizzaFrame = new JFrame("Pizza Making ");
	JFrame instrFrame = new JFrame("Instructions");
	JFrame orderFrame = new JFrame(" Place order ");
      
	

	JButton end = new JButton("End");
	JButton pizzaMake = new JButton("Make Pizza");
	JButton placeOrder = new JButton("Place Order");
	JButton inst = new JButton("Instructions");
	JButton done = new JButton("Done");
      JButton done1=new JButton("Done");
	JButton getBill = new JButton("Get Bill");
      
	
	int total = 0;
      JCheckBox crust = new JCheckBox("Crust");
      JCheckBox sausage = new JCheckBox("Sausage");
      JCheckBox vegies = new JCheckBox("vegies");
	JCheckBox cheese = new JCheckBox("Cheese");
      JCheckBox green = new JCheckBox("Green Basil");
      JCheckBox pineapple = new JCheckBox("Pinapple");
      JCheckBox spinach = new JCheckBox("Spinach");
      JCheckBox mushrooms = new JCheckBox("Mushrooms");
      JCheckBox black = new JCheckBox("Black olive"); 
      JCheckBox extra = new JCheckBox("Extra Topping"); 
	
	JTextArea info = new JTextArea("Click on Make Pizza Button and select your toppings,\nthen Click on Order button to order\nthe pizza and get Bill");
	JLabel nameLabel = new JLabel("Enter your name");
	JLabel welcome=new JLabel("WELCOME TO PIZZARIA");
	JTextField name = new JTextField(20);
	JLabel phLabel=new JLabel("Enter phone number");
	JTextField ph = new JTextField(20);
	JLabel addrLabel=new JLabel("Enter Address");
	JTextField addr = new JTextField(20);

	JLabel billLabel=new JLabel("Amount to pay");
	JTextField bill = new JTextField(20);



	public Pizza()
	{
		startFrame.setSize(700, 500);
		pizzaFrame.setSize(700, 500);
		orderFrame.setSize(700, 500);
		instrFrame.setSize(700, 500);
		instrFrame.setLayout(null);
		startFrame.setLayout(null);
		pizzaFrame.setLayout(null);
		orderFrame.setLayout(null);
		
		startFrame.add(welcome);
		startFrame.add(inst); 
		startFrame.add(pizzaMake);
		startFrame.add(placeOrder);
		welcome.setBounds(200, 50, 400, 50);
		inst.setBounds(250, 250, 150, 50);
		pizzaMake.setBounds(100, 350, 150, 50);
		placeOrder.setBounds(400, 350, 150, 50);
            instrFrame.add(info);	
		instrFrame.add(done1);
		info.setBounds(100, 100, 350, 200);
		done1.setBounds(100, 400, 100, 50);
            pizzaFrame.add(done);
      	done.setBounds(100, 400, 100, 50);
            pizzaMake.setBackground(Color.cyan);
            placeOrder.setBackground(Color.cyan);
            inst.setBackground(Color.cyan);
            done.setBackground(Color.cyan);
            done1.setBackground(Color.cyan);
            getBill.setBackground(Color.cyan);
            welcome.setFont(new Font("",Font.BOLD,20));
            
            
          pizzaFrame.add(crust);
		crust.addItemListener(new ItemListener() 
		{    
             		public void itemStateChanged(ItemEvent e) 
			{                 
                		total=total+60; //60rs is the cost of crust  
             		}    
         	 });    
		crust.setBounds(100, 50, 150, 50);

          pizzaFrame.add(sausage);
		sausage.addItemListener(new ItemListener() 
		{    
             		public void itemStateChanged(ItemEvent e) 
			{                 
                		total=total+15; //15 rs is the cost of sausage  
             		}    
         	 });    
		sausage.setBounds(300, 50, 150, 50);

          pizzaFrame.add(vegies);
		vegies.addItemListener(new ItemListener() 
		{    
             		public void itemStateChanged(ItemEvent e) 
			{                 
                		total=total+25; //25 rs is the cost of vegies 
             		}    
         	 });    
		vegies.setBounds(100, 100, 150, 50);

          pizzaFrame.add(cheese);
		cheese.addItemListener(new ItemListener() 
		{    
             		public void itemStateChanged(ItemEvent e) 
			{                 
                		total=total+20; //20 rs is the cost of cheese  
             		}    
         	 });    
		cheese.setBounds(300, 100, 150, 50);

            pizzaFrame.add(green);
		green.addItemListener(new ItemListener() 
		{    
             		public void itemStateChanged(ItemEvent e) 
			{                 
                		total=total+30; // 30rs is the cost of green basil
             		}    
         	 });    
		green.setBounds(100,150 , 150, 50); 

           pizzaFrame.add(pineapple);
		pineapple.addItemListener(new ItemListener() 
		{    
             		public void itemStateChanged(ItemEvent e) 
			{                 
                		total=total+20; //20 rs is the cost of pineapple
             		}    
         	 });    
		pineapple.setBounds(300, 150, 150, 50);

          pizzaFrame.add(spinach);
		spinach.addItemListener(new ItemListener() 
		{    
             		public void itemStateChanged(ItemEvent e) 
			{                 
                		total=total+15; // 15rs is the cost of spinach
             		}    
         	 });    
		spinach.setBounds(100, 200, 150, 50);

          pizzaFrame.add(mushrooms);
		mushrooms.addItemListener(new ItemListener() 
		{    
             		public void itemStateChanged(ItemEvent e) 
			{                 
                		total=total+40; //40 rs is the cost of mushrooms 
             		}    
         	 });    
		mushrooms.setBounds(300, 200, 150, 50);

          pizzaFrame.add(black);
		black.addItemListener(new ItemListener() 
		{    
             		public void itemStateChanged(ItemEvent e) 
			{                 
                		total=total+25; //25 rs is the cost of blaclk olive  
             		}    
         	 });    
		black.setBounds(100, 250, 150, 50);

          pizzaFrame.add(extra);
		extra.addItemListener(new ItemListener() 
		{    
             		public void itemStateChanged(ItemEvent e) 
			{                 
                		total=total+35; //35 rs is the cost of extra topping 
             		}    
         	 });    
		extra.setBounds(300,250, 150, 50);
		
		orderFrame.add(nameLabel);
		orderFrame.add(name);
		orderFrame.add(phLabel);
		orderFrame.add(ph);
		orderFrame.add(addrLabel);
		orderFrame.add(addr);
		orderFrame.add(billLabel);
		orderFrame.add(bill);
		orderFrame.add(getBill);
            nameLabel.setBounds(50,50,150,50);
            name.setBounds(200,50,150,50);
            phLabel.setBounds(50,150,150,50);
            ph.setBounds(200,150,150,50);
            addrLabel.setBounds(50,250,150,50);
            addr.setBounds(200,250,150,50);
            getBill.setBounds(200, 400, 150, 50); 
		billLabel.setBounds(50, 350, 150, 50);
		bill.setBounds(200, 350, 150, 50);
            
            
            
          

		inst.addActionListener(this);
		inst.setEnabled(true);

		pizzaMake.addActionListener(this);
		pizzaMake.setEnabled(true);

		placeOrder.addActionListener(this);
		placeOrder.setEnabled(true);

		
		startFrame.setVisible(true);

		
	}//constructor end	


	public void actionPerformed(ActionEvent click)
	{
		Object source = click.getSource();

		if(source==pizzaMake)
		{ 
			pizzaFrame.setVisible(true);
			
			done.addActionListener(this);
			done.setEnabled(true);
	
		}

		if(source==placeOrder)
		{
			orderFrame.setVisible(true);
			
			getBill.addActionListener(this);
			getBill.setEnabled(true);
		
		}

		if(source==inst)
		{
			instrFrame.setVisible(true);
                  done1.addActionListener(this);
                  done1.setEnabled(true);
                  
             }
            if(source==done)
            {
                 instrFrame.dispose();
            }           

		if(source==done)
		{
			pizzaFrame.dispose();
		}
		
		if(source==getBill)
		{
			String s1 = String.valueOf(total); //typecasting
			bill.setText(s1);
		}
}

		

public static void main(String args[])
{
	new Pizza();
}

}//end of class