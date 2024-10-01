package org.launchcode.skills_tracker.SkillsController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String homepage(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Skills to learn</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "<li>Ruby</li>" +
                "<li>C++</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String skillsForm(){
        return "<html>" +
                "<body>" +
                "<form action='/form' method='POST'>" +
                "<label for='name'>Enter your name:</label>" +
                "<br>" +
                "<input type='text' name='inputName'/>" +
                "<br>" +
                "<label>My favorite language</label>" +
                "<br>" +
                "<select name='favorite1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label>My second favorite language</label>" +
                "<br>" +
                "<select name='favorite2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label>My third favorite languages</label>" +
                "<br>" +
                "<select name='favorite3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit' value='Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    public String sendSkillsForm(@RequestParam String inputName, String favorite1, String favorite2, String favorite3){
        return "<html>" +
                "<body>" +
                "<h1>" + inputName + "</h1>" +
                "<h3>My top languages</h3>" +
                "<ol>" +
                "<li>" + favorite1 + "</li>" + "<br>" +
                "<li>" + favorite2 + "</li>" + "<br>" +
                "<li>" + favorite3 + "</li>" + "<br>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }
}
