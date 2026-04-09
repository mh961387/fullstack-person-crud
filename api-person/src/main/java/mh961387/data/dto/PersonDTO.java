package mh961387.data.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
public class PersonDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private Long zipCode;
    private String city;
    private String state;
    private String gender;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateBirth;
    private Long document;
    private String fone;

}
