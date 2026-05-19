package com.example.demo.controller;

import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.PersonalDev11565SumadaYuriApplication;
import com.example.demo.model.Account;
import com.example.demo.repository.UserRepository;

@Controller
public class UserController {

	private final PersonalDev11565SumadaYuriApplication personalDev11565SumadaYuriApplication;
	private final HttpSession session;
	private final Account account;
	private final UserRepository userRepository;

	public UserController(
			HttpSession session,
			Account account,
			UserRepository userRepository,
			PersonalDev11565SumadaYuriApplication personalDev11565SumadaYuriApplication) {
		this.session = session;
		this.account = account;
		this.userRepository = userRepository;
		this.personalDev11565SumadaYuriApplication = personalDev11565SumadaYuriApplication;
	}

	@GetMapping({ "/", "/login" })
	public String index() {
		session.invalidate();

		return "login";
	}

	@PostMapping({ "/", "/login" })
	public String login(
			@RequestParam String name,
			@RequestParam String password,
			Model model) {
		return "redirect:/";
	}

	@GetMapping("//users/new")
	public String create() {
		return "accountForm";
	}

	@PostMapping("/users/add")
	public String add(
			@RequestParam String name,
			@RequestParam String password,
			Model model) {
		return "redirect:/";
	}

	@PostMapping("/logout")
	public String logout() {
		return "redirect:/";
	}
}
