package com.example.demo.controller;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaskController {
	//消費カロリーの計算が実行され、カロリー出力ページにリダイレクト
	@PostMapping("records/add")
	public String past(
			@RequestParam Date date,
			@RequestParam Integer time,
			@RequestParam Integer burn_calorie,
			Model model) {

		return "burnCalorie";
	}
}