package jp.co.sample.emp_management.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class LogController {

	private static final Logger LOGGER =LoggerFactory.getLogger(LogController.class);

	@RequestMapping("/loglevel")
	public String logLevel() {
		LOGGER.error("エラーが発生しました");
		LOGGER.warn("警告です");
		LOGGER.info("情報です");
		LOGGER.debug("デバック情報です");
		LOGGER.trace("細かいトレース情報です");
		return "500";

	}
}