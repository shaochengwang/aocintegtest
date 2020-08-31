package com.amazon.aocagent.testamis;

import com.amazon.aocagent.enums.S3Package;

public class EcsOptimizedAMI extends LinuxAMI {

  public EcsOptimizedAMI(String amiId) {
    super(amiId);
  }

  @Override
  public String getLoginUser() {
    return null;
  }

  @Override
  public S3Package getS3Package() {
    return null;
  }
}