package com.lizza.SpEl;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Record {

    private String orgId;

    private Long applicationId;

    private String type;

    private Boolean withApplyForm;
}
