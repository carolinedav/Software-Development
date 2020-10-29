import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.SpringLayout;
import javax.swing.SpinnerNumberModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 * This Calculator class represents the JFrame on containing the 
 * Roth IRA calculator. 
 * @author Your Friendly CS Professors
 *
 */
public class Calculator extends JFrame{
	
	/**
	 * Instance variables for State of Calculator
	 * Don't change the variable names they are used by test
	 * case
	 */
	protected int monthlySavings;
	protected int numYears;
	protected int currentAge;
	protected double rateOfReturn ;
	protected double investmentValue;
	protected int futureAge; 

	/**
	 * This represents the elements that are displayed on screen. 
	 * Don't change the name of these variables they are used by the
	 * test cases. 
	 */
	protected JLabel ageLabel;
	protected JSpinner ageSpinner;
	protected JLabel monthSaveLabel;
	protected JSlider monthlySaveSlider;
	protected JLabel monthlySaveDisplayAmount;
	protected JLabel numYearsDisplay;
	protected JLabel futureAgeLabel; 
	protected JLabel investmentDisplayValue;
	protected JLabel rateOfReturnDisplay;
	protected JLabel numberOfYearsLabel;
	protected JSlider numYearsSlider;

	/**
	 * A getter for the monthlySaving instance variable
	 * @return the monthSavings
	 */
	public int getMonthlySavings() {
		return monthlySavings;
	}

	
	/**
	 * Inner classes that implement the handler form listeners
	 *  These classes implement the change listeners. 
	 */
	protected class NumYearsListener {
		//TODO: Implement this class.
    }
	
	/**(
	 *
	 *	Listener for age change events. 
	 */
	
	 protected class AgeListener {
		 //TODO: Implement this class. 
	 }
	
	
	/**
	 * 
	 * Listener for month change events. 
	 *
	 */
	protected class MonthSavingListener implements ChangeListener{

		  public void stateChanged(ChangeEvent e) {
          	JSlider source = (JSlider)e.getSource();
          	int value = source.getValue();
          	//TODO: Update appropriate values and labels
            }	
	}
 
 /**
	 * Class represents the frame. That we will create
	 * @param monthlySavings
	 * @param numYears
	 * @param currentAge
	 * @param rateOfReturn
	 */
	public Calculator(int monthlySavings, int numYears, int currentAge, double rateOfReturn) {
		super();
		/*
		 * Set up the default values
		 */
		this.monthlySavings = monthlySavings;
		this.numYears = numYears;
		this.currentAge = currentAge;
		this.rateOfReturn = rateOfReturn;
		/*
		 * Setup close window behavior 
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 363);
		getContentPane().setLayout(null);
         
		 
        /*------------------------------------------------------------
         * Logo Section Value Section.
         * Doesn't show up in the designer.
         *  You will need to run the program to see it.
      	 * ------------------------------------------------------------
      	 */
        ImageIcon iconLogo = new ImageIcon("Images/logo-uvacs.png");
        JLabel logoCS = new JLabel();
        logoCS.setIcon(iconLogo);
        logoCS.setBounds(350, 28, 165, 63);
        getContentPane().add(logoCS);
      
		/*------------------------------------------------------------
		 * monthly contribution section 
		 * ------------------------------------------------------------
		 */
        //Month Saving Title Label
        monthSaveLabel = new JLabel("Monthly Savings");
        monthSaveLabel.setBounds(31, 131, 118, 26);
        getContentPane().add(monthSaveLabel);
        // Month Saving Display Label
        monthlySaveDisplayAmount = new JLabel("$"+getMonthlySavings());
        monthlySaveDisplayAmount.setBounds(469, 137, 46, 14);
        getContentPane().add(monthlySaveDisplayAmount);
        
        //Slide for selecting Month Savings 
        monthlySaveSlider = new JSlider();
        //Sets the maximum value of the slide
        monthlySaveSlider.setMaximum(500);
        //Sets the sliders default value 
        monthlySaveSlider.setValue(getMonthlySavings());
        //Set the location (x,y, .., ..) and the 
        // width and height (..., ..., width, height)
        monthlySaveSlider.setBounds(169, 122, 266, 45);
        //Show the ruler style lines
        monthlySaveSlider.setPaintTicks(true);
        //Spacing between major Ticks
        monthlySaveSlider.setMajorTickSpacing(150);
        //Spacing between minor Ticks
        monthlySaveSlider.setMinorTickSpacing(10);
        //Show labels on Ticks 
        monthlySaveSlider.setPaintLabels(true);
        //Add Change listener. 
        monthlySaveSlider.addChangeListener(new MonthSavingListener());
        getContentPane().add(monthlySaveSlider);
       
       
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator(77, 70, 18, 0.07);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
