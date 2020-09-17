package com.amazon.aocagent.testamis;

import com.amazon.aocagent.enums.OSType;
import com.amazon.aocagent.enums.S3Package;
import com.amazonaws.services.ec2.model.InstanceType;

import java.util.List;

public interface ITestAMI {
  String getAMIId();

  OSType getOSType();

  String getLoginUser();

  S3Package getS3Package();

  String getDownloadingCommand(String fromUrl, String toLocation);

  String getInstallingCommand(String packagePath);

  String getStartingCommand(String configPath);

  String getIptablesCommand();

  InstanceType getInstanceType();
}
