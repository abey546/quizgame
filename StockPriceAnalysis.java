import java.util.ArrayList;
import java.util.Arrays;

public class StockPriceAnalysis {
    
    // Method to calculate the average stock price
    public static double calculateAveragePrice(float[] prices) {
        double sum = 0;
        for (float price : prices) {
            sum += price;
        }
        return sum / prices.length;
    }

    // Method to find the maximum stock price
    public static float findMaximumPrice(float[] prices) {
        float maxPrice = prices[0]; // Assume first price is the highest
        for (float price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Method to count occurrences of a specific stock price
    public static int countOccurrences(float[] prices, float targetPrice) {
        int count = 0;
        for (float price : prices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Method to compute cumulative sum of stock prices in an ArrayList
    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> prices) {
        ArrayList<Float> cumulativeSumList = new ArrayList<>();
        float sum = 0;
        for (float price : prices) {
            sum += price;
            cumulativeSumList.add(sum);
        }
        return cumulativeSumList;
    }

    public static void main(String[] args) {
        // Example stock prices for 10 days
        float[] stockPricesArray = {100.5f, 102.3f, 98.7f, 101.2f, 105.6f, 99.9f, 103.5f, 97.8f, 104.2f, 101.0f};
        ArrayList<Float> stockPricesList = new ArrayList<>(Arrays.asList(100.5f, 102.3f, 98.7f, 101.2f, 105.6f, 99.9f, 103.5f, 97.8f, 104.2f, 101.0f));

        // Calculate and display results
        double averagePrice = calculateAveragePrice(stockPricesArray);
        float maxPrice = findMaximumPrice(stockPricesArray);
        int occurrenceCount = countOccurrences(stockPricesArray, 100.5f);
        ArrayList<Float> cumulativeSum = computeCumulativeSum(stockPricesList);

        // Display outputs
        System.out.println("Average Stock Price: " + averagePrice);
        System.out.println("Maximum Stock Price: " + maxPrice);
        System.out.println("Occurrences of 100.5: " + occurrenceCount);
        System.out.println("Cumulative Sum of Stock Prices: " + cumulativeSum);
    }
}
