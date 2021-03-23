package com.xylia.platform.graphql.inputs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateNameInput {
    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
}
