package com.bbd.pm.common.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by Tony on 2017/8/3.
 */
@Data
@JsonIgnoreProperties("log")
@ApiModel(value = "BaseResponse", description = "返回值基类")
public class BaseResponse<T> implements Serializable {
    @ApiModelProperty(value = "是否成功：true 成功, false 失败", name = "success", example = "true")
    private boolean success;

    @ApiModelProperty(value = "success为false时,此字段不为空,代表错误信息", name = "errMsg", example = "错误信息 : 请重新登陆")
    private String errMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ApiModelProperty(value = "请求响应实体类", name = "data")
    private T data = null;

    @ApiModelProperty(value = "总行数", name = "totalCount", example = "100")
    private long totalCount;

    @ApiModelProperty(hidden = true)
    private String log;

    public BaseResponse() {
        this.success = true;
        this.totalCount = 0;
        this.setData(null);
    }


    /**
     * 请求报错时 将错误信息
     *
     * @param log
     */
    public void setLogAndErrMsg(String log) {
        this.errMsg = log;
        this.log = log;
    }

    /**
     * 请求成功时 将错误信息
     *
     * @param log
     */
    public void setLogAndData(String log) {
//        todo this.data = log;
        this.log = log;
    }
}
