package xiaohu.community.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xiaohu.community.community.dto.PaginationDTO;
import xiaohu.community.community.service.QuestionService;

@Controller
public class IndexController {

    @Autowired
    private QuestionService questionService;
    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "size", defaultValue = "10") Integer size,
                        @RequestParam(name = "search", required = false) String search
                        ) {
        PaginationDTO pagination = questionService.list(search, page, size);//获取到列表
        model.addAttribute("pagination", pagination);
        model.addAttribute("search", search);
        return "index";
    }
}
