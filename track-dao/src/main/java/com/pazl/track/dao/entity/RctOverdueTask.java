package com.pazl.track.dao.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.io.Serializable;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name="rct_overdue_task")
public class RctOverdueTask implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L ;
    private int catId;
    private String catName;
    private int catPid;
    private int catLevel;
    private String catDeleted;
}
