/*
 * Copyright (C) 2014-2015 LinkedIn Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.
 */
package gobblin.data.management.copy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SerializableCopyableDatasetTest {

  @Test
  public void testSerializeDeserialize() throws Exception {
    CopyableDataset copyableDataset = new TestCopyableDataset();
    String serialized = SerializableCopyableDataset.serialize(copyableDataset);

    CopyableDataset deserialized = SerializableCopyableDataset.deserialize(serialized);

    Assert.assertEquals(copyableDataset.datasetRoot(), deserialized.datasetRoot());
    Assert.assertEquals(copyableDataset.datasetTargetRoot(), deserialized.datasetTargetRoot());
  }

}
