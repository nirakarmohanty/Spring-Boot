package com.nirakar.src.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.google.common.annotations.Beta;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This Model class contains all the attribute of Matches.csv
 * 
 * @author Nirakar
 *
 */

@Entity
public class IPLMatchDetail {
	@Id
	private int id;
	@Column(name = "SEASON")
	private String season;
	private String city;
	private String date;
	private String team1;
	private String team2;
	private String toss_winner;
	private String toss_decision;
	private String result;
	private String dl_applied;
	private String winner;
	private String win_by_runs;
	private String win_by_wickets;
	private String player_of_match;
	private String venue;
	private String umpire1;
	private String umpire2;
	private String umpire3;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getToss_winner() {
		return toss_winner;
	}

	public void setToss_winner(String toss_winner) {
		this.toss_winner = toss_winner;
	}

	public String getToss_decision() {
		return toss_decision;
	}

	public void setToss_decision(String toss_decision) {
		this.toss_decision = toss_decision;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getDl_applied() {
		return dl_applied;
	}

	public void setDl_applied(String dl_applied) {
		this.dl_applied = dl_applied;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public String getWin_by_runs() {
		return win_by_runs;
	}

	public void setWin_by_runs(String win_by_runs) {
		this.win_by_runs = win_by_runs;
	}

	public String getWin_by_wickets() {
		return win_by_wickets;
	}

	public void setWin_by_wickets(String win_by_wickets) {
		this.win_by_wickets = win_by_wickets;
	}

	public String getPlayer_of_match() {
		return player_of_match;
	}

	public void setPlayer_of_match(String player_of_match) {
		this.player_of_match = player_of_match;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getUmpire1() {
		return umpire1;
	}

	public void setUmpire1(String umpire1) {
		this.umpire1 = umpire1;
	}

	public String getUmpire2() {
		return umpire2;
	}

	public void setUmpire2(String umpire2) {
		this.umpire2 = umpire2;
	}

	public String getUmpire3() {
		return umpire3;
	}

	public void setUmpire3(String umpire3) {
		this.umpire3 = umpire3;
	}

	@Override
	public String toString() {
		return "IPLMatchDetails [id=" + id + ", season=" + season + ", city=" + city + ", date=" + date + ", team1="
				+ team1 + ", team2=" + team2 + ", toss_winner=" + toss_winner + ", toss_decision=" + toss_decision
				+ ", result=" + result + ", dl_applied=" + dl_applied + ", winner=" + winner + ", win_by_runs="
				+ win_by_runs + ", win_by_wickets=" + win_by_wickets + ", player_of_match=" + player_of_match
				+ ", venue=" + venue + ", umpire1=" + umpire1 + ", umpire2=" + umpire2 + ", umpire3=" + umpire3
				+ ", getId()=" + getId() + ", getSeason()=" + getSeason() + ", getCity()=" + getCity() + ", getDate()="
				+ getDate() + ", getTeam1()=" + getTeam1() + ", getTeam2()=" + getTeam2() + ", getToss_winner()="
				+ getToss_winner() + ", getToss_decision()=" + getToss_decision() + ", getResult()=" + getResult()
				+ ", getDl_applied()=" + getDl_applied() + ", getWinner()=" + getWinner() + ", getWin_by_runs()="
				+ getWin_by_runs() + ", getWin_by_wickets()=" + getWin_by_wickets() + ", getPlayer_of_match()="
				+ getPlayer_of_match() + ", getVenue()=" + getVenue() + ", getUmpire1()=" + getUmpire1()
				+ ", getUmpire2()=" + getUmpire2() + ", getUmpire3()=" + getUmpire3() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
