
package com.u2team.huansync.event.model.classes;

/**
 *
 * @author Cristian Pardo
 */
public enum StatusEnum {
    ACTIVE("It is active"), FINISHED("It is Inactive"), PENDING("It is Pending");
    
    private String description;

    private StatusEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
