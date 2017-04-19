package com.mybatis.model;

public class Server {
    private Integer id;

    private Integer osfamilyId;

    private Integer osversionId;

    private Integer oslicenceId;

    private String cpu;

    private String ram;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOsfamilyId() {
        return osfamilyId;
    }

    public void setOsfamilyId(Integer osfamilyId) {
        this.osfamilyId = osfamilyId;
    }

    public Integer getOsversionId() {
        return osversionId;
    }

    public void setOsversionId(Integer osversionId) {
        this.osversionId = osversionId;
    }

    public Integer getOslicenceId() {
        return oslicenceId;
    }

    public void setOslicenceId(Integer oslicenceId) {
        this.oslicenceId = oslicenceId;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}