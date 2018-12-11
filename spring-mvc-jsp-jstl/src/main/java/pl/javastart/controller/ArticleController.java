package pl.javastart.controller;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.javastart.model.Article;

@Controller
public class ArticleController {

    @PostMapping("/add")
    public String addArticle(@RequestParam String title, @RequestParam String content, @RequestParam String tags, Model model ){
        if (checkNoEmpty(title,content)){
            Article article = new Article(title,content,tags);
            model.addAttribute("article",article);
            return "success";
        }else{
            return "redirect:sorry";
        }
    }
    @GetMapping("/sorry")
    public  String error(){
        return "errorMessage";
    }
    private boolean checkNoEmpty(String title, String content){
        return (title!=null && title.length()>0) && (content!=null && content.length()>0);
    }
}
