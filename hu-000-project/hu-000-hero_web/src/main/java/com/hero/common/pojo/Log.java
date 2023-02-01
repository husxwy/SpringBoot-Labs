package com.hero.common.pojo;



import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "undo_log")
public class Log implements Serializable {
  @Id
  private Long id;
  
  private Long branchId;
  
  private String xid;
  
  private byte[] rollbackInfo;
  
  private Integer logStatus;
  
  private Date logCreated;
  
  private Date logModified;
  
  private String ext;
  
  public Long getId() {
/* 30 */     return this.id;
  }
  
  public void setId(Long id) {
/* 33 */     this.id = id;
  }
  
  public Long getBranchId() {
/* 37 */     return this.branchId;
  }
  
  public void setBranchId(Long branchId) {
/* 40 */     this.branchId = branchId;
  }
  
  public String getXid() {
/* 44 */     return this.xid;
  }
  
  public void setXid(String xid) {
/* 47 */     this.xid = xid;
  }
  
  public byte[] getRollbackInfo() {
/* 51 */     return this.rollbackInfo;
  }
  
  public void setRollbackInfo(byte[] rollbackInfo) {
/* 54 */     this.rollbackInfo = rollbackInfo;
  }
  
  public Integer getLogStatus() {
/* 58 */     return this.logStatus;
  }
  
  public void setLogStatus(Integer logStatus) {
/* 61 */     this.logStatus = logStatus;
  }
  
  public Date getLogCreated() {
/* 65 */     return this.logCreated;
  }
  
  public void setLogCreated(Date logCreated) {
/* 68 */     this.logCreated = logCreated;
  }
  
  public Date getLogModified() {
/* 72 */     return this.logModified;
  }
  
  public void setLogModified(Date logModified) {
/* 75 */     this.logModified = logModified;
  }
  
  public String getExt() {
/* 79 */     return this.ext;
  }
  
  public void setExt(String ext) {
/* 82 */     this.ext = ext;
  }
}


/* Location:              /Users/husx/temp/hero_web-1.0-SNAPSHOT-default.jar!/BOOT-INF/classes/com/hero/common/pojo/Log.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */