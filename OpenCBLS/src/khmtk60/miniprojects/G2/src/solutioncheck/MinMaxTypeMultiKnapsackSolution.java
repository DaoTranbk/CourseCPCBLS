package khmtk60.miniprojects.G2.src.solutioncheck;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;

public class MinMaxTypeMultiKnapsackSolution {
	public int[] binOfItem;

	public int[] getBinOfItem() {
		return binOfItem;
	}

	public void setBinOfItem(int[] binOfItem) {
		this.binOfItem = binOfItem;
	}
	
	public void loadSubmit(String path) {
		JSONParser jsonParser = new JSONParser();
		try {
			FileReader reader = new FileReader(path);
			Object obj = jsonParser.parse(reader);
			JSONObject jo = (JSONObject) obj;
			binOfItem = new int[jo.size()];
			for(int i = 0; i < jo.size(); i++) {
				binOfItem[i] = (int)(long)jo.get(String.valueOf(i));
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void writeToFile(String fn) {
		try {
			PrintWriter out = new PrintWriter(fn);
			Gson gson = new Gson();
			String json = gson.toJson(this);
			out.print(json);
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		MinMaxTypeMultiKnapsackSolution test = new MinMaxTypeMultiKnapsackSolution();
//		test.loadSubmit("Result/output3000.json");
//		test.writeToFile("result_submit/output-3000.json");
		MinMaxTypeMultiKnapsackInput input = MinMaxTypeMultiKnapsackInput.loadFromFile("data/MinMaxTypeMultiKnapsackInput-100.json");
		input.writeToFile("result_submit/input-100.json");
	}

}