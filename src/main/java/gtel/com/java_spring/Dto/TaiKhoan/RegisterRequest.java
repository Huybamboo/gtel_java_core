package gtel.com.java_spring.Dto.TaiKhoan;

import com.fasterxml.jackson.annotation.JsonProperty;
import gtel.com.java_spring.annotation.ValidSoDienThoai;
import lombok.Data;

@Data
public class RegisterRequest {

    @ValidSoDienThoai
    @JsonProperty("soDienThoai")
    private String soDienThoai;

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
