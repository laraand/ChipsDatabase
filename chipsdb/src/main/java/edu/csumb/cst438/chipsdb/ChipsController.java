package edu.csumb.cst438.chipsdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.csumb.cst438.chipsdb.entities.chip;

@RestController
public class ChipsController {
    @Autowired
    IChipsRepository chipRepository;

    @GetMapping("/allChips")

    public List<chip> getAll(){
        List<chip> result = chipRepository.findAll();
        return result;

    }

}