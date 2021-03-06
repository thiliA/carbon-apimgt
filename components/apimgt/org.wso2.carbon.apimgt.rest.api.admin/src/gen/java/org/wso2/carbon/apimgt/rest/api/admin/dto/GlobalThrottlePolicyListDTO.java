package org.wso2.carbon.apimgt.rest.api.admin.dto;

import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.apimgt.rest.api.admin.dto.GlobalThrottlePolicyDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class GlobalThrottlePolicyListDTO  {
  
  
  
  private Integer count = null;
  
  
  private String next = null;
  
  
  private String previous = null;
  
  
  private List<GlobalThrottlePolicyDTO> list = new ArrayList<GlobalThrottlePolicyDTO>();

  
  /**
   * Number of Global throttle policies returned.\n
   **/
  @ApiModelProperty(value = "Number of Global throttle policies returned.\n")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  
  /**
   * Link to the next subset of resources qualified.\nEmpty if no more resources are to be returned.\nexample: \"/throttling/policies/global?limit=1&offset=2&query=\"\n
   **/
  @ApiModelProperty(value = "Link to the next subset of resources qualified.\nEmpty if no more resources are to be returned.\nexample: \"/throttling/policies/global?limit=1&offset=2&query=\"\n")
  @JsonProperty("next")
  public String getNext() {
    return next;
  }
  public void setNext(String next) {
    this.next = next;
  }

  
  /**
   * Link to the previous subset of resources qualified.\nEmpty if current subset is the first subset returned.\nexample: \"/throttling/policies/global?limit=1&offset=0&query=\"\n
   **/
  @ApiModelProperty(value = "Link to the previous subset of resources qualified.\nEmpty if current subset is the first subset returned.\nexample: \"/throttling/policies/global?limit=1&offset=0&query=\"\n")
  @JsonProperty("previous")
  public String getPrevious() {
    return previous;
  }
  public void setPrevious(String previous) {
    this.previous = previous;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("list")
  public List<GlobalThrottlePolicyDTO> getList() {
    return list;
  }
  public void setList(List<GlobalThrottlePolicyDTO> list) {
    this.list = list;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalThrottlePolicyListDTO {\n");
    
    sb.append("  count: ").append(count).append("\n");
    sb.append("  next: ").append(next).append("\n");
    sb.append("  previous: ").append(previous).append("\n");
    sb.append("  list: ").append(list).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
