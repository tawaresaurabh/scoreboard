package com.example.scoreboard.controllers;


import com.example.scoreboard.dto.PlayerRecordForm;
import com.example.scoreboard.model.PlayerRecord;
import com.example.scoreboard.service.ScoreBoardService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;


@Controller
public class ScoreboardController {

    @Autowired
    private ScoreBoardService scoreBoardService;

    @GetMapping(value={"/","/home"})
    public ModelAndView getScoreboardRecords(){
        ModelAndView modelAndView = new ModelAndView();
        PlayerRecordForm playerRecordForm =  new PlayerRecordForm();
        modelAndView.setViewName("home");
        modelAndView.addObject("playerRecordForm",playerRecordForm);
        modelAndView.addObject("playerRecordList",scoreBoardService.getAllRecords());
        return modelAndView;

    }

    @PostMapping("/createRecord")
    public String createRecord(@Valid @ModelAttribute PlayerRecordForm playerRecordForm, BindingResult errors, Model model) {

        if (errors.hasErrors()) {
            return "home";
        }else{
            PlayerRecord playerRecord = new PlayerRecord(playerRecordForm.getPlayerName(),Integer.parseInt(playerRecordForm.getPoints()));
            scoreBoardService.savePlayerRecord(playerRecord);
            return "redirect:/home";
        }
    }

}
