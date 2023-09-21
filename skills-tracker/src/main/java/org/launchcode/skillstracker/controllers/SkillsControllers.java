package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsControllers {

    @GetMapping
    public String localhost8080Format() {
        return "<html>" +
                    "<body>" +
                        "<h1> Skills Tracker </h1>" +
                        "<h2> We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>C#</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String formResponses() {
        return "<html>" +
                    "<body>" +
                        "<h2>Rank your favorite Languages!</h2>" +
                        "<form action='/8080'>" +

                            "<input type='text' name='name' />" +

                        "<div>" +
                            "<label for='oneFavLang'>My favorite Language</label>" +
                            "<select name='oneFavLang' id='lang'" +
                                "<option value=''>Select an option</option>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='C#'>C#</option>" +
                            "</select>" +
                        "</div>" +

                        "<div>" +
                            "<label for='twoFavLang'> My second favorite language</label>" +
                            "<select name='twoFavLang' id='lang2'" +
                                "<option value=''>Select an option</option>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='C#'>C#</option>" +
                            "</select>" +
                        "</div>" +

                        "<div>" +
                            "<label for='threeFavLang'> My second favorite language</label>" +
                            "<select name='threeFavLang' id='lang3'" +
                                "<option value=''>Select an option</option>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='C#'>C#</option>" +
                            "</select>" +
                        "</div>" +

                        "<input type='submit' value='Submit'/>" +

                        "</form>" +
                    "</body" +
                "</html>";


    }

    @GetMapping("/8080")
    public String localHostWithResponses(@RequestParam String name, String oneFavLang, String twoFavLang, String threeFavLang) {
        return "<html>" +
                    "<body>" +
                        "<h1>" + name +"</h1>" +
                        "<ol>" +
                            "<li>"+ oneFavLang +"</li>" +
                            "<li>"+ twoFavLang +"</li>" +
                            "<li>"+ threeFavLang +"</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }
}

