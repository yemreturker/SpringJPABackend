package com.yemreturker.rentACar.webApi.controllers;

import com.yemreturker.rentACar.business.abstracts.ColorService;
import com.yemreturker.rentACar.core.utilities.results.*;
import com.yemreturker.rentACar.entities.concretes.Color;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/colors")
@AllArgsConstructor
public class ColorsController {
    private ColorService colorService;
    @GetMapping()
    public DataResult<List<Color>> GetAll() {
        return this.colorService.GetAll();
    }
    @GetMapping("/{id}")
    public DataResult<Color> GetById(@PathVariable int id) {
        return this.colorService.GetById(id);
    }
    @PostMapping("/add")
    public Result Add(@RequestBody() Color color) {
        return this.colorService.Add(color);
    }
    @PutMapping("/update")
    public Result Update(@RequestBody() Color color) {
        return this.colorService.Update(color);
    }
    @DeleteMapping("/delete")
    public Result Delete(@PathVariable int id) {
        return this.colorService.Delete(id);
    }
}