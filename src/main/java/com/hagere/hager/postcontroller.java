package com.hagere.hager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
// @RequestMapping
public class postcontroller {   
    @Autowired
    private postservice postservice;


    @GetMapping("/")
    public String showExampleView(Model model){
        List<post> posts=postservice.getAllPost();
        model.addAttribute("posts", posts);
        return "post";
    }
    @GetMapping("")
    public String showAddPost(){
        return"post";
    }
    @PostMapping("/addp")
        public String savePost(@RequestParam("name") String Name, @RequestParam("desc") String Desc,@RequestParam("file") MultipartFile file ){
        postservice.savePostToDb(file,Name,Desc);
        return"redirect:/postmain";}
    
    @GetMapping("/deletpost/{id}")
    public String deletePost(@PathVariable("id") long id){
        postservice.deletePostById(id);
        return"redirect:/postmain";
}
@PostMapping("/changeName")
public String changeName(@RequestParam("id") Long id,
        @RequestParam("newName") String name){
 postservice.chagePostName(id, name);
    return "redirect:/postpage";
}
@PostMapping("/changeDescription")
public String changeDescription(@RequestParam("id") Long id ,
        @RequestParam("newDescription") String description)
{
    postservice.changePostDescription(id, description);
    return "redirect:/postmain";
}



}
