/*
  $Id: $
  @file GcrImageTag.java
  @brief Contains the GcrImageTag.java class

  @author Rahul Singh [rsingh]
  Copyright (c) 2013, Distelli Inc., All Rights Reserved.
*/
package com.distelli.gcr.models;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GcrImageTag
{
    protected String tag;
    protected String sha; // The Manifest sha, NOT the image sha.
    protected String layerId;
    protected long created;
}
