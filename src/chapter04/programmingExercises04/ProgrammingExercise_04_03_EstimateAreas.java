package chapter04.programmingExercises04;

/**
 * @author FSO
 * Aug 26, 2021 1:23:31 AM
 */

public class ProgrammingExercise_04_03_EstimateAreas {
    public static void main(String[] args) {
        // Declare and initialize variables for the latitude and longitude of each city
        double atlantaX = 33.7489954; // latitude of Atlanta, Georgia
        double atlantaY = -84.3879824; // longitude of Atlanta
        
        double orlandoX = 28.5383355; // latitude of Orlando, Florida
        double orlandoY = -81.3792365; // longitude of Orlando
        
        double savannahX = 32.0835407; // latitude of Savannah, Georgia
        double savannahY = -81.0998342; // longitude of Savannah
        
        double charlotteX = 35.2270869; // latitude of Charlotte, North Carolina
        double charlotteY = -80.8431267; // longitude of Charlotte
        
        // Convert all the given degree values to radians
        atlantaX = Math.toRadians(atlantaX);
        atlantaY = Math.toRadians(atlantaY);
        orlandoX = Math.toRadians(orlandoX);
        orlandoY = Math.toRadians(orlandoY);
        savannahX = Math.toRadians(savannahX);
        savannahY = Math.toRadians(savannahY);
        charlotteX = Math.toRadians(charlotteX);
        charlotteY = Math.toRadians(charlotteY);
        
        // Declare a constant for the average radius of the earth
        final double RADIUS_OF_EARTH = 6371.01;
        
        // Compute the distance between each pair of cities to form a quadrilateral
        // Distance between Atlanta and Orlando
        double distanceATL_ORL = RADIUS_OF_EARTH * 
            Math.acos(Math.sin(atlantaX) * Math.sin(orlandoX) 
            + Math.cos(atlantaX) * Math.cos(orlandoX) * Math.cos(Math.abs(atlantaY - orlandoY)));
        
        // Distance between Orlando and Savannah
        double distanceORL_SAV = RADIUS_OF_EARTH * 
            Math.acos(Math.sin(orlandoX) * Math.sin(savannahX) 
            + Math.cos(orlandoX) * Math.cos(savannahX) * Math.cos(Math.abs(orlandoY - savannahY)));
        
        // Distance between Savannah and Charlotte
        double distanceSAV_CLT = RADIUS_OF_EARTH * 
            Math.acos(Math.sin(savannahX) * Math.sin(charlotteX) 
            + Math.cos(savannahX) * Math.cos(charlotteX) * Math.cos(Math.abs(savannahY - charlotteY)));
        
        // Distance between Atlanta and Charlotte
        double distanceATL_CLT = RADIUS_OF_EARTH * 
            Math.acos(Math.sin(atlantaX) * Math.sin(charlotteX) 
            + Math.cos(atlantaX) * Math.cos(charlotteX) * Math.cos(Math.abs(atlantaY - charlotteY)));
        
        // Distance between two cities that represent the diagonal of the quadrilateral
        double diagonalATL_SAV = RADIUS_OF_EARTH * 
            Math.acos(Math.sin(atlantaX) * Math.sin(savannahX) 
            + Math.cos(atlantaX) * Math.cos(savannahX) * Math.cos(Math.abs(atlantaY - savannahY))); // Atlanta to Savannah
        
        // Dividing the quadrilateral into two triangles, compute the 's' of each triangle
        double sCLT_ATL_SAV = (distanceATL_CLT + distanceSAV_CLT + diagonalATL_SAV) / 2;
        double sATL_ORL_SAV = (distanceATL_ORL + distanceORL_SAV + diagonalATL_SAV) / 2;
        
        // Compute the area of each triangle
        // Area of triangle formed by Charlotte, Atlanta, and Savannah
        double areaCLT_ATL_SAV = Math.sqrt(sCLT_ATL_SAV * (sCLT_ATL_SAV - distanceATL_CLT) *
                (sCLT_ATL_SAV - diagonalATL_SAV) * (sCLT_ATL_SAV - distanceSAV_CLT));
        
        // Area of triangle formed by Atlanta, Orlando, and Savannah
        double areaATL_ORL_SAV = Math.sqrt(sATL_ORL_SAV * (sATL_ORL_SAV - distanceATL_ORL) *
                (sATL_ORL_SAV - distanceORL_SAV) * (sATL_ORL_SAV - diagonalATL_SAV));
        
        // Display the result of the calculations
        System.out.println("The estimated area enclosed by ");
        System.out.println("Atlanta, Orlando, Savannah, and Charlotte is " 
                + (areaATL_ORL_SAV + areaCLT_ATL_SAV) + "km");
    }
}
