package chapter03;

import java.util.Scanner;

/**
 * @author FSO
 * Mar 22, 2021 10:59:40 PM
 */

public class Listing05_ComputeTax {
    public static void main(String[] args) {
        // Create a Scanner object to accept the user's input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter their filing status
        System.out.println("    0 - Single filer,");
        System.out.println("    1 - Married jointly or Qualifying Widow(er),");
        System.out.println("    2 - Married Separately,");
        System.out.println("    3 - Head of Household");
        System.out.print("Enter the filing status: ");
        byte filingStatus = input.nextByte();
        
        // Prompt the user to enter their income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();
        
        // Compute the tax
        double tax = 0;
        
        // Calculate the tax according to the filing status and income
        if (filingStatus == 0) {
            if (income > 8350) {
                tax = 8350 * 0.1;
                
                if (income > 33950) {
                    tax += (33950 - 8350) * 0.15;
                    
                    if (income > 82250) {
                        tax += (82250 - 33950) * 0.25;
                        
                        if (income > 171550) {
                            tax += (171550 - 82250) * 0.28;
                            
                            if (income > 372950) {
                                tax += (372950 - 171550) * 0.33;
                                
                                // Calculate for the last tax rate of the income
                                tax += (income - 372950) * 0.35;
                            } else {
                                tax += (income - 171550) * 0.33;
                            }
                        } else {
                            tax += (income - 82250) * 0.28;
                        }
                    } else {
                        tax += (income - 33950) * 0.25;
                    }
                } else {
                    tax += (income - 8350) * 0.15;
                }
            } else {
                tax = income * 0.1;
            }
        } else if (filingStatus == 1) {
            if (income > 16700) {
                tax = 16700 * 0.1;
                
                if (income > 67900) {
                    tax += (67900 - 16700) * 0.15;
                    
                    if (income > 137050) {
                        tax += (137050 - 67900) * 0.25;
                        
                        if (income > 208850) {
                            tax += (208850 - 137050) * 0.28;
                            
                            if (income > 372950) {
                                tax += (372950 - 208850) * 0.33;
                                
                                // Calculate for the last tax rate of the income
                                tax += (income - 372950) * 0.35;
                            } else {
                                tax += (income - 208850) * 0.33;
                            }
                        } else {
                            tax += (income - 137050) * 0.28;
                        }
                    } else {
                        tax += (income - 67900) * 0.25;
                    }
                } else {
                    tax += (income - 16700) * 0.15;
                }
            } else {
                tax = income * 0.1;
            }
        } else if (filingStatus == 2) {
            if (income > 8350) {
                tax = 8350 * 0.1;
                
                if (income > 33950) {
                    tax += (33950 - 8350) * 0.15;
                    
                    if (income > 68525) {
                        tax += (68525 - 33950) * 0.25;
                        
                        if (income > 104425) {
                            tax += (104425 - 68525) * 0.28;
                            
                            if (income > 186475) {
                                tax += (186475 - 104425) * 0.33;
                                
                                // Calculate for the last tax rate of the income
                                tax += (income - 186475) * 0.35;
                            } else {
                                tax += (income - 104425) * 0.33;
                            }
                        } else {
                            tax += (income - 68525) * 0.28;
                        }
                    } else {
                        tax += (income - 33950) * 0.25;
                    }
                } else {
                    tax += (income - 8350) * 0.15;
                }
            } else {
                tax = income * 0.1;
            }
        } else if (filingStatus == 3) {
            if (income > 11950) {
                tax = 11950 * 0.1;
                
                if (income > 45500) {
                    tax += (45500 - 11950) * 0.15;
                    
                    if (income > 117450) {
                        tax += (117450 - 45500) * 0.25;
                        
                        if (income > 190200) {
                            tax += (190200 - 117450) * 0.28;
                            
                            if (income > 372950) {
                                tax += (372950 - 190200) * 0.33;
                                
                                // Calculate for the last tax rate of the income
                                tax += (income - 372950) * 0.35;
                            } else {
                                tax += (income - 190200) * 0.33;
                            }
                        } else {
                            tax += (income - 117450) * 0.28;
                        }
                    } else {
                        tax += (income - 45500) * 0.25;
                    }
                } else {
                    tax += (income - 11950) * 0.15;
                }
            } else {
                tax = income * 0.1;
            }
        } else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }
        
        // Display the result
        System.out.println("The tax is " + (int)(tax * 100) / 100.0);
    }
}
