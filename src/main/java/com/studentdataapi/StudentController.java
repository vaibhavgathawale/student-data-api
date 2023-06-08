package com.studentdataapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private WebClient.Builder webClient;
    ResponseData responseData = new ResponseData();
    @GetMapping("/{studentId}")
    public ResponseEntity<ResponseData> getStudentDetails(@PathVariable ("studentId") Long studentId ){
            Student student = new Student();
            student.setStudentId(1L);
            student.setStudentName("Vaibhav");
            student.setAddress("D'mart");
            student.setCollageId(22L);
        // We need to call RestTemplate or WebClient


        responseData.setStudent(student);

        Long collageId = student.getCollageId();

        // RestTemplate Code
      /*  String endPoint = "http://localhost:9012/collage/{collageId}";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Collage> data = restTemplate.getForEntity(endPoint, Collage.class, collageId);

        if(data.getStatusCodeValue()==200){

           Collage collage =  data.getBody();
           responseData.setCollage(collage);
        }*/

        //Web Client Code




       Collage c1 = webClient.build().get()
                  .uri("http://localhost:9012/collage/"+collageId)
                  .retrieve()
                  .bodyToMono(Collage.class)
                  .block();

        responseData.setCollage(c1);

        return new ResponseEntity<ResponseData>(responseData,HttpStatus.OK);
    }
}
