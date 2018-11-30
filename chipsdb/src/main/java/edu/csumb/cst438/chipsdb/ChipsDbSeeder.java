package edu.csumb.cst438.chipsdb;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.csumb.cst438.chipsdb.entities.Brand;
import edu.csumb.cst438.chipsdb.entities.Flavor;
import edu.csumb.cst438.chipsdb.entities.Price;
import edu.csumb.cst438.chipsdb.entities.chip;

@Component
public class ChipsDbSeeder implements CommandLineRunner{

    @Autowired
    IChipsRepository chipsRepo;
    
    @Override
    public void run(String... args) throws Exception {
        chip kettle = new chip("Potatoe", new Brand("Kettle"), new Flavor("Honey Dijon"), new Price(2.50));
        chip veggie = new chip("Veggie", new Brand("Garden"), new Flavor("Veggie"), new Price(2.50));
        chip sunchip = new chip("SunChip", new Brand("Sun Chip"), new Flavor("Harvest Cheddar"), new Price(2.50));
        chip popchip = new chip("Popchips", new Brand("Popchips"), new Flavor("Barbecue"), new Price(2.50));
        chip Doritos = new chip("Dorito", new Brand("Doritos"), new Flavor("Cool Ranch"), new Price(2.50));
        chip bbq = new chip("BBQ", new Brand("Barbecue Chips"), new Flavor("Barbecue"), new Price(2.20));
        chip stax = new chip("Stax", new Brand("Lays"), new Flavor("All American Cheeseburger"), new Price(2.50));
        chip takis = new chip("Fuego", new Brand("Barcel"), new Flavor("Fuego"), new Price(2.50));
        chip ruffles = new chip("Ruffles", new Brand("Ruffles"), new Flavor("Cheddar & Sour Cream"), new Price(2.50));


        //delete db data
        chipsRepo.deleteAll();

        List<chip> chips = Arrays.asList(kettle,veggie,sunchip,popchip,Doritos,bbq,stax,takis,ruffles);

        chipsRepo.saveAll(chips);
    }

}