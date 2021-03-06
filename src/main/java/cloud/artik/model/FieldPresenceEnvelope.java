/**
 * ARTIK Cloud API
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package cloud.artik.model;

import java.util.Objects;
import cloud.artik.model.FieldPresence;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Field Presence Envelope
 */
@ApiModel(description = "Field Presence Envelope")

public class FieldPresenceEnvelope   {
  @SerializedName("sdid")
  private String sdid = null;

  @SerializedName("fieldPresence")
  private String fieldPresence = null;

  @SerializedName("startDate")
  private Long startDate = null;

  @SerializedName("endDate")
  private Long endDate = null;

  @SerializedName("interval")
  private String interval = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("data")
  private List<FieldPresence> data = new ArrayList<FieldPresence>();

  public FieldPresenceEnvelope sdid(String sdid) {
    this.sdid = sdid;
    return this;
  }

   /**
   * Get sdid
   * @return sdid
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getSdid() {
    return sdid;
  }

  public void setSdid(String sdid) {
    this.sdid = sdid;
  }

  public FieldPresenceEnvelope fieldPresence(String fieldPresence) {
    this.fieldPresence = fieldPresence;
    return this;
  }

   /**
   * Get fieldPresence
   * @return fieldPresence
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getFieldPresence() {
    return fieldPresence;
  }

  public void setFieldPresence(String fieldPresence) {
    this.fieldPresence = fieldPresence;
  }

  public FieldPresenceEnvelope startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public FieldPresenceEnvelope endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public FieldPresenceEnvelope interval(String interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public FieldPresenceEnvelope size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public FieldPresenceEnvelope data(List<FieldPresence> data) {
    this.data = data;
    return this;
  }

  public FieldPresenceEnvelope addDataItem(FieldPresence dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<FieldPresence> getData() {
    return data;
  }

  public void setData(List<FieldPresence> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldPresenceEnvelope fieldPresenceEnvelope = (FieldPresenceEnvelope) o;
    return Objects.equals(this.sdid, fieldPresenceEnvelope.sdid) &&
        Objects.equals(this.fieldPresence, fieldPresenceEnvelope.fieldPresence) &&
        Objects.equals(this.startDate, fieldPresenceEnvelope.startDate) &&
        Objects.equals(this.endDate, fieldPresenceEnvelope.endDate) &&
        Objects.equals(this.interval, fieldPresenceEnvelope.interval) &&
        Objects.equals(this.size, fieldPresenceEnvelope.size) &&
        Objects.equals(this.data, fieldPresenceEnvelope.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sdid, fieldPresence, startDate, endDate, interval, size, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldPresenceEnvelope {\n");
    
    sb.append("    sdid: ").append(toIndentedString(sdid)).append("\n");
    sb.append("    fieldPresence: ").append(toIndentedString(fieldPresence)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

