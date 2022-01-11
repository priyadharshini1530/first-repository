import java.io.BufferedReader; 
import java.io.FileReader; 
import weka.associations.*; 
import weka.core.Instances; 
public class dm2
{ 
	public static void main(String[] args) 
	{ 
		try { 
			FileReader input = new FileReader("C:\\Users\\Priyadharshini.S\\Desktop\\fruits.arff"); 
			BufferedReader bf = new BufferedReader(input); 
			Instances data = new Instances(bf); 
			Apriori model = new Apriori(); 
			model.setMinMetric(0.8); 
			model.setLowerBoundMinSupport(0.2); 
			model.buildAssociations(data); 
			System.out.println(model); 
		} 
		catch(Exception e) { 
		System.out.println(e); 
		} 
	} 
}