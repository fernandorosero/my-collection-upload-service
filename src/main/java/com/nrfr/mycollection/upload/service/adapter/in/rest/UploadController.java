package com.nrfr.mycollection.upload.service.adapter.in.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UploadController {

    @GetMapping(path ="/api/v1/upload")
    public String getSaludo() {
        log.info("Llamada al servicio");  
        return "Holita desde mi ipad pro :)";
    }

}
