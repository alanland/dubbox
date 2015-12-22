package com.github.alanland.demo.api

import com.fasterxml.jackson.annotation.JsonProperty

import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlRootElement

/**
 *
 * @author 王成义
 * @date 2015-12-22
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
class User implements Serializable {

    @NotNull
    @Min(1L)
    Long id;

    @JsonProperty("username")
    @XmlElement(name = "username")
    @NotNull
    @Size(min = 6, max = 50)
    String name;

    public User() {
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User: {id: $id, name: $name}"
    }
}