package com.nirakar.src.springboot.restservice.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.nirakar.src.springboot.model.IPLMatchDetail;

@Component
public class CsvParser {
	
	
	List<IPLMatchDetail> iPLMatchDetailsList= new ArrayList<IPLMatchDetail>();
	
	Map<Integer,IPLMatchDetail> iplMatchDetialsMap=new HashMap<Integer, IPLMatchDetail>();

	public static void main(String[] args) {
		CsvParser csvParse = new CsvParser();
		List<IPLMatchDetail> result = csvParse.run();
		System.out.println(result);
	}

	@PostConstruct
	private List<IPLMatchDetail> run() {
		System.out.println("File uploading started");
		String csvFile = "E:/Study/Spring-Boot/src/main/resources/matches.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {

			br = new BufferedReader(new FileReader(csvFile));
			int iteration = 0;
			while ((line = br.readLine()) != null) {

				if (iteration == 0) {
					++iteration;
					continue;
				} else {
					IPLMatchDetail iPLMatchDetails = new IPLMatchDetail();
					// use comma as separator
					String[] iPLMatchDetailsArray = line.split(cvsSplitBy);
					iPLMatchDetails.setId(Integer.parseInt(iPLMatchDetailsArray[0]));
					iPLMatchDetails.setSeason(iPLMatchDetailsArray[1]);
					iPLMatchDetails.setCity(iPLMatchDetailsArray[2]);
					iPLMatchDetails.setDate(iPLMatchDetailsArray[3]);
					iPLMatchDetails.setTeam1(iPLMatchDetailsArray[4]);
					iPLMatchDetails.setTeam2(iPLMatchDetailsArray[5]);
					iPLMatchDetails.setToss_winner(iPLMatchDetailsArray[6]);
					iPLMatchDetails.setToss_decision(iPLMatchDetailsArray[7]);
					iPLMatchDetails.setResult(iPLMatchDetailsArray[8]);
					iPLMatchDetails.setDl_applied(iPLMatchDetailsArray[9]);
					iPLMatchDetails.setWinner(iPLMatchDetailsArray[10]);
					iPLMatchDetails.setWin_by_runs(iPLMatchDetailsArray[11]);
					iPLMatchDetails.setWin_by_wickets(iPLMatchDetailsArray[12]);
					iPLMatchDetails.setPlayer_of_match(iPLMatchDetailsArray[13]);
					iPLMatchDetails.setVenue(iPLMatchDetailsArray[14]);
					iPLMatchDetails.setUmpire1(iPLMatchDetailsArray[15]);
					iPLMatchDetails.setUmpire2(iPLMatchDetailsArray[16]);
					// iPLMatchDetails.setUmpire3(iPLMatchDetailsArray[17]);

					iPLMatchDetailsList.add(iPLMatchDetails);
					iplMatchDetialsMap.put(iPLMatchDetails.getId(), iPLMatchDetails);
					//System.out.println(iPLMatchDetails);
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		return iPLMatchDetailsList;

	}
	
	
	public IPLMatchDetail getMatchDetailById(int id) {
		return (IPLMatchDetail) iplMatchDetialsMap.get(id);
	}

	public List<String> getAllTeamNamesForASeason(String year) {
		final Set<String> teamNames = new HashSet<>();
		 iplMatchDetialsMap.forEach((k,v ) ->{
			if(v.getDate().contains(year)) {
				teamNames.add(v.getTeam1());
			}
		});
		return new ArrayList<String>(teamNames);
	}

	public boolean save(IPLMatchDetail matchDetailById) {
		IPLMatchDetail iplMatchDetails = iplMatchDetialsMap.get(matchDetailById.getId());
		iplMatchDetails.setResult(matchDetailById.getResult());
		return true;
	}
}
