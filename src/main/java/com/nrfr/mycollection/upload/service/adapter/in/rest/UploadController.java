package com.nrfr.mycollection.upload.service.adapter.in.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadController {

    @GetMapping(path ="/api/v1/upload")
    public String getSaludo() {
        return "Holita desde mi ipad pro :)";
    }

}
