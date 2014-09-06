package br.com.tabomtaruim.entity;

public class GoodBad {

    private String line;
    private String status;
    private String imei;

    public GoodBad() {
    }

    public GoodBad(String line, String status, String imei) {
        this.line = line;
        this.status = status;
        this.imei = imei;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GoodBad{");
        sb.append("line='").append(line).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", imei='").append(imei).append('\'');
        sb.append('}');
        return sb.toString();
    }
}