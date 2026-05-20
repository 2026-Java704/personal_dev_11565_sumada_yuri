package com.example.demo.controller;

import java.util.List;

import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.model.Account;
import com.example.demo.repository.UsersRepository;

@Controller
public class UserController {

	private final Account account;
	private final HttpSession session;
	private final UsersRepository usersRepository;

	public UserController(
			Account account,
			HttpSession session,
			UsersRepository usersRepository) {
		this.account = account;
		this.session = session;
		this.usersRepository = usersRepository;
	}

	//ログイン画面表示
	@GetMapping({ "/", "/login", "logout" })
	public String index() {
		session.invalidate();
		return "login";
	}

	//ログイン画面処理
	@PostMapping({ "/", "/login" })
	public String login(
			@RequestParam String name,
			@RequestParam String password,
			Model model) {
		List<User> userList = usersRepository.findBynameAndPassword(name, password);
		if (userList.size() == 0) {
			model.addAttribute("message", "名前とパスワードが一致しませんでした");
			return "login";
		}
		if (name == null || password == null) {
			model.addAttribute("message", "入力してください");
			return "login";

		}
		account.setName(name);
		return "addRecords";
	}

	//新規登録画面表示
	@GetMapping("/users/add")
	public String create() {
		return "accountForm";
	}

	//新規登録画面処理
	@PostMapping("/users/add")
	public String create(
			@RequestParam String name,
			@RequestParam String password) {
		User user = new User(name, password);
		usersRepository.save(user);

		return "redirect:/login";
	}

}