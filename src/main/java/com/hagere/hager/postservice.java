package com.hagere.hager;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
@Service
public class postservice {
    @Autowired
    private postrepository postrepo;
    

    public void savePostToDb(MultipartFile file,String name,String description){
        post p = new post();
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        if(filename.contains("..")){
            System.out.println("It is not a valid file.");
        }
        try{p.setImage(Base64.getEncoder().encodeToString(file.getBytes()));}
        catch(IOException e){e.printStackTrace();}
        p.setDescription(description);
        
        p.setName(name);

        postrepo.save(p);
    }
    
    
    public List<post> getAllPost()
	{
		return (List<post>) postrepo.findAll();
	}
    public void deletePostById(Long id)
    {
    	postrepo.deleteById(id);
    }
    public void chagePostName(Long id ,String name)
    {
    	post p = new post();
    	p = postrepo.findById(id).get();
    	p.setName(name);
    	postrepo.save(p);    
    }
    public void changePostDescription(Long id , String description)
    {
    	post p = new post();
    	p = postrepo.findById(id).get();
    	p.setDescription(description);
    	postrepo.save(p);
    }
}    
    

