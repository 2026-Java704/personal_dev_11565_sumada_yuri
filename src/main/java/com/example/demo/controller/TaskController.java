package com.example.demo.controller;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaskController {
	@GetMapping("records/add")
	public String enter() {
		return "addRecords";
	}

	//消費カロリーの計算が実行され、カロリー出力ページにリダイレクト
	@PostMapping("records/add")
	public String enter(
			@RequestParam Integer time,
			@RequestParam Integer weight,
			@RequestParam Date date,
			@RequestParam Integer eventId,
			Model model) {

		return "redirect:/burnCalorie";
	}

	//	これまでの記録が保持、出力され、過去の記録ページにリダイレクトされる
	@GetMapping("/past")
	public String past(
			@RequestParam Date date,
			@RequestParam Integer time,
			@RequestParam Integer burnCalorie,
			Model model) {

		return "redirect:/pastRecords";
	}
}